/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Argument;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.relevance.extractors.ElementProvider;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\006\n\002\030\002\n\000\n\002\030\002\n\002\b\003\030\000 \0252\0020\001:\001\025B\007¢\006\004\b\002\020\003J\036\020\017\032\0020\0052\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\020\024R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\b\n\000\032\004\b\013\020\fR\024\020\r\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\007¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "<init>", "()V", "name", "", "getName", "()Ljava/lang/String;", "arguments", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/Argument;", "getArguments", "()Ljava/util/List;", "docstring", "getDocstring", "execute", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ej-core"})
/*     */ public final class OpenFileAgentAction implements AgentAction {
/*     */   @NotNull
/*  18 */   public String getCustomSignature() { return AgentAction.DefaultImpls.getCustomSignature(this); } @NotNull public static final Companion Companion = new Companion(null); @Nullable public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion); } @Nullable public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) { return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J8\020\007\032\0020\0052\006\020\b\032\0020\t2\006\020\n\032\0020\0132\016\020\f\032\n\030\0010\rj\004\030\001`\0162\b\b\002\020\017\032\0020\rH@¢\006\002\020\020J\016\020\021\032\0020\0052\006\020\022\032\0020\023J(\020\024\032\004\030\0010\0052\006\020\025\032\0020\0132\006\020\026\032\0020\0232\006\020\b\032\0020\tH@¢\006\002\020\027R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;", "", "<init>", "()V", "PATH_ARGUMENT", "", "LINE_NUMBER_ARGUMENT", "getOpenFileActionOutput", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "lineNumber", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "window", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildAiignoreMessage", "filePath", "Ljava/nio/file/Path;", "getFileImports", "vFile", "path", "(Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nOpenFileAgentAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenFileAgentAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final Object getOpenFileActionOutput(@NotNull ExecutionAgentContext context, @NotNull VirtualFile file, @Nullable Integer lineNumber, int window, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload #5
/*     */       //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion$getOpenFileActionOutput$1
/*     */       //   5: ifeq -> 41
/*     */       //   8: aload #5
/*     */       //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion$getOpenFileActionOutput$1
/*     */       //   13: astore #15
/*     */       //   15: aload #15
/*     */       //   17: getfield label : I
/*     */       //   20: ldc -2147483648
/*     */       //   22: iand
/*     */       //   23: ifeq -> 41
/*     */       //   26: aload #15
/*     */       //   28: dup
/*     */       //   29: getfield label : I
/*     */       //   32: ldc -2147483648
/*     */       //   34: isub
/*     */       //   35: putfield label : I
/*     */       //   38: goto -> 53
/*     */       //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion$getOpenFileActionOutput$1
/*     */       //   44: dup
/*     */       //   45: aload_0
/*     */       //   46: aload #5
/*     */       //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;Lkotlin/coroutines/Continuation;)V
/*     */       //   51: astore #15
/*     */       //   53: aload #15
/*     */       //   55: getfield result : Ljava/lang/Object;
/*     */       //   58: astore #14
/*     */       //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   63: astore #16
/*     */       //   65: aload #15
/*     */       //   67: getfield label : I
/*     */       //   70: tableswitch default -> 774, 0 -> 104, 1 -> 251, 2 -> 415, 3 -> 612, 4 -> 748
/*     */       //   104: aload #14
/*     */       //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   109: aload_2
/*     */       //   110: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */       //   113: dup
/*     */       //   114: ifnonnull -> 121
/*     */       //   117: pop
/*     */       //   118: ldc 'ERROR: file path is invalid.'
/*     */       //   120: areturn
/*     */       //   121: astore #6
/*     */       //   123: aload_3
/*     */       //   124: dup
/*     */       //   125: ifnull -> 134
/*     */       //   128: invokevirtual intValue : ()I
/*     */       //   131: goto -> 136
/*     */       //   134: pop
/*     */       //   135: iconst_1
/*     */       //   136: istore #7
/*     */       //   138: aload_1
/*     */       //   139: new com/intellij/ml/llm/matterhorn/ej/core/FileWithLine
/*     */       //   142: dup
/*     */       //   143: aload_2
/*     */       //   144: iload #7
/*     */       //   146: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;I)V
/*     */       //   149: invokeinterface setCurrentScreenPosition : (Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;)V
/*     */       //   154: new com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*     */       //   157: dup
/*     */       //   158: aload #6
/*     */       //   160: ldc 'Open'
/*     */       //   162: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;)V
/*     */       //   165: astore #8
/*     */       //   167: aload_1
/*     */       //   168: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */       //   173: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   176: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */       //   179: aload #8
/*     */       //   181: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */       //   184: aload #15
/*     */       //   186: aload #15
/*     */       //   188: aload_0
/*     */       //   189: putfield L$0 : Ljava/lang/Object;
/*     */       //   192: aload #15
/*     */       //   194: aload_1
/*     */       //   195: putfield L$1 : Ljava/lang/Object;
/*     */       //   198: aload #15
/*     */       //   200: aload_2
/*     */       //   201: putfield L$2 : Ljava/lang/Object;
/*     */       //   204: aload #15
/*     */       //   206: aload_3
/*     */       //   207: putfield L$3 : Ljava/lang/Object;
/*     */       //   210: aload #15
/*     */       //   212: aload #6
/*     */       //   214: putfield L$4 : Ljava/lang/Object;
/*     */       //   217: aload #15
/*     */       //   219: iload #4
/*     */       //   221: putfield I$0 : I
/*     */       //   224: aload #15
/*     */       //   226: iload #7
/*     */       //   228: putfield I$1 : I
/*     */       //   231: aload #15
/*     */       //   233: iconst_1
/*     */       //   234: putfield label : I
/*     */       //   237: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   242: dup
/*     */       //   243: aload #16
/*     */       //   245: if_acmpne -> 318
/*     */       //   248: aload #16
/*     */       //   250: areturn
/*     */       //   251: aload #15
/*     */       //   253: getfield I$1 : I
/*     */       //   256: istore #7
/*     */       //   258: aload #15
/*     */       //   260: getfield I$0 : I
/*     */       //   263: istore #4
/*     */       //   265: aload #15
/*     */       //   267: getfield L$4 : Ljava/lang/Object;
/*     */       //   270: checkcast java/nio/file/Path
/*     */       //   273: astore #6
/*     */       //   275: aload #15
/*     */       //   277: getfield L$3 : Ljava/lang/Object;
/*     */       //   280: checkcast java/lang/Integer
/*     */       //   283: astore_3
/*     */       //   284: aload #15
/*     */       //   286: getfield L$2 : Ljava/lang/Object;
/*     */       //   289: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   292: astore_2
/*     */       //   293: aload #15
/*     */       //   295: getfield L$1 : Ljava/lang/Object;
/*     */       //   298: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */       //   301: astore_1
/*     */       //   302: aload #15
/*     */       //   304: getfield L$0 : Ljava/lang/Object;
/*     */       //   307: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion
/*     */       //   310: astore_0
/*     */       //   311: aload #14
/*     */       //   313: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   316: aload #14
/*     */       //   318: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */       //   321: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   324: ifne -> 334
/*     */       //   327: aload_0
/*     */       //   328: aload #6
/*     */       //   330: invokevirtual buildAiignoreMessage : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */       //   333: areturn
/*     */       //   334: aload_1
/*     */       //   335: aload_2
/*     */       //   336: aload #6
/*     */       //   338: aload_3
/*     */       //   339: ifnonnull -> 346
/*     */       //   342: iconst_1
/*     */       //   343: goto -> 347
/*     */       //   346: iconst_0
/*     */       //   347: sipush #200
/*     */       //   350: aload #15
/*     */       //   352: aload #15
/*     */       //   354: aload_0
/*     */       //   355: putfield L$0 : Ljava/lang/Object;
/*     */       //   358: aload #15
/*     */       //   360: aload_1
/*     */       //   361: putfield L$1 : Ljava/lang/Object;
/*     */       //   364: aload #15
/*     */       //   366: aload_2
/*     */       //   367: putfield L$2 : Ljava/lang/Object;
/*     */       //   370: aload #15
/*     */       //   372: aload #6
/*     */       //   374: putfield L$3 : Ljava/lang/Object;
/*     */       //   377: aload #15
/*     */       //   379: aconst_null
/*     */       //   380: putfield L$4 : Ljava/lang/Object;
/*     */       //   383: aload #15
/*     */       //   385: iload #4
/*     */       //   387: putfield I$0 : I
/*     */       //   390: aload #15
/*     */       //   392: iload #7
/*     */       //   394: putfield I$1 : I
/*     */       //   397: aload #15
/*     */       //   399: iconst_2
/*     */       //   400: putfield label : I
/*     */       //   403: invokestatic oncePerSessionShowFileToAgent : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   406: dup
/*     */       //   407: aload #16
/*     */       //   409: if_acmpne -> 473
/*     */       //   412: aload #16
/*     */       //   414: areturn
/*     */       //   415: aload #15
/*     */       //   417: getfield I$1 : I
/*     */       //   420: istore #7
/*     */       //   422: aload #15
/*     */       //   424: getfield I$0 : I
/*     */       //   427: istore #4
/*     */       //   429: aload #15
/*     */       //   431: getfield L$3 : Ljava/lang/Object;
/*     */       //   434: checkcast java/nio/file/Path
/*     */       //   437: astore #6
/*     */       //   439: aload #15
/*     */       //   441: getfield L$2 : Ljava/lang/Object;
/*     */       //   444: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   447: astore_2
/*     */       //   448: aload #15
/*     */       //   450: getfield L$1 : Ljava/lang/Object;
/*     */       //   453: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */       //   456: astore_1
/*     */       //   457: aload #15
/*     */       //   459: getfield L$0 : Ljava/lang/Object;
/*     */       //   462: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion
/*     */       //   465: astore_0
/*     */       //   466: aload #14
/*     */       //   468: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   471: aload #14
/*     */       //   473: checkcast java/lang/String
/*     */       //   476: astore #9
/*     */       //   478: aload #9
/*     */       //   480: ifnull -> 493
/*     */       //   483: aload #9
/*     */       //   485: astore #11
/*     */       //   487: iconst_0
/*     */       //   488: istore #12
/*     */       //   490: aload #11
/*     */       //   492: areturn
/*     */       //   493: aload_1
/*     */       //   494: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */       //   499: aload #6
/*     */       //   501: invokevirtual hasViewedFile : (Ljava/nio/file/Path;)Z
/*     */       //   504: ifne -> 521
/*     */       //   507: aload_1
/*     */       //   508: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */       //   513: aload #6
/*     */       //   515: invokevirtual hasViewedImport : (Ljava/nio/file/Path;)Z
/*     */       //   518: ifeq -> 525
/*     */       //   521: iconst_1
/*     */       //   522: goto -> 526
/*     */       //   525: iconst_0
/*     */       //   526: istore #9
/*     */       //   528: iload #9
/*     */       //   530: ifeq -> 538
/*     */       //   533: ldc ''
/*     */       //   535: goto -> 654
/*     */       //   538: aload_1
/*     */       //   539: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */       //   544: aload #6
/*     */       //   546: invokevirtual markViewedImport : (Ljava/nio/file/Path;)V
/*     */       //   549: aload_0
/*     */       //   550: aload_2
/*     */       //   551: aload #6
/*     */       //   553: aload_1
/*     */       //   554: aload #15
/*     */       //   556: aload #15
/*     */       //   558: aload_1
/*     */       //   559: putfield L$0 : Ljava/lang/Object;
/*     */       //   562: aload #15
/*     */       //   564: aload_2
/*     */       //   565: putfield L$1 : Ljava/lang/Object;
/*     */       //   568: aload #15
/*     */       //   570: aconst_null
/*     */       //   571: putfield L$2 : Ljava/lang/Object;
/*     */       //   574: aload #15
/*     */       //   576: aconst_null
/*     */       //   577: putfield L$3 : Ljava/lang/Object;
/*     */       //   580: aload #15
/*     */       //   582: iload #4
/*     */       //   584: putfield I$0 : I
/*     */       //   587: aload #15
/*     */       //   589: iload #7
/*     */       //   591: putfield I$1 : I
/*     */       //   594: aload #15
/*     */       //   596: iconst_3
/*     */       //   597: putfield label : I
/*     */       //   600: invokespecial getFileImports : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   603: dup
/*     */       //   604: aload #16
/*     */       //   606: if_acmpne -> 651
/*     */       //   609: aload #16
/*     */       //   611: areturn
/*     */       //   612: aload #15
/*     */       //   614: getfield I$1 : I
/*     */       //   617: istore #7
/*     */       //   619: aload #15
/*     */       //   621: getfield I$0 : I
/*     */       //   624: istore #4
/*     */       //   626: aload #15
/*     */       //   628: getfield L$1 : Ljava/lang/Object;
/*     */       //   631: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */       //   634: astore_2
/*     */       //   635: aload #15
/*     */       //   637: getfield L$0 : Ljava/lang/Object;
/*     */       //   640: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */       //   643: astore_1
/*     */       //   644: aload #14
/*     */       //   646: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   649: aload #14
/*     */       //   651: checkcast java/lang/String
/*     */       //   654: dup
/*     */       //   655: ifnonnull -> 661
/*     */       //   658: pop
/*     */       //   659: ldc ''
/*     */       //   661: astore #10
/*     */       //   663: aload #10
/*     */       //   665: astore #13
/*     */       //   667: aload_1
/*     */       //   668: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */       //   673: aload_2
/*     */       //   674: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */       //   677: dup
/*     */       //   678: iload #7
/*     */       //   680: iload #4
/*     */       //   682: bipush #10
/*     */       //   684: bipush #10
/*     */       //   686: iconst_0
/*     */       //   687: bipush #16
/*     */       //   689: aconst_null
/*     */       //   690: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   693: aconst_null
/*     */       //   694: aload_1
/*     */       //   695: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */       //   700: aload #15
/*     */       //   702: bipush #8
/*     */       //   704: aconst_null
/*     */       //   705: aload #15
/*     */       //   707: aload #13
/*     */       //   709: putfield L$0 : Ljava/lang/Object;
/*     */       //   712: aload #15
/*     */       //   714: aconst_null
/*     */       //   715: putfield L$1 : Ljava/lang/Object;
/*     */       //   718: aload #15
/*     */       //   720: aconst_null
/*     */       //   721: putfield L$2 : Ljava/lang/Object;
/*     */       //   724: aload #15
/*     */       //   726: aconst_null
/*     */       //   727: putfield L$3 : Ljava/lang/Object;
/*     */       //   730: aload #15
/*     */       //   732: iconst_4
/*     */       //   733: putfield label : I
/*     */       //   736: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   739: dup
/*     */       //   740: aload #16
/*     */       //   742: if_acmpne -> 765
/*     */       //   745: aload #16
/*     */       //   747: areturn
/*     */       //   748: aload #15
/*     */       //   750: getfield L$0 : Ljava/lang/Object;
/*     */       //   753: checkcast java/lang/String
/*     */       //   756: astore #13
/*     */       //   758: aload #14
/*     */       //   760: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   763: aload #14
/*     */       //   765: aload #13
/*     */       //   767: swap
/*     */       //   768: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;
/*     */       //   773: areturn
/*     */       //   774: new java/lang/IllegalStateException
/*     */       //   777: dup
/*     */       //   778: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   780: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   783: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #24	-> 63
/*     */       //   #25	-> 109
/*     */       //   #27	-> 123
/*     */       //   #28	-> 138
/*     */       //   #30	-> 154
/*     */       //   #31	-> 167
/*     */       //   #24	-> 248
/*     */       //   #31	-> 318
/*     */       //   #32	-> 327
/*     */       //   #40	-> 334
/*     */       //   #35	-> 334
/*     */       //   #36	-> 335
/*     */       //   #37	-> 336
/*     */       //   #38	-> 338
/*     */       //   #39	-> 347
/*     */       //   #35	-> 352
/*     */       //   #24	-> 412
/*     */       //   #40	-> 478
/*     */       //   #35	-> 483
/*     */       //   #40	-> 485
/*     */       //   #41	-> 490
/*     */       //   #45	-> 493
/*     */       //   #46	-> 528
/*     */       //   #47	-> 538
/*     */       //   #48	-> 549
/*     */       //   #24	-> 609
/*     */       //   #46	-> 654
/*     */       //   #49	-> 659
/*     */       //   #46	-> 661
/*     */       //   #51	-> 663
/*     */       //   #52	-> 667
/*     */       //   #53	-> 673
/*     */       //   #54	-> 674
/*     */       //   #51	-> 693
/*     */       //   #55	-> 694
/*     */       //   #51	-> 702
/*     */       //   #24	-> 745
/*     */       //   #51	-> 765
/*     */       //   #24	-> 774
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   109	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   121	130	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   311	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   334	81	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   466	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   493	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   538	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   109	8	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   121	130	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   302	25	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   334	81	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   457	26	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   493	119	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   644	58	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   109	8	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   121	130	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   293	34	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   334	81	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   448	35	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   493	119	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   635	39	2	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   109	8	3	lineNumber	Ljava/lang/Integer;
/*     */       //   121	130	3	lineNumber	Ljava/lang/Integer;
/*     */       //   284	43	3	lineNumber	Ljava/lang/Integer;
/*     */       //   334	12	3	lineNumber	Ljava/lang/Integer;
/*     */       //   109	8	4	window	I
/*     */       //   121	130	4	window	I
/*     */       //   265	62	4	window	I
/*     */       //   334	81	4	window	I
/*     */       //   429	54	4	window	I
/*     */       //   493	119	4	window	I
/*     */       //   626	67	4	window	I
/*     */       //   123	128	6	filePath	Ljava/nio/file/Path;
/*     */       //   275	59	6	filePath	Ljava/nio/file/Path;
/*     */       //   334	81	6	filePath	Ljava/nio/file/Path;
/*     */       //   439	44	6	filePath	Ljava/nio/file/Path;
/*     */       //   493	45	6	filePath	Ljava/nio/file/Path;
/*     */       //   538	65	6	filePath	Ljava/nio/file/Path;
/*     */       //   138	113	7	line	I
/*     */       //   258	69	7	line	I
/*     */       //   334	81	7	line	I
/*     */       //   422	61	7	line	I
/*     */       //   493	119	7	line	I
/*     */       //   619	74	7	line	I
/*     */       //   167	75	8	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile;
/*     */       //   528	10	9	seenImports	Z
/*     */       //   663	4	10	importsButOnlyOnce	Ljava/lang/String;
/*     */       //   487	6	11	it	Ljava/lang/String;
/*     */       //   490	3	12	$i$a$-let-OpenFileAgentAction$Companion$getOpenFileActionOutput$2	I
/*     */       //   0	784	5	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   53	721	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   60	714	14	$result	Ljava/lang/Object;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @NotNull
/*     */     public final String buildAiignoreMessage(@NotNull Path filePath) {
/*  60 */       Intrinsics.checkNotNullParameter(filePath, "filePath"); return "ERROR: accessing " + filePath + " was explicitly rejected by user. Don't try accessing this file again.";
/*     */     } private final Object getFileImports(VirtualFile vFile, Path path, ExecutionAgentContext context, Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_3
/*     */       //   1: aload_1
/*     */       //   2: aload_2
/*     */       //   3: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */       //   8: aload #4
/*     */       //   10: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   13: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #64	-> 0
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   0	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */       //   0	14	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   0	14	2	path	Ljava/nio/file/Path;
/*     */       //   0	14	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   0	14	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     } private static final String getFileImports$lambda$2(ExecutionAgentContext $context, VirtualFile $vFile, Path $path) {
/*     */       PsiFile psiFile;
/*  65 */       if (PsiManager.getInstance($context.getProject()).findFile($vFile) == null) { PsiManager.getInstance($context.getProject()).findFile($vFile); return null; }
/*  66 */        if (ElementProvider.Companion.getImportStatementsText(psiFile, $path, $context.getSessionHistory()) != null) { String str1 = ElementProvider.Companion.getImportStatementsText(psiFile, $path, $context.getSessionHistory()), it = str1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 154 */         int $i$a$-takeIf-OpenFileAgentAction$Companion$getFileImports$2$imports$1 = 0;
/*     */         if (((!StringsKt.isBlank(it)) ? str1 : null) != null) {
/*     */           Object object;
/*     */           FileDocumentManager.getInstance().getDocument($vFile);
/*     */           int documentLineCount = (FileDocumentManager.getInstance().getDocument($vFile) != null) ? FileDocumentManager.getInstance().getDocument($vFile).getLineCount() : 0;
/*     */           return "[File: " + ExecutionEnvironmentKt.safePathForBash($path) + " (" + documentLineCount + " lines total)]\n##### Imports\n" + object + "\n\n";
/*     */         }  }
/*     */       
/*     */       ElementProvider.Companion.getImportStatementsText(psiFile, $path, $context.getSessionHistory());
/*     */       return null;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "OpenFileAgentAction.kt", l = {31, 35, 48, 51}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "I$0", "I$1"}, n = {"this", "context", "file", "lineNumber", "filePath", "window", "line", "this", "context", "file", "filePath", "window", "line", "context", "file", "window", "line"}, m = "getOpenFileActionOutput", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentAction$Companion")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class OpenFileAgentAction$Companion$getOpenFileActionOutput$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       Object L$2;
/*     */       Object L$3;
/*     */       Object L$4;
/*     */       int I$0;
/*     */       int I$1;
/*     */       int label;
/*     */       
/*     */       OpenFileAgentAction$Companion$getOpenFileActionOutput$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return OpenFileAgentAction.Companion.this.getOpenFileActionOutput(null, null, null, 0, (Continuation<? super String>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final String name = "open";
/*     */   @NotNull
/*     */   private final List<Argument> arguments;
/*     */   @NotNull
/*     */   private final String docstring;
/*     */   @NotNull
/*     */   public static final String PATH_ARGUMENT = "path";
/*     */   @NotNull
/*     */   public static final String LINE_NUMBER_ARGUMENT = "line_number";
/*     */   
/*     */   @NotNull
/*     */   public String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public List<Argument> getArguments() {
/*     */     return this.arguments;
/*     */   }
/*     */   
/*     */   public OpenFileAgentAction() {
/*     */     Argument[] arrayOfArgument = new Argument[2];
/*     */     arrayOfArgument[0] = new Argument("path", ArgumentType.STRING, "the full path to the file to open", false, false, 24, null);
/*     */     arrayOfArgument[1] = new Argument("line_number", ArgumentType.INTEGER, "the line number where the view window will start. If this parameter is omitted, the view window will start from the first line.", true, false, 16, null);
/*     */     this.arguments = CollectionsKt.listOf((Object[])arrayOfArgument);
/*     */     this.docstring = StringsKt.trim("Open 100 lines of the specified file in the editor, starting from the specified line number.\nSince files are often larger than the visible window, specifying the line number helps you view a specific section of the code.\nInformation from [Tag: RelevantCode], as well as the commands `get_file_structure` and `search_project` can help identify the relevant lines.").toString();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDocstring() {
/*     */     return this.docstring;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$execute$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$execute$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #11
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$execute$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 431, 0 -> 96, 1 -> 129, 2 -> 266, 3 -> 414
/*     */     //   96: aload #10
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aload #11
/*     */     //   105: aload #11
/*     */     //   107: aload_2
/*     */     //   108: putfield L$0 : Ljava/lang/Object;
/*     */     //   111: aload #11
/*     */     //   113: iconst_1
/*     */     //   114: putfield label : I
/*     */     //   117: invokevirtual getInputParams : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   120: dup
/*     */     //   121: aload #12
/*     */     //   123: if_acmpne -> 145
/*     */     //   126: aload #12
/*     */     //   128: areturn
/*     */     //   129: aload #11
/*     */     //   131: getfield L$0 : Ljava/lang/Object;
/*     */     //   134: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   137: astore_2
/*     */     //   138: aload #10
/*     */     //   140: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   143: aload #10
/*     */     //   145: checkcast java/util/Map
/*     */     //   148: astore #4
/*     */     //   150: aload #4
/*     */     //   152: ldc 'path'
/*     */     //   154: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   159: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   162: invokestatic tryGetNonEmptyStringValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   165: dup
/*     */     //   166: ifnonnull -> 173
/*     */     //   169: pop
/*     */     //   170: ldc 'ERROR: path is missing or invalid'
/*     */     //   172: areturn
/*     */     //   173: astore #5
/*     */     //   175: aload #4
/*     */     //   177: ldc 'line_number'
/*     */     //   179: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   184: checkcast com/intellij/ml/llm/matterhorn/llm/ParameterValue
/*     */     //   187: astore #6
/*     */     //   189: aload #6
/*     */     //   191: ifnull -> 224
/*     */     //   194: aload #6
/*     */     //   196: invokestatic tryGetIntValue : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/Integer;
/*     */     //   199: dup
/*     */     //   200: ifnull -> 209
/*     */     //   203: invokevirtual intValue : ()I
/*     */     //   206: goto -> 218
/*     */     //   209: pop
/*     */     //   210: aload #6
/*     */     //   212: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;)Ljava/lang/String;
/*     */     //   217: areturn
/*     */     //   218: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   221: goto -> 225
/*     */     //   224: aconst_null
/*     */     //   225: astore #7
/*     */     //   227: aload #5
/*     */     //   229: aload_2
/*     */     //   230: iconst_0
/*     */     //   231: aload #11
/*     */     //   233: iconst_4
/*     */     //   234: aconst_null
/*     */     //   235: aload #11
/*     */     //   237: aload_2
/*     */     //   238: putfield L$0 : Ljava/lang/Object;
/*     */     //   241: aload #11
/*     */     //   243: aload #7
/*     */     //   245: putfield L$1 : Ljava/lang/Object;
/*     */     //   248: aload #11
/*     */     //   250: iconst_2
/*     */     //   251: putfield label : I
/*     */     //   254: invokestatic smartLocateFile$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   257: dup
/*     */     //   258: aload #12
/*     */     //   260: if_acmpne -> 292
/*     */     //   263: aload #12
/*     */     //   265: areturn
/*     */     //   266: aload #11
/*     */     //   268: getfield L$1 : Ljava/lang/Object;
/*     */     //   271: checkcast java/lang/Integer
/*     */     //   274: astore #7
/*     */     //   276: aload #11
/*     */     //   278: getfield L$0 : Ljava/lang/Object;
/*     */     //   281: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   284: astore_2
/*     */     //   285: aload #10
/*     */     //   287: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   290: aload #10
/*     */     //   292: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   295: astore #8
/*     */     //   297: aload #8
/*     */     //   299: astore #9
/*     */     //   301: aload #9
/*     */     //   303: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   306: ifeq -> 329
/*     */     //   309: ldc 'Open file'
/*     */     //   311: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   314: aload_2
/*     */     //   315: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   318: aload #8
/*     */     //   320: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   323: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   326: goto -> 430
/*     */     //   329: aload #9
/*     */     //   331: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   334: ifeq -> 422
/*     */     //   337: aload #8
/*     */     //   339: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   342: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   345: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   348: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   351: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   356: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Info : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   359: aload_2
/*     */     //   360: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   363: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction$Companion;
/*     */     //   366: aload_2
/*     */     //   367: aload #8
/*     */     //   369: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   372: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   375: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   378: aload #7
/*     */     //   380: bipush #100
/*     */     //   382: aload #11
/*     */     //   384: aload #11
/*     */     //   386: aconst_null
/*     */     //   387: putfield L$0 : Ljava/lang/Object;
/*     */     //   390: aload #11
/*     */     //   392: aconst_null
/*     */     //   393: putfield L$1 : Ljava/lang/Object;
/*     */     //   396: aload #11
/*     */     //   398: iconst_3
/*     */     //   399: putfield label : I
/*     */     //   402: invokevirtual getOpenFileActionOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/Integer;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   405: dup
/*     */     //   406: aload #12
/*     */     //   408: if_acmpne -> 421
/*     */     //   411: aload #12
/*     */     //   413: areturn
/*     */     //   414: aload #10
/*     */     //   416: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   419: aload #10
/*     */     //   421: areturn
/*     */     //   422: new kotlin/NoWhenBranchMatchedException
/*     */     //   425: dup
/*     */     //   426: invokespecial <init> : ()V
/*     */     //   429: athrow
/*     */     //   430: areturn
/*     */     //   431: new java/lang/IllegalStateException
/*     */     //   434: dup
/*     */     //   435: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   437: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   440: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #94	-> 60
/*     */     //   #96	-> 101
/*     */     //   #94	-> 126
/*     */     //   #97	-> 150
/*     */     //   #98	-> 175
/*     */     //   #99	-> 189
/*     */     //   #100	-> 194
/*     */     //   #103	-> 224
/*     */     //   #99	-> 225
/*     */     //   #106	-> 227
/*     */     //   #94	-> 263
/*     */     //   #107	-> 297
/*     */     //   #108	-> 301
/*     */     //   #109	-> 309
/*     */     //   #110	-> 318
/*     */     //   #112	-> 329
/*     */     //   #113	-> 337
/*     */     //   #114	-> 363
/*     */     //   #94	-> 411
/*     */     //   #117	-> 421
/*     */     //   #107	-> 422
/*     */     //   #94	-> 431
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentAction;
/*     */     //   101	19	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   101	28	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   138	31	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   173	36	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   218	48	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   285	33	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   329	76	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   150	19	4	params	Ljava/util/Map;
/*     */     //   173	16	4	params	Ljava/util/Map;
/*     */     //   175	34	5	pathStr	Ljava/lang/String;
/*     */     //   218	39	5	pathStr	Ljava/lang/String;
/*     */     //   189	20	6	lineNumberStr	Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;
/*     */     //   209	9	6	lineNumberStr	Lcom/intellij/ml/llm/matterhorn/llm/ParameterValue;
/*     */     //   227	39	7	lineNumber	Ljava/lang/Integer;
/*     */     //   276	33	7	lineNumber	Ljava/lang/Integer;
/*     */     //   329	76	7	lineNumber	Ljava/lang/Integer;
/*     */     //   297	32	8	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   329	76	8	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   0	441	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	381	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	374	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "OpenFileAgentAction.kt", l = {96, 106, 114}, i = {0, 1, 1}, s = {"L$0", "L$0", "L$1"}, n = {"context", "context", "lineNumber"}, m = "execute", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class OpenFileAgentAction$execute$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     OpenFileAgentAction$execute$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return OpenFileAgentAction.this.execute(null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\OpenFileAgentAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */