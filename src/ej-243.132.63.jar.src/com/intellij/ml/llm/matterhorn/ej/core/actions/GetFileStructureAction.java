/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiElement;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\030\000 \0312\0020\001:\001\031B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024J\034\020\025\032\0020\0052\f\020\026\032\b\022\004\022\0020\0270\tH@¢\006\002\020\030R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "format", "elements", "Lcom/intellij/psi/PsiElement;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ public final class GetFileStructureAction implements AgentAction {
/*     */   @NotNull
/*  19 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\007XT¢\006\002\n\000R\016\020\b\032\0020\007XT¢\006\002\n\000R\016\020\t\032\0020\007XT¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$Companion;", "", "<init>", "()V", "SMALL_FILE_LIMIT", "", "FAIL_STRUCTURE_MESSAGE", "", "GET_FILE_STRUCTURE_ACTION_NAME", "FILE_ARGUMENT", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*  28 */   private final String name = "get_file_structure"; @NotNull public String getName() { return this.name; } @NotNull
/*  29 */   private final List<Argument> arguments = CollectionsKt.listOf(
/*  30 */       new Argument(
/*  31 */         "file", 
/*  32 */         ArgumentType.STRING, 
/*  33 */         "the path to the file", false, false, 24, null)); @NotNull
/*     */   public List<Argument> getArguments() { return this.arguments; }
/*     */   @NotNull
/*  36 */   public String getDocstring() { return this.docstring; }
/*     */    @NotNull
/*  38 */   private final String docstring = "Displaying the code structure of the specified file by listing definitions for all symbols (classes, methods, functions) , along with import statements.\nIf [Tag: FileCode] or [Tag: FileStructure] is not provided for the file, it's important to explore its structure before opening or editing it. \nFor each symbol, input-output parameters and line ranges will be provided. This information will help you navigate the file more effectively and ensure you don't overlook any part of the code.";
/*     */   
/*     */   public static final int SMALL_FILE_LIMIT = 200;
/*     */   
/*     */   @NotNull
/*     */   public static final String FAIL_STRUCTURE_MESSAGE = "It's not possible to display the file structure; either the file type is not supported, or parsing failed.";
/*     */   
/*     */   @NotNull
/*     */   public static final String GET_FILE_STRUCTURE_ACTION_NAME = "get_file_structure";
/*     */   
/*     */   @NotNull
/*     */   public static final String FILE_ARGUMENT = "file";
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$execute$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$execute$1
/*     */     //   11: astore #21
/*     */     //   13: aload #21
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #21
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$execute$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #21
/*     */     //   50: aload #21
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #20
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #22
/*     */     //   62: aload #21
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1409, 0 -> 120, 1 -> 168, 2 -> 261, 3 -> 433, 4 -> 549, 5 -> 667, 6 -> 826, 7 -> 921, 8 -> 1091, 9 -> 1208
/*     */     //   120: aload #20
/*     */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   125: ldc 'Get structure'
/*     */     //   127: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   130: aload_2
/*     */     //   131: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   134: aload_0
/*     */     //   135: aload_1
/*     */     //   136: aload #21
/*     */     //   138: aload #21
/*     */     //   140: aload_0
/*     */     //   141: putfield L$0 : Ljava/lang/Object;
/*     */     //   144: aload #21
/*     */     //   146: aload_2
/*     */     //   147: putfield L$1 : Ljava/lang/Object;
/*     */     //   150: aload #21
/*     */     //   152: iconst_1
/*     */     //   153: putfield label : I
/*     */     //   156: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   159: dup
/*     */     //   160: aload #22
/*     */     //   162: if_acmpne -> 193
/*     */     //   165: aload #22
/*     */     //   167: areturn
/*     */     //   168: aload #21
/*     */     //   170: getfield L$1 : Ljava/lang/Object;
/*     */     //   173: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   176: astore_2
/*     */     //   177: aload #21
/*     */     //   179: getfield L$0 : Ljava/lang/Object;
/*     */     //   182: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   185: astore_0
/*     */     //   186: aload #20
/*     */     //   188: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   191: aload #20
/*     */     //   193: checkcast java/util/Map
/*     */     //   196: astore #4
/*     */     //   198: aload #4
/*     */     //   200: ldc 'file'
/*     */     //   202: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   210: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   213: dup
/*     */     //   214: ifnonnull -> 221
/*     */     //   217: pop
/*     */     //   218: ldc 'ERROR: File parameter required.'
/*     */     //   220: areturn
/*     */     //   221: astore #5
/*     */     //   223: aload #5
/*     */     //   225: aload_2
/*     */     //   226: iconst_0
/*     */     //   227: aload #21
/*     */     //   229: iconst_4
/*     */     //   230: aconst_null
/*     */     //   231: aload #21
/*     */     //   233: aload_0
/*     */     //   234: putfield L$0 : Ljava/lang/Object;
/*     */     //   237: aload #21
/*     */     //   239: aload_2
/*     */     //   240: putfield L$1 : Ljava/lang/Object;
/*     */     //   243: aload #21
/*     */     //   245: iconst_2
/*     */     //   246: putfield label : I
/*     */     //   249: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   252: dup
/*     */     //   253: aload #22
/*     */     //   255: if_acmpne -> 286
/*     */     //   258: aload #22
/*     */     //   260: areturn
/*     */     //   261: aload #21
/*     */     //   263: getfield L$1 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   269: astore_2
/*     */     //   270: aload #21
/*     */     //   272: getfield L$0 : Ljava/lang/Object;
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   278: astore_0
/*     */     //   279: aload #20
/*     */     //   281: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   284: aload #20
/*     */     //   286: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   289: astore #7
/*     */     //   291: aload #7
/*     */     //   293: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   296: ifeq -> 308
/*     */     //   299: aload #7
/*     */     //   301: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   304: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   307: areturn
/*     */     //   308: aload #7
/*     */     //   310: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   313: ifeq -> 330
/*     */     //   316: aload #7
/*     */     //   318: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   321: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   324: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   327: goto -> 338
/*     */     //   330: new kotlin/NoWhenBranchMatchedException
/*     */     //   333: dup
/*     */     //   334: invokespecial <init> : ()V
/*     */     //   337: athrow
/*     */     //   338: astore #6
/*     */     //   340: aload #6
/*     */     //   342: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   345: dup
/*     */     //   346: ifnonnull -> 353
/*     */     //   349: pop
/*     */     //   350: ldc 'ERROR: file path is invalid'
/*     */     //   352: areturn
/*     */     //   353: astore #7
/*     */     //   355: new com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*     */     //   358: dup
/*     */     //   359: aload #7
/*     */     //   361: ldc 'Get structure'
/*     */     //   363: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;)V
/*     */     //   366: astore #8
/*     */     //   368: aload_2
/*     */     //   369: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   374: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   377: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   380: aload #8
/*     */     //   382: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   385: aload #21
/*     */     //   387: aload #21
/*     */     //   389: aload_0
/*     */     //   390: putfield L$0 : Ljava/lang/Object;
/*     */     //   393: aload #21
/*     */     //   395: aload_2
/*     */     //   396: putfield L$1 : Ljava/lang/Object;
/*     */     //   399: aload #21
/*     */     //   401: aload #6
/*     */     //   403: putfield L$2 : Ljava/lang/Object;
/*     */     //   406: aload #21
/*     */     //   408: aload #7
/*     */     //   410: putfield L$3 : Ljava/lang/Object;
/*     */     //   413: aload #21
/*     */     //   415: iconst_3
/*     */     //   416: putfield label : I
/*     */     //   419: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   424: dup
/*     */     //   425: aload #22
/*     */     //   427: if_acmpne -> 478
/*     */     //   430: aload #22
/*     */     //   432: areturn
/*     */     //   433: aload #21
/*     */     //   435: getfield L$3 : Ljava/lang/Object;
/*     */     //   438: checkcast java/nio/file/Path
/*     */     //   441: astore #7
/*     */     //   443: aload #21
/*     */     //   445: getfield L$2 : Ljava/lang/Object;
/*     */     //   448: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   451: astore #6
/*     */     //   453: aload #21
/*     */     //   455: getfield L$1 : Ljava/lang/Object;
/*     */     //   458: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   461: astore_2
/*     */     //   462: aload #21
/*     */     //   464: getfield L$0 : Ljava/lang/Object;
/*     */     //   467: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   470: astore_0
/*     */     //   471: aload #20
/*     */     //   473: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   476: aload #20
/*     */     //   478: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */     //   481: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   484: ifne -> 495
/*     */     //   487: aload #7
/*     */     //   489: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   494: areturn
/*     */     //   495: aload_2
/*     */     //   496: aload #6
/*     */     //   498: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   503: aload #21
/*     */     //   505: aload #21
/*     */     //   507: aload_0
/*     */     //   508: putfield L$0 : Ljava/lang/Object;
/*     */     //   511: aload #21
/*     */     //   513: aload_2
/*     */     //   514: putfield L$1 : Ljava/lang/Object;
/*     */     //   517: aload #21
/*     */     //   519: aload #6
/*     */     //   521: putfield L$2 : Ljava/lang/Object;
/*     */     //   524: aload #21
/*     */     //   526: aload #7
/*     */     //   528: putfield L$3 : Ljava/lang/Object;
/*     */     //   531: aload #21
/*     */     //   533: iconst_4
/*     */     //   534: putfield label : I
/*     */     //   537: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   540: dup
/*     */     //   541: aload #22
/*     */     //   543: if_acmpne -> 594
/*     */     //   546: aload #22
/*     */     //   548: areturn
/*     */     //   549: aload #21
/*     */     //   551: getfield L$3 : Ljava/lang/Object;
/*     */     //   554: checkcast java/nio/file/Path
/*     */     //   557: astore #7
/*     */     //   559: aload #21
/*     */     //   561: getfield L$2 : Ljava/lang/Object;
/*     */     //   564: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   567: astore #6
/*     */     //   569: aload #21
/*     */     //   571: getfield L$1 : Ljava/lang/Object;
/*     */     //   574: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   577: astore_2
/*     */     //   578: aload #21
/*     */     //   580: getfield L$0 : Ljava/lang/Object;
/*     */     //   583: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   586: astore_0
/*     */     //   587: aload #20
/*     */     //   589: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   592: aload #20
/*     */     //   594: checkcast com/intellij/psi/PsiFile
/*     */     //   597: dup
/*     */     //   598: ifnonnull -> 605
/*     */     //   601: pop
/*     */     //   602: ldc 'ERROR: Could not find PSI for file'
/*     */     //   604: areturn
/*     */     //   605: astore #9
/*     */     //   607: aload #6
/*     */     //   609: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   614: aload #21
/*     */     //   616: aload #21
/*     */     //   618: aload_0
/*     */     //   619: putfield L$0 : Ljava/lang/Object;
/*     */     //   622: aload #21
/*     */     //   624: aload_2
/*     */     //   625: putfield L$1 : Ljava/lang/Object;
/*     */     //   628: aload #21
/*     */     //   630: aload #6
/*     */     //   632: putfield L$2 : Ljava/lang/Object;
/*     */     //   635: aload #21
/*     */     //   637: aload #7
/*     */     //   639: putfield L$3 : Ljava/lang/Object;
/*     */     //   642: aload #21
/*     */     //   644: aload #9
/*     */     //   646: putfield L$4 : Ljava/lang/Object;
/*     */     //   649: aload #21
/*     */     //   651: iconst_5
/*     */     //   652: putfield label : I
/*     */     //   655: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   658: dup
/*     */     //   659: aload #22
/*     */     //   661: if_acmpne -> 722
/*     */     //   664: aload #22
/*     */     //   666: areturn
/*     */     //   667: aload #21
/*     */     //   669: getfield L$4 : Ljava/lang/Object;
/*     */     //   672: checkcast com/intellij/psi/PsiFile
/*     */     //   675: astore #9
/*     */     //   677: aload #21
/*     */     //   679: getfield L$3 : Ljava/lang/Object;
/*     */     //   682: checkcast java/nio/file/Path
/*     */     //   685: astore #7
/*     */     //   687: aload #21
/*     */     //   689: getfield L$2 : Ljava/lang/Object;
/*     */     //   692: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   695: astore #6
/*     */     //   697: aload #21
/*     */     //   699: getfield L$1 : Ljava/lang/Object;
/*     */     //   702: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   705: astore_2
/*     */     //   706: aload #21
/*     */     //   708: getfield L$0 : Ljava/lang/Object;
/*     */     //   711: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   714: astore_0
/*     */     //   715: aload #20
/*     */     //   717: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   720: aload #20
/*     */     //   722: checkcast com/intellij/openapi/editor/Document
/*     */     //   725: astore #10
/*     */     //   727: aload #10
/*     */     //   729: dup
/*     */     //   730: ifnull -> 741
/*     */     //   733: invokeinterface getLineCount : ()I
/*     */     //   738: goto -> 743
/*     */     //   741: pop
/*     */     //   742: iconst_0
/*     */     //   743: istore #11
/*     */     //   745: iload #11
/*     */     //   747: sipush #200
/*     */     //   750: if_icmpge -> 846
/*     */     //   753: aload_2
/*     */     //   754: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   759: aload #6
/*     */     //   761: iconst_1
/*     */     //   762: sipush #200
/*     */     //   765: aconst_null
/*     */     //   766: aload_2
/*     */     //   767: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   772: aload #21
/*     */     //   774: bipush #16
/*     */     //   776: aconst_null
/*     */     //   777: aload #21
/*     */     //   779: aconst_null
/*     */     //   780: putfield L$0 : Ljava/lang/Object;
/*     */     //   783: aload #21
/*     */     //   785: aconst_null
/*     */     //   786: putfield L$1 : Ljava/lang/Object;
/*     */     //   789: aload #21
/*     */     //   791: aconst_null
/*     */     //   792: putfield L$2 : Ljava/lang/Object;
/*     */     //   795: aload #21
/*     */     //   797: aconst_null
/*     */     //   798: putfield L$3 : Ljava/lang/Object;
/*     */     //   801: aload #21
/*     */     //   803: aconst_null
/*     */     //   804: putfield L$4 : Ljava/lang/Object;
/*     */     //   807: aload #21
/*     */     //   809: bipush #6
/*     */     //   811: putfield label : I
/*     */     //   814: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   817: dup
/*     */     //   818: aload #22
/*     */     //   820: if_acmpne -> 833
/*     */     //   823: aload #22
/*     */     //   825: areturn
/*     */     //   826: aload #20
/*     */     //   828: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   831: aload #20
/*     */     //   833: checkcast java/lang/String
/*     */     //   836: astore #12
/*     */     //   838: aload #12
/*     */     //   840: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   845: areturn
/*     */     //   846: aload #7
/*     */     //   848: iload #11
/*     */     //   850: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;I)Ljava/lang/String;
/*     */     //   855: astore #12
/*     */     //   857: aload #9
/*     */     //   859: aload #7
/*     */     //   861: aload_2
/*     */     //   862: <illegal opcode> invoke : (Lcom/intellij/psi/PsiFile;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Lkotlin/jvm/functions/Function0;
/*     */     //   867: aload #21
/*     */     //   869: aload #21
/*     */     //   871: aload_0
/*     */     //   872: putfield L$0 : Ljava/lang/Object;
/*     */     //   875: aload #21
/*     */     //   877: aload_2
/*     */     //   878: putfield L$1 : Ljava/lang/Object;
/*     */     //   881: aload #21
/*     */     //   883: aload #7
/*     */     //   885: putfield L$2 : Ljava/lang/Object;
/*     */     //   888: aload #21
/*     */     //   890: aload #9
/*     */     //   892: putfield L$3 : Ljava/lang/Object;
/*     */     //   895: aload #21
/*     */     //   897: aload #12
/*     */     //   899: putfield L$4 : Ljava/lang/Object;
/*     */     //   902: aload #21
/*     */     //   904: bipush #7
/*     */     //   906: putfield label : I
/*     */     //   909: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   912: dup
/*     */     //   913: aload #22
/*     */     //   915: if_acmpne -> 976
/*     */     //   918: aload #22
/*     */     //   920: areturn
/*     */     //   921: aload #21
/*     */     //   923: getfield L$4 : Ljava/lang/Object;
/*     */     //   926: checkcast java/lang/String
/*     */     //   929: astore #12
/*     */     //   931: aload #21
/*     */     //   933: getfield L$3 : Ljava/lang/Object;
/*     */     //   936: checkcast com/intellij/psi/PsiFile
/*     */     //   939: astore #9
/*     */     //   941: aload #21
/*     */     //   943: getfield L$2 : Ljava/lang/Object;
/*     */     //   946: checkcast java/nio/file/Path
/*     */     //   949: astore #7
/*     */     //   951: aload #21
/*     */     //   953: getfield L$1 : Ljava/lang/Object;
/*     */     //   956: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   959: astore_2
/*     */     //   960: aload #21
/*     */     //   962: getfield L$0 : Ljava/lang/Object;
/*     */     //   965: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   968: astore_0
/*     */     //   969: aload #20
/*     */     //   971: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   974: aload #20
/*     */     //   976: checkcast java/lang/String
/*     */     //   979: astore #13
/*     */     //   981: aload #13
/*     */     //   983: checkcast java/lang/CharSequence
/*     */     //   986: astore #15
/*     */     //   988: aload #15
/*     */     //   990: ifnull -> 1001
/*     */     //   993: aload #15
/*     */     //   995: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   998: ifeq -> 1005
/*     */     //   1001: iconst_1
/*     */     //   1002: goto -> 1006
/*     */     //   1005: iconst_0
/*     */     //   1006: ifeq -> 1015
/*     */     //   1009: ldc_w ''
/*     */     //   1012: goto -> 1022
/*     */     //   1015: aload #13
/*     */     //   1017: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1022: astore #14
/*     */     //   1024: aload_2
/*     */     //   1025: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   1030: aload #9
/*     */     //   1032: <illegal opcode> invoke : (Lcom/intellij/psi/PsiFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   1037: aload #21
/*     */     //   1039: aload #21
/*     */     //   1041: aload_0
/*     */     //   1042: putfield L$0 : Ljava/lang/Object;
/*     */     //   1045: aload #21
/*     */     //   1047: aload_2
/*     */     //   1048: putfield L$1 : Ljava/lang/Object;
/*     */     //   1051: aload #21
/*     */     //   1053: aload #7
/*     */     //   1055: putfield L$2 : Ljava/lang/Object;
/*     */     //   1058: aload #21
/*     */     //   1060: aload #12
/*     */     //   1062: putfield L$3 : Ljava/lang/Object;
/*     */     //   1065: aload #21
/*     */     //   1067: aload #14
/*     */     //   1069: putfield L$4 : Ljava/lang/Object;
/*     */     //   1072: aload #21
/*     */     //   1074: bipush #8
/*     */     //   1076: putfield label : I
/*     */     //   1079: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1082: dup
/*     */     //   1083: aload #22
/*     */     //   1085: if_acmpne -> 1146
/*     */     //   1088: aload #22
/*     */     //   1090: areturn
/*     */     //   1091: aload #21
/*     */     //   1093: getfield L$4 : Ljava/lang/Object;
/*     */     //   1096: checkcast java/lang/String
/*     */     //   1099: astore #14
/*     */     //   1101: aload #21
/*     */     //   1103: getfield L$3 : Ljava/lang/Object;
/*     */     //   1106: checkcast java/lang/String
/*     */     //   1109: astore #12
/*     */     //   1111: aload #21
/*     */     //   1113: getfield L$2 : Ljava/lang/Object;
/*     */     //   1116: checkcast java/nio/file/Path
/*     */     //   1119: astore #7
/*     */     //   1121: aload #21
/*     */     //   1123: getfield L$1 : Ljava/lang/Object;
/*     */     //   1126: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1129: astore_2
/*     */     //   1130: aload #21
/*     */     //   1132: getfield L$0 : Ljava/lang/Object;
/*     */     //   1135: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   1138: astore_0
/*     */     //   1139: aload #20
/*     */     //   1141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1144: aload #20
/*     */     //   1146: checkcast java/util/List
/*     */     //   1149: astore #15
/*     */     //   1151: aload_0
/*     */     //   1152: aload #15
/*     */     //   1154: aload #21
/*     */     //   1156: aload #21
/*     */     //   1158: aload_2
/*     */     //   1159: putfield L$0 : Ljava/lang/Object;
/*     */     //   1162: aload #21
/*     */     //   1164: aload #7
/*     */     //   1166: putfield L$1 : Ljava/lang/Object;
/*     */     //   1169: aload #21
/*     */     //   1171: aload #12
/*     */     //   1173: putfield L$2 : Ljava/lang/Object;
/*     */     //   1176: aload #21
/*     */     //   1178: aload #14
/*     */     //   1180: putfield L$3 : Ljava/lang/Object;
/*     */     //   1183: aload #21
/*     */     //   1185: aconst_null
/*     */     //   1186: putfield L$4 : Ljava/lang/Object;
/*     */     //   1189: aload #21
/*     */     //   1191: bipush #9
/*     */     //   1193: putfield label : I
/*     */     //   1196: invokespecial format : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1199: dup
/*     */     //   1200: aload #22
/*     */     //   1202: if_acmpne -> 1254
/*     */     //   1205: aload #22
/*     */     //   1207: areturn
/*     */     //   1208: aload #21
/*     */     //   1210: getfield L$3 : Ljava/lang/Object;
/*     */     //   1213: checkcast java/lang/String
/*     */     //   1216: astore #14
/*     */     //   1218: aload #21
/*     */     //   1220: getfield L$2 : Ljava/lang/Object;
/*     */     //   1223: checkcast java/lang/String
/*     */     //   1226: astore #12
/*     */     //   1228: aload #21
/*     */     //   1230: getfield L$1 : Ljava/lang/Object;
/*     */     //   1233: checkcast java/nio/file/Path
/*     */     //   1236: astore #7
/*     */     //   1238: aload #21
/*     */     //   1240: getfield L$0 : Ljava/lang/Object;
/*     */     //   1243: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1246: astore_2
/*     */     //   1247: aload #20
/*     */     //   1249: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1252: aload #20
/*     */     //   1254: checkcast java/lang/String
/*     */     //   1257: astore #16
/*     */     //   1259: aload #16
/*     */     //   1261: checkcast java/lang/CharSequence
/*     */     //   1264: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   1267: istore #18
/*     */     //   1269: iload #18
/*     */     //   1271: iconst_1
/*     */     //   1272: if_icmpne -> 1281
/*     */     //   1275: ldc_w 'It's not possible to display the file structure; either the file type is not supported, or parsing failed.'
/*     */     //   1278: goto -> 1304
/*     */     //   1281: iload #18
/*     */     //   1283: ifne -> 1296
/*     */     //   1286: aload #16
/*     */     //   1288: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1293: goto -> 1304
/*     */     //   1296: new kotlin/NoWhenBranchMatchedException
/*     */     //   1299: dup
/*     */     //   1300: invokespecial <init> : ()V
/*     */     //   1303: athrow
/*     */     //   1304: astore #17
/*     */     //   1306: aload #16
/*     */     //   1308: checkcast java/lang/CharSequence
/*     */     //   1311: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   1314: iconst_1
/*     */     //   1315: if_icmpne -> 1324
/*     */     //   1318: ldc_w ''
/*     */     //   1321: goto -> 1327
/*     */     //   1324: ldc_w '##### Annotation \\nEach line contains information about a single symbol (class, method, function) and its parent symbols. For each symbol, the start and end lines are provided. To view the code of a specific symbol, add the start line number to the open command following the file path.'
/*     */     //   1327: astore #18
/*     */     //   1329: aload_2
/*     */     //   1330: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   1335: aload #7
/*     */     //   1337: invokevirtual markViewedFile : (Ljava/nio/file/Path;)V
/*     */     //   1340: iconst_5
/*     */     //   1341: anewarray java/lang/String
/*     */     //   1344: astore #19
/*     */     //   1346: aload #19
/*     */     //   1348: iconst_0
/*     */     //   1349: ldc_w '#### File structure [Tag: FileStructure]'
/*     */     //   1352: aastore
/*     */     //   1353: aload #19
/*     */     //   1355: iconst_1
/*     */     //   1356: aload #12
/*     */     //   1358: aastore
/*     */     //   1359: aload #19
/*     */     //   1361: iconst_2
/*     */     //   1362: aload #14
/*     */     //   1364: invokestatic nullIfEmpty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1367: aastore
/*     */     //   1368: aload #19
/*     */     //   1370: iconst_3
/*     */     //   1371: aload #17
/*     */     //   1373: invokestatic nullIfEmpty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1376: aastore
/*     */     //   1377: aload #19
/*     */     //   1379: iconst_4
/*     */     //   1380: aload #18
/*     */     //   1382: aastore
/*     */     //   1383: aload #19
/*     */     //   1385: invokestatic listOfNotNull : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1388: checkcast java/lang/Iterable
/*     */     //   1391: ldc_w '\\n\\n'
/*     */     //   1394: checkcast java/lang/CharSequence
/*     */     //   1397: aconst_null
/*     */     //   1398: aconst_null
/*     */     //   1399: iconst_0
/*     */     //   1400: aconst_null
/*     */     //   1401: aconst_null
/*     */     //   1402: bipush #62
/*     */     //   1404: aconst_null
/*     */     //   1405: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1408: areturn
/*     */     //   1409: new java/lang/IllegalStateException
/*     */     //   1412: dup
/*     */     //   1413: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1416: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1419: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #40	-> 60
/*     */     //   #41	-> 125
/*     */     //   #42	-> 134
/*     */     //   #40	-> 165
/*     */     //   #43	-> 198
/*     */     //   #45	-> 223
/*     */     //   #40	-> 258
/*     */     //   #46	-> 291
/*     */     //   #47	-> 308
/*     */     //   #45	-> 330
/*     */     //   #50	-> 340
/*     */     //   #52	-> 355
/*     */     //   #53	-> 368
/*     */     //   #40	-> 430
/*     */     //   #53	-> 478
/*     */     //   #54	-> 487
/*     */     //   #57	-> 495
/*     */     //   #40	-> 546
/*     */     //   #57	-> 594
/*     */     //   #59	-> 602
/*     */     //   #57	-> 605
/*     */     //   #61	-> 607
/*     */     //   #40	-> 664
/*     */     //   #64	-> 727
/*     */     //   #65	-> 745
/*     */     //   #66	-> 753
/*     */     //   #40	-> 823
/*     */     //   #67	-> 838
/*     */     //   #70	-> 846
/*     */     //   #72	-> 857
/*     */     //   #40	-> 918
/*     */     //   #73	-> 981
/*     */     //   #73	-> 1006
/*     */     //   #74	-> 1024
/*     */     //   #40	-> 1088
/*     */     //   #75	-> 1151
/*     */     //   #40	-> 1205
/*     */     //   #77	-> 1259
/*     */     //   #78	-> 1269
/*     */     //   #79	-> 1281
/*     */     //   #77	-> 1296
/*     */     //   #82	-> 1306
/*     */     //   #83	-> 1314
/*     */     //   #87	-> 1324
/*     */     //   #82	-> 1327
/*     */     //   #90	-> 1329
/*     */     //   #93	-> 1340
/*     */     //   #94	-> 1356
/*     */     //   #93	-> 1359
/*     */     //   #95	-> 1362
/*     */     //   #93	-> 1368
/*     */     //   #96	-> 1371
/*     */     //   #93	-> 1377
/*     */     //   #97	-> 1380
/*     */     //   #93	-> 1383
/*     */     //   #92	-> 1385
/*     */     //   #98	-> 1391
/*     */     //   #92	-> 1408
/*     */     //   #40	-> 1409
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   125	43	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   186	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   279	154	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   471	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   587	80	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   715	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   846	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   969	37	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   1006	85	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   1139	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   125	34	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   125	43	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   177	84	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   270	163	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   462	87	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   578	89	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   706	111	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   846	75	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   960	46	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1006	85	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1130	78	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1247	49	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1304	105	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   198	15	4	params	Ljava/util/Map;
/*     */     //   223	29	5	fileName	Ljava/lang/String;
/*     */     //   340	93	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   453	96	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   569	98	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   697	120	6	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   291	47	7	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   355	78	7	filePath	Ljava/nio/file/Path;
/*     */     //   443	106	7	filePath	Ljava/nio/file/Path;
/*     */     //   559	108	7	filePath	Ljava/nio/file/Path;
/*     */     //   687	66	7	filePath	Ljava/nio/file/Path;
/*     */     //   846	75	7	filePath	Ljava/nio/file/Path;
/*     */     //   951	55	7	filePath	Ljava/nio/file/Path;
/*     */     //   1006	85	7	filePath	Ljava/nio/file/Path;
/*     */     //   1121	87	7	filePath	Ljava/nio/file/Path;
/*     */     //   1238	58	7	filePath	Ljava/nio/file/Path;
/*     */     //   1304	105	7	filePath	Ljava/nio/file/Path;
/*     */     //   368	56	8	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile;
/*     */     //   607	60	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   677	76	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   846	75	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   941	65	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   1006	76	9	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   727	11	10	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   745	8	11	documentLineCount	I
/*     */     //   846	11	11	documentLineCount	I
/*     */     //   838	8	12	fullFile	Ljava/lang/String;
/*     */     //   857	64	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   931	75	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   1006	85	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   1111	97	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   1228	68	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   1304	105	12	fileNameToStructure	Ljava/lang/String;
/*     */     //   981	25	13	importStatements	Ljava/lang/String;
/*     */     //   1006	9	13	importStatements	Ljava/lang/String;
/*     */     //   1015	7	13	importStatements	Ljava/lang/String;
/*     */     //   1024	67	14	importStatementsTagged	Ljava/lang/String;
/*     */     //   1101	107	14	importStatementsTagged	Ljava/lang/String;
/*     */     //   1218	78	14	importStatementsTagged	Ljava/lang/String;
/*     */     //   1304	105	14	importStatementsTagged	Ljava/lang/String;
/*     */     //   1151	48	15	elements	Ljava/util/List;
/*     */     //   1259	37	16	fileStructure	Ljava/lang/String;
/*     */     //   1304	10	16	fileStructure	Ljava/lang/String;
/*     */     //   1306	103	17	fileStructureTagged	Ljava/lang/String;
/*     */     //   1329	80	18	formatOfFileStructure	Ljava/lang/String;
/*     */     //   0	1420	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1359	21	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1352	20	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final PsiFile execute$lambda$0(ExecutionAgentContext $context, VirtualFile $file) {
/*  58 */     return PsiManager.getInstance($context.getProject()).findFile($file);
/*     */   }
/*     */   
/*     */   private static final Document execute$lambda$1(VirtualFile $file) {
/*  62 */     return FileDocumentManager.getInstance().getDocument($file);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String execute$lambda$2(PsiFile $psiFile, Path $filePath, ExecutionAgentContext $context) {
/*  72 */     return ElementProvider.Companion.getImportStatementsText($psiFile, $filePath, $context.getSessionHistory());
/*     */   } private static final List execute$lambda$3(PsiFile $psiFile) {
/*  74 */     return ElementProvider.Companion.extractElements($psiFile);
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
/*     */   @RequiresReadLock
/*     */   private final Object format(List elements, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$format$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$format$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction$format$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 163, 0 -> 88, 1 -> 134
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new java/lang/StringBuilder
/*     */     //   96: dup
/*     */     //   97: invokespecial <init> : ()V
/*     */     //   100: astore_3
/*     */     //   101: aload_1
/*     */     //   102: aload_3
/*     */     //   103: <illegal opcode> invoke : (Ljava/util/List;Ljava/lang/StringBuilder;)Lkotlin/jvm/functions/Function0;
/*     */     //   108: aload #5
/*     */     //   110: aload #5
/*     */     //   112: aload_3
/*     */     //   113: putfield L$0 : Ljava/lang/Object;
/*     */     //   116: aload #5
/*     */     //   118: iconst_1
/*     */     //   119: putfield label : I
/*     */     //   122: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   125: dup
/*     */     //   126: aload #6
/*     */     //   128: if_acmpne -> 150
/*     */     //   131: aload #6
/*     */     //   133: areturn
/*     */     //   134: aload #5
/*     */     //   136: getfield L$0 : Ljava/lang/Object;
/*     */     //   139: checkcast java/lang/StringBuilder
/*     */     //   142: astore_3
/*     */     //   143: aload #4
/*     */     //   145: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   148: aload #4
/*     */     //   150: pop
/*     */     //   151: aload_3
/*     */     //   152: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   155: dup
/*     */     //   156: ldc_w 'toString(...)'
/*     */     //   159: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   162: areturn
/*     */     //   163: new java/lang/IllegalStateException
/*     */     //   166: dup
/*     */     //   167: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   173: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 60
/*     */     //   #103	-> 93
/*     */     //   #104	-> 101
/*     */     //   #101	-> 131
/*     */     //   #111	-> 150
/*     */     //   #101	-> 163
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	32	1	elements	Ljava/util/List;
/*     */     //   101	33	3	builder	Ljava/lang/StringBuilder;
/*     */     //   143	20	3	builder	Ljava/lang/StringBuilder;
/*     */     //   0	174	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	113	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	106	4	$result	Ljava/lang/Object;
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
/*     */   private static final Unit format$lambda$5(List $elements, StringBuilder $builder) {
/* 105 */     ExtractorUtilsKt.formatHierarchy($elements, new FormatHierarchyParams(true, null, 2, null), $builder::format$lambda$5$lambda$4);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit format$lambda$5$lambda$4(StringBuilder $builder, PsiElement paramPsiElement, String text) {
/*     */     Intrinsics.checkNotNullParameter(paramPsiElement, "<unused var>");
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     if ((((CharSequence)text).length() > 0)) {
/*     */       Intrinsics.checkNotNullExpressionValue($builder.append(text), "append(...)");
/*     */       Intrinsics.checkNotNullExpressionValue($builder.append(text).append('\n'), "append(...)");
/*     */       $builder.append(text).append('\n');
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GetFileStructureAction.kt", l = {42, 45, 53, 57, 61, 66, 72, 74, 75}, i = {0, 0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 8, 8, 8, 8}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "context", "this", "context", "this", "context", "file", "filePath", "this", "context", "file", "filePath", "this", "context", "file", "filePath", "psiFile", "this", "context", "filePath", "psiFile", "fileNameToStructure", "this", "context", "filePath", "fileNameToStructure", "importStatementsTagged", "context", "filePath", "fileNameToStructure", "importStatementsTagged"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.GetFileStructureAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GetFileStructureAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     GetFileStructureAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GetFileStructureAction.this.execute(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GetFileStructureAction.kt", l = {104}, i = {0}, s = {"L$0"}, n = {"builder"}, m = "format", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.GetFileStructureAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GetFileStructureAction$format$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     GetFileStructureAction$format$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GetFileStructureAction.this.format(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\GetFileStructureAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */