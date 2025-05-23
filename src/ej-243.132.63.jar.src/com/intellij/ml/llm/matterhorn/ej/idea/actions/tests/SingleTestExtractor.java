/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\005\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JL\020\f\032\024\022\n\022\b\022\004\022\0020\0170\016\022\004\022\0020\0200\r2\006\020\021\032\0020\0222\"\020\023\032\036\b\001\022\004\022\0020\025\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\024H@¢\006\002\020\031J\034\020\032\032\b\022\004\022\0020\0070\0162\006\020\021\032\0020\022H@¢\006\002\020\033J\026\020\034\032\0020\0272\006\020\021\032\0020\022H@¢\006\002\020\033R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007XD¢\006\b\n\000\032\004\b\013\020\t¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "description", "", "getDescription", "()Ljava/lang/String;", "source", "getSource", "extract", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "query", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executedClasses", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matches", "ej-idea"})
/*    */ public final class SingleTestExtractor extends ActionLocationsExtractor {
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/* 11 */   public SingleTestExtractor(@NotNull ExecutionAgentContext context) { super(context);
/*    */     
/* 13 */     this.description = "Single test extractor";
/* 14 */     this.source = "Query with file path and test name"; } @NotNull private final String source; @NotNull public String getDescription() { return this.description; } @NotNull public String getSource() { return this.source; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object extract(@NotNull ActionLocationsExtractor.Query query, @NotNull Function2 mustIgnore, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$extract$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$extract$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$extract$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #11
/*    */     //   50: aload #11
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #10
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #13
/*    */     //   62: aload #11
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 479, 0 -> 96, 1 -> 197, 2 -> 317, 3 -> 460
/*    */     //   96: aload #10
/*    */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   101: aload_1
/*    */     //   102: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest
/*    */     //   105: ifeq -> 115
/*    */     //   108: aload_1
/*    */     //   109: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest
/*    */     //   112: goto -> 116
/*    */     //   115: aconst_null
/*    */     //   116: dup
/*    */     //   117: ifnonnull -> 132
/*    */     //   120: pop
/*    */     //   121: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   124: dup
/*    */     //   125: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   128: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   131: areturn
/*    */     //   132: astore #4
/*    */     //   134: aload #4
/*    */     //   136: invokevirtual component1 : ()Ljava/lang/String;
/*    */     //   139: astore #5
/*    */     //   141: aload #4
/*    */     //   143: invokevirtual component2 : ()Ljava/lang/String;
/*    */     //   146: astore #6
/*    */     //   148: aload_0
/*    */     //   149: aload #5
/*    */     //   151: aload_0
/*    */     //   152: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   155: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget.File : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*    */     //   158: aload #11
/*    */     //   160: aload #11
/*    */     //   162: aload_0
/*    */     //   163: putfield L$0 : Ljava/lang/Object;
/*    */     //   166: aload #11
/*    */     //   168: aload_2
/*    */     //   169: putfield L$1 : Ljava/lang/Object;
/*    */     //   172: aload #11
/*    */     //   174: aload #6
/*    */     //   176: putfield L$2 : Ljava/lang/Object;
/*    */     //   179: aload #11
/*    */     //   181: iconst_1
/*    */     //   182: putfield label : I
/*    */     //   185: invokevirtual findVirtualFile : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   188: dup
/*    */     //   189: aload #13
/*    */     //   191: if_acmpne -> 232
/*    */     //   194: aload #13
/*    */     //   196: areturn
/*    */     //   197: aload #11
/*    */     //   199: getfield L$2 : Ljava/lang/Object;
/*    */     //   202: checkcast java/lang/String
/*    */     //   205: astore #6
/*    */     //   207: aload #11
/*    */     //   209: getfield L$1 : Ljava/lang/Object;
/*    */     //   212: checkcast kotlin/jvm/functions/Function2
/*    */     //   215: astore_2
/*    */     //   216: aload #11
/*    */     //   218: getfield L$0 : Ljava/lang/Object;
/*    */     //   221: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor
/*    */     //   224: astore_0
/*    */     //   225: aload #10
/*    */     //   227: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   230: aload #10
/*    */     //   232: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   235: dup
/*    */     //   236: ifnonnull -> 251
/*    */     //   239: pop
/*    */     //   240: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   243: dup
/*    */     //   244: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   247: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   250: areturn
/*    */     //   251: astore #7
/*    */     //   253: aload #7
/*    */     //   255: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   258: astore #8
/*    */     //   260: aload #8
/*    */     //   262: ifnull -> 391
/*    */     //   265: aload_2
/*    */     //   266: aload #8
/*    */     //   268: aload #11
/*    */     //   270: aload #11
/*    */     //   272: aload_0
/*    */     //   273: putfield L$0 : Ljava/lang/Object;
/*    */     //   276: aload #11
/*    */     //   278: aload #6
/*    */     //   280: putfield L$1 : Ljava/lang/Object;
/*    */     //   283: aload #11
/*    */     //   285: aload #7
/*    */     //   287: putfield L$2 : Ljava/lang/Object;
/*    */     //   290: aload #11
/*    */     //   292: aload #8
/*    */     //   294: putfield L$3 : Ljava/lang/Object;
/*    */     //   297: aload #11
/*    */     //   299: iconst_2
/*    */     //   300: putfield label : I
/*    */     //   303: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   308: dup
/*    */     //   309: aload #13
/*    */     //   311: if_acmpne -> 363
/*    */     //   314: aload #13
/*    */     //   316: areturn
/*    */     //   317: aload #11
/*    */     //   319: getfield L$3 : Ljava/lang/Object;
/*    */     //   322: checkcast java/nio/file/Path
/*    */     //   325: astore #8
/*    */     //   327: aload #11
/*    */     //   329: getfield L$2 : Ljava/lang/Object;
/*    */     //   332: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   335: astore #7
/*    */     //   337: aload #11
/*    */     //   339: getfield L$1 : Ljava/lang/Object;
/*    */     //   342: checkcast java/lang/String
/*    */     //   345: astore #6
/*    */     //   347: aload #11
/*    */     //   349: getfield L$0 : Ljava/lang/Object;
/*    */     //   352: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor
/*    */     //   355: astore_0
/*    */     //   356: aload #10
/*    */     //   358: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   361: aload #10
/*    */     //   363: checkcast java/lang/Boolean
/*    */     //   366: invokevirtual booleanValue : ()Z
/*    */     //   369: ifeq -> 391
/*    */     //   372: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   375: dup
/*    */     //   376: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   379: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;
/*    */     //   382: aload #8
/*    */     //   384: invokevirtual buildAiIgnoreMessage : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   387: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   390: areturn
/*    */     //   391: aload_0
/*    */     //   392: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   395: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   400: astore #9
/*    */     //   402: aload #9
/*    */     //   404: aload_0
/*    */     //   405: aload #9
/*    */     //   407: aload #7
/*    */     //   409: aload #6
/*    */     //   411: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*    */     //   416: aload #11
/*    */     //   418: aload #11
/*    */     //   420: aconst_null
/*    */     //   421: putfield L$0 : Ljava/lang/Object;
/*    */     //   424: aload #11
/*    */     //   426: aconst_null
/*    */     //   427: putfield L$1 : Ljava/lang/Object;
/*    */     //   430: aload #11
/*    */     //   432: aconst_null
/*    */     //   433: putfield L$2 : Ljava/lang/Object;
/*    */     //   436: aload #11
/*    */     //   438: aconst_null
/*    */     //   439: putfield L$3 : Ljava/lang/Object;
/*    */     //   442: aload #11
/*    */     //   444: iconst_3
/*    */     //   445: putfield label : I
/*    */     //   448: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   451: dup
/*    */     //   452: aload #13
/*    */     //   454: if_acmpne -> 467
/*    */     //   457: aload #13
/*    */     //   459: areturn
/*    */     //   460: aload #10
/*    */     //   462: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   465: aload #10
/*    */     //   467: astore #12
/*    */     //   469: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   472: dup
/*    */     //   473: aload #12
/*    */     //   475: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   478: areturn
/*    */     //   479: new java/lang/IllegalStateException
/*    */     //   482: dup
/*    */     //   483: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   485: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   488: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #16	-> 60
/*    */     //   #17	-> 101
/*    */     //   #18	-> 148
/*    */     //   #16	-> 194
/*    */     //   #18	-> 232
/*    */     //   #20	-> 253
/*    */     //   #21	-> 260
/*    */     //   #16	-> 314
/*    */     //   #21	-> 363
/*    */     //   #22	-> 372
/*    */     //   #25	-> 391
/*    */     //   #27	-> 402
/*    */     //   #16	-> 457
/*    */     //   #27	-> 467
/*    */     //   #16	-> 479
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   101	96	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   225	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   356	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   391	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   101	14	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   101	96	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   216	23	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   251	57	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   141	47	5	fileName	Ljava/lang/String;
/*    */     //   148	49	6	testName	Ljava/lang/String;
/*    */     //   207	110	6	testName	Ljava/lang/String;
/*    */     //   347	25	6	testName	Ljava/lang/String;
/*    */     //   391	60	6	testName	Ljava/lang/String;
/*    */     //   253	64	7	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   337	35	7	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   391	60	7	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   260	57	8	nioPath	Ljava/nio/file/Path;
/*    */     //   327	64	8	nioPath	Ljava/nio/file/Path;
/*    */     //   402	49	9	project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	489	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	429	11	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	422	10	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final List extract$lambda$1(SingleTestExtractor this$0, Project $project, VirtualFile $virtualFile, String $testName) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/PsiManager;
/*    */     //   5: aload_2
/*    */     //   6: invokevirtual findFile : (Lcom/intellij/openapi/vfs/VirtualFile;)Lcom/intellij/psi/PsiFile;
/*    */     //   9: invokevirtual getClassesForFile : (Lcom/intellij/psi/PsiFile;)Ljava/util/Collection;
/*    */     //   12: astore #4
/*    */     //   14: aload #4
/*    */     //   16: checkcast java/lang/Iterable
/*    */     //   19: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   24: astore #5
/*    */     //   26: aload #5
/*    */     //   28: invokeinterface hasNext : ()Z
/*    */     //   33: ifeq -> 177
/*    */     //   36: aload #5
/*    */     //   38: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   43: checkcast com/intellij/psi/PsiClass
/*    */     //   46: astore #6
/*    */     //   48: iconst_0
/*    */     //   49: istore #7
/*    */     //   51: aload #6
/*    */     //   53: aload_3
/*    */     //   54: iconst_0
/*    */     //   55: invokeinterface findMethodsByName : (Ljava/lang/String;Z)[Lcom/intellij/psi/PsiMethod;
/*    */     //   60: dup
/*    */     //   61: ldc_w 'findMethodsByName(...)'
/*    */     //   64: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   67: checkcast [Ljava/lang/Object;
/*    */     //   70: invokestatic firstOrNull : ([Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   73: checkcast com/intellij/psi/PsiMethod
/*    */     //   76: dup
/*    */     //   77: ifnonnull -> 85
/*    */     //   80: pop
/*    */     //   81: aconst_null
/*    */     //   82: goto -> 165
/*    */     //   85: astore #8
/*    */     //   87: iconst_2
/*    */     //   88: anewarray java/lang/String
/*    */     //   91: astore #9
/*    */     //   93: aload #9
/*    */     //   95: iconst_0
/*    */     //   96: aload #6
/*    */     //   98: invokeinterface getQualifiedName : ()Ljava/lang/String;
/*    */     //   103: aastore
/*    */     //   104: aload #9
/*    */     //   106: iconst_1
/*    */     //   107: aload_3
/*    */     //   108: aastore
/*    */     //   109: aload #9
/*    */     //   111: invokestatic listOfNotNull : ([Ljava/lang/Object;)Ljava/util/List;
/*    */     //   114: checkcast java/lang/Iterable
/*    */     //   117: ldc_w '.'
/*    */     //   120: checkcast java/lang/CharSequence
/*    */     //   123: aconst_null
/*    */     //   124: aconst_null
/*    */     //   125: iconst_0
/*    */     //   126: aconst_null
/*    */     //   127: aconst_null
/*    */     //   128: bipush #62
/*    */     //   130: aconst_null
/*    */     //   131: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*    */     //   134: astore #10
/*    */     //   136: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/TestRunActionLocationContributor$Companion;
/*    */     //   139: aload #10
/*    */     //   141: aload #8
/*    */     //   143: checkcast com/intellij/psi/PsiNameIdentifierOwner
/*    */     //   146: invokevirtual findActionLocation : (Ljava/lang/String;Lcom/intellij/psi/PsiNameIdentifierOwner;)Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;
/*    */     //   149: dup
/*    */     //   150: ifnonnull -> 158
/*    */     //   153: pop
/*    */     //   154: aconst_null
/*    */     //   155: goto -> 165
/*    */     //   158: astore #9
/*    */     //   160: aload #9
/*    */     //   162: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   165: astore #6
/*    */     //   167: aload #6
/*    */     //   169: ifnull -> 26
/*    */     //   172: aload #6
/*    */     //   174: goto -> 178
/*    */     //   177: aconst_null
/*    */     //   178: dup
/*    */     //   179: ifnonnull -> 186
/*    */     //   182: pop
/*    */     //   183: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   186: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #29	-> 0
/*    */     //   #30	-> 14
/*    */     //   #31	-> 51
/*    */     //   #32	-> 81
/*    */     //   #31	-> 85
/*    */     //   #34	-> 87
/*    */     //   #35	-> 136
/*    */     //   #36	-> 154
/*    */     //   #35	-> 158
/*    */     //   #38	-> 160
/*    */     //   #30	-> 165
/*    */     //   #30	-> 178
/*    */     //   #39	-> 183
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   51	114	7	$i$a$-firstNotNullOfOrNull-SingleTestExtractor$extract$2$1	I
/*    */     //   87	78	8	method	Lcom/intellij/psi/PsiMethod;
/*    */     //   136	29	10	expectedFqn	Ljava/lang/String;
/*    */     //   160	5	9	location	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;
/*    */     //   48	117	6	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   14	173	4	psiClasses	Ljava/util/Collection;
/*    */     //   0	187	0	this$0	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   0	187	1	$project	Lcom/intellij/openapi/project/Project;
/*    */     //   0	187	2	$virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   0	187	3	$testName	Ljava/lang/String;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object executedClasses(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/* 44 */     return CollectionsKt.emptyList();
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object matches(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$matches$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$matches$1
/*    */     //   11: astore #7
/*    */     //   13: aload #7
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #7
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor$matches$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #7
/*    */     //   50: aload #7
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #6
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #8
/*    */     //   62: aload #7
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 207, 0 -> 88, 1 -> 188
/*    */     //   88: aload #6
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_1
/*    */     //   94: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest
/*    */     //   97: ifeq -> 107
/*    */     //   100: aload_1
/*    */     //   101: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest
/*    */     //   104: goto -> 108
/*    */     //   107: aconst_null
/*    */     //   108: dup
/*    */     //   109: ifnonnull -> 118
/*    */     //   112: pop
/*    */     //   113: iconst_0
/*    */     //   114: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   117: areturn
/*    */     //   118: astore_3
/*    */     //   119: aload_3
/*    */     //   120: invokevirtual component1 : ()Ljava/lang/String;
/*    */     //   123: astore #4
/*    */     //   125: aload_3
/*    */     //   126: invokevirtual component2 : ()Ljava/lang/String;
/*    */     //   129: astore #5
/*    */     //   131: aload #4
/*    */     //   133: checkcast java/lang/CharSequence
/*    */     //   136: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   139: ifne -> 153
/*    */     //   142: aload #5
/*    */     //   144: checkcast java/lang/CharSequence
/*    */     //   147: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   150: ifeq -> 158
/*    */     //   153: iconst_0
/*    */     //   154: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   157: areturn
/*    */     //   158: aload_0
/*    */     //   159: aload #4
/*    */     //   161: aload_0
/*    */     //   162: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   165: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget.File : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*    */     //   168: aload #7
/*    */     //   170: aload #7
/*    */     //   172: iconst_1
/*    */     //   173: putfield label : I
/*    */     //   176: invokevirtual findVirtualFile : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   179: dup
/*    */     //   180: aload #8
/*    */     //   182: if_acmpne -> 195
/*    */     //   185: aload #8
/*    */     //   187: areturn
/*    */     //   188: aload #6
/*    */     //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   193: aload #6
/*    */     //   195: ifnull -> 202
/*    */     //   198: iconst_1
/*    */     //   199: goto -> 203
/*    */     //   202: iconst_0
/*    */     //   203: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*    */     //   206: areturn
/*    */     //   207: new java/lang/IllegalStateException
/*    */     //   210: dup
/*    */     //   211: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   213: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   216: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #47	-> 60
/*    */     //   #48	-> 93
/*    */     //   #49	-> 131
/*    */     //   #50	-> 158
/*    */     //   #47	-> 185
/*    */     //   #50	-> 195
/*    */     //   #47	-> 207
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   118	35	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   158	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/SingleTestExtractor;
/*    */     //   93	14	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   125	28	4	fileName	Ljava/lang/String;
/*    */     //   158	21	4	fileName	Ljava/lang/String;
/*    */     //   131	22	5	testName	Ljava/lang/String;
/*    */     //   0	217	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	157	7	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	150	6	$result	Ljava/lang/Object;
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SingleTestExtractor.kt", l = {18, 21, 27}, i = {0, 0, 0, 1, 1, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "mustIgnore", "testName", "this", "testName", "virtualFile", "nioPath"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.SingleTestExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SingleTestExtractor$extract$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     int label;
/*    */     
/*    */     SingleTestExtractor$extract$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SingleTestExtractor.this.extract(null, null, (Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "SingleTestExtractor.kt", l = {50}, i = {}, s = {}, n = {}, m = "matches", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.SingleTestExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class SingleTestExtractor$matches$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     SingleTestExtractor$matches$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return SingleTestExtractor.this.matches(null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\SingleTestExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */