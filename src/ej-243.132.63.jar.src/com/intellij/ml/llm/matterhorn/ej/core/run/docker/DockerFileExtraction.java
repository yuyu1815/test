/*    */ package com.intellij.ml.llm.matterhorn.ej.core.run.docker;
/*    */ import com.intellij.openapi.diagnostic.Logger;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\005\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J:\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\0202\030\020\021\032\024\022\004\022\0020\t\022\004\022\0020\023\022\004\022\0020\0240\022H@¢\006\004\b\025\020\026J:\020\027\032\0020\0242\006\020\r\032\0020\0162\006\020\017\032\0020\0202\030\020\021\032\024\022\004\022\0020\t\022\004\022\0020\023\022\004\022\0020\0240\022H@¢\006\004\b\030\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\016\020\b\032\0020\tXT¢\006\002\n\000R\016\020\n\032\0020\tXT¢\006\002\n\000¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ELECTRIC_JUNIOR_DOCKERFILE", "", "ELECTRIC_JUNIOR_ENV_SETUP_SCRIPT", "createDockerFileIfAbsentAndNotify", "", "project", "Lcom/intellij/openapi/project/Project;", "dockerFileExtractor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;", "onNotification", "Lkotlin/Function2;", "Lcom/intellij/notification/NotificationType;", "", "createDockerFileIfAbsentAndNotify$ej_core", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createDockerFileAndNotify", "createDockerFileAndNotify$ej_core", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nDockerFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DockerFile.kt\ncom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,97:1\n14#2:98\n*S KotlinDebug\n*F\n+ 1 DockerFile.kt\ncom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction\n*L\n15#1:98\n*E\n"})
/*    */ public final class DockerFileExtraction {
/*    */   @NotNull
/* 15 */   public static final DockerFileExtraction INSTANCE = new DockerFileExtraction(); @NotNull public final Logger getLogger() { return logger; } static { int $i$f$logger = 0;
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
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 98 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(DockerFileExtraction.class), "getInstance(...)"); } @Nullable public final Object createDockerFileIfAbsentAndNotify$ej_core(@NotNull Project project, @NotNull ProjectDockerFileExtractor dockerFileExtractor, @NotNull Function2 onNotification, @NotNull Continuation $completion) { // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileIfAbsentAndNotify$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileIfAbsentAndNotify$1
/*    */     //   13: astore #8
/*    */     //   15: aload #8
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #8
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileIfAbsentAndNotify$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #8
/*    */     //   53: aload #8
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #7
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #9
/*    */     //   65: aload #8
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 177, 0 -> 92, 1 -> 164
/*    */     //   92: aload #7
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_1
/*    */     //   98: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   101: dup
/*    */     //   102: ifnonnull -> 119
/*    */     //   105: pop
/*    */     //   106: new java/lang/IllegalStateException
/*    */     //   109: dup
/*    */     //   110: ldc 'Project dir not found'
/*    */     //   112: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   115: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   118: athrow
/*    */     //   119: astore #5
/*    */     //   121: aload #5
/*    */     //   123: ldc 'electricJuniorDockerfile'
/*    */     //   125: invokevirtual findChild : (Ljava/lang/String;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   128: astore #6
/*    */     //   130: aload #6
/*    */     //   132: ifnull -> 140
/*    */     //   135: iconst_0
/*    */     //   136: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   139: areturn
/*    */     //   140: aload_0
/*    */     //   141: aload_1
/*    */     //   142: aload_2
/*    */     //   143: aload_3
/*    */     //   144: aload #8
/*    */     //   146: aload #8
/*    */     //   148: iconst_1
/*    */     //   149: putfield label : I
/*    */     //   152: invokevirtual createDockerFileAndNotify$ej_core : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   155: dup
/*    */     //   156: aload #9
/*    */     //   158: if_acmpne -> 171
/*    */     //   161: aload #9
/*    */     //   163: areturn
/*    */     //   164: aload #7
/*    */     //   166: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   169: aload #7
/*    */     //   171: pop
/*    */     //   172: iconst_1
/*    */     //   173: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   176: areturn
/*    */     //   177: new java/lang/IllegalStateException
/*    */     //   180: dup
/*    */     //   181: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   183: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   186: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #23	-> 63
/*    */     //   #26	-> 97
/*    */     //   #27	-> 121
/*    */     //   #28	-> 130
/*    */     //   #29	-> 135
/*    */     //   #31	-> 140
/*    */     //   #23	-> 161
/*    */     //   #32	-> 171
/*    */     //   #23	-> 177
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;
/*    */     //   119	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;
/*    */     //   140	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;
/*    */     //   97	8	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   119	16	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   140	15	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   97	8	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   119	16	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   140	15	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   97	8	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   119	16	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   140	15	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   121	9	5	projectDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   130	5	6	dockerFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   0	187	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	124	8	$continuation	Lkotlin/coroutines/Continuation;
/* 98 */     //   60	117	7	$result	Ljava/lang/Object; } @NotNull private static final Logger logger = Logger.getInstance(DockerFileExtraction.class);
/*    */   
/*    */   @Nullable
/*    */   public final Object createDockerFileAndNotify$ej_core(@NotNull Project project, @NotNull ProjectDockerFileExtractor dockerFileExtractor, @NotNull Function2 onNotification, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload #4
/*    */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileAndNotify$1
/*    */     //   5: ifeq -> 41
/*    */     //   8: aload #4
/*    */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileAndNotify$1
/*    */     //   13: astore #9
/*    */     //   15: aload #9
/*    */     //   17: getfield label : I
/*    */     //   20: ldc -2147483648
/*    */     //   22: iand
/*    */     //   23: ifeq -> 41
/*    */     //   26: aload #9
/*    */     //   28: dup
/*    */     //   29: getfield label : I
/*    */     //   32: ldc -2147483648
/*    */     //   34: isub
/*    */     //   35: putfield label : I
/*    */     //   38: goto -> 53
/*    */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction$createDockerFileAndNotify$1
/*    */     //   44: dup
/*    */     //   45: aload_0
/*    */     //   46: aload #4
/*    */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFileExtraction;Lkotlin/coroutines/Continuation;)V
/*    */     //   51: astore #9
/*    */     //   53: aload #9
/*    */     //   55: getfield result : Ljava/lang/Object;
/*    */     //   58: astore #8
/*    */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   63: astore #10
/*    */     //   65: aload #9
/*    */     //   67: getfield label : I
/*    */     //   70: tableswitch default -> 314, 0 -> 100, 1 -> 147, 2 -> 269, 3 -> 302
/*    */     //   100: aload #8
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_2
/*    */     //   106: aload_1
/*    */     //   107: aload #9
/*    */     //   109: aload #9
/*    */     //   111: aload_1
/*    */     //   112: putfield L$0 : Ljava/lang/Object;
/*    */     //   115: aload #9
/*    */     //   117: aload_2
/*    */     //   118: putfield L$1 : Ljava/lang/Object;
/*    */     //   121: aload #9
/*    */     //   123: aload_3
/*    */     //   124: putfield L$2 : Ljava/lang/Object;
/*    */     //   127: aload #9
/*    */     //   129: iconst_1
/*    */     //   130: putfield label : I
/*    */     //   133: invokeinterface createDockerFile : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   138: dup
/*    */     //   139: aload #10
/*    */     //   141: if_acmpne -> 181
/*    */     //   144: aload #10
/*    */     //   146: areturn
/*    */     //   147: aload #9
/*    */     //   149: getfield L$2 : Ljava/lang/Object;
/*    */     //   152: checkcast kotlin/jvm/functions/Function2
/*    */     //   155: astore_3
/*    */     //   156: aload #9
/*    */     //   158: getfield L$1 : Ljava/lang/Object;
/*    */     //   161: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor
/*    */     //   164: astore_2
/*    */     //   165: aload #9
/*    */     //   167: getfield L$0 : Ljava/lang/Object;
/*    */     //   170: checkcast com/intellij/openapi/project/Project
/*    */     //   173: astore_1
/*    */     //   174: aload #8
/*    */     //   176: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   179: aload #8
/*    */     //   181: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile
/*    */     //   184: astore #5
/*    */     //   186: aload #5
/*    */     //   188: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   191: astore #6
/*    */     //   193: aload_1
/*    */     //   194: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   197: dup
/*    */     //   198: ifnonnull -> 215
/*    */     //   201: pop
/*    */     //   202: new java/lang/IllegalStateException
/*    */     //   205: dup
/*    */     //   206: ldc 'Project dir not found'
/*    */     //   208: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   211: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   214: athrow
/*    */     //   215: astore #7
/*    */     //   217: aload_1
/*    */     //   218: ldc 'Creating Dockerfile'
/*    */     //   220: aload #7
/*    */     //   222: aload #6
/*    */     //   224: aload_2
/*    */     //   225: aload_3
/*    */     //   226: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;Lkotlin/jvm/functions/Function2;)Lkotlin/jvm/functions/Function0;
/*    */     //   231: aload #9
/*    */     //   233: aload #9
/*    */     //   235: aconst_null
/*    */     //   236: putfield L$0 : Ljava/lang/Object;
/*    */     //   239: aload #9
/*    */     //   241: aconst_null
/*    */     //   242: putfield L$1 : Ljava/lang/Object;
/*    */     //   245: aload #9
/*    */     //   247: aconst_null
/*    */     //   248: putfield L$2 : Ljava/lang/Object;
/*    */     //   251: aload #9
/*    */     //   253: iconst_2
/*    */     //   254: putfield label : I
/*    */     //   257: invokestatic writeCommandAction : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   260: dup
/*    */     //   261: aload #10
/*    */     //   263: if_acmpne -> 276
/*    */     //   266: aload #10
/*    */     //   268: areturn
/*    */     //   269: aload #8
/*    */     //   271: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   274: aload #8
/*    */     //   276: pop
/*    */     //   277: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*    */     //   282: aload #9
/*    */     //   284: aload #9
/*    */     //   286: iconst_3
/*    */     //   287: putfield label : I
/*    */     //   290: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   293: dup
/*    */     //   294: aload #10
/*    */     //   296: if_acmpne -> 309
/*    */     //   299: aload #10
/*    */     //   301: areturn
/*    */     //   302: aload #8
/*    */     //   304: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   307: aload #8
/*    */     //   309: pop
/*    */     //   310: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   313: areturn
/*    */     //   314: new java/lang/IllegalStateException
/*    */     //   317: dup
/*    */     //   318: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   320: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   323: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 63
/*    */     //   #38	-> 105
/*    */     //   #35	-> 144
/*    */     //   #39	-> 186
/*    */     //   #40	-> 193
/*    */     //   #42	-> 217
/*    */     //   #35	-> 266
/*    */     //   #67	-> 276
/*    */     //   #35	-> 299
/*    */     //   #70	-> 309
/*    */     //   #35	-> 314
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	42	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   174	27	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   215	45	1	project	Lcom/intellij/openapi/project/Project;
/*    */     //   105	42	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   165	36	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   215	45	2	dockerFileExtractor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/ProjectDockerFileExtractor;
/*    */     //   105	42	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   156	45	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   215	45	3	onNotification	Lkotlin/jvm/functions/Function2;
/*    */     //   186	7	5	dockerFile	Lcom/intellij/ml/llm/matterhorn/ej/core/run/docker/DockerFile;
/*    */     //   193	8	6	dockerFileText	Ljava/lang/String;
/*    */     //   215	45	6	dockerFileText	Ljava/lang/String;
/*    */     //   217	43	7	projectDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   0	324	4	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   53	261	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   60	254	8	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private static final Unit createDockerFileAndNotify$lambda$0(VirtualFile $projectDir, String $dockerFileText, ProjectDockerFileExtractor $dockerFileExtractor, Function2 $onNotification) {
/*    */     String message = null;
/*    */     VirtualFile dockerFileVirtual = $projectDir.findChild("electricJuniorDockerfile");
/*    */     boolean fileExisted = (dockerFileVirtual != null);
/*    */     Intrinsics.checkNotNullExpressionValue(dockerFileVirtual.contentsToByteArray(), "contentsToByteArray(...)");
/*    */     byte[] arrayOfByte = dockerFileVirtual.contentsToByteArray();
/*    */     Charset charset = Charsets.UTF_8;
/*    */     boolean fileContentMatches = (dockerFileVirtual != null && Intrinsics.areEqual(new String(arrayOfByte, charset), $dockerFileText));
/*    */     logger.debug("Dockerfile is at " + ((dockerFileVirtual != null) ? (String)AgentUtilsKt.toNioPathOrNull(dockerFileVirtual) : null));
/*    */     if (fileExisted && fileContentMatches) {
/*    */       message = "Dockerfile already up-to-date";
/*    */       logger.debug(message);
/*    */     } else {
/*    */       Intrinsics.checkNotNullExpressionValue($projectDir.findOrCreateChildData($dockerFileExtractor, "electricJuniorDockerfile"), "findOrCreateChildData(...)");
/*    */       VirtualFile virtualFile = $projectDir.findOrCreateChildData($dockerFileExtractor, "electricJuniorDockerfile");
/*    */       Intrinsics.checkNotNullExpressionValue($dockerFileText.getBytes(Charsets.UTF_8), "getBytes(...)");
/*    */       virtualFile.setBinaryContent($dockerFileText.getBytes(Charsets.UTF_8));
/*    */       virtualFile.refresh(false, true);
/*    */       message = fileExisted ? "Dockerfile was updated" : "Dockerfile created";
/*    */       $onNotification.invoke(message, NotificationType.INFORMATION);
/*    */       logger.info(message);
/*    */     } 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   private static final Unit createDockerFileAndNotify$lambda$1() {
/*    */     FileDocumentManager.getInstance().saveAllDocuments();
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final String ELECTRIC_JUNIOR_DOCKERFILE = "electricJuniorDockerfile";
/*    */   @NotNull
/*    */   public static final String ELECTRIC_JUNIOR_ENV_SETUP_SCRIPT = "electricJuniorEnvSetupScript";
/*    */   
/*    */   @DebugMetadata(f = "DockerFile.kt", l = {38, 42, 67}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"project", "dockerFileExtractor", "onNotification"}, m = "createDockerFileAndNotify$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.run.docker.DockerFileExtraction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class DockerFileExtraction$createDockerFileAndNotify$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     DockerFileExtraction$createDockerFileAndNotify$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DockerFileExtraction.this.createDockerFileAndNotify$ej_core(null, null, null, (Continuation<? super Unit>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "DockerFile.kt", l = {31}, i = {}, s = {}, n = {}, m = "createDockerFileIfAbsentAndNotify$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.run.docker.DockerFileExtraction")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class DockerFileExtraction$createDockerFileIfAbsentAndNotify$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     DockerFileExtraction$createDockerFileIfAbsentAndNotify$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return DockerFileExtraction.this.createDockerFileIfAbsentAndNotify$ej_core(null, null, null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\run\docker\DockerFileExtraction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */