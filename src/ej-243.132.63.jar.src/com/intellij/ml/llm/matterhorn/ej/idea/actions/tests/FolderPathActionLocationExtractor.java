/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import java.util.List;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\006\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JL\020\f\032\024\022\n\022\b\022\004\022\0020\0170\016\022\004\022\0020\0200\r2\006\020\021\032\0020\0222\"\020\023\032\036\b\001\022\004\022\0020\025\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\024H@¢\006\002\020\031J\034\020\032\032\b\022\004\022\0020\0070\0162\006\020\021\032\0020\022H@¢\006\002\020\033J\030\020\034\032\b\022\004\022\0020\0350\016*\0020\036H@¢\006\002\020\037J\026\020 \032\b\022\004\022\0020\0360\0162\006\020!\032\0020\036H\002J\026\020\"\032\0020\0272\006\020\021\032\0020\022H@¢\006\002\020\033J\024\020#\032\004\030\0010\036*\0020\022H@¢\006\002\020\033R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007XD¢\006\b\n\000\032\004\b\013\020\t¨\006$"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "description", "", "getDescription", "()Ljava/lang/String;", "source", "getSource", "extract", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "query", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executedClasses", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTestClassesInDirectory", "Lcom/intellij/psi/PsiClass;", "Lcom/intellij/openapi/vfs/VirtualFile;", "(Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectFirstLevelFiles", "root", "matches", "findVirtualFolder", "ej-idea"})
/*    */ @SourceDebugExtension({"SMAP\nFolderPathActionLocationExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderPathActionLocationExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,66:1\n1611#2,9:67\n1863#2:76\n1864#2:78\n1620#2:79\n1053#2:83\n1#3:77\n3829#4:80\n4344#4,2:81\n*S KotlinDebug\n*F\n+ 1 FolderPathActionLocationExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor\n*L\n32#1:67,9\n32#1:76\n32#1:78\n32#1:79\n54#1:83\n32#1:77\n53#1:80\n53#1:81,2\n*E\n"})
/*    */ public final class FolderPathActionLocationExtractor extends ActionLocationsExtractor {
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/* 14 */   public FolderPathActionLocationExtractor(@NotNull ExecutionAgentContext context) { super(context);
/* 15 */     this.description = "Test extractor by folder path (only first level files)";
/* 16 */     this.source = "directory path"; } @NotNull private final String source; @NotNull public String getDescription() { return this.description; } @NotNull public String getSource() { return this.source; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object extract(@NotNull ActionLocationsExtractor.Query query, @NotNull Function2 mustIgnore, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$extract$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$extract$1
/*    */     //   11: astore #8
/*    */     //   13: aload #8
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #8
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$extract$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #8
/*    */     //   50: aload #8
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #7
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #8
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 396, 0 -> 100, 1 -> 139, 2 -> 235, 3 -> 318, 4 -> 377
/*    */     //   100: aload #7
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: aload #8
/*    */     //   109: aload #8
/*    */     //   111: aload_0
/*    */     //   112: putfield L$0 : Ljava/lang/Object;
/*    */     //   115: aload #8
/*    */     //   117: aload_2
/*    */     //   118: putfield L$1 : Ljava/lang/Object;
/*    */     //   121: aload #8
/*    */     //   123: iconst_1
/*    */     //   124: putfield label : I
/*    */     //   127: invokespecial findVirtualFolder : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   130: dup
/*    */     //   131: aload #10
/*    */     //   133: if_acmpne -> 164
/*    */     //   136: aload #10
/*    */     //   138: areturn
/*    */     //   139: aload #8
/*    */     //   141: getfield L$1 : Ljava/lang/Object;
/*    */     //   144: checkcast kotlin/jvm/functions/Function2
/*    */     //   147: astore_2
/*    */     //   148: aload #8
/*    */     //   150: getfield L$0 : Ljava/lang/Object;
/*    */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   156: astore_0
/*    */     //   157: aload #7
/*    */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   162: aload #7
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
/*    */     //   185: aload #4
/*    */     //   187: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   190: astore #5
/*    */     //   192: aload #5
/*    */     //   194: ifnull -> 283
/*    */     //   197: aload_2
/*    */     //   198: aload #5
/*    */     //   200: aload #8
/*    */     //   202: aload #8
/*    */     //   204: aload_0
/*    */     //   205: putfield L$0 : Ljava/lang/Object;
/*    */     //   208: aload #8
/*    */     //   210: aload #4
/*    */     //   212: putfield L$1 : Ljava/lang/Object;
/*    */     //   215: aload #8
/*    */     //   217: iconst_2
/*    */     //   218: putfield label : I
/*    */     //   221: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   226: dup
/*    */     //   227: aload #10
/*    */     //   229: if_acmpne -> 261
/*    */     //   232: aload #10
/*    */     //   234: areturn
/*    */     //   235: aload #8
/*    */     //   237: getfield L$1 : Ljava/lang/Object;
/*    */     //   240: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   243: astore #4
/*    */     //   245: aload #8
/*    */     //   247: getfield L$0 : Ljava/lang/Object;
/*    */     //   250: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   253: astore_0
/*    */     //   254: aload #7
/*    */     //   256: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   259: aload #7
/*    */     //   261: checkcast java/lang/Boolean
/*    */     //   264: invokevirtual booleanValue : ()Z
/*    */     //   267: ifeq -> 283
/*    */     //   270: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   273: dup
/*    */     //   274: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   277: ldc 'buildAiIgnoreMessage(nioPath)'
/*    */     //   279: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   282: areturn
/*    */     //   283: aload_0
/*    */     //   284: aload #4
/*    */     //   286: aload #8
/*    */     //   288: aload #8
/*    */     //   290: aload_0
/*    */     //   291: putfield L$0 : Ljava/lang/Object;
/*    */     //   294: aload #8
/*    */     //   296: aconst_null
/*    */     //   297: putfield L$1 : Ljava/lang/Object;
/*    */     //   300: aload #8
/*    */     //   302: iconst_3
/*    */     //   303: putfield label : I
/*    */     //   306: invokespecial findTestClassesInDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   309: dup
/*    */     //   310: aload #10
/*    */     //   312: if_acmpne -> 334
/*    */     //   315: aload #10
/*    */     //   317: areturn
/*    */     //   318: aload #8
/*    */     //   320: getfield L$0 : Ljava/lang/Object;
/*    */     //   323: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   326: astore_0
/*    */     //   327: aload #7
/*    */     //   329: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   332: aload #7
/*    */     //   334: checkcast java/util/List
/*    */     //   337: astore #6
/*    */     //   339: aload_0
/*    */     //   340: aload_0
/*    */     //   341: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   344: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   349: aload #6
/*    */     //   351: aload #8
/*    */     //   353: aload #8
/*    */     //   355: aconst_null
/*    */     //   356: putfield L$0 : Ljava/lang/Object;
/*    */     //   359: aload #8
/*    */     //   361: iconst_4
/*    */     //   362: putfield label : I
/*    */     //   365: invokevirtual findActionsForTestClasses : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   368: dup
/*    */     //   369: aload #10
/*    */     //   371: if_acmpne -> 384
/*    */     //   374: aload #10
/*    */     //   376: areturn
/*    */     //   377: aload #7
/*    */     //   379: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   382: aload #7
/*    */     //   384: astore #9
/*    */     //   386: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   389: dup
/*    */     //   390: aload #9
/*    */     //   392: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   395: areturn
/*    */     //   396: new java/lang/IllegalStateException
/*    */     //   399: dup
/*    */     //   400: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   402: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   405: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #18	-> 60
/*    */     //   #19	-> 105
/*    */     //   #18	-> 136
/*    */     //   #19	-> 164
/*    */     //   #20	-> 185
/*    */     //   #21	-> 192
/*    */     //   #18	-> 232
/*    */     //   #21	-> 261
/*    */     //   #22	-> 270
/*    */     //   #25	-> 283
/*    */     //   #18	-> 315
/*    */     //   #26	-> 339
/*    */     //   #18	-> 374
/*    */     //   #26	-> 384
/*    */     //   #18	-> 396
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   157	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   254	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   283	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   327	41	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   105	25	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   105	34	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   148	23	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   183	43	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   185	50	4	folder	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   245	25	4	folder	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   283	26	4	folder	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   192	34	5	nioPath	Ljava/nio/file/Path;
/*    */     //   339	29	6	testClasses	Ljava/util/List;
/*    */     //   0	406	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	346	8	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	339	7	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object executedClasses(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$executedClasses$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$executedClasses$1
/*    */     //   11: astore #21
/*    */     //   13: aload #21
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #21
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$executedClasses$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #21
/*    */     //   50: aload #21
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #20
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #22
/*    */     //   62: aload #21
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 316, 0 -> 92, 1 -> 125, 2 -> 182
/*    */     //   92: aload #20
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: aload_1
/*    */     //   99: aload #21
/*    */     //   101: aload #21
/*    */     //   103: aload_0
/*    */     //   104: putfield L$0 : Ljava/lang/Object;
/*    */     //   107: aload #21
/*    */     //   109: iconst_1
/*    */     //   110: putfield label : I
/*    */     //   113: invokespecial findVirtualFolder : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   116: dup
/*    */     //   117: aload #22
/*    */     //   119: if_acmpne -> 141
/*    */     //   122: aload #22
/*    */     //   124: areturn
/*    */     //   125: aload #21
/*    */     //   127: getfield L$0 : Ljava/lang/Object;
/*    */     //   130: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   133: astore_0
/*    */     //   134: aload #20
/*    */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   139: aload #20
/*    */     //   141: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   144: dup
/*    */     //   145: ifnonnull -> 153
/*    */     //   148: pop
/*    */     //   149: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   152: areturn
/*    */     //   153: astore_3
/*    */     //   154: aload_0
/*    */     //   155: aload_3
/*    */     //   156: aload #21
/*    */     //   158: aload #21
/*    */     //   160: aconst_null
/*    */     //   161: putfield L$0 : Ljava/lang/Object;
/*    */     //   164: aload #21
/*    */     //   166: iconst_2
/*    */     //   167: putfield label : I
/*    */     //   170: invokespecial findTestClassesInDirectory : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   173: dup
/*    */     //   174: aload #22
/*    */     //   176: if_acmpne -> 189
/*    */     //   179: aload #22
/*    */     //   181: areturn
/*    */     //   182: aload #20
/*    */     //   184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   187: aload #20
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
/*    */     //   212: invokespecial <init> : ()V
/*    */     //   215: checkcast java/util/Collection
/*    */     //   218: astore #8
/*    */     //   220: iconst_0
/*    */     //   221: istore #9
/*    */     //   223: aload #7
/*    */     //   225: astore #10
/*    */     //   227: iconst_0
/*    */     //   228: istore #11
/*    */     //   230: aload #10
/*    */     //   232: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   237: astore #12
/*    */     //   239: aload #12
/*    */     //   241: invokeinterface hasNext : ()Z
/*    */     //   246: ifeq -> 308
/*    */     //   249: aload #12
/*    */     //   251: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   256: astore #13
/*    */     //   258: aload #13
/*    */     //   260: astore #14
/*    */     //   262: iconst_0
/*    */     //   263: istore #15
/*    */     //   265: aload #14
/*    */     //   267: checkcast com/intellij/psi/PsiClass
/*    */     //   270: astore #16
/*    */     //   272: iconst_0
/*    */     //   273: istore #17
/*    */     //   275: aload #16
/*    */     //   277: invokeinterface getQualifiedName : ()Ljava/lang/String;
/*    */     //   282: dup
/*    */     //   283: ifnull -> 304
/*    */     //   286: astore #18
/*    */     //   288: iconst_0
/*    */     //   289: istore #19
/*    */     //   291: aload #8
/*    */     //   293: aload #18
/*    */     //   295: invokeinterface add : (Ljava/lang/Object;)Z
/*    */     //   300: pop
/*    */     //   301: goto -> 305
/*    */     //   304: pop
/*    */     //   305: goto -> 239
/*    */     //   308: nop
/*    */     //   309: aload #8
/*    */     //   311: checkcast java/util/List
/*    */     //   314: nop
/*    */     //   315: areturn
/*    */     //   316: new java/lang/IllegalStateException
/*    */     //   319: dup
/*    */     //   320: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   322: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   325: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 60
/*    */     //   #30	-> 97
/*    */     //   #29	-> 122
/*    */     //   #30	-> 141
/*    */     //   #31	-> 154
/*    */     //   #29	-> 179
/*    */     //   #32	-> 194
/*    */     //   #67	-> 204
/*    */     //   #75	-> 223
/*    */     //   #76	-> 230
/*    */     //   #75	-> 265
/*    */     //   #32	-> 275
/*    */     //   #75	-> 282
/*    */     //   #77	-> 288
/*    */     //   #75	-> 291
/*    */     //   #75	-> 301
/*    */     //   #75	-> 304
/*    */     //   #76	-> 305
/*    */     //   #78	-> 308
/*    */     //   #79	-> 309
/*    */     //   #67	-> 314
/*    */     //   #32	-> 315
/*    */     //   #29	-> 316
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	28	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   134	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   153	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   97	19	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   154	19	3	folder	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   194	7	4	testClasses	Ljava/util/List;
/*    */     //   201	19	5	$this$mapNotNull$iv	Ljava/lang/Iterable;
/*    */     //   220	7	7	$this$mapNotNullTo$iv$iv	Ljava/lang/Iterable;
/*    */     //   220	62	8	destination$iv$iv	Ljava/util/Collection;
/*    */     //   282	29	8	destination$iv$iv	Ljava/util/Collection;
/*    */     //   227	12	10	$this$forEach$iv$iv$iv	Ljava/lang/Iterable;
/*    */     //   258	4	13	element$iv$iv$iv	Ljava/lang/Object;
/*    */     //   262	43	14	element$iv$iv	Ljava/lang/Object;
/*    */     //   272	10	16	it	Lcom/intellij/psi/PsiClass;
/*    */     //   288	13	18	it$iv$iv	Ljava/lang/Object;
/*    */     //   275	7	17	$i$a$-mapNotNull-FolderPathActionLocationExtractor$executedClasses$2	I
/*    */     //   291	10	19	$i$a$-let-CollectionsKt___CollectionsKt$mapNotNullTo$1$1$iv$iv	I
/*    */     //   265	40	15	$i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv	I
/*    */     //   230	79	11	$i$f$forEach	I
/*    */     //   223	88	9	$i$f$mapNotNullTo	I
/*    */     //   204	111	6	$i$f$mapNotNull	I
/*    */     //   0	326	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	266	21	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	259	20	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object findTestClassesInDirectory(VirtualFile $this$findTestClassesInDirectory, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$findTestClassesInDirectory$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$findTestClassesInDirectory$1
/*    */     //   11: astore #11
/*    */     //   13: aload #11
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #11
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$findTestClassesInDirectory$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #12
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 407, 0 -> 92, 1 -> 217, 2 -> 334
/*    */     //   92: aload #10
/*    */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   97: aload_0
/*    */     //   98: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   101: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   106: astore_3
/*    */     //   107: new java/util/ArrayList
/*    */     //   110: dup
/*    */     //   111: invokespecial <init> : ()V
/*    */     //   114: checkcast java/util/List
/*    */     //   117: astore #4
/*    */     //   119: aload_0
/*    */     //   120: aload_1
/*    */     //   121: invokespecial collectFirstLevelFiles : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/util/List;
/*    */     //   124: astore #5
/*    */     //   126: aload #5
/*    */     //   128: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   133: astore #6
/*    */     //   135: aload #6
/*    */     //   137: invokeinterface hasNext : ()Z
/*    */     //   142: ifeq -> 404
/*    */     //   145: aload #6
/*    */     //   147: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   152: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   155: astore #7
/*    */     //   157: aload_3
/*    */     //   158: aload #7
/*    */     //   160: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;)Lkotlin/jvm/functions/Function0;
/*    */     //   165: aload #11
/*    */     //   167: aload #11
/*    */     //   169: aload_0
/*    */     //   170: putfield L$0 : Ljava/lang/Object;
/*    */     //   173: aload #11
/*    */     //   175: aload_3
/*    */     //   176: putfield L$1 : Ljava/lang/Object;
/*    */     //   179: aload #11
/*    */     //   181: aload #4
/*    */     //   183: putfield L$2 : Ljava/lang/Object;
/*    */     //   186: aload #11
/*    */     //   188: aload #6
/*    */     //   190: putfield L$3 : Ljava/lang/Object;
/*    */     //   193: aload #11
/*    */     //   195: aconst_null
/*    */     //   196: putfield L$4 : Ljava/lang/Object;
/*    */     //   199: aload #11
/*    */     //   201: iconst_1
/*    */     //   202: putfield label : I
/*    */     //   205: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   208: dup
/*    */     //   209: aload #12
/*    */     //   211: if_acmpne -> 262
/*    */     //   214: aload #12
/*    */     //   216: areturn
/*    */     //   217: aload #11
/*    */     //   219: getfield L$3 : Ljava/lang/Object;
/*    */     //   222: checkcast java/util/Iterator
/*    */     //   225: astore #6
/*    */     //   227: aload #11
/*    */     //   229: getfield L$2 : Ljava/lang/Object;
/*    */     //   232: checkcast java/util/List
/*    */     //   235: astore #4
/*    */     //   237: aload #11
/*    */     //   239: getfield L$1 : Ljava/lang/Object;
/*    */     //   242: checkcast com/intellij/openapi/project/Project
/*    */     //   245: astore_3
/*    */     //   246: aload #11
/*    */     //   248: getfield L$0 : Ljava/lang/Object;
/*    */     //   251: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   254: astore_0
/*    */     //   255: aload #10
/*    */     //   257: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   260: aload #10
/*    */     //   262: checkcast com/intellij/psi/PsiFile
/*    */     //   265: astore #8
/*    */     //   267: aload #8
/*    */     //   269: ifnull -> 135
/*    */     //   272: aload #4
/*    */     //   274: astore #9
/*    */     //   276: aload_0
/*    */     //   277: aload_3
/*    */     //   278: aload #8
/*    */     //   280: iconst_0
/*    */     //   281: aload #11
/*    */     //   283: aload #11
/*    */     //   285: aload_0
/*    */     //   286: putfield L$0 : Ljava/lang/Object;
/*    */     //   289: aload #11
/*    */     //   291: aload_3
/*    */     //   292: putfield L$1 : Ljava/lang/Object;
/*    */     //   295: aload #11
/*    */     //   297: aload #4
/*    */     //   299: putfield L$2 : Ljava/lang/Object;
/*    */     //   302: aload #11
/*    */     //   304: aload #6
/*    */     //   306: putfield L$3 : Ljava/lang/Object;
/*    */     //   309: aload #11
/*    */     //   311: aload #9
/*    */     //   313: putfield L$4 : Ljava/lang/Object;
/*    */     //   316: aload #11
/*    */     //   318: iconst_2
/*    */     //   319: putfield label : I
/*    */     //   322: invokevirtual findTestClasses : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   325: dup
/*    */     //   326: aload #12
/*    */     //   328: if_acmpne -> 389
/*    */     //   331: aload #12
/*    */     //   333: areturn
/*    */     //   334: aload #11
/*    */     //   336: getfield L$4 : Ljava/lang/Object;
/*    */     //   339: checkcast java/util/List
/*    */     //   342: astore #9
/*    */     //   344: aload #11
/*    */     //   346: getfield L$3 : Ljava/lang/Object;
/*    */     //   349: checkcast java/util/Iterator
/*    */     //   352: astore #6
/*    */     //   354: aload #11
/*    */     //   356: getfield L$2 : Ljava/lang/Object;
/*    */     //   359: checkcast java/util/List
/*    */     //   362: astore #4
/*    */     //   364: aload #11
/*    */     //   366: getfield L$1 : Ljava/lang/Object;
/*    */     //   369: checkcast com/intellij/openapi/project/Project
/*    */     //   372: astore_3
/*    */     //   373: aload #11
/*    */     //   375: getfield L$0 : Ljava/lang/Object;
/*    */     //   378: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor
/*    */     //   381: astore_0
/*    */     //   382: aload #10
/*    */     //   384: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   387: aload #10
/*    */     //   389: aload #9
/*    */     //   391: swap
/*    */     //   392: checkcast java/util/Collection
/*    */     //   395: invokeinterface addAll : (Ljava/util/Collection;)Z
/*    */     //   400: pop
/*    */     //   401: goto -> 135
/*    */     //   404: aload #4
/*    */     //   406: areturn
/*    */     //   407: new java/lang/IllegalStateException
/*    */     //   410: dup
/*    */     //   411: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   413: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   416: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #35	-> 60
/*    */     //   #36	-> 97
/*    */     //   #38	-> 107
/*    */     //   #38	-> 117
/*    */     //   #39	-> 119
/*    */     //   #40	-> 126
/*    */     //   #41	-> 157
/*    */     //   #35	-> 214
/*    */     //   #44	-> 267
/*    */     //   #45	-> 272
/*    */     //   #35	-> 331
/*    */     //   #45	-> 389
/*    */     //   #48	-> 404
/*    */     //   #35	-> 407
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   97	20	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   117	100	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   255	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   382	25	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   97	20	1	$this$findTestClassesInDirectory	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   117	9	1	$this$findTestClassesInDirectory	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   107	10	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   117	100	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   246	88	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   373	34	3	project	Lcom/intellij/openapi/project/Project;
/*    */     //   119	98	4	result	Ljava/util/List;
/*    */     //   237	97	4	result	Ljava/util/List;
/*    */     //   364	43	4	result	Ljava/util/List;
/*    */     //   126	9	5	files	Ljava/util/List;
/*    */     //   157	51	7	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   267	58	8	psiFile	Lcom/intellij/psi/PsiFile;
/*    */     //   0	417	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	357	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	350	10	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final PsiFile findTestClassesInDirectory$lambda$1(Project $project, VirtualFile $file) {
/* 42 */     return PsiManager.getInstance($project).findFile($file);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private final List<VirtualFile> collectFirstLevelFiles(VirtualFile root) {
/* 52 */     Intrinsics.checkNotNullExpressionValue(root.getChildren(), "getChildren(...)"); Object[] arrayOfObject1 = (Object[])root.getChildren();
/* 53 */     int $i$f$filter = 0;
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
/* 80 */     Object[] arrayOfObject2 = arrayOfObject1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0; byte b; int i;
/* 81 */     for (b = 0, i = arrayOfObject2.length; b < i; ) { Object element$iv$iv = arrayOfObject2[b]; VirtualFile it = (VirtualFile)element$iv$iv; int $i$a$-filter-FolderPathActionLocationExtractor$collectFirstLevelFiles$1 = 0; if ((!it.isDirectory() && (Intrinsics.areEqual(it.getExtension(), "kt") || Intrinsics.areEqual(it.getExtension(), "java")))) destination$iv$iv.add(element$iv$iv);  b++; }
/* 82 */      List list = (List)destination$iv$iv; int $i$f$sortedBy = 0;
/* 83 */     return CollectionsKt.sortedWith(list, new FolderPathActionLocationExtractor$collectFirstLevelFiles$$inlined$sortedBy$1());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object matches(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$matches$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$matches$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor$matches$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   102: invokespecial findVirtualFolder : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
/*    */     //   #57	-> 59
/*    */     //   #58	-> 92
/*    */     //   #57	-> 111
/*    */     //   #58	-> 119
/*    */     //   #57	-> 131
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   92	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FolderPathActionLocationExtractor;
/*    */     //   92	13	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   0	141	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	81	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	75	3	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   private final Object findVirtualFolder(ActionLocationsExtractor.Query $this$findVirtualFolder, Continuation<? super VirtualFile> $completion) {
/*    */     if ((($this$findVirtualFolder instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFolder : null) == null) {
/*    */       ($this$findVirtualFolder instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFolder : null;
/*    */       return null;
/*    */     } 
/*    */     String path = (($this$findVirtualFolder instanceof ActionLocationsExtractor.Query.RawPath) ? $this$findVirtualFolder : null).component1();
/*    */     return findVirtualFile(path, getContext(), LocateTarget.Directory, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FolderPathActionLocationExtractor.kt", l = {30, 31}, i = {0}, s = {"L$0"}, n = {"this"}, m = "executedClasses", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FolderPathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FolderPathActionLocationExtractor$executedClasses$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     int label;
/*    */     
/*    */     FolderPathActionLocationExtractor$executedClasses$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FolderPathActionLocationExtractor.this.executedClasses((ActionLocationsExtractor.Query)null, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FolderPathActionLocationExtractor.kt", l = {19, 21, 25, 26}, i = {0, 0, 1, 1, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"}, n = {"this", "mustIgnore", "this", "folder", "this"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FolderPathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FolderPathActionLocationExtractor$extract$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     int label;
/*    */     
/*    */     FolderPathActionLocationExtractor$extract$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FolderPathActionLocationExtractor.this.extract((ActionLocationsExtractor.Query)null, (Function2<? super Path, ? super Continuation<? super Boolean>, ? extends Object>)null, (Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FolderPathActionLocationExtractor.kt", l = {41, 45}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "project", "result", "this", "project", "result"}, m = "findTestClassesInDirectory", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FolderPathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FolderPathActionLocationExtractor$findTestClassesInDirectory$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     int label;
/*    */     
/*    */     FolderPathActionLocationExtractor$findTestClassesInDirectory$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FolderPathActionLocationExtractor.this.findTestClassesInDirectory((VirtualFile)null, (Continuation)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FolderPathActionLocationExtractor.kt", l = {58}, i = {}, s = {}, n = {}, m = "matches", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FolderPathActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FolderPathActionLocationExtractor$matches$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FolderPathActionLocationExtractor$matches$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FolderPathActionLocationExtractor.this.matches((ActionLocationsExtractor.Query)null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\FolderPathActionLocationExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */