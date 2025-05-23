/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*    */ 
/*    */ import com.intellij.psi.PsiClass;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\005\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\020\000\n\002\b\005\n\002\030\002\n\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JL\020\f\032\024\022\n\022\b\022\004\022\0020\0170\016\022\004\022\0020\0200\r2\006\020\021\032\0020\0222\"\020\023\032\036\b\001\022\004\022\0020\025\022\n\022\b\022\004\022\0020\0270\026\022\006\022\004\030\0010\0300\024H@¢\006\002\020\031J\034\020\032\032\b\022\004\022\0020\0070\0162\006\020\021\032\0020\022H@¢\006\002\020\033J\026\020\034\032\0020\0272\006\020\021\032\0020\022H@¢\006\002\020\033J\024\020\035\032\004\030\0010\036*\0020\022H@¢\006\002\020\033R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\b\020\tR\024\020\n\032\0020\007XD¢\006\b\n\000\032\004\b\013\020\t¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "description", "", "getDescription", "()Ljava/lang/String;", "source", "getSource", "extract", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "query", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executedClasses", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matches", "findPsiClassesByFqn", "Lcom/intellij/psi/PsiClass;", "ej-idea"})
/*    */ public final class FileFQNActionLocationExtractor extends ActionLocationsExtractor {
/*    */   @NotNull
/*    */   private final String description;
/*    */   
/* 13 */   public FileFQNActionLocationExtractor(@NotNull ExecutionAgentContext context) { super(context);
/* 14 */     this.description = "Test extractor by fully qualified action name";
/* 15 */     this.source = "fully qualified file name"; } @NotNull private final String source; @NotNull public String getDescription() { return this.description; } @NotNull public String getSource() { return this.source; }
/*    */    @Nullable
/*    */   public Object extract(@NotNull ActionLocationsExtractor.Query query, @NotNull Function2 mustIgnore, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_3
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$extract$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_3
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$extract$1
/*    */     //   11: astore #9
/*    */     //   13: aload #9
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #9
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$extract$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_3
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #9
/*    */     //   50: aload #9
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #8
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #10
/*    */     //   62: aload #9
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 472, 0 -> 100, 1 -> 139, 2 -> 231, 3 -> 333, 4 -> 450
/*    */     //   100: aload #8
/*    */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   105: aload_0
/*    */     //   106: aload_1
/*    */     //   107: aload #9
/*    */     //   109: aload #9
/*    */     //   111: aload_0
/*    */     //   112: putfield L$0 : Ljava/lang/Object;
/*    */     //   115: aload #9
/*    */     //   117: aload_2
/*    */     //   118: putfield L$1 : Ljava/lang/Object;
/*    */     //   121: aload #9
/*    */     //   123: iconst_1
/*    */     //   124: putfield label : I
/*    */     //   127: invokespecial findPsiClassesByFqn : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   130: dup
/*    */     //   131: aload #10
/*    */     //   133: if_acmpne -> 164
/*    */     //   136: aload #10
/*    */     //   138: areturn
/*    */     //   139: aload #9
/*    */     //   141: getfield L$1 : Ljava/lang/Object;
/*    */     //   144: checkcast kotlin/jvm/functions/Function2
/*    */     //   147: astore_2
/*    */     //   148: aload #9
/*    */     //   150: getfield L$0 : Ljava/lang/Object;
/*    */     //   153: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor
/*    */     //   156: astore_0
/*    */     //   157: aload #8
/*    */     //   159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   162: aload #8
/*    */     //   164: checkcast com/intellij/psi/PsiClass
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
/*    */     //   187: <illegal opcode> invoke : (Lcom/intellij/psi/PsiClass;)Lkotlin/jvm/functions/Function0;
/*    */     //   192: aload #9
/*    */     //   194: aload #9
/*    */     //   196: aload_0
/*    */     //   197: putfield L$0 : Ljava/lang/Object;
/*    */     //   200: aload #9
/*    */     //   202: aload_2
/*    */     //   203: putfield L$1 : Ljava/lang/Object;
/*    */     //   206: aload #9
/*    */     //   208: aload #4
/*    */     //   210: putfield L$2 : Ljava/lang/Object;
/*    */     //   213: aload #9
/*    */     //   215: iconst_2
/*    */     //   216: putfield label : I
/*    */     //   219: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   222: dup
/*    */     //   223: aload #10
/*    */     //   225: if_acmpne -> 266
/*    */     //   228: aload #10
/*    */     //   230: areturn
/*    */     //   231: aload #9
/*    */     //   233: getfield L$2 : Ljava/lang/Object;
/*    */     //   236: checkcast com/intellij/psi/PsiClass
/*    */     //   239: astore #4
/*    */     //   241: aload #9
/*    */     //   243: getfield L$1 : Ljava/lang/Object;
/*    */     //   246: checkcast kotlin/jvm/functions/Function2
/*    */     //   249: astore_2
/*    */     //   250: aload #9
/*    */     //   252: getfield L$0 : Ljava/lang/Object;
/*    */     //   255: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor
/*    */     //   258: astore_0
/*    */     //   259: aload #8
/*    */     //   261: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   264: aload #8
/*    */     //   266: checkcast com/intellij/openapi/vfs/VirtualFile
/*    */     //   269: astore #5
/*    */     //   271: aload #5
/*    */     //   273: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*    */     //   276: aload #5
/*    */     //   278: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*    */     //   281: astore #6
/*    */     //   283: aload #6
/*    */     //   285: ifnull -> 397
/*    */     //   288: aload_2
/*    */     //   289: aload #6
/*    */     //   291: aload #9
/*    */     //   293: aload #9
/*    */     //   295: aload_0
/*    */     //   296: putfield L$0 : Ljava/lang/Object;
/*    */     //   299: aload #9
/*    */     //   301: aload #4
/*    */     //   303: putfield L$1 : Ljava/lang/Object;
/*    */     //   306: aload #9
/*    */     //   308: aload #6
/*    */     //   310: putfield L$2 : Ljava/lang/Object;
/*    */     //   313: aload #9
/*    */     //   315: iconst_3
/*    */     //   316: putfield label : I
/*    */     //   319: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   324: dup
/*    */     //   325: aload #10
/*    */     //   327: if_acmpne -> 369
/*    */     //   330: aload #10
/*    */     //   332: areturn
/*    */     //   333: aload #9
/*    */     //   335: getfield L$2 : Ljava/lang/Object;
/*    */     //   338: checkcast java/nio/file/Path
/*    */     //   341: astore #6
/*    */     //   343: aload #9
/*    */     //   345: getfield L$1 : Ljava/lang/Object;
/*    */     //   348: checkcast com/intellij/psi/PsiClass
/*    */     //   351: astore #4
/*    */     //   353: aload #9
/*    */     //   355: getfield L$0 : Ljava/lang/Object;
/*    */     //   358: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor
/*    */     //   361: astore_0
/*    */     //   362: aload #8
/*    */     //   364: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   367: aload #8
/*    */     //   369: checkcast java/lang/Boolean
/*    */     //   372: invokevirtual booleanValue : ()Z
/*    */     //   375: ifeq -> 397
/*    */     //   378: new com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*    */     //   381: dup
/*    */     //   382: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*    */     //   385: getstatic com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;
/*    */     //   388: aload #6
/*    */     //   390: invokevirtual buildAiIgnoreMessage : (Ljava/nio/file/Path;)Ljava/lang/String;
/*    */     //   393: invokespecial <init> : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   396: areturn
/*    */     //   397: aload_0
/*    */     //   398: aload_0
/*    */     //   399: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   402: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   407: aload #4
/*    */     //   409: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   412: aload #9
/*    */     //   414: aload #9
/*    */     //   416: aconst_null
/*    */     //   417: putfield L$0 : Ljava/lang/Object;
/*    */     //   420: aload #9
/*    */     //   422: aconst_null
/*    */     //   423: putfield L$1 : Ljava/lang/Object;
/*    */     //   426: aload #9
/*    */     //   428: aconst_null
/*    */     //   429: putfield L$2 : Ljava/lang/Object;
/*    */     //   432: aload #9
/*    */     //   434: iconst_4
/*    */     //   435: putfield label : I
/*    */     //   438: invokevirtual findActionsForTestClasses : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   441: dup
/*    */     //   442: aload #10
/*    */     //   444: if_acmpne -> 457
/*    */     //   447: aload #10
/*    */     //   449: areturn
/*    */     //   450: aload #8
/*    */     //   452: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   455: aload #8
/*    */     //   457: checkcast java/util/List
/*    */     //   460: astore #7
/*    */     //   462: new com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*    */     //   465: dup
/*    */     //   466: aload #7
/*    */     //   468: invokespecial <init> : (Ljava/lang/Object;)V
/*    */     //   471: areturn
/*    */     //   472: new java/lang/IllegalStateException
/*    */     //   475: dup
/*    */     //   476: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   478: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   481: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #17	-> 60
/*    */     //   #18	-> 105
/*    */     //   #17	-> 136
/*    */     //   #18	-> 164
/*    */     //   #19	-> 185
/*    */     //   #17	-> 228
/*    */     //   #23	-> 271
/*    */     //   #24	-> 283
/*    */     //   #17	-> 330
/*    */     //   #24	-> 369
/*    */     //   #25	-> 378
/*    */     //   #28	-> 397
/*    */     //   #17	-> 447
/*    */     //   #29	-> 462
/*    */     //   #17	-> 472
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   105	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   157	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   259	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   362	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   397	44	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   105	25	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   105	34	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   148	83	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   250	74	2	mustIgnore	Lkotlin/jvm/functions/Function2;
/*    */     //   185	46	4	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   241	92	4	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   353	25	4	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   397	44	4	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   271	12	5	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*    */     //   283	50	6	nioPath	Ljava/nio/file/Path;
/*    */     //   343	54	6	nioPath	Ljava/nio/file/Path;
/*    */     //   462	10	7	actionLocations	Ljava/util/List;
/*    */     //   0	482	3	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	422	9	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	415	8	$result	Ljava/lang/Object;
/*    */   } private static final VirtualFile extract$lambda$0(PsiClass $psiClass) {
/* 20 */     return $psiClass.getContainingFile().getVirtualFile();
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object executedClasses(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$executedClasses$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$executedClasses$1
/*    */     //   11: astore #5
/*    */     //   13: aload #5
/*    */     //   15: getfield label : I
/*    */     //   18: ldc -2147483648
/*    */     //   20: iand
/*    */     //   21: ifeq -> 39
/*    */     //   24: aload #5
/*    */     //   26: dup
/*    */     //   27: getfield label : I
/*    */     //   30: ldc -2147483648
/*    */     //   32: isub
/*    */     //   33: putfield label : I
/*    */     //   36: goto -> 50
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$executedClasses$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #5
/*    */     //   52: getfield result : Ljava/lang/Object;
/*    */     //   55: astore #4
/*    */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */     //   60: astore #6
/*    */     //   62: aload #5
/*    */     //   64: getfield label : I
/*    */     //   67: tableswitch default -> 152, 0 -> 88, 1 -> 115
/*    */     //   88: aload #4
/*    */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   93: aload_0
/*    */     //   94: aload_1
/*    */     //   95: aload #5
/*    */     //   97: aload #5
/*    */     //   99: iconst_1
/*    */     //   100: putfield label : I
/*    */     //   103: invokespecial findPsiClassesByFqn : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   106: dup
/*    */     //   107: aload #6
/*    */     //   109: if_acmpne -> 122
/*    */     //   112: aload #6
/*    */     //   114: areturn
/*    */     //   115: aload #4
/*    */     //   117: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */     //   120: aload #4
/*    */     //   122: checkcast com/intellij/psi/PsiClass
/*    */     //   125: dup
/*    */     //   126: ifnonnull -> 134
/*    */     //   129: pop
/*    */     //   130: invokestatic emptyList : ()Ljava/util/List;
/*    */     //   133: areturn
/*    */     //   134: astore_3
/*    */     //   135: aload_3
/*    */     //   136: invokeinterface getQualifiedName : ()Ljava/lang/String;
/*    */     //   141: dup
/*    */     //   142: ifnonnull -> 148
/*    */     //   145: pop
/*    */     //   146: ldc ''
/*    */     //   148: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*    */     //   151: areturn
/*    */     //   152: new java/lang/IllegalStateException
/*    */     //   155: dup
/*    */     //   156: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */     //   158: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   161: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #32	-> 60
/*    */     //   #33	-> 93
/*    */     //   #32	-> 112
/*    */     //   #33	-> 122
/*    */     //   #34	-> 135
/*    */     //   #32	-> 152
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   93	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   93	13	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   135	6	3	psiClass	Lcom/intellij/psi/PsiClass;
/*    */     //   0	162	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	102	5	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   57	95	4	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public Object matches(@NotNull ActionLocationsExtractor.Query query, @NotNull Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$matches$1
/*    */     //   4: ifeq -> 39
/*    */     //   7: aload_2
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$matches$1
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
/*    */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor$matches$1
/*    */     //   42: dup
/*    */     //   43: aload_0
/*    */     //   44: aload_2
/*    */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;Lkotlin/coroutines/Continuation;)V
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
/*    */     //   102: invokespecial findPsiClassesByFqn : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
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
/*    */     //   92	13	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   92	13	1	query	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   0	141	2	$completion	Lkotlin/coroutines/Continuation;
/*    */     //   50	81	4	$continuation	Lkotlin/coroutines/Continuation;
/*    */     //   56	75	3	$result	Ljava/lang/Object;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private final Object findPsiClassesByFqn(ActionLocationsExtractor.Query $this$findPsiClassesByFqn, Continuation $completion) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$RawPath
/*    */     //   4: ifeq -> 14
/*    */     //   7: aload_1
/*    */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$RawPath
/*    */     //   11: goto -> 15
/*    */     //   14: aconst_null
/*    */     //   15: dup
/*    */     //   16: ifnonnull -> 22
/*    */     //   19: pop
/*    */     //   20: aconst_null
/*    */     //   21: areturn
/*    */     //   22: invokevirtual component1 : ()Ljava/lang/String;
/*    */     //   25: astore_3
/*    */     //   26: aload_0
/*    */     //   27: invokevirtual getContext : ()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*    */     //   30: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*    */     //   35: astore #4
/*    */     //   37: aload #4
/*    */     //   39: invokestatic projectScope : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   42: dup
/*    */     //   43: ldc 'projectScope(...)'
/*    */     //   45: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   48: astore #5
/*    */     //   50: aload #4
/*    */     //   52: aload #4
/*    */     //   54: aload_3
/*    */     //   55: aload #5
/*    */     //   57: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Lcom/intellij/psi/search/GlobalSearchScope;)Lkotlin/jvm/functions/Function0;
/*    */     //   62: aload_2
/*    */     //   63: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */     //   66: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #42	-> 0
/*    */     //   #43	-> 26
/*    */     //   #44	-> 37
/*    */     //   #45	-> 50
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   26	41	3	fqn	Ljava/lang/String;
/*    */     //   37	30	4	project	Lcom/intellij/openapi/project/Project;
/*    */     //   50	17	5	scope	Lcom/intellij/psi/search/GlobalSearchScope;
/*    */     //   0	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/FileFQNActionLocationExtractor;
/*    */     //   0	67	1	$this$findPsiClassesByFqn	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;
/*    */     //   0	67	2	$completion	Lkotlin/coroutines/Continuation;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final PsiClass findPsiClassesByFqn$lambda$1(Project $project, String $fqn, GlobalSearchScope $scope) {
/* 46 */     return JavaPsiFacade.getInstance($project).findClass($fqn, $scope);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileFQNActionLocationExtractor.kt", l = {33}, i = {}, s = {}, n = {}, m = "executedClasses", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FileFQNActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FileFQNActionLocationExtractor$executedClasses$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FileFQNActionLocationExtractor$executedClasses$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FileFQNActionLocationExtractor.this.executedClasses(null, (Continuation<? super List<String>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileFQNActionLocationExtractor.kt", l = {18, 19, 24, 28}, i = {0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "mustIgnore", "this", "mustIgnore", "psiClass", "this", "psiClass", "nioPath"}, m = "extract", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FileFQNActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FileFQNActionLocationExtractor$extract$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     int label;
/*    */     
/*    */     FileFQNActionLocationExtractor$extract$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FileFQNActionLocationExtractor.this.extract(null, null, (Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "FileFQNActionLocationExtractor.kt", l = {38}, i = {}, s = {}, n = {}, m = "matches", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.FileFQNActionLocationExtractor")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class FileFQNActionLocationExtractor$matches$1 extends ContinuationImpl {
/*    */     int label;
/*    */     
/*    */     FileFQNActionLocationExtractor$matches$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return FileFQNActionLocationExtractor.this.matches(null, (Continuation<? super Boolean>)this);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\FileFQNActionLocationExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */