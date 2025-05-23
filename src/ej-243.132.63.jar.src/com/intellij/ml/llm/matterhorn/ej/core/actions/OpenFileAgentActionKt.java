/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000&\n\000\n\002\020\016\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\b\n\002\b\005\0324\020\000\032\004\030\0010\001*\0020\0022\006\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013\032\034\020\f\032\004\030\0010\001*\0020\0022\006\020\r\032\0020\006H@¢\006\002\020\016¨\006\017"}, d2 = {"oncePerSessionShowFileToAgent", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "vFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "filePath", "Ljava/nio/file/Path;", "atLeastShowStructure", "", "smallFileLimit", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/nio/file/Path;ZILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFileStructureOrNull", "path", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ public final class OpenFileAgentActionKt
/*     */ {
/*     */   @Nullable
/*     */   public static final Object oncePerSessionShowFileToAgent(@NotNull ExecutionAgentContext $this$oncePerSessionShowFileToAgent, @NotNull VirtualFile vFile, @NotNull Path filePath, boolean atLeastShowStructure, int smallFileLimit, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1
/*     */     //   13: astore #10
/*     */     //   15: aload #10
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #10
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1
/*     */     //   44: dup
/*     */     //   45: aload #5
/*     */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #10
/*     */     //   52: aload #10
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #9
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #11
/*     */     //   64: aload #10
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 399, 0 -> 100, 1 -> 177, 2 -> 307, 3 -> 369
/*     */     //   100: aload #9
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   111: aload_2
/*     */     //   112: invokevirtual hasViewedFile : (Ljava/nio/file/Path;)Z
/*     */     //   115: ifeq -> 120
/*     */     //   118: aconst_null
/*     */     //   119: areturn
/*     */     //   120: aload_1
/*     */     //   121: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*     */     //   126: aload #10
/*     */     //   128: aload #10
/*     */     //   130: aload_0
/*     */     //   131: putfield L$0 : Ljava/lang/Object;
/*     */     //   134: aload #10
/*     */     //   136: aload_1
/*     */     //   137: putfield L$1 : Ljava/lang/Object;
/*     */     //   140: aload #10
/*     */     //   142: aload_2
/*     */     //   143: putfield L$2 : Ljava/lang/Object;
/*     */     //   146: aload #10
/*     */     //   148: iload_3
/*     */     //   149: putfield Z$0 : Z
/*     */     //   152: aload #10
/*     */     //   154: iload #4
/*     */     //   156: putfield I$0 : I
/*     */     //   159: aload #10
/*     */     //   161: iconst_1
/*     */     //   162: putfield label : I
/*     */     //   165: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   168: dup
/*     */     //   169: aload #11
/*     */     //   171: if_acmpne -> 224
/*     */     //   174: aload #11
/*     */     //   176: areturn
/*     */     //   177: aload #10
/*     */     //   179: getfield I$0 : I
/*     */     //   182: istore #4
/*     */     //   184: aload #10
/*     */     //   186: getfield Z$0 : Z
/*     */     //   189: istore_3
/*     */     //   190: aload #10
/*     */     //   192: getfield L$2 : Ljava/lang/Object;
/*     */     //   195: checkcast java/nio/file/Path
/*     */     //   198: astore_2
/*     */     //   199: aload #10
/*     */     //   201: getfield L$1 : Ljava/lang/Object;
/*     */     //   204: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   207: astore_1
/*     */     //   208: aload #10
/*     */     //   210: getfield L$0 : Ljava/lang/Object;
/*     */     //   213: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   216: astore_0
/*     */     //   217: aload #9
/*     */     //   219: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   222: aload #9
/*     */     //   224: checkcast java/lang/Number
/*     */     //   227: invokevirtual intValue : ()I
/*     */     //   230: istore #6
/*     */     //   232: iload #6
/*     */     //   234: iload #4
/*     */     //   236: if_icmpge -> 315
/*     */     //   239: aload_0
/*     */     //   240: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   245: aload_2
/*     */     //   246: invokevirtual markViewedFile : (Ljava/nio/file/Path;)V
/*     */     //   249: aload_0
/*     */     //   250: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   255: aload_1
/*     */     //   256: iconst_1
/*     */     //   257: iload #4
/*     */     //   259: aconst_null
/*     */     //   260: aload_0
/*     */     //   261: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   266: aload #10
/*     */     //   268: bipush #16
/*     */     //   270: aconst_null
/*     */     //   271: aload #10
/*     */     //   273: aconst_null
/*     */     //   274: putfield L$0 : Ljava/lang/Object;
/*     */     //   277: aload #10
/*     */     //   279: aconst_null
/*     */     //   280: putfield L$1 : Ljava/lang/Object;
/*     */     //   283: aload #10
/*     */     //   285: aconst_null
/*     */     //   286: putfield L$2 : Ljava/lang/Object;
/*     */     //   289: aload #10
/*     */     //   291: iconst_2
/*     */     //   292: putfield label : I
/*     */     //   295: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;IILjava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   298: dup
/*     */     //   299: aload #11
/*     */     //   301: if_acmpne -> 314
/*     */     //   304: aload #11
/*     */     //   306: areturn
/*     */     //   307: aload #9
/*     */     //   309: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   312: aload #9
/*     */     //   314: areturn
/*     */     //   315: iload_3
/*     */     //   316: ifeq -> 397
/*     */     //   319: aload_0
/*     */     //   320: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   325: aload_2
/*     */     //   326: invokevirtual markViewedFile : (Ljava/nio/file/Path;)V
/*     */     //   329: aload_0
/*     */     //   330: aload_2
/*     */     //   331: aload #10
/*     */     //   333: aload #10
/*     */     //   335: aconst_null
/*     */     //   336: putfield L$0 : Ljava/lang/Object;
/*     */     //   339: aload #10
/*     */     //   341: aconst_null
/*     */     //   342: putfield L$1 : Ljava/lang/Object;
/*     */     //   345: aload #10
/*     */     //   347: aconst_null
/*     */     //   348: putfield L$2 : Ljava/lang/Object;
/*     */     //   351: aload #10
/*     */     //   353: iconst_3
/*     */     //   354: putfield label : I
/*     */     //   357: invokestatic getFileStructureOrNull : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   360: dup
/*     */     //   361: aload #11
/*     */     //   363: if_acmpne -> 376
/*     */     //   366: aload #11
/*     */     //   368: areturn
/*     */     //   369: aload #9
/*     */     //   371: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   374: aload #9
/*     */     //   376: checkcast java/lang/String
/*     */     //   379: dup
/*     */     //   380: ifnull -> 396
/*     */     //   383: astore #7
/*     */     //   385: iconst_0
/*     */     //   386: istore #8
/*     */     //   388: aload #7
/*     */     //   390: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   395: areturn
/*     */     //   396: pop
/*     */     //   397: aconst_null
/*     */     //   398: areturn
/*     */     //   399: new java/lang/IllegalStateException
/*     */     //   402: dup
/*     */     //   403: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   405: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   408: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #120	-> 62
/*     */     //   #124	-> 105
/*     */     //   #125	-> 118
/*     */     //   #128	-> 120
/*     */     //   #120	-> 174
/*     */     //   #128	-> 224
/*     */     //   #129	-> 232
/*     */     //   #130	-> 239
/*     */     //   #131	-> 249
/*     */     //   #120	-> 304
/*     */     //   #134	-> 314
/*     */     //   #135	-> 319
/*     */     //   #136	-> 329
/*     */     //   #120	-> 366
/*     */     //   #136	-> 376
/*     */     //   #139	-> 388
/*     */     //   #137	-> 395
/*     */     //   #143	-> 397
/*     */     //   #120	-> 399
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	72	0	$this$oncePerSessionShowFileToAgent	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   217	81	0	$this$oncePerSessionShowFileToAgent	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   315	45	0	$this$oncePerSessionShowFileToAgent	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   105	72	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   208	90	1	vFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   105	72	2	filePath	Ljava/nio/file/Path;
/*     */     //   199	50	2	filePath	Ljava/nio/file/Path;
/*     */     //   315	45	2	filePath	Ljava/nio/file/Path;
/*     */     //   105	72	3	atLeastShowStructure	Z
/*     */     //   190	49	3	atLeastShowStructure	Z
/*     */     //   315	4	3	atLeastShowStructure	Z
/*     */     //   105	72	4	smallFileLimit	I
/*     */     //   184	114	4	smallFileLimit	I
/*     */     //   232	7	6	documentLineCount	I
/*     */     //   385	11	7	structure	Ljava/lang/String;
/*     */     //   388	8	8	$i$a$-let-OpenFileAgentActionKt$oncePerSessionShowFileToAgent$2	I
/*     */     //   0	409	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   52	347	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	340	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final int oncePerSessionShowFileToAgent$lambda$0(VirtualFile $vFile) {
/* 128 */     FileDocumentManager.getInstance().getDocument($vFile); return (FileDocumentManager.getInstance().getDocument($vFile) != null) ? FileDocumentManager.getInstance().getDocument($vFile).getLineCount() : 0;
/*     */   }
/*     */   
/*     */   private static final Object getFileStructureOrNull(ExecutionAgentContext $this$getFileStructureOrNull, Path path, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$getFileStructureOrNull$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$getFileStructureOrNull$1
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
/*     */     //   36: goto -> 49
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/OpenFileAgentActionKt$getFileStructureOrNull$1
/*     */     //   42: dup
/*     */     //   43: aload_2
/*     */     //   44: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   47: astore #9
/*     */     //   49: aload #9
/*     */     //   51: getfield result : Ljava/lang/Object;
/*     */     //   54: astore #8
/*     */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   59: astore #10
/*     */     //   61: aload #9
/*     */     //   63: getfield label : I
/*     */     //   66: tableswitch default -> 210, 0 -> 88, 1 -> 157
/*     */     //   88: aload #8
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   96: dup
/*     */     //   97: invokespecial <init> : ()V
/*     */     //   100: astore_3
/*     */     //   101: new com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   104: dup
/*     */     //   105: aload_3
/*     */     //   106: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   109: aload_1
/*     */     //   110: invokestatic safePathForBash : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   113: ldc ''
/*     */     //   115: iconst_0
/*     */     //   116: bipush #8
/*     */     //   118: aconst_null
/*     */     //   119: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   122: astore #4
/*     */     //   124: new com/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction
/*     */     //   127: dup
/*     */     //   128: invokespecial <init> : ()V
/*     */     //   131: aload #4
/*     */     //   133: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   136: aload_0
/*     */     //   137: aload #9
/*     */     //   139: aload #9
/*     */     //   141: iconst_1
/*     */     //   142: putfield label : I
/*     */     //   145: invokevirtual execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   148: dup
/*     */     //   149: aload #10
/*     */     //   151: if_acmpne -> 164
/*     */     //   154: aload #10
/*     */     //   156: areturn
/*     */     //   157: aload #8
/*     */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   162: aload #8
/*     */     //   164: astore #5
/*     */     //   166: aload #5
/*     */     //   168: checkcast java/lang/String
/*     */     //   171: astore #6
/*     */     //   173: iconst_0
/*     */     //   174: istore #7
/*     */     //   176: aload #6
/*     */     //   178: checkcast java/lang/CharSequence
/*     */     //   181: ldc 'It's not possible to display the file structure; either the file type is not supported, or parsing failed.'
/*     */     //   183: checkcast java/lang/CharSequence
/*     */     //   186: iconst_0
/*     */     //   187: iconst_2
/*     */     //   188: aconst_null
/*     */     //   189: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   192: ifne -> 199
/*     */     //   195: iconst_1
/*     */     //   196: goto -> 200
/*     */     //   199: iconst_0
/*     */     //   200: ifeq -> 208
/*     */     //   203: aload #5
/*     */     //   205: goto -> 209
/*     */     //   208: aconst_null
/*     */     //   209: areturn
/*     */     //   210: new java/lang/IllegalStateException
/*     */     //   213: dup
/*     */     //   214: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   216: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   219: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 59
/*     */     //   #147	-> 93
/*     */     //   #148	-> 101
/*     */     //   #149	-> 124
/*     */     //   #146	-> 154
/*     */     //   #150	-> 176
/*     */     //   #149	-> 200
/*     */     //   #149	-> 209
/*     */     //   #146	-> 210
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	55	0	$this$getFileStructureOrNull	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   93	31	1	path	Ljava/nio/file/Path;
/*     */     //   101	23	3	action	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/GetFileStructureAction;
/*     */     //   124	24	4	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;
/*     */     //   173	26	6	it	Ljava/lang/String;
/*     */     //   176	24	7	$i$a$-takeIf-OpenFileAgentActionKt$getFileStructureOrNull$2	I
/*     */     //   0	220	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   49	161	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   56	154	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "OpenFileAgentAction.kt", l = {149}, i = {}, s = {}, n = {}, m = "getFileStructureOrNull", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentActionKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class OpenFileAgentActionKt$getFileStructureOrNull$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     OpenFileAgentActionKt$getFileStructureOrNull$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return OpenFileAgentActionKt.getFileStructureOrNull(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "OpenFileAgentAction.kt", l = {128, 131, 136}, i = {0, 0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0"}, n = {"$this$oncePerSessionShowFileToAgent", "vFile", "filePath", "atLeastShowStructure", "smallFileLimit"}, m = "oncePerSessionShowFileToAgent", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.OpenFileAgentActionKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     boolean Z$0;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     OpenFileAgentActionKt$oncePerSessionShowFileToAgent$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return OpenFileAgentActionKt.oncePerSessionShowFileToAgent(null, null, null, false, 0, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\OpenFileAgentActionKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */