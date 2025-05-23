/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\005\b&\030\000 \0232\016\022\004\022\0020\002\022\004\022\0020\0030\001:\001\023B\007¢\006\004\b\004\020\005J$\020\006\032\b\022\004\022\0020\0030\0072\006\020\b\032\0020\0022\006\020\t\032\0020\nH@¢\006\002\020\013J\036\020\f\032\0020\r2\006\020\b\032\0020\0022\006\020\016\032\0020\017H@¢\006\002\020\020J\036\020\021\032\0020\r2\006\020\b\032\0020\0022\006\020\016\032\0020\017H@¢\006\002\020\020J\020\020\022\032\0020\0172\006\020\t\032\0020\nH\004¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker;", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;", "Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;", "", "<init>", "()V", "produceArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;", "input", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFileStructureAction", "", "agentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkFileChecker", "initEnvironment", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractProjectCheckWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractProjectCheckWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,115:1\n14#2:116\n*S KotlinDebug\n*F\n+ 1 AbstractProjectCheckWorker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker\n*L\n28#1:116\n*E\n"})
/*     */ public abstract class AbstractProjectCheckWorker implements ArtifactRequestExecutor<ProjectCheckInput, Boolean> {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion { @NotNull
/*  28 */     public final Logger getLogger() { return AbstractProjectCheckWorker.logger; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 116 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AbstractProjectCheckWorker.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(AbstractProjectCheckWorker.class);
/*     */   
/*     */   @Nullable
/*     */   protected final Object checkFileStructureAction(@NotNull ProjectCheckInput input, @NotNull ExecutionAgentContext agentContext, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileStructureAction$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileStructureAction$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileStructureAction$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 368, 0 -> 88, 1 -> 226
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: invokevirtual getFilesToCheck : ()Ljava/util/List;
/*     */     //   97: checkcast java/lang/Iterable
/*     */     //   100: ldc ';'
/*     */     //   102: checkcast java/lang/CharSequence
/*     */     //   105: aconst_null
/*     */     //   106: aconst_null
/*     */     //   107: iconst_0
/*     */     //   108: aconst_null
/*     */     //   109: aconst_null
/*     */     //   110: bipush #62
/*     */     //   112: aconst_null
/*     */     //   113: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   116: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   121: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   124: swap
/*     */     //   125: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   128: aload_1
/*     */     //   129: invokevirtual getFilesToCheck : ()Ljava/util/List;
/*     */     //   132: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   137: astore #4
/*     */     //   139: aload #4
/*     */     //   141: invokeinterface hasNext : ()Z
/*     */     //   146: ifeq -> 364
/*     */     //   149: aload #4
/*     */     //   151: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   156: checkcast java/lang/String
/*     */     //   159: astore #5
/*     */     //   161: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   164: dup
/*     */     //   165: ldc 'get_file_structure'
/*     */     //   167: aload #5
/*     */     //   169: ldc ''
/*     */     //   171: iconst_0
/*     */     //   172: bipush #8
/*     */     //   174: aconst_null
/*     */     //   175: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   178: astore #6
/*     */     //   180: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   183: dup
/*     */     //   184: invokespecial <init> : ()V
/*     */     //   187: aload #6
/*     */     //   189: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   192: aload_2
/*     */     //   193: aload #9
/*     */     //   195: aload #9
/*     */     //   197: aload_2
/*     */     //   198: putfield L$0 : Ljava/lang/Object;
/*     */     //   201: aload #9
/*     */     //   203: aload #4
/*     */     //   205: putfield L$1 : Ljava/lang/Object;
/*     */     //   208: aload #9
/*     */     //   210: iconst_1
/*     */     //   211: putfield label : I
/*     */     //   214: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   217: dup
/*     */     //   218: aload #10
/*     */     //   220: if_acmpne -> 252
/*     */     //   223: aload #10
/*     */     //   225: areturn
/*     */     //   226: aload #9
/*     */     //   228: getfield L$1 : Ljava/lang/Object;
/*     */     //   231: checkcast java/util/Iterator
/*     */     //   234: astore #4
/*     */     //   236: aload #9
/*     */     //   238: getfield L$0 : Ljava/lang/Object;
/*     */     //   241: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   244: astore_2
/*     */     //   245: aload #8
/*     */     //   247: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   250: aload #8
/*     */     //   252: checkcast java/lang/String
/*     */     //   255: astore #7
/*     */     //   257: ldc 'FILE STRUCTURE:'
/*     */     //   259: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   262: swap
/*     */     //   263: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   266: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   269: aload #7
/*     */     //   271: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   274: aload #7
/*     */     //   276: checkcast java/lang/CharSequence
/*     */     //   279: ldc 'ERROR:'
/*     */     //   281: checkcast java/lang/CharSequence
/*     */     //   284: iconst_0
/*     */     //   285: iconst_2
/*     */     //   286: aconst_null
/*     */     //   287: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   290: ifne -> 349
/*     */     //   293: aload #7
/*     */     //   295: checkcast java/lang/CharSequence
/*     */     //   298: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   301: invokeinterface size : ()I
/*     */     //   306: bipush #10
/*     */     //   308: if_icmple -> 139
/*     */     //   311: aload #7
/*     */     //   313: checkcast java/lang/CharSequence
/*     */     //   316: ldc '##### Structure'
/*     */     //   318: checkcast java/lang/CharSequence
/*     */     //   321: iconst_0
/*     */     //   322: iconst_2
/*     */     //   323: aconst_null
/*     */     //   324: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   327: ifne -> 139
/*     */     //   330: aload #7
/*     */     //   332: checkcast java/lang/CharSequence
/*     */     //   335: ldc 'we will display the entire content'
/*     */     //   337: checkcast java/lang/CharSequence
/*     */     //   340: iconst_0
/*     */     //   341: iconst_2
/*     */     //   342: aconst_null
/*     */     //   343: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   346: ifne -> 139
/*     */     //   349: new java/lang/RuntimeException
/*     */     //   352: dup
/*     */     //   353: aload #7
/*     */     //   355: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   360: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   363: athrow
/*     */     //   364: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   367: areturn
/*     */     //   368: new java/lang/IllegalStateException
/*     */     //   371: dup
/*     */     //   372: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   374: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   377: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 60
/*     */     //   #44	-> 93
/*     */     //   #45	-> 128
/*     */     //   #46	-> 161
/*     */     //   #47	-> 180
/*     */     //   #40	-> 223
/*     */     //   #49	-> 257
/*     */     //   #50	-> 266
/*     */     //   #52	-> 274
/*     */     //   #53	-> 293
/*     */     //   #55	-> 349
/*     */     //   #58	-> 364
/*     */     //   #40	-> 368
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	35	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*     */     //   128	11	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*     */     //   93	35	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   128	98	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   245	21	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   266	8	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   274	75	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   364	4	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   161	19	5	file	Ljava/lang/String;
/*     */     //   180	37	6	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   257	9	7	fileStructureResult	Ljava/lang/String;
/*     */     //   266	8	7	fileStructureResult	Ljava/lang/String;
/*     */     //   274	90	7	fileStructureResult	Ljava/lang/String;
/*     */     //   0	378	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	318	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	311	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   protected final Object checkFileChecker(@NotNull ProjectCheckInput input, @NotNull ExecutionAgentContext agentContext, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileChecker$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileChecker$1
/*     */     //   11: astore #17
/*     */     //   13: aload #17
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #17
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker$checkFileChecker$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AbstractProjectCheckWorker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #17
/*     */     //   50: aload #17
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #16
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #18
/*     */     //   62: aload #17
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1802, 0 -> 120, 1 -> 239, 2 -> 363, 3 -> 498, 4 -> 704, 5 -> 1025, 6 -> 1180, 7 -> 1390, 8 -> 1655, 9 -> 1777
/*     */     //   120: aload #16
/*     */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   125: aload_1
/*     */     //   126: invokevirtual getFilesToCheck : ()Ljava/util/List;
/*     */     //   129: checkcast java/lang/Iterable
/*     */     //   132: ldc ';'
/*     */     //   134: checkcast java/lang/CharSequence
/*     */     //   137: aconst_null
/*     */     //   138: aconst_null
/*     */     //   139: iconst_0
/*     */     //   140: aconst_null
/*     */     //   141: aconst_null
/*     */     //   142: bipush #62
/*     */     //   144: aconst_null
/*     */     //   145: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   148: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   153: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   156: swap
/*     */     //   157: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   160: aload_1
/*     */     //   161: invokevirtual getFilesToCheck : ()Ljava/util/List;
/*     */     //   164: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   169: astore #4
/*     */     //   171: aload #4
/*     */     //   173: invokeinterface hasNext : ()Z
/*     */     //   178: ifeq -> 1798
/*     */     //   181: aload #4
/*     */     //   183: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   188: checkcast java/lang/String
/*     */     //   191: astore #5
/*     */     //   193: aload #5
/*     */     //   195: aload_2
/*     */     //   196: iconst_0
/*     */     //   197: aload #17
/*     */     //   199: iconst_4
/*     */     //   200: aconst_null
/*     */     //   201: aload #17
/*     */     //   203: aload_2
/*     */     //   204: putfield L$0 : Ljava/lang/Object;
/*     */     //   207: aload #17
/*     */     //   209: aload #4
/*     */     //   211: putfield L$1 : Ljava/lang/Object;
/*     */     //   214: aload #17
/*     */     //   216: aload #5
/*     */     //   218: putfield L$2 : Ljava/lang/Object;
/*     */     //   221: aload #17
/*     */     //   223: iconst_1
/*     */     //   224: putfield label : I
/*     */     //   227: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   230: dup
/*     */     //   231: aload #18
/*     */     //   233: if_acmpne -> 275
/*     */     //   236: aload #18
/*     */     //   238: areturn
/*     */     //   239: aload #17
/*     */     //   241: getfield L$2 : Ljava/lang/Object;
/*     */     //   244: checkcast java/lang/String
/*     */     //   247: astore #5
/*     */     //   249: aload #17
/*     */     //   251: getfield L$1 : Ljava/lang/Object;
/*     */     //   254: checkcast java/util/Iterator
/*     */     //   257: astore #4
/*     */     //   259: aload #17
/*     */     //   261: getfield L$0 : Ljava/lang/Object;
/*     */     //   264: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   267: astore_2
/*     */     //   268: aload #16
/*     */     //   270: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   273: aload #16
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   278: astore #6
/*     */     //   280: aload #6
/*     */     //   282: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   285: ifeq -> 303
/*     */     //   288: new java/lang/RuntimeException
/*     */     //   291: dup
/*     */     //   292: aload #5
/*     */     //   294: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   299: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   302: athrow
/*     */     //   303: aload #6
/*     */     //   305: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.Result.Ok<com.intellij.openapi.vfs.VirtualFile>'
/*     */     //   307: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   310: aload #6
/*     */     //   312: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   315: pop
/*     */     //   316: aload #6
/*     */     //   318: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;)Lkotlin/jvm/functions/Function0;
/*     */     //   323: aload #17
/*     */     //   325: aload #17
/*     */     //   327: aload_2
/*     */     //   328: putfield L$0 : Ljava/lang/Object;
/*     */     //   331: aload #17
/*     */     //   333: aload #4
/*     */     //   335: putfield L$1 : Ljava/lang/Object;
/*     */     //   338: aload #17
/*     */     //   340: aload #5
/*     */     //   342: putfield L$2 : Ljava/lang/Object;
/*     */     //   345: aload #17
/*     */     //   347: iconst_2
/*     */     //   348: putfield label : I
/*     */     //   351: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   354: dup
/*     */     //   355: aload #18
/*     */     //   357: if_acmpne -> 399
/*     */     //   360: aload #18
/*     */     //   362: areturn
/*     */     //   363: aload #17
/*     */     //   365: getfield L$2 : Ljava/lang/Object;
/*     */     //   368: checkcast java/lang/String
/*     */     //   371: astore #5
/*     */     //   373: aload #17
/*     */     //   375: getfield L$1 : Ljava/lang/Object;
/*     */     //   378: checkcast java/util/Iterator
/*     */     //   381: astore #4
/*     */     //   383: aload #17
/*     */     //   385: getfield L$0 : Ljava/lang/Object;
/*     */     //   388: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   391: astore_2
/*     */     //   392: aload #16
/*     */     //   394: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   397: aload #16
/*     */     //   399: checkcast com/intellij/openapi/editor/Document
/*     */     //   402: dup
/*     */     //   403: ifnonnull -> 422
/*     */     //   406: pop
/*     */     //   407: new java/lang/RuntimeException
/*     */     //   410: dup
/*     */     //   411: aload #5
/*     */     //   413: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   418: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   421: athrow
/*     */     //   422: astore #7
/*     */     //   424: aload_2
/*     */     //   425: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   430: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   433: astore #8
/*     */     //   435: aload #8
/*     */     //   437: aload #7
/*     */     //   439: <illegal opcode> invoke : (Lcom/intellij/psi/PsiDocumentManager;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   444: aload #17
/*     */     //   446: aload #17
/*     */     //   448: aload_2
/*     */     //   449: putfield L$0 : Ljava/lang/Object;
/*     */     //   452: aload #17
/*     */     //   454: aload #4
/*     */     //   456: putfield L$1 : Ljava/lang/Object;
/*     */     //   459: aload #17
/*     */     //   461: aload #5
/*     */     //   463: putfield L$2 : Ljava/lang/Object;
/*     */     //   466: aload #17
/*     */     //   468: aload #7
/*     */     //   470: putfield L$3 : Ljava/lang/Object;
/*     */     //   473: aload #17
/*     */     //   475: aload #8
/*     */     //   477: putfield L$4 : Ljava/lang/Object;
/*     */     //   480: aload #17
/*     */     //   482: iconst_3
/*     */     //   483: putfield label : I
/*     */     //   486: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   489: dup
/*     */     //   490: aload #18
/*     */     //   492: if_acmpne -> 554
/*     */     //   495: aload #18
/*     */     //   497: areturn
/*     */     //   498: aload #17
/*     */     //   500: getfield L$4 : Ljava/lang/Object;
/*     */     //   503: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   506: astore #8
/*     */     //   508: aload #17
/*     */     //   510: getfield L$3 : Ljava/lang/Object;
/*     */     //   513: checkcast com/intellij/openapi/editor/Document
/*     */     //   516: astore #7
/*     */     //   518: aload #17
/*     */     //   520: getfield L$2 : Ljava/lang/Object;
/*     */     //   523: checkcast java/lang/String
/*     */     //   526: astore #5
/*     */     //   528: aload #17
/*     */     //   530: getfield L$1 : Ljava/lang/Object;
/*     */     //   533: checkcast java/util/Iterator
/*     */     //   536: astore #4
/*     */     //   538: aload #17
/*     */     //   540: getfield L$0 : Ljava/lang/Object;
/*     */     //   543: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   546: astore_2
/*     */     //   547: aload #16
/*     */     //   549: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   552: aload #16
/*     */     //   554: checkcast com/intellij/psi/PsiFile
/*     */     //   557: astore #9
/*     */     //   559: new java/util/ArrayList
/*     */     //   562: dup
/*     */     //   563: invokespecial <init> : ()V
/*     */     //   566: checkcast java/util/List
/*     */     //   569: astore #10
/*     */     //   571: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker$Companion;
/*     */     //   574: invokevirtual getErrorCheckers : ()Ljava/util/List;
/*     */     //   577: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   582: astore #11
/*     */     //   584: aload #11
/*     */     //   586: invokeinterface hasNext : ()Z
/*     */     //   591: ifeq -> 815
/*     */     //   594: aload #11
/*     */     //   596: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   601: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker
/*     */     //   604: astore #12
/*     */     //   606: aload #10
/*     */     //   608: astore #15
/*     */     //   610: aload #12
/*     */     //   612: aload_2
/*     */     //   613: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   618: aload #9
/*     */     //   620: aload #17
/*     */     //   622: aload #17
/*     */     //   624: aload_2
/*     */     //   625: putfield L$0 : Ljava/lang/Object;
/*     */     //   628: aload #17
/*     */     //   630: aload #4
/*     */     //   632: putfield L$1 : Ljava/lang/Object;
/*     */     //   635: aload #17
/*     */     //   637: aload #5
/*     */     //   639: putfield L$2 : Ljava/lang/Object;
/*     */     //   642: aload #17
/*     */     //   644: aload #7
/*     */     //   646: putfield L$3 : Ljava/lang/Object;
/*     */     //   649: aload #17
/*     */     //   651: aload #8
/*     */     //   653: putfield L$4 : Ljava/lang/Object;
/*     */     //   656: aload #17
/*     */     //   658: aload #9
/*     */     //   660: putfield L$5 : Ljava/lang/Object;
/*     */     //   663: aload #17
/*     */     //   665: aload #10
/*     */     //   667: putfield L$6 : Ljava/lang/Object;
/*     */     //   670: aload #17
/*     */     //   672: aload #11
/*     */     //   674: putfield L$7 : Ljava/lang/Object;
/*     */     //   677: aload #17
/*     */     //   679: aload #15
/*     */     //   681: putfield L$8 : Ljava/lang/Object;
/*     */     //   684: aload #17
/*     */     //   686: iconst_4
/*     */     //   687: putfield label : I
/*     */     //   690: invokeinterface findErrors : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   695: dup
/*     */     //   696: aload #18
/*     */     //   698: if_acmpne -> 800
/*     */     //   701: aload #18
/*     */     //   703: areturn
/*     */     //   704: aload #17
/*     */     //   706: getfield L$8 : Ljava/lang/Object;
/*     */     //   709: checkcast java/util/List
/*     */     //   712: astore #15
/*     */     //   714: aload #17
/*     */     //   716: getfield L$7 : Ljava/lang/Object;
/*     */     //   719: checkcast java/util/Iterator
/*     */     //   722: astore #11
/*     */     //   724: aload #17
/*     */     //   726: getfield L$6 : Ljava/lang/Object;
/*     */     //   729: checkcast java/util/List
/*     */     //   732: astore #10
/*     */     //   734: aload #17
/*     */     //   736: getfield L$5 : Ljava/lang/Object;
/*     */     //   739: checkcast com/intellij/psi/PsiFile
/*     */     //   742: astore #9
/*     */     //   744: aload #17
/*     */     //   746: getfield L$4 : Ljava/lang/Object;
/*     */     //   749: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   752: astore #8
/*     */     //   754: aload #17
/*     */     //   756: getfield L$3 : Ljava/lang/Object;
/*     */     //   759: checkcast com/intellij/openapi/editor/Document
/*     */     //   762: astore #7
/*     */     //   764: aload #17
/*     */     //   766: getfield L$2 : Ljava/lang/Object;
/*     */     //   769: checkcast java/lang/String
/*     */     //   772: astore #5
/*     */     //   774: aload #17
/*     */     //   776: getfield L$1 : Ljava/lang/Object;
/*     */     //   779: checkcast java/util/Iterator
/*     */     //   782: astore #4
/*     */     //   784: aload #17
/*     */     //   786: getfield L$0 : Ljava/lang/Object;
/*     */     //   789: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   792: astore_2
/*     */     //   793: aload #16
/*     */     //   795: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   798: aload #16
/*     */     //   800: aload #15
/*     */     //   802: swap
/*     */     //   803: checkcast java/util/Collection
/*     */     //   806: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   811: pop
/*     */     //   812: goto -> 584
/*     */     //   815: aload #10
/*     */     //   817: checkcast java/lang/Iterable
/*     */     //   820: ldc_w '\\n'
/*     */     //   823: checkcast java/lang/CharSequence
/*     */     //   826: aconst_null
/*     */     //   827: aconst_null
/*     */     //   828: iconst_0
/*     */     //   829: aconst_null
/*     */     //   830: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   835: bipush #30
/*     */     //   837: aconst_null
/*     */     //   838: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   841: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   846: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   849: swap
/*     */     //   850: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   853: aload #10
/*     */     //   855: checkcast java/util/Collection
/*     */     //   858: invokeinterface isEmpty : ()Z
/*     */     //   863: ifne -> 870
/*     */     //   866: iconst_1
/*     */     //   867: goto -> 871
/*     */     //   870: iconst_0
/*     */     //   871: ifeq -> 913
/*     */     //   874: new java/lang/RuntimeException
/*     */     //   877: dup
/*     */     //   878: aload #10
/*     */     //   880: checkcast java/lang/Iterable
/*     */     //   883: ldc_w '\\n'
/*     */     //   886: checkcast java/lang/CharSequence
/*     */     //   889: aconst_null
/*     */     //   890: aconst_null
/*     */     //   891: iconst_0
/*     */     //   892: aconst_null
/*     */     //   893: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   898: bipush #30
/*     */     //   900: aconst_null
/*     */     //   901: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   904: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   909: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   912: athrow
/*     */     //   913: aload #7
/*     */     //   915: invokeinterface getText : ()Ljava/lang/String;
/*     */     //   920: dup
/*     */     //   921: ldc_w 'getText(...)'
/*     */     //   924: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   927: astore #11
/*     */     //   929: nop
/*     */     //   930: aload_2
/*     */     //   931: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   936: aload #7
/*     */     //   938: ldc_w '<?php Hello from junie'
/*     */     //   941: aconst_null
/*     */     //   942: aload #17
/*     */     //   944: bipush #8
/*     */     //   946: aconst_null
/*     */     //   947: aload #17
/*     */     //   949: aload_2
/*     */     //   950: putfield L$0 : Ljava/lang/Object;
/*     */     //   953: aload #17
/*     */     //   955: aload #4
/*     */     //   957: putfield L$1 : Ljava/lang/Object;
/*     */     //   960: aload #17
/*     */     //   962: aload #5
/*     */     //   964: putfield L$2 : Ljava/lang/Object;
/*     */     //   967: aload #17
/*     */     //   969: aload #7
/*     */     //   971: putfield L$3 : Ljava/lang/Object;
/*     */     //   974: aload #17
/*     */     //   976: aload #8
/*     */     //   978: putfield L$4 : Ljava/lang/Object;
/*     */     //   981: aload #17
/*     */     //   983: aload #10
/*     */     //   985: putfield L$5 : Ljava/lang/Object;
/*     */     //   988: aload #17
/*     */     //   990: aload #11
/*     */     //   992: putfield L$6 : Ljava/lang/Object;
/*     */     //   995: aload #17
/*     */     //   997: aconst_null
/*     */     //   998: putfield L$7 : Ljava/lang/Object;
/*     */     //   1001: aload #17
/*     */     //   1003: aconst_null
/*     */     //   1004: putfield L$8 : Ljava/lang/Object;
/*     */     //   1007: aload #17
/*     */     //   1009: iconst_5
/*     */     //   1010: putfield label : I
/*     */     //   1013: invokestatic updateDocument$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1016: dup
/*     */     //   1017: aload #18
/*     */     //   1019: if_acmpne -> 1102
/*     */     //   1022: aload #18
/*     */     //   1024: areturn
/*     */     //   1025: aload #17
/*     */     //   1027: getfield L$6 : Ljava/lang/Object;
/*     */     //   1030: checkcast java/lang/String
/*     */     //   1033: astore #11
/*     */     //   1035: aload #17
/*     */     //   1037: getfield L$5 : Ljava/lang/Object;
/*     */     //   1040: checkcast java/util/List
/*     */     //   1043: astore #10
/*     */     //   1045: aload #17
/*     */     //   1047: getfield L$4 : Ljava/lang/Object;
/*     */     //   1050: checkcast com/intellij/psi/PsiDocumentManager
/*     */     //   1053: astore #8
/*     */     //   1055: aload #17
/*     */     //   1057: getfield L$3 : Ljava/lang/Object;
/*     */     //   1060: checkcast com/intellij/openapi/editor/Document
/*     */     //   1063: astore #7
/*     */     //   1065: aload #17
/*     */     //   1067: getfield L$2 : Ljava/lang/Object;
/*     */     //   1070: checkcast java/lang/String
/*     */     //   1073: astore #5
/*     */     //   1075: aload #17
/*     */     //   1077: getfield L$1 : Ljava/lang/Object;
/*     */     //   1080: checkcast java/util/Iterator
/*     */     //   1083: astore #4
/*     */     //   1085: aload #17
/*     */     //   1087: getfield L$0 : Ljava/lang/Object;
/*     */     //   1090: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1093: astore_2
/*     */     //   1094: nop
/*     */     //   1095: aload #16
/*     */     //   1097: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1100: aload #16
/*     */     //   1102: pop
/*     */     //   1103: aload #8
/*     */     //   1105: aload #7
/*     */     //   1107: <illegal opcode> invoke : (Lcom/intellij/psi/PsiDocumentManager;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   1112: aload #17
/*     */     //   1114: aload #17
/*     */     //   1116: aload_2
/*     */     //   1117: putfield L$0 : Ljava/lang/Object;
/*     */     //   1120: aload #17
/*     */     //   1122: aload #4
/*     */     //   1124: putfield L$1 : Ljava/lang/Object;
/*     */     //   1127: aload #17
/*     */     //   1129: aload #5
/*     */     //   1131: putfield L$2 : Ljava/lang/Object;
/*     */     //   1134: aload #17
/*     */     //   1136: aload #7
/*     */     //   1138: putfield L$3 : Ljava/lang/Object;
/*     */     //   1141: aload #17
/*     */     //   1143: aload #10
/*     */     //   1145: putfield L$4 : Ljava/lang/Object;
/*     */     //   1148: aload #17
/*     */     //   1150: aload #11
/*     */     //   1152: putfield L$5 : Ljava/lang/Object;
/*     */     //   1155: aload #17
/*     */     //   1157: aconst_null
/*     */     //   1158: putfield L$6 : Ljava/lang/Object;
/*     */     //   1161: aload #17
/*     */     //   1163: bipush #6
/*     */     //   1165: putfield label : I
/*     */     //   1168: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1171: dup
/*     */     //   1172: aload #18
/*     */     //   1174: if_acmpne -> 1247
/*     */     //   1177: aload #18
/*     */     //   1179: areturn
/*     */     //   1180: aload #17
/*     */     //   1182: getfield L$5 : Ljava/lang/Object;
/*     */     //   1185: checkcast java/lang/String
/*     */     //   1188: astore #11
/*     */     //   1190: aload #17
/*     */     //   1192: getfield L$4 : Ljava/lang/Object;
/*     */     //   1195: checkcast java/util/List
/*     */     //   1198: astore #10
/*     */     //   1200: aload #17
/*     */     //   1202: getfield L$3 : Ljava/lang/Object;
/*     */     //   1205: checkcast com/intellij/openapi/editor/Document
/*     */     //   1208: astore #7
/*     */     //   1210: aload #17
/*     */     //   1212: getfield L$2 : Ljava/lang/Object;
/*     */     //   1215: checkcast java/lang/String
/*     */     //   1218: astore #5
/*     */     //   1220: aload #17
/*     */     //   1222: getfield L$1 : Ljava/lang/Object;
/*     */     //   1225: checkcast java/util/Iterator
/*     */     //   1228: astore #4
/*     */     //   1230: aload #17
/*     */     //   1232: getfield L$0 : Ljava/lang/Object;
/*     */     //   1235: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1238: astore_2
/*     */     //   1239: nop
/*     */     //   1240: aload #16
/*     */     //   1242: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1245: aload #16
/*     */     //   1247: dup
/*     */     //   1248: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1251: checkcast com/intellij/psi/PsiFile
/*     */     //   1254: astore #12
/*     */     //   1256: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker$Companion;
/*     */     //   1259: invokevirtual getErrorCheckers : ()Ljava/util/List;
/*     */     //   1262: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   1267: astore #13
/*     */     //   1269: aload #13
/*     */     //   1271: invokeinterface hasNext : ()Z
/*     */     //   1276: ifeq -> 1502
/*     */     //   1279: aload #13
/*     */     //   1281: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   1286: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker
/*     */     //   1289: astore #14
/*     */     //   1291: aload #10
/*     */     //   1293: astore #15
/*     */     //   1295: aload #14
/*     */     //   1297: aload_2
/*     */     //   1298: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   1303: aload #12
/*     */     //   1305: aload #17
/*     */     //   1307: aload #17
/*     */     //   1309: aload_2
/*     */     //   1310: putfield L$0 : Ljava/lang/Object;
/*     */     //   1313: aload #17
/*     */     //   1315: aload #4
/*     */     //   1317: putfield L$1 : Ljava/lang/Object;
/*     */     //   1320: aload #17
/*     */     //   1322: aload #5
/*     */     //   1324: putfield L$2 : Ljava/lang/Object;
/*     */     //   1327: aload #17
/*     */     //   1329: aload #7
/*     */     //   1331: putfield L$3 : Ljava/lang/Object;
/*     */     //   1334: aload #17
/*     */     //   1336: aload #10
/*     */     //   1338: putfield L$4 : Ljava/lang/Object;
/*     */     //   1341: aload #17
/*     */     //   1343: aload #11
/*     */     //   1345: putfield L$5 : Ljava/lang/Object;
/*     */     //   1348: aload #17
/*     */     //   1350: aload #12
/*     */     //   1352: putfield L$6 : Ljava/lang/Object;
/*     */     //   1355: aload #17
/*     */     //   1357: aload #13
/*     */     //   1359: putfield L$7 : Ljava/lang/Object;
/*     */     //   1362: aload #17
/*     */     //   1364: aload #15
/*     */     //   1366: putfield L$8 : Ljava/lang/Object;
/*     */     //   1369: aload #17
/*     */     //   1371: bipush #7
/*     */     //   1373: putfield label : I
/*     */     //   1376: invokeinterface findErrors : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1381: dup
/*     */     //   1382: aload #18
/*     */     //   1384: if_acmpne -> 1487
/*     */     //   1387: aload #18
/*     */     //   1389: areturn
/*     */     //   1390: aload #17
/*     */     //   1392: getfield L$8 : Ljava/lang/Object;
/*     */     //   1395: checkcast java/util/List
/*     */     //   1398: astore #15
/*     */     //   1400: aload #17
/*     */     //   1402: getfield L$7 : Ljava/lang/Object;
/*     */     //   1405: checkcast java/util/Iterator
/*     */     //   1408: astore #13
/*     */     //   1410: aload #17
/*     */     //   1412: getfield L$6 : Ljava/lang/Object;
/*     */     //   1415: checkcast com/intellij/psi/PsiFile
/*     */     //   1418: astore #12
/*     */     //   1420: aload #17
/*     */     //   1422: getfield L$5 : Ljava/lang/Object;
/*     */     //   1425: checkcast java/lang/String
/*     */     //   1428: astore #11
/*     */     //   1430: aload #17
/*     */     //   1432: getfield L$4 : Ljava/lang/Object;
/*     */     //   1435: checkcast java/util/List
/*     */     //   1438: astore #10
/*     */     //   1440: aload #17
/*     */     //   1442: getfield L$3 : Ljava/lang/Object;
/*     */     //   1445: checkcast com/intellij/openapi/editor/Document
/*     */     //   1448: astore #7
/*     */     //   1450: aload #17
/*     */     //   1452: getfield L$2 : Ljava/lang/Object;
/*     */     //   1455: checkcast java/lang/String
/*     */     //   1458: astore #5
/*     */     //   1460: aload #17
/*     */     //   1462: getfield L$1 : Ljava/lang/Object;
/*     */     //   1465: checkcast java/util/Iterator
/*     */     //   1468: astore #4
/*     */     //   1470: aload #17
/*     */     //   1472: getfield L$0 : Ljava/lang/Object;
/*     */     //   1475: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1478: astore_2
/*     */     //   1479: nop
/*     */     //   1480: aload #16
/*     */     //   1482: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1485: aload #16
/*     */     //   1487: aload #15
/*     */     //   1489: swap
/*     */     //   1490: checkcast java/util/Collection
/*     */     //   1493: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   1498: pop
/*     */     //   1499: goto -> 1269
/*     */     //   1502: aload #10
/*     */     //   1504: checkcast java/lang/Iterable
/*     */     //   1507: ldc_w '\\n'
/*     */     //   1510: checkcast java/lang/CharSequence
/*     */     //   1513: aconst_null
/*     */     //   1514: aconst_null
/*     */     //   1515: iconst_0
/*     */     //   1516: aconst_null
/*     */     //   1517: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   1522: bipush #30
/*     */     //   1524: aconst_null
/*     */     //   1525: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1528: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1533: getstatic java/lang/System.out : Ljava/io/PrintStream;
/*     */     //   1536: swap
/*     */     //   1537: invokevirtual println : (Ljava/lang/Object;)V
/*     */     //   1540: aload #10
/*     */     //   1542: invokeinterface isEmpty : ()Z
/*     */     //   1547: ifeq -> 1565
/*     */     //   1550: new java/lang/RuntimeException
/*     */     //   1553: dup
/*     */     //   1554: aload #5
/*     */     //   1556: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1561: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1564: athrow
/*     */     //   1565: aload_2
/*     */     //   1566: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   1571: aload #7
/*     */     //   1573: aload #11
/*     */     //   1575: aconst_null
/*     */     //   1576: aload #17
/*     */     //   1578: bipush #8
/*     */     //   1580: aconst_null
/*     */     //   1581: aload #17
/*     */     //   1583: aload_2
/*     */     //   1584: putfield L$0 : Ljava/lang/Object;
/*     */     //   1587: aload #17
/*     */     //   1589: aload #4
/*     */     //   1591: putfield L$1 : Ljava/lang/Object;
/*     */     //   1594: aload #17
/*     */     //   1596: aconst_null
/*     */     //   1597: putfield L$2 : Ljava/lang/Object;
/*     */     //   1600: aload #17
/*     */     //   1602: aconst_null
/*     */     //   1603: putfield L$3 : Ljava/lang/Object;
/*     */     //   1606: aload #17
/*     */     //   1608: aconst_null
/*     */     //   1609: putfield L$4 : Ljava/lang/Object;
/*     */     //   1612: aload #17
/*     */     //   1614: aconst_null
/*     */     //   1615: putfield L$5 : Ljava/lang/Object;
/*     */     //   1618: aload #17
/*     */     //   1620: aconst_null
/*     */     //   1621: putfield L$6 : Ljava/lang/Object;
/*     */     //   1624: aload #17
/*     */     //   1626: aconst_null
/*     */     //   1627: putfield L$7 : Ljava/lang/Object;
/*     */     //   1630: aload #17
/*     */     //   1632: aconst_null
/*     */     //   1633: putfield L$8 : Ljava/lang/Object;
/*     */     //   1636: aload #17
/*     */     //   1638: bipush #8
/*     */     //   1640: putfield label : I
/*     */     //   1643: invokestatic updateDocument$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1646: dup
/*     */     //   1647: aload #18
/*     */     //   1649: if_acmpne -> 1681
/*     */     //   1652: aload #18
/*     */     //   1654: areturn
/*     */     //   1655: aload #17
/*     */     //   1657: getfield L$1 : Ljava/lang/Object;
/*     */     //   1660: checkcast java/util/Iterator
/*     */     //   1663: astore #4
/*     */     //   1665: aload #17
/*     */     //   1667: getfield L$0 : Ljava/lang/Object;
/*     */     //   1670: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1673: astore_2
/*     */     //   1674: aload #16
/*     */     //   1676: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1679: aload #16
/*     */     //   1681: pop
/*     */     //   1682: goto -> 171
/*     */     //   1685: astore #12
/*     */     //   1687: aload_2
/*     */     //   1688: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   1693: aload #7
/*     */     //   1695: aload #11
/*     */     //   1697: aconst_null
/*     */     //   1698: aload #17
/*     */     //   1700: bipush #8
/*     */     //   1702: aconst_null
/*     */     //   1703: aload #17
/*     */     //   1705: aload #12
/*     */     //   1707: putfield L$0 : Ljava/lang/Object;
/*     */     //   1710: aload #17
/*     */     //   1712: aconst_null
/*     */     //   1713: putfield L$1 : Ljava/lang/Object;
/*     */     //   1716: aload #17
/*     */     //   1718: aconst_null
/*     */     //   1719: putfield L$2 : Ljava/lang/Object;
/*     */     //   1722: aload #17
/*     */     //   1724: aconst_null
/*     */     //   1725: putfield L$3 : Ljava/lang/Object;
/*     */     //   1728: aload #17
/*     */     //   1730: aconst_null
/*     */     //   1731: putfield L$4 : Ljava/lang/Object;
/*     */     //   1734: aload #17
/*     */     //   1736: aconst_null
/*     */     //   1737: putfield L$5 : Ljava/lang/Object;
/*     */     //   1740: aload #17
/*     */     //   1742: aconst_null
/*     */     //   1743: putfield L$6 : Ljava/lang/Object;
/*     */     //   1746: aload #17
/*     */     //   1748: aconst_null
/*     */     //   1749: putfield L$7 : Ljava/lang/Object;
/*     */     //   1752: aload #17
/*     */     //   1754: aconst_null
/*     */     //   1755: putfield L$8 : Ljava/lang/Object;
/*     */     //   1758: aload #17
/*     */     //   1760: bipush #9
/*     */     //   1762: putfield label : I
/*     */     //   1765: invokestatic updateDocument$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1768: dup
/*     */     //   1769: aload #18
/*     */     //   1771: if_acmpne -> 1794
/*     */     //   1774: aload #18
/*     */     //   1776: areturn
/*     */     //   1777: aload #17
/*     */     //   1779: getfield L$0 : Ljava/lang/Object;
/*     */     //   1782: checkcast java/lang/Throwable
/*     */     //   1785: astore #12
/*     */     //   1787: aload #16
/*     */     //   1789: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1792: aload #16
/*     */     //   1794: pop
/*     */     //   1795: aload #12
/*     */     //   1797: athrow
/*     */     //   1798: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   1801: areturn
/*     */     //   1802: new java/lang/IllegalStateException
/*     */     //   1805: dup
/*     */     //   1806: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1808: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1811: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #60	-> 60
/*     */     //   #64	-> 125
/*     */     //   #65	-> 160
/*     */     //   #66	-> 193
/*     */     //   #60	-> 236
/*     */     //   #67	-> 280
/*     */     //   #68	-> 288
/*     */     //   #71	-> 303
/*     */     //   #72	-> 316
/*     */     //   #60	-> 360
/*     */     //   #72	-> 399
/*     */     //   #74	-> 407
/*     */     //   #72	-> 422
/*     */     //   #76	-> 424
/*     */     //   #77	-> 435
/*     */     //   #60	-> 495
/*     */     //   #80	-> 559
/*     */     //   #80	-> 569
/*     */     //   #81	-> 571
/*     */     //   #82	-> 606
/*     */     //   #60	-> 701
/*     */     //   #82	-> 800
/*     */     //   #84	-> 815
/*     */     //   #85	-> 853
/*     */     //   #85	-> 871
/*     */     //   #86	-> 874
/*     */     //   #89	-> 913
/*     */     //   #90	-> 929
/*     */     //   #91	-> 930
/*     */     //   #60	-> 1022
/*     */     //   #93	-> 1102
/*     */     //   #60	-> 1177
/*     */     //   #93	-> 1247
/*     */     //   #94	-> 1256
/*     */     //   #95	-> 1291
/*     */     //   #60	-> 1387
/*     */     //   #95	-> 1487
/*     */     //   #97	-> 1502
/*     */     //   #98	-> 1540
/*     */     //   #99	-> 1550
/*     */     //   #103	-> 1565
/*     */     //   #60	-> 1652
/*     */     //   #104	-> 1681
/*     */     //   #103	-> 1685
/*     */     //   #60	-> 1774
/*     */     //   #103	-> 1794
/*     */     //   #106	-> 1798
/*     */     //   #60	-> 1802
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   125	35	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*     */     //   160	11	1	input	Lcom/intellij/ml/llm/matterhorn/ej/core/ProjectCheckInput;
/*     */     //   125	35	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   160	79	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   268	95	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   392	106	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   547	22	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   569	135	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   793	60	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   853	172	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1094	86	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1239	151	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1479	176	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1674	11	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1685	83	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1798	4	2	agentContext	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   193	46	5	file	Ljava/lang/String;
/*     */     //   249	114	5	file	Ljava/lang/String;
/*     */     //   373	125	5	file	Ljava/lang/String;
/*     */     //   528	41	5	file	Ljava/lang/String;
/*     */     //   569	135	5	file	Ljava/lang/String;
/*     */     //   774	79	5	file	Ljava/lang/String;
/*     */     //   853	172	5	file	Ljava/lang/String;
/*     */     //   1075	105	5	file	Ljava/lang/String;
/*     */     //   1220	170	5	file	Ljava/lang/String;
/*     */     //   1460	80	5	file	Ljava/lang/String;
/*     */     //   1540	25	5	file	Ljava/lang/String;
/*     */     //   280	8	6	openRes	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   303	51	6	openRes	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   424	74	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   518	51	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   569	135	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   764	89	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   853	172	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1065	115	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1210	180	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1450	90	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1540	106	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1685	83	7	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   435	63	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   508	61	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   569	135	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   754	99	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   853	172	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   1055	116	8	documentManager	Lcom/intellij/psi/PsiDocumentManager;
/*     */     //   559	10	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   569	135	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   744	71	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   571	133	10	errors	Ljava/util/List;
/*     */     //   734	119	10	errors	Ljava/util/List;
/*     */     //   853	172	10	errors	Ljava/util/List;
/*     */     //   1045	135	10	errors	Ljava/util/List;
/*     */     //   1200	190	10	errors	Ljava/util/List;
/*     */     //   1440	100	10	errors	Ljava/util/List;
/*     */     //   1540	10	10	errors	Ljava/util/List;
/*     */     //   929	96	11	originalText	Ljava/lang/String;
/*     */     //   1035	145	11	originalText	Ljava/lang/String;
/*     */     //   1190	200	11	originalText	Ljava/lang/String;
/*     */     //   1430	110	11	originalText	Ljava/lang/String;
/*     */     //   1540	106	11	originalText	Ljava/lang/String;
/*     */     //   1685	83	11	originalText	Ljava/lang/String;
/*     */     //   606	89	12	checker	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;
/*     */     //   1256	134	12	updatedPsiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   1420	145	12	updatedPsiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   1291	90	14	checker	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;
/*     */     //   0	1812	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1752	17	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1745	16	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   929	1016	1685	finally
/*     */     //   1094	1171	1685	finally
/*     */     //   1239	1381	1685	finally
/*     */     //   1479	1565	1685	finally
/*     */     //   1685	1687	1685	finally
/*     */   }
/*     */   
/*     */   private static final Document checkFileChecker$lambda$0(Result $openRes) {
/*     */     return FileDocumentManager.getInstance().getDocument(((Result.Ok<VirtualFile>)$openRes).getValue());
/*     */   }
/*     */   
/*     */   private static final PsiFile checkFileChecker$lambda$1(PsiDocumentManager $documentManager, Document $document) {
/*     */     if ($documentManager.getPsiFile($document) == null) {
/*     */       $documentManager.getPsiFile($document);
/*     */       throw new IllegalStateException("PSI file is expected to present if document is already obtained".toString());
/*     */     } 
/*     */     return $documentManager.getPsiFile($document);
/*     */   }
/*     */   
/*     */   private static final CharSequence checkFileChecker$lambda$2(Error it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getText();
/*     */   }
/*     */   
/*     */   private static final CharSequence checkFileChecker$lambda$3(Error it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getText();
/*     */   }
/*     */   
/*     */   private static final PsiFile checkFileChecker$lambda$4(PsiDocumentManager $documentManager, Document $document) {
/*     */     return $documentManager.getPsiFile($document);
/*     */   }
/*     */   
/*     */   private static final CharSequence checkFileChecker$lambda$5(Error it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getText();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final ExecutionAgentContext initEnvironment(@NotNull ExecutionContext context) {
/*     */     Intrinsics.checkNotNullParameter(context, "context");
/*     */     if ((AgentContext)context.lookupContext(AgentContext.Companion.getKEY()) == null) {
/*     */       (AgentContext)context.lookupContext(AgentContext.Companion.getKEY());
/*     */       Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(context.getProject()));
/*     */       AgentContext agentContext1 = new AgentContext(null, ProjectUtil.guessProjectDir(context.getProject())), it = agentContext1;
/*     */       int $i$a$-also-AbstractProjectCheckWorker$initEnvironment$agentContext$1 = 0;
/*     */       context.registerContext(AgentContext.Companion.getKEY(), it);
/*     */     } 
/*     */     AgentContext agentContext = agentContext1;
/*     */     return new SimpleExecutionAgentContext(agentContext, context);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object produceArtifact(@NotNull ProjectCheckInput input, @NotNull ExecutionContext context, @NotNull Continuation<? super ArtifactResponse<Boolean>> $completion) {
/*     */     return produceArtifact$suspendImpl(this, input, context, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractProjectCheckWorker.kt", l = {66, 72, 77, 82, 91, 93, 95, 103, 103}, i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2", "L$3", "L$4", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$2", "L$3", "L$4", "L$5", "L$0", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0"}, n = {"agentContext", "file", "agentContext", "file", "agentContext", "file", "document", "documentManager", "agentContext", "file", "document", "documentManager", "psiFile", "errors", "agentContext", "file", "document", "documentManager", "errors", "originalText", "agentContext", "file", "document", "errors", "originalText", "agentContext", "file", "document", "errors", "originalText", "updatedPsiFile", "agentContext"}, m = "checkFileChecker", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractProjectCheckWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractProjectCheckWorker$checkFileChecker$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     int label;
/*     */     
/*     */     AbstractProjectCheckWorker$checkFileChecker$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractProjectCheckWorker.this.checkFileChecker(null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractProjectCheckWorker.kt", l = {47}, i = {0}, s = {"L$0"}, n = {"agentContext"}, m = "checkFileStructureAction", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractProjectCheckWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractProjectCheckWorker$checkFileStructureAction$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractProjectCheckWorker$checkFileStructureAction$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractProjectCheckWorker.this.checkFileStructureAction(null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractProjectCheckWorker.kt", l = {34, 35}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"$this", "input", "agentContext"}, m = "produceArtifact$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.AbstractProjectCheckWorker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractProjectCheckWorker$produceArtifact$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     AbstractProjectCheckWorker$produceArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractProjectCheckWorker.produceArtifact$suspendImpl(AbstractProjectCheckWorker.this, null, null, (Continuation<? super ArtifactResponse<Boolean>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AbstractProjectCheckWorker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */