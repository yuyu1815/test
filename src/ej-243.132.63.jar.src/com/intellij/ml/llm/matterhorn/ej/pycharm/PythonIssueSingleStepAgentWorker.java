/*    */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AbstractIssueSingleStepAgentWorker;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.AgentParameters;
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*    */ import java.net.URL;
/*    */ import java.nio.charset.Charset;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.io.TextStreamsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.Charsets;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\bJ\034\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH@¢\006\002\020\016J\034\020\017\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH@¢\006\002\020\016J\016\020\020\032\0020\021H@¢\006\002\020\022¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractIssueSingleStepAgentWorker;", "<init>", "()V", "getAgentParameters", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "(Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAvailableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHiddenActions", "getDemonstration", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-pycharm"})
/*    */ @SourceDebugExtension({"SMAP\nPythonIssueSingleStepAgentWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PythonIssueSingleStepAgentWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,85:1\n1#2:86\n*E\n"})
/*    */ public final class PythonIssueSingleStepAgentWorker
/*    */   extends AbstractIssueSingleStepAgentWorker
/*    */ {
/*    */   @Nullable
/*    */   public Object getAgentParameters(@NotNull MatterhornPropertyProvider propertyProvider, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAgentParameters$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAgentParameters$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAgentParameters$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 253, 0 -> 92, 1 -> 143, 2 -> 245
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentParameters.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion;
/*    */     //   100: astore #4
/*    */     //   102: getstatic com/intellij/ml/llm/matterhorn/llm/ModelParameters.Companion : Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters$Companion;
/*    */     //   105: aload_0
/*    */     //   106: invokevirtual getAgentName : ()Ljava/lang/String;
/*    */     //   109: aload_1
/*    */     //   110: aload #6
/*    */     //   112: aload #6
/*    */     //   114: aload_1
/*    */     //   115: putfield L$0 : Ljava/lang/Object;
/*    */     //   118: aload #6
/*    */     //   120: aload #4
/*    */     //   122: putfield L$1 : Ljava/lang/Object;
/*    */     //   125: aload #6
/*    */     //   127: iconst_1
/*    */     //   128: putfield label : I
/*    */     //   131: invokevirtual getDefaultModel : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   134: dup
/*    */     //   135: aload #7
/*    */     //   137: if_acmpne -> 169
/*    */     //   140: aload #7
/*    */     //   142: areturn
/*    */     //   143: aload #6
/*    */     //   145: getfield L$1 : Ljava/lang/Object;
/*    */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters$Companion
/*    */     //   151: astore #4
/*    */     //   153: aload #6
/*    */     //   155: getfield L$0 : Ljava/lang/Object;
/*    */     //   158: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   161: astore_1
/*    */     //   162: aload #5
/*    */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   167: aload #5
/*    */     //   169: aload #4
/*    */     //   171: swap
/*    */     //   172: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*    */     //   175: astore_3
/*    */     //   176: new com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   179: dup
/*    */     //   180: aload_3
/*    */     //   181: iconst_0
/*    */     //   182: aconst_null
/*    */     //   183: aconst_null
/*    */     //   184: sipush #10000
/*    */     //   187: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   190: sipush #200
/*    */     //   193: invokestatic boxInt : (I)Ljava/lang/Integer;
/*    */     //   196: iconst_0
/*    */     //   197: iconst_1
/*    */     //   198: iconst_0
/*    */     //   199: iconst_0
/*    */     //   200: iconst_0
/*    */     //   201: iconst_0
/*    */     //   202: iconst_0
/*    */     //   203: dconst_0
/*    */     //   204: iconst_0
/*    */     //   205: sipush #32590
/*    */     //   208: aconst_null
/*    */     //   209: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;ILcom/intellij/ml/llm/matterhorn/ej/core/history_processors/HistoryProcessors;Lcom/intellij/ml/llm/matterhorn/ej/core/critique/Critiques;Ljava/lang/Integer;Ljava/lang/Integer;IZZZZZIDZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*    */     //   212: aload_1
/*    */     //   213: aload #6
/*    */     //   215: aload #6
/*    */     //   217: aconst_null
/*    */     //   218: putfield L$0 : Ljava/lang/Object;
/*    */     //   221: aload #6
/*    */     //   223: aconst_null
/*    */     //   224: putfield L$1 : Ljava/lang/Object;
/*    */     //   227: aload #6
/*    */     //   229: iconst_2
/*    */     //   230: putfield label : I
/*    */     //   233: invokevirtual setupFromEnvironment : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   236: dup
/*    */     //   237: aload #7
/*    */     //   239: if_acmpne -> 252
/*    */     //   242: aload #7
/*    */     //   244: areturn
/*    */     //   245: aload #5
/*    */     //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   250: aload #5
/*    */     //   252: areturn
/*    */     //   253: new java/lang/IllegalStateException
/*    */     //   256: dup
/*    */     //   257: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   259: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   262: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 60
/*    */     //   #23	-> 97
/*    */     //   #26	-> 102
/*    */     //   #22	-> 140
/*    */     //   #23	-> 176
/*    */     //   #26	-> 180
/*    */     //   #23	-> 181
/*    */     //   #24	-> 184
/*    */     //   #25	-> 190
/*    */     //   #23	-> 196
/*    */     //   #27	-> 197
/*    */     //   #23	-> 198
/*    */     //   #28	-> 212
/*    */     //   #22	-> 242
/*    */     //   #23	-> 252
/*    */     //   #22	-> 253
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;
/*    */     //   97	46	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   162	74	1	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   0	263	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	203	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	196	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getAvailableActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   11: astore #14
/*    */     //   13: aload #14
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #14
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getAvailableActions$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #14
/*    */     //   50: aload #14
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #13
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #15
/*    */     //   62: aload #14
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 608, 0 -> 92, 1 -> 144, 2 -> 209
/*    */     //   92: aload #13
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_1
/*    */     //   98: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   103: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   106: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   109: astore_3
/*    */     //   110: aload_0
/*    */     //   111: aload_3
/*    */     //   112: aload #14
/*    */     //   114: aload #14
/*    */     //   116: aload_0
/*    */     //   117: putfield L$0 : Ljava/lang/Object;
/*    */     //   120: aload #14
/*    */     //   122: aload_3
/*    */     //   123: putfield L$1 : Ljava/lang/Object;
/*    */     //   126: aload #14
/*    */     //   128: iconst_1
/*    */     //   129: putfield label : I
/*    */     //   132: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   135: dup
/*    */     //   136: aload #15
/*    */     //   138: if_acmpne -> 169
/*    */     //   141: aload #15
/*    */     //   143: areturn
/*    */     //   144: aload #14
/*    */     //   146: getfield L$1 : Ljava/lang/Object;
/*    */     //   149: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*    */     //   152: astore_3
/*    */     //   153: aload #14
/*    */     //   155: getfield L$0 : Ljava/lang/Object;
/*    */     //   158: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker
/*    */     //   161: astore_0
/*    */     //   162: aload #13
/*    */     //   164: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   167: aload #13
/*    */     //   169: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   172: astore #4
/*    */     //   174: aload_0
/*    */     //   175: aload_3
/*    */     //   176: aload #14
/*    */     //   178: aload #14
/*    */     //   180: aload #4
/*    */     //   182: putfield L$0 : Ljava/lang/Object;
/*    */     //   185: aload #14
/*    */     //   187: aconst_null
/*    */     //   188: putfield L$1 : Ljava/lang/Object;
/*    */     //   191: aload #14
/*    */     //   193: iconst_2
/*    */     //   194: putfield label : I
/*    */     //   197: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   200: dup
/*    */     //   201: aload #15
/*    */     //   203: if_acmpne -> 226
/*    */     //   206: aload #15
/*    */     //   208: areturn
/*    */     //   209: aload #14
/*    */     //   211: getfield L$0 : Ljava/lang/Object;
/*    */     //   214: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   217: astore #4
/*    */     //   219: aload #13
/*    */     //   221: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   224: aload #13
/*    */     //   226: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   229: invokevirtual getUseEditSubagent : ()Z
/*    */     //   232: istore #6
/*    */     //   234: iload #6
/*    */     //   236: iconst_1
/*    */     //   237: if_icmpne -> 253
/*    */     //   240: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSubagentAction
/*    */     //   243: dup
/*    */     //   244: invokespecial <init> : ()V
/*    */     //   247: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*    */     //   250: goto -> 313
/*    */     //   253: iload #6
/*    */     //   255: ifne -> 305
/*    */     //   258: aload #4
/*    */     //   260: invokevirtual getUseTools : ()Z
/*    */     //   263: ifeq -> 285
/*    */     //   266: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchReplaceToolAction
/*    */     //   269: dup
/*    */     //   270: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   273: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   276: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   279: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*    */     //   282: goto -> 313
/*    */     //   285: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*    */     //   288: dup
/*    */     //   289: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   292: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   295: iconst_1
/*    */     //   296: invokespecial <init> : (Ljava/util/List;Z)V
/*    */     //   299: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*    */     //   302: goto -> 313
/*    */     //   305: new kotlin/NoWhenBranchMatchedException
/*    */     //   308: dup
/*    */     //   309: invokespecial <init> : ()V
/*    */     //   312: athrow
/*    */     //   313: astore #5
/*    */     //   315: nop
/*    */     //   316: aload #4
/*    */     //   318: invokevirtual getUseTools : ()Z
/*    */     //   321: ifeq -> 343
/*    */     //   324: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/CreateFileToolAction
/*    */     //   327: dup
/*    */     //   328: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   331: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   334: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   337: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction
/*    */     //   340: goto -> 356
/*    */     //   343: new com/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction
/*    */     //   346: dup
/*    */     //   347: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   350: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   353: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   356: astore #6
/*    */     //   358: nop
/*    */     //   359: aload #4
/*    */     //   361: invokevirtual getUseTools : ()Z
/*    */     //   364: ifeq -> 380
/*    */     //   367: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/SearchProjectToolAction
/*    */     //   370: dup
/*    */     //   371: invokespecial <init> : ()V
/*    */     //   374: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*    */     //   377: goto -> 387
/*    */     //   380: new com/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction
/*    */     //   383: dup
/*    */     //   384: invokespecial <init> : ()V
/*    */     //   387: astore #7
/*    */     //   389: bipush #11
/*    */     //   391: anewarray com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*    */     //   394: astore #9
/*    */     //   396: aload #9
/*    */     //   398: iconst_0
/*    */     //   399: aload #7
/*    */     //   401: aastore
/*    */     //   402: aload #9
/*    */     //   404: iconst_1
/*    */     //   405: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*    */     //   408: dup
/*    */     //   409: invokespecial <init> : ()V
/*    */     //   412: aastore
/*    */     //   413: aload #9
/*    */     //   415: iconst_2
/*    */     //   416: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction
/*    */     //   419: dup
/*    */     //   420: invokespecial <init> : ()V
/*    */     //   423: aastore
/*    */     //   424: aload #9
/*    */     //   426: iconst_3
/*    */     //   427: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenEntireFileAgentAction
/*    */     //   430: dup
/*    */     //   431: invokespecial <init> : ()V
/*    */     //   434: aastore
/*    */     //   435: aload #9
/*    */     //   437: iconst_4
/*    */     //   438: new com/intellij/ml/llm/matterhorn/ej/core/actions/GotoLineAgentAction
/*    */     //   441: dup
/*    */     //   442: invokespecial <init> : ()V
/*    */     //   445: aastore
/*    */     //   446: aload #9
/*    */     //   448: iconst_5
/*    */     //   449: new com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollDownAgentAction
/*    */     //   452: dup
/*    */     //   453: invokespecial <init> : ()V
/*    */     //   456: aastore
/*    */     //   457: aload #9
/*    */     //   459: bipush #6
/*    */     //   461: new com/intellij/ml/llm/matterhorn/ej/core/actions/ScrollUpAgentAction
/*    */     //   464: dup
/*    */     //   465: invokespecial <init> : ()V
/*    */     //   468: aastore
/*    */     //   469: aload #9
/*    */     //   471: bipush #7
/*    */     //   473: aload #6
/*    */     //   475: aastore
/*    */     //   476: aload #9
/*    */     //   478: bipush #8
/*    */     //   480: aload #5
/*    */     //   482: aastore
/*    */     //   483: aload #9
/*    */     //   485: bipush #9
/*    */     //   487: new com/intellij/ml/llm/matterhorn/ej/core/actions/UndoEditAction
/*    */     //   490: dup
/*    */     //   491: invokespecial <init> : ()V
/*    */     //   494: aastore
/*    */     //   495: aload #9
/*    */     //   497: bipush #10
/*    */     //   499: new com/intellij/ml/llm/matterhorn/ej/core/actions/SubmitAgentAction
/*    */     //   502: dup
/*    */     //   503: invokespecial <init> : ()V
/*    */     //   506: aastore
/*    */     //   507: aload #9
/*    */     //   509: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   512: checkcast java/util/Collection
/*    */     //   515: new com/intellij/ml/llm/matterhorn/ej/core/actions/CallExpertAgentAction
/*    */     //   518: dup
/*    */     //   519: invokespecial <init> : ()V
/*    */     //   522: astore #9
/*    */     //   524: astore #11
/*    */     //   526: iconst_0
/*    */     //   527: istore #10
/*    */     //   529: aload #4
/*    */     //   531: invokevirtual getAllowCallExpert : ()D
/*    */     //   534: dconst_0
/*    */     //   535: dcmpl
/*    */     //   536: ifle -> 543
/*    */     //   539: iconst_1
/*    */     //   540: goto -> 544
/*    */     //   543: iconst_0
/*    */     //   544: istore #12
/*    */     //   546: aload #11
/*    */     //   548: iload #12
/*    */     //   550: ifeq -> 558
/*    */     //   553: aload #9
/*    */     //   555: goto -> 559
/*    */     //   558: aconst_null
/*    */     //   559: invokestatic listOfNotNull : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   562: checkcast java/lang/Iterable
/*    */     //   565: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   568: astore #8
/*    */     //   570: nop
/*    */     //   571: aload #4
/*    */     //   573: invokevirtual getUseTools : ()Z
/*    */     //   576: ifeq -> 605
/*    */     //   579: new com/intellij/ml/llm/matterhorn/ej/core/actions/tools/BashToolAction
/*    */     //   582: dup
/*    */     //   583: ldc 'bash_20241022'
/*    */     //   585: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   588: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   591: checkcast java/util/Collection
/*    */     //   594: aload #8
/*    */     //   596: checkcast java/lang/Iterable
/*    */     //   599: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   602: goto -> 607
/*    */     //   605: aload #8
/*    */     //   607: areturn
/*    */     //   608: new java/lang/IllegalStateException
/*    */     //   611: dup
/*    */     //   612: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   614: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   617: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 60
/*    */     //   #33	-> 97
/*    */     //   #34	-> 110
/*    */     //   #32	-> 141
/*    */     //   #35	-> 174
/*    */     //   #32	-> 206
/*    */     //   #35	-> 226
/*    */     //   #36	-> 234
/*    */     //   #37	-> 253
/*    */     //   #38	-> 258
/*    */     //   #39	-> 285
/*    */     //   #35	-> 305
/*    */     //   #42	-> 315
/*    */     //   #43	-> 316
/*    */     //   #44	-> 343
/*    */     //   #42	-> 356
/*    */     //   #46	-> 358
/*    */     //   #47	-> 359
/*    */     //   #48	-> 380
/*    */     //   #46	-> 387
/*    */     //   #51	-> 389
/*    */     //   #52	-> 405
/*    */     //   #51	-> 413
/*    */     //   #53	-> 416
/*    */     //   #51	-> 424
/*    */     //   #54	-> 427
/*    */     //   #51	-> 435
/*    */     //   #55	-> 438
/*    */     //   #51	-> 446
/*    */     //   #56	-> 449
/*    */     //   #51	-> 457
/*    */     //   #57	-> 461
/*    */     //   #51	-> 469
/*    */     //   #58	-> 473
/*    */     //   #51	-> 476
/*    */     //   #59	-> 480
/*    */     //   #51	-> 483
/*    */     //   #60	-> 487
/*    */     //   #51	-> 495
/*    */     //   #61	-> 499
/*    */     //   #51	-> 507
/*    */     //   #50	-> 509
/*    */     //   #62	-> 515
/*    */     //   #86	-> 524
/*    */     //   #62	-> 529
/*    */     //   #62	-> 550
/*    */     //   #62	-> 559
/*    */     //   #50	-> 565
/*    */     //   #63	-> 570
/*    */     //   #64	-> 571
/*    */     //   #65	-> 605
/*    */     //   #63	-> 607
/*    */     //   #32	-> 608
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;
/*    */     //   162	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;
/*    */     //   97	13	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   110	34	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   153	47	3	propertyProvider	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   174	35	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*    */     //   219	86	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*    */     //   313	231	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*    */     //   544	15	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*    */     //   559	46	4	parameters	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentParameters;
/*    */     //   315	168	5	editAction	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*    */     //   358	118	6	createAction	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/CreateFileAgentAction;
/*    */     //   389	16	7	searchProjectAction	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SearchProjectAction;
/*    */     //   570	35	8	actions	Ljava/util/List;
/*    */     //   605	2	8	actions	Ljava/util/List;
/*    */     //   529	15	10	$i$a$-takeIf-PythonIssueSingleStepAgentWorker$getAvailableActions$actions$1	I
/*    */     //   0	618	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	558	14	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	551	13	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getHiddenActions(@NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   11: astore #6
/*    */     //   13: aload #6
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #6
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker$getHiddenActions$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 217, 0 -> 88, 1 -> 139
/*    */     //   88: aload #5
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker$Companion;
/*    */     //   96: invokevirtual getSyntaxCheckers : ()Ljava/util/List;
/*    */     //   99: astore_3
/*    */     //   100: aload_0
/*    */     //   101: aload_1
/*    */     //   102: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*    */     //   107: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*    */     //   110: invokevirtual getPropertyProvider : ()Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;
/*    */     //   113: aload #6
/*    */     //   115: aload #6
/*    */     //   117: aload_3
/*    */     //   118: putfield L$0 : Ljava/lang/Object;
/*    */     //   121: aload #6
/*    */     //   123: iconst_1
/*    */     //   124: putfield label : I
/*    */     //   127: invokevirtual getAgentParameters : (Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   130: dup
/*    */     //   131: aload #7
/*    */     //   133: if_acmpne -> 155
/*    */     //   136: aload #7
/*    */     //   138: areturn
/*    */     //   139: aload #6
/*    */     //   141: getfield L$0 : Ljava/lang/Object;
/*    */     //   144: checkcast java/util/List
/*    */     //   147: astore_3
/*    */     //   148: aload #5
/*    */     //   150: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   153: aload #5
/*    */     //   155: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentParameters
/*    */     //   158: invokevirtual getUseEditSubagent : ()Z
/*    */     //   161: ifne -> 168
/*    */     //   164: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   167: areturn
/*    */     //   168: iconst_3
/*    */     //   169: anewarray com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*    */     //   172: astore #4
/*    */     //   174: aload #4
/*    */     //   176: iconst_0
/*    */     //   177: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace
/*    */     //   180: dup
/*    */     //   181: aload_3
/*    */     //   182: iconst_0
/*    */     //   183: invokespecial <init> : (Ljava/util/List;Z)V
/*    */     //   186: aastore
/*    */     //   187: aload #4
/*    */     //   189: iconst_1
/*    */     //   190: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditAgentAction
/*    */     //   193: dup
/*    */     //   194: aload_3
/*    */     //   195: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   198: aastore
/*    */     //   199: aload #4
/*    */     //   201: iconst_2
/*    */     //   202: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/RewriteFileAction
/*    */     //   205: dup
/*    */     //   206: aload_3
/*    */     //   207: invokespecial <init> : (Ljava/util/List;)V
/*    */     //   210: aastore
/*    */     //   211: aload #4
/*    */     //   213: invokestatic listOf : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   216: areturn
/*    */     //   217: new java/lang/IllegalStateException
/*    */     //   220: dup
/*    */     //   221: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   223: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   226: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #69	-> 60
/*    */     //   #70	-> 93
/*    */     //   #71	-> 100
/*    */     //   #69	-> 136
/*    */     //   #71	-> 155
/*    */     //   #72	-> 164
/*    */     //   #75	-> 168
/*    */     //   #76	-> 190
/*    */     //   #75	-> 199
/*    */     //   #77	-> 202
/*    */     //   #75	-> 211
/*    */     //   #74	-> 213
/*    */     //   #69	-> 217
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/PythonIssueSingleStepAgentWorker;
/*    */     //   93	37	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   100	39	3	checkers	Ljava/util/List;
/*    */     //   148	69	3	checkers	Ljava/util/List;
/*    */     //   0	227	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	167	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	160	5	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object getDemonstration(@NotNull Continuation $completion) {
/* 82 */     if (getClass().getResource("/swe_demonstrations/marshmallow_1867_search_everywhere_drop_bash_prompt.txt") != null) { URL uRL = getClass().getResource("/swe_demonstrations/marshmallow_1867_search_everywhere_drop_bash_prompt.txt"); Charset charset = Charsets.UTF_8; byte[] arrayOfByte = TextStreamsKt.readBytes(uRL); } else { new String(arrayOfByte, charset); }  Intrinsics.checkNotNull(null); return null;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonIssueSingleStepAgentWorker.kt", l = {26, 28}, i = {0}, s = {"L$0"}, n = {"propertyProvider"}, m = "getAgentParameters", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PythonIssueSingleStepAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PythonIssueSingleStepAgentWorker$getAgentParameters$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     PythonIssueSingleStepAgentWorker$getAgentParameters$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonIssueSingleStepAgentWorker.this.getAgentParameters(null, (Continuation<? super AgentParameters>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonIssueSingleStepAgentWorker.kt", l = {34, 35}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"this", "propertyProvider", "parameters"}, m = "getAvailableActions", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PythonIssueSingleStepAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PythonIssueSingleStepAgentWorker$getAvailableActions$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     PythonIssueSingleStepAgentWorker$getAvailableActions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonIssueSingleStepAgentWorker.this.getAvailableActions(null, (Continuation<? super List<? extends AgentAction>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "PythonIssueSingleStepAgentWorker.kt", l = {71}, i = {0}, s = {"L$0"}, n = {"checkers"}, m = "getHiddenActions", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.PythonIssueSingleStepAgentWorker")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class PythonIssueSingleStepAgentWorker$getHiddenActions$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     PythonIssueSingleStepAgentWorker$getHiddenActions$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return PythonIssueSingleStepAgentWorker.this.getHiddenActions(null, (Continuation<? super List<? extends AgentAction>>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\PythonIssueSingleStepAgentWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */