/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\003\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JL\020\f\032\024\022\n\022\b\022\004\022\0020\0170\016\022\004\022\0020\0200\r2\006\020\021\032\0020\0222\"\020\023\032\036\b\001\022\004\022\0020\025\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\024H@¢\006\002\020\031J\034\020\032\032\b\022\004\022\0020\0070\0162\006\020\021\032\0020\022H@¢\006\002\020\033J\026\020\034\032\0020\0272\006\020\021\032\0020\022H@¢\006\002\020\033J\030\020\035\032\b\022\004\022\0020\0360\016*\0020\037H@¢\006\002\020 J\024\020!\032\004\030\0010\037*\0020\022H@¢\006\002\020\033R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007XD¢\006\b\n\000\032\004\b\013\020\t¨\006\""}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "description", "", "getDescription", "()Ljava/lang/String;", "source", "getSource", "extract", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "query", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executedClasses", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matches", "findTestClassesInFile", "Lcom/intellij/psi/PsiClass;", "Lcom/intellij/openapi/vfs/VirtualFile;", "(Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findVirtualFileByPath", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nFilePathActionLocationExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FilePathActionLocationExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,54:1\n1557#2:55\n1628#2,3:56\n*S KotlinDebug\n*F\n+ 1 FilePathActionLocationExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor\n*L\n34#1:55\n34#1:56,3\n*E\n"})
/*    */ public final class FilePathActionLocationExtractor extends ActionLocationsExtractor {
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/* 14 */   public FilePathActionLocationExtractor(@NotNull ExecutionAgentContext context) { super(context);
/* 15 */     this.description = "Test extractor by file path";
/* 16 */     this.source = "file path"; } @NotNull private final String source; @NotNull public String getDescription() { return this.description; } @NotNull public String getSource() { return this.source; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object extract(@NotNull ActionLocationsExtractor.Query query, @NotNull Function2 mustIgnore, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$extract$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$extract$1
/*    */     //   11: astore #10
/*    */     //   13: aload #10
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #10
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$extract$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #10
/*    */     //   50: aload #10
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #9
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #11
/*    */     //   62: aload #10
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 464, 0 -> 100, 1 -> 139, 2 -> 227, 3 -> 324, 4 -> 442
/*    */     //   100: aload #9
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: aload #10
/*    */     //   109: aload #10
/*    */     //   111: aload_0
/*    */     //   112: putfield L$0 : Ljava/lang/Object;
/*    */     //   115: aload #10
/*    */     //   117: aload_2
/*    */     //   118: putfield L$1 : Ljava/lang/Object;
/*    */     //   121: aload #10
/*    */     //   123: iconst_1
/*    */     //   124: putfield label : I
/*    */     //   127: invokespecial findVirtualFileByPath : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   130: dup
/*    */     //   131: aload #11
/*    */     //   133: if_acmpne -> 164
/*    */     //   136: aload #11
/*    */     //   138: areturn
/*    */     //   139: aload #10
/*    */     //   141: getfield L$1 : Ljava/lang/Object;
/*    */     //   144: checkcast kotlin/jvm/functions/Function2
/*    */     //   147: astore_2
/*    */     //   148: aload #10
/*    */     //   150: getfield L$0 : Ljava/lang/Object;
/*    */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor
/*    */     //   156: astore_0
/*    */     //   157: aload #9
/*    */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   162: aload #9
/*    */     //   164: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   167: dup
/*    */     //   168: ifnonnull -> 183
/*    */     //   171: pop
/*    */     //   172: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   175: dup
/*    */     //   176: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   179: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   182: areturn
/*    */     //   183: astore #4
/*    */     //   185: aload_0
/*    */     //   186: aload #4
/*    */     //   188: aload #10
/*    */     //   190: aload #10
/*    */     //   192: aload_0
/*    */     //   193: putfield L$0 : Ljava/lang/Object;
/*    */     //   196: aload #10
/*    */     //   198: aload_2
/*    */     //   199: putfield L$1 : Ljava/lang/Object;
/*    */     //   202: aload #10
/*    */     //   204: aload #4
/*    */     //   206: putfield L$2 : Ljava/lang/Object;
/*    */     //   209: aload #10
/*    */     //   211: iconst_2
/*    */     //   212: putfield label : I
/*    */     //   215: invokespecial findTestClassesInFile : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   218: dup
/*    */     //   219: aload #11
/*    */     //   221: if_acmpne -> 262
/*    */     //   224: aload #11
/*    */     //   226: areturn
/*    */     //   227: aload #10
/*    */     //   229: getfield L$2 : Ljava/lang/Object;
/*    */     //   232: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   235: astore #4
/*    */     //   237: aload #10
/*    */     //   239: getfield L$1 : Ljava/lang/Object;
/*    */     //   242: checkcast kotlin/jvm/functions/Function2
/*    */     //   245: astore_2
/*    */     //   246: aload #10
/*    */     //   248: getfield L$0 : Ljava/lang/Object;
/*    */     //   251: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor
/*    */     //   254: astore_0
/*    */     //   255: aload #9
/*    */     //   257: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   260: aload #9
/*    */     //   262: checkcast java/util/List
/*    */     //   265: astore #5
/*    */     //   267: aload #4
/*    */     //   269: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   272: astore #6
/*    */     //   274: aload #6
/*    */     //   276: ifnull -> 388
/*    */     //   279: aload_2
/*    */     //   280: aload #6
/*    */     //   282: aload #10
/*    */     //   284: aload #10
/*    */     //   286: aload_0
/*    */     //   287: putfield L$0 : Ljava/lang/Object;
/*    */     //   290: aload #10
/*    */     //   292: aload #5
/*    */     //   294: putfield L$1 : Ljava/lang/Object;
/*    */     //   297: aload #10
/*    */     //   299: aload #6
/*    */     //   301: putfield L$2 : Ljava/lang/Object;
/*    */     //   304: aload #10
/*    */     //   306: iconst_3
/*    */     //   307: putfield label : I
/*    */     //   310: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   315: dup
/*    */     //   316: aload #11
/*    */     //   318: if_acmpne -> 360
/*    */     //   321: aload #11
/*    */     //   323: areturn
/*    */     //   324: aload #10
/*    */     //   326: getfield L$2 : Ljava/lang/Object;
/*    */     //   329: checkcast java/nio/file/Path
/*    */     //   332: astore #6
/*    */     //   334: aload #10
/*    */     //   336: getfield L$1 : Ljava/lang/Object;
/*    */     //   339: checkcast java/util/List
/*    */     //   342: astore #5
/*    */     //   344: aload #10
/*    */     //   346: getfield L$0 : Ljava/lang/Object;
/*    */     //   349: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor
/*    */     //   352: astore_0
/*    */     //   353: aload #9
/*    */     //   355: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   358: aload #9
/*    */     //   360: checkcast java/lang/Boolean
/*    */     //   363: invokevirtual booleanValue : ()Z
/*    */     //   366: ifeq -> 388
/*    */     //   369: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   372: dup
/*    */     //   373: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   376: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;
/*    */     //   379: aload #6
/*    */     //   381: invokevirtual buildAiIgnoreMessage : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   384: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   387: areturn
/*    */     //   388: aload_0
/*    */     //   389: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   392: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   397: astore #7
/*    */     //   399: aload_0
/*    */     //   400: aload #7
/*    */     //   402: aload #5
/*    */     //   404: aload #10
/*    */     //   406: aload #10
/*    */     //   408: aconst_null
/*    */     //   409: putfield L$0 : Ljava/lang/Object;
/*    */     //   412: aload #10
/*    */     //   414: aconst_null
/*    */     //   415: putfield L$1 : Ljava/lang/Object;
/*    */     //   418: aload #10
/*    */     //   420: aconst_null
/*    */     //   421: putfield L$2 : Ljava/lang/Object;
/*    */     //   424: aload #10
/*    */     //   426: iconst_4
/*    */     //   427: putfield label : I
/*    */     //   430: invokevirtual findActionsForTestClasses : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   433: dup
/*    */     //   434: aload #11
/*    */     //   436: if_acmpne -> 449
/*    */     //   439: aload #11
/*    */     //   441: areturn
/*    */     //   442: aload #9
/*    */     //   444: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   447: aload #9
/*    */     //   449: checkcast java/util/List
/*    */     //   452: astore #8
/*    */     //   454: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   457: dup
/*    */     //   458: aload #8
/*    */     //   460: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   463: areturn
/*    */     //   464: new java/lang/IllegalStateException
/*    */     //   467: dup
/*    */     //   468: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   470: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   473: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 60
/*    */     //   #19	-> 105
/*    */     //   #18	-> 136
/*    */     //   #19	-> 164
/*    */     //   #20	-> 185
/*    */     //   #18	-> 224
/*    */     //   #21	-> 267
/*    */     //   #22	-> 274
/*    */     //   #18	-> 321
/*    */     //   #22	-> 360
/*    */     //   #23	-> 369
/*    */     //   #26	-> 388
/*    */     //   #27	-> 399
/*    */     //   #18	-> 439
/*    */     //   #28	-> 454
/*    */     //   #18	-> 464
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   157	70	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   255	69	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   353	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   388	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   105	25	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   105	34	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   148	79	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   246	69	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   185	42	4	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   237	37	4	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   267	57	5	testClasses	Ljava/util/List;
/*    */     //   344	25	5	testClasses	Ljava/util/List;
/*    */     //   388	45	5	testClasses	Ljava/util/List;
/*    */     //   274	50	6	nioPath	Ljava/nio/file/Path;
/*    */     //   334	54	6	nioPath	Ljava/nio/file/Path;
/*    */     //   399	34	7	project	Lcom/intellij/openapi/project/Project;
/*    */     //   454	10	8	actionLocations	Ljava/util/List;
/*    */     //   0	474	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	414	10	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	407	9	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object executedClasses(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$executedClasses$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$executedClasses$1
/*    */     //   11: astore #16
/*    */     //   13: aload #16
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #16
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$executedClasses$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #16
/*    */     //   50: aload #16
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #15
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #17
/*    */     //   62: aload #16
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 305, 0 -> 92, 1 -> 125, 2 -> 182
/*    */     //   92: aload #15
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload #16
/*    */     //   101: aload #16
/*    */     //   103: aload_0
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #16
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokespecial findVirtualFileByPath : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #17
/*    */     //   119: if_acmpne -> 141
/*    */     //   122: aload #17
/*    */     //   124: areturn
/*    */     //   125: aload #16
/*    */     //   127: getfield L$0 : Ljava/lang/Object;
/*    */     //   130: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor
/*    */     //   133: astore_0
/*    */     //   134: aload #15
/*    */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   139: aload #15
/*    */     //   141: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   144: dup
/*    */     //   145: ifnonnull -> 153
/*    */     //   148: pop
/*    */     //   149: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   152: areturn
/*    */     //   153: astore_3
/*    */     //   154: aload_0
/*    */     //   155: aload_3
/*    */     //   156: aload #16
/*    */     //   158: aload #16
/*    */     //   160: aconst_null
/*    */     //   161: putfield L$0 : Ljava/lang/Object;
/*    */     //   164: aload #16
/*    */     //   166: iconst_2
/*    */     //   167: putfield label : I
/*    */     //   170: invokespecial findTestClassesInFile : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   173: dup
/*    */     //   174: aload #17
/*    */     //   176: if_acmpne -> 189
/*    */     //   179: aload #17
/*    */     //   181: areturn
/*    */     //   182: aload #15
/*    */     //   184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   187: aload #15
/*    */     //   189: checkcast java/util/List
/*    */     //   192: astore #4
/*    */     //   194: aload #4
/*    */     //   196: checkcast java/lang/Iterable
/*    */     //   199: astore #5
/*    */     //   201: iconst_0
/*    */     //   202: istore #6
/*    */     //   204: aload #5
/*    */     //   206: astore #7
/*    */     //   208: new java/util/ArrayList
/*    */     //   211: dup
/*    */     //   212: aload #5
/*    */     //   214: bipush #10
/*    */     //   216: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*    */     //   219: invokespecial <init> : (I)V
/*    */     //   222: checkcast java/util/Collection
/*    */     //   225: astore #8
/*    */     //   227: iconst_0
/*    */     //   228: istore #9
/*    */     //   230: aload #7
/*    */     //   232: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   237: astore #10
/*    */     //   239: aload #10
/*    */     //   241: invokeinterface hasNext : ()Z
/*    */     //   246: ifeq -> 298
/*    */     //   249: aload #10
/*    */     //   251: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   256: astore #11
/*    */     //   258: aload #8
/*    */     //   260: aload #11
/*    */     //   262: checkcast com/intellij/psi/PsiClass
/*    */     //   265: astore #12
/*    */     //   267: astore #14
/*    */     //   269: iconst_0
/*    */     //   270: istore #13
/*    */     //   272: aload #12
/*    */     //   274: invokeinterface getQualifiedName : ()Ljava/lang/String;
/*    */     //   279: dup
/*    */     //   280: ifnonnull -> 286
/*    */     //   283: pop
/*    */     //   284: ldc ''
/*    */     //   286: aload #14
/*    */     //   288: swap
/*    */     //   289: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   294: pop
/*    */     //   295: goto -> 239
/*    */     //   298: aload #8
/*    */     //   300: checkcast java/util/List
/*    */     //   303: nop
/*    */     //   304: areturn
/*    */     //   305: new java/lang/IllegalStateException
/*    */     //   308: dup
/*    */     //   309: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   311: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   314: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #31	-> 60
/*    */     //   #32	-> 97
/*    */     //   #31	-> 122
/*    */     //   #32	-> 141
/*    */     //   #33	-> 154
/*    */     //   #31	-> 179
/*    */     //   #34	-> 194
/*    */     //   #55	-> 204
/*    */     //   #56	-> 230
/*    */     //   #57	-> 258
/*    */     //   #34	-> 272
/*    */     //   #57	-> 289
/*    */     //   #58	-> 298
/*    */     //   #55	-> 303
/*    */     //   #34	-> 304
/*    */     //   #31	-> 305
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   134	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   153	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   97	19	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   154	19	3	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   194	7	4	testClasses	Ljava/util/List;
/*    */     //   201	26	5	$this$map$iv	Ljava/lang/Iterable;
/*    */     //   227	12	7	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   227	73	8	destination$iv$iv	Ljava/util/Collection;
/*    */     //   258	11	11	item$iv$iv	Ljava/lang/Object;
/*    */     //   269	14	12	it	Lcom/intellij/psi/PsiClass;
/*    */     //   272	14	13	$i$a$-map-FilePathActionLocationExtractor$executedClasses$2	I
/*    */     //   230	70	9	$i$f$mapTo	I
/*    */     //   204	100	6	$i$f$map	I
/*    */     //   0	315	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	255	16	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	248	15	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object matches(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$matches$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$matches$1
/*    */     //   11: astore #4
/*    */     //   13: aload #4
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #4
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$matches$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #4
/*    */     //   50: aload #4
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore_3
/*    */     //   56: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   59: astore #5
/*    */     //   61: aload #4
/*    */     //   63: getfield label : I
/*    */     //   66: tableswitch default -> 131, 0 -> 88, 1 -> 114
/*    */     //   88: aload_3
/*    */     //   89: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   92: aload_0
/*    */     //   93: aload_1
/*    */     //   94: aload #4
/*    */     //   96: aload #4
/*    */     //   98: iconst_1
/*    */     //   99: putfield label : I
/*    */     //   102: invokespecial findVirtualFileByPath : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   105: dup
/*    */     //   106: aload #5
/*    */     //   108: if_acmpne -> 119
/*    */     //   111: aload #5
/*    */     //   113: areturn
/*    */     //   114: aload_3
/*    */     //   115: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   118: aload_3
/*    */     //   119: ifnull -> 126
/*    */     //   122: iconst_1
/*    */     //   123: goto -> 127
/*    */     //   126: iconst_0
/*    */     //   127: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   130: areturn
/*    */     //   131: new java/lang/IllegalStateException
/*    */     //   134: dup
/*    */     //   135: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   137: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   140: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #37	-> 59
/*    */     //   #38	-> 92
/*    */     //   #37	-> 111
/*    */     //   #38	-> 119
/*    */     //   #37	-> 131
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   92	13	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   0	141	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	81	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	75	3	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   private final Object findTestClassesInFile(VirtualFile $this$findTestClassesInFile, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$findTestClassesInFile$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$findTestClassesInFile$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor$findTestClassesInFile$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #5
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #7
/*    */     //   62: aload #6
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 236, 0 -> 92, 1 -> 147, 2 -> 228
/*    */     //   92: aload #5
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   101: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   106: astore_3
/*    */     //   107: aload_3
/*    */     //   108: aload_3
/*    */     //   109: aload_1
/*    */     //   110: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   115: aload #6
/*    */     //   117: aload #6
/*    */     //   119: aload_0
/*    */     //   120: putfield L$0 : Ljava/lang/Object;
/*    */     //   123: aload #6
/*    */     //   125: aload_3
/*    */     //   126: putfield L$1 : Ljava/lang/Object;
/*    */     //   129: aload #6
/*    */     //   131: iconst_1
/*    */     //   132: putfield label : I
/*    */     //   135: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   138: dup
/*    */     //   139: aload #7
/*    */     //   141: if_acmpne -> 172
/*    */     //   144: aload #7
/*    */     //   146: areturn
/*    */     //   147: aload #6
/*    */     //   149: getfield L$1 : Ljava/lang/Object;
/*    */     //   152: checkcast com/intellij/openapi/project/Project
/*    */     //   155: astore_3
/*    */     //   156: aload #6
/*    */     //   158: getfield L$0 : Ljava/lang/Object;
/*    */     //   161: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor
/*    */     //   164: astore_0
/*    */     //   165: aload #5
/*    */     //   167: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   170: aload #5
/*    */     //   172: checkcast com/intellij/psi/PsiFile
/*    */     //   175: dup
/*    */     //   176: ifnonnull -> 184
/*    */     //   179: pop
/*    */     //   180: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   183: areturn
/*    */     //   184: astore #4
/*    */     //   186: aload_0
/*    */     //   187: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor
/*    */     //   190: aload_3
/*    */     //   191: aload #4
/*    */     //   193: iconst_0
/*    */     //   194: aload #6
/*    */     //   196: iconst_4
/*    */     //   197: aconst_null
/*    */     //   198: aload #6
/*    */     //   200: aconst_null
/*    */     //   201: putfield L$0 : Ljava/lang/Object;
/*    */     //   204: aload #6
/*    */     //   206: aconst_null
/*    */     //   207: putfield L$1 : Ljava/lang/Object;
/*    */     //   210: aload #6
/*    */     //   212: iconst_2
/*    */     //   213: putfield label : I
/*    */     //   216: invokestatic findTestClasses$default : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   219: dup
/*    */     //   220: aload #7
/*    */     //   222: if_acmpne -> 235
/*    */     //   225: aload #7
/*    */     //   227: areturn
/*    */     //   228: aload #5
/*    */     //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   233: aload #5
/*    */     //   235: areturn
/*    */     //   236: new java/lang/IllegalStateException
/*    */     //   239: dup
/*    */     //   240: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   242: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   245: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #41	-> 60
/*    */     //   #42	-> 97
/*    */     //   #43	-> 107
/*    */     //   #41	-> 144
/*    */     //   #43	-> 172
/*    */     //   #45	-> 180
/*    */     //   #43	-> 184
/*    */     //   #46	-> 186
/*    */     //   #41	-> 225
/*    */     //   #46	-> 235
/*    */     //   #41	-> 236
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	50	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   165	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   184	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FilePathActionLocationExtractor;
/*    */     //   97	41	1	$this$findTestClassesInFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   107	40	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   156	23	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   184	35	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   186	33	4	psiFile	Lcom/intellij/psi/PsiFile;
/*    */     //   0	246	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	186	6	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	179	5	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */   
/*    */   private static final PsiFile findTestClassesInFile$lambda$1(Project $project, VirtualFile $this_findTestClassesInFile) {
/* 44 */     return PsiManager.getInstance($project).findFile($this_findTestClassesInFile);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object findVirtualFileByPath(ActionLocationsExtractor.Query $this$findVirtualFileByPath, Continuation<? super VirtualFile> $completion) {
/* 50 */     if ((($this$findVirtualFileByPath instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFileByPath : null) == null) { ($this$findVirtualFileByPath instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFileByPath : null; return null; }  String path = (($this$findVirtualFileByPath instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFileByPath : null).component1();
/* 51 */     return findVirtualFile(path, getContext(), LocateTarget.File, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FilePathActionLocationExtractor.kt", l = {32, 33}, i = {0}, s = {"L$0"}, n = {"this"}, m = "executedClasses", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FilePathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FilePathActionLocationExtractor$executedClasses$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     FilePathActionLocationExtractor$executedClasses$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FilePathActionLocationExtractor.this.executedClasses((ActionLocationsExtractor.Query)null, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FilePathActionLocationExtractor.kt", l = {19, 20, 22, 27}, i = {0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "mustIgnore", "this", "mustIgnore", "virtualFile", "this", "testClasses", "nioPath"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FilePathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FilePathActionLocationExtractor$extract$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     FilePathActionLocationExtractor$extract$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FilePathActionLocationExtractor.this.extract((ActionLocationsExtractor.Query)null, (Function2<? super Path, ? super Continuation<? super Boolean>, ? extends Object>)null, (Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FilePathActionLocationExtractor.kt", l = {43, 46}, i = {0, 0}, s = {"L$0", "L$1"}, n = {"this", "project"}, m = "findTestClassesInFile", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FilePathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FilePathActionLocationExtractor$findTestClassesInFile$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     FilePathActionLocationExtractor$findTestClassesInFile$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FilePathActionLocationExtractor.this.findTestClassesInFile((VirtualFile)null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FilePathActionLocationExtractor.kt", l = {38}, i = {}, s = {}, n = {}, m = "matches", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FilePathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FilePathActionLocationExtractor$matches$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FilePathActionLocationExtractor$matches$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FilePathActionLocationExtractor.this.matches((ActionLocationsExtractor.Query)null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\FilePathActionLocationExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */