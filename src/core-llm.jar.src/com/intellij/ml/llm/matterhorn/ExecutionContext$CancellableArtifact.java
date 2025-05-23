/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.Deferred;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\b\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\b\004\030\000*\004\b\000\020\001*\004\b\001\020\0022\0020\003B3\022\022\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005\022\b\020\006\032\004\030\0010\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\004\b\013\020\fJ\016\020\017\032\0020\020H@¢\006\002\020\021J\024\020\022\032\b\022\004\022\0028\0010\023H@¢\006\002\020\021R\032\020\004\032\016\022\004\022\0028\000\022\004\022\0028\0010\005X\004¢\006\002\n\000R\020\020\006\032\004\030\0010\007X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\016\020\r\032\0020\016X\016¢\006\002\n\000¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;", "I", "O", "", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "deferredArtifact", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lkotlinx/coroutines/Deferred;)V", "allowResume", "", "cancelAndJoin", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "Lcom/intellij/ml/llm/matterhorn/Artifact;", "core"})
/*     */ @SourceDebugExtension({"SMAP\nExecutionContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact\n+ 2 Stopwatch.kt\ncom/intellij/ml/llm/matterhorn/helpers/Stopwatch\n*L\n1#1,468:1\n54#2,4:469\n*S KotlinDebug\n*F\n+ 1 ExecutionContext.kt\ncom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact\n*L\n148#1:469,4\n*E\n"})
/*     */ public final class CancellableArtifact<I, O>
/*     */ {
/*     */   @NotNull
/*     */   private final ArtifactRequest<I, O> request;
/*     */   @Nullable
/*     */   private final ProjectFileStructure source;
/*     */   @NotNull
/*     */   private final Deferred<Artifactual> deferredArtifact;
/*     */   private volatile boolean allowResume;
/*     */   
/*     */   public CancellableArtifact(@Nullable ArtifactRequest<I, O> request, @NotNull ProjectFileStructure source, Deferred<Artifactual> deferredArtifact) {
/* 134 */     this.request = request; this.source = source; this.deferredArtifact = deferredArtifact;
/*     */ 
/*     */     
/* 137 */     this.allowResume = true;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object cancelAndJoin(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$cancelAndJoin$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 214, 0 -> 88, 1 -> 131
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: iconst_0
/*     */     //   95: putfield allowResume : Z
/*     */     //   98: aload_0
/*     */     //   99: getfield deferredArtifact : Lkotlinx/coroutines/Deferred;
/*     */     //   102: checkcast kotlinx/coroutines/Job
/*     */     //   105: aload #7
/*     */     //   107: aload #7
/*     */     //   109: aload_0
/*     */     //   110: putfield L$0 : Ljava/lang/Object;
/*     */     //   113: aload #7
/*     */     //   115: iconst_1
/*     */     //   116: putfield label : I
/*     */     //   119: invokestatic cancelAndJoin : (Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   122: dup
/*     */     //   123: aload #8
/*     */     //   125: if_acmpne -> 147
/*     */     //   128: aload #8
/*     */     //   130: areturn
/*     */     //   131: aload #7
/*     */     //   133: getfield L$0 : Ljava/lang/Object;
/*     */     //   136: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact
/*     */     //   139: astore_0
/*     */     //   140: aload #6
/*     */     //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   145: aload #6
/*     */     //   147: pop
/*     */     //   148: aload_0
/*     */     //   149: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   152: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Ljava/lang/Object;
/*     */     //   155: astore_2
/*     */     //   156: aload_0
/*     */     //   157: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   160: astore_3
/*     */     //   161: aload_2
/*     */     //   162: astore #4
/*     */     //   164: aload #4
/*     */     //   166: monitorenter
/*     */     //   167: nop
/*     */     //   168: iconst_0
/*     */     //   169: istore #5
/*     */     //   171: aload_3
/*     */     //   172: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   175: dup
/*     */     //   176: aload_0
/*     */     //   177: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   180: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   183: iconst_0
/*     */     //   184: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */     //   187: invokestatic access$addDependency : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */     //   190: nop
/*     */     //   191: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   194: astore #5
/*     */     //   196: aload #4
/*     */     //   198: monitorexit
/*     */     //   199: goto -> 210
/*     */     //   202: astore #5
/*     */     //   204: aload #4
/*     */     //   206: monitorexit
/*     */     //   207: aload #5
/*     */     //   209: athrow
/*     */     //   210: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   213: areturn
/*     */     //   214: new java/lang/IllegalStateException
/*     */     //   217: dup
/*     */     //   218: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   220: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   223: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #139	-> 60
/*     */     //   #140	-> 93
/*     */     //   #141	-> 98
/*     */     //   #139	-> 128
/*     */     //   #142	-> 147
/*     */     //   #143	-> 171
/*     */     //   #144	-> 190
/*     */     //   #142	-> 194
/*     */     //   #145	-> 210
/*     */     //   #139	-> 214
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	38	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */     //   140	50	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */     //   171	20	5	$i$a$-synchronized-ExecutionContext$CancellableArtifact$cancelAndJoin$2	I
/*     */     //   0	224	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	164	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	157	6	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   167	196	202	finally
/*     */     //   202	204	202	finally
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object get(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact$get$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 487, 0 -> 92, 1 -> 163, 2 -> 266
/*     */     //   92: aload #10
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   101: invokestatic access$getOwnTimeStopwatch$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   104: astore_2
/*     */     //   105: aload_0
/*     */     //   106: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   109: astore_3
/*     */     //   110: iconst_0
/*     */     //   111: istore #4
/*     */     //   113: aload_2
/*     */     //   114: invokevirtual isRunning : ()Z
/*     */     //   117: pop
/*     */     //   118: aload_2
/*     */     //   119: invokevirtual stop : ()V
/*     */     //   122: iconst_0
/*     */     //   123: istore #5
/*     */     //   125: aload_0
/*     */     //   126: getfield deferredArtifact : Lkotlinx/coroutines/Deferred;
/*     */     //   129: aload #11
/*     */     //   131: aload #11
/*     */     //   133: aload_0
/*     */     //   134: putfield L$0 : Ljava/lang/Object;
/*     */     //   137: aload #11
/*     */     //   139: aload_3
/*     */     //   140: putfield L$1 : Ljava/lang/Object;
/*     */     //   143: aload #11
/*     */     //   145: iconst_1
/*     */     //   146: putfield label : I
/*     */     //   149: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   154: dup
/*     */     //   155: aload #12
/*     */     //   157: if_acmpne -> 194
/*     */     //   160: aload #12
/*     */     //   162: areturn
/*     */     //   163: iconst_0
/*     */     //   164: istore #4
/*     */     //   166: iconst_0
/*     */     //   167: istore #5
/*     */     //   169: aload #11
/*     */     //   171: getfield L$1 : Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   177: astore_3
/*     */     //   178: aload #11
/*     */     //   180: getfield L$0 : Ljava/lang/Object;
/*     */     //   183: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact
/*     */     //   186: astore_0
/*     */     //   187: aload #10
/*     */     //   189: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   192: aload #10
/*     */     //   194: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   197: astore #7
/*     */     //   199: iconst_0
/*     */     //   200: istore #8
/*     */     //   202: aload_0
/*     */     //   203: getfield allowResume : Z
/*     */     //   206: ifeq -> 297
/*     */     //   209: aload #7
/*     */     //   211: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   214: ifeq -> 297
/*     */     //   217: aload_3
/*     */     //   218: invokevirtual getService : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   221: aload_0
/*     */     //   222: getfield request : Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   225: aload_0
/*     */     //   226: getfield source : Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   229: aload_3
/*     */     //   230: aconst_null
/*     */     //   231: aload #11
/*     */     //   233: bipush #8
/*     */     //   235: aconst_null
/*     */     //   236: aload #11
/*     */     //   238: aload_3
/*     */     //   239: putfield L$0 : Ljava/lang/Object;
/*     */     //   242: aload #11
/*     */     //   244: aconst_null
/*     */     //   245: putfield L$1 : Ljava/lang/Object;
/*     */     //   248: aload #11
/*     */     //   250: iconst_2
/*     */     //   251: putfield label : I
/*     */     //   254: invokestatic getOrCreateArtifact$default : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   257: dup
/*     */     //   258: aload #12
/*     */     //   260: if_acmpne -> 291
/*     */     //   263: aload #12
/*     */     //   265: areturn
/*     */     //   266: iconst_0
/*     */     //   267: istore #4
/*     */     //   269: iconst_0
/*     */     //   270: istore #5
/*     */     //   272: iconst_0
/*     */     //   273: istore #8
/*     */     //   275: aload #11
/*     */     //   277: getfield L$0 : Ljava/lang/Object;
/*     */     //   280: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   283: astore_3
/*     */     //   284: aload #10
/*     */     //   286: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   289: aload #10
/*     */     //   291: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   294: goto -> 309
/*     */     //   297: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   300: dup
/*     */     //   301: aload #7
/*     */     //   303: iconst_0
/*     */     //   304: iconst_2
/*     */     //   305: aconst_null
/*     */     //   306: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   309: nop
/*     */     //   310: astore #9
/*     */     //   312: aload_3
/*     */     //   313: invokestatic access$getLock$p : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Ljava/lang/Object;
/*     */     //   316: astore #7
/*     */     //   318: aload #7
/*     */     //   320: monitorenter
/*     */     //   321: nop
/*     */     //   322: iconst_0
/*     */     //   323: istore #8
/*     */     //   325: aload_3
/*     */     //   326: new com/intellij/ml/llm/matterhorn/ArtifactDependency
/*     */     //   329: dup
/*     */     //   330: aload #9
/*     */     //   332: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   335: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   340: aload #9
/*     */     //   342: invokevirtual getCached : ()Z
/*     */     //   345: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Z)V
/*     */     //   348: invokestatic access$addDependency : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/ArtifactDependency;)V
/*     */     //   351: nop
/*     */     //   352: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   355: astore #8
/*     */     //   357: aload #7
/*     */     //   359: monitorexit
/*     */     //   360: goto -> 371
/*     */     //   363: astore #8
/*     */     //   365: aload #7
/*     */     //   367: monitorexit
/*     */     //   368: aload #8
/*     */     //   370: athrow
/*     */     //   371: aload #9
/*     */     //   373: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   376: astore #6
/*     */     //   378: aload #6
/*     */     //   380: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   383: ifeq -> 408
/*     */     //   386: new java/util/concurrent/CancellationException
/*     */     //   389: dup
/*     */     //   390: aload #9
/*     */     //   392: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   395: checkcast com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   398: invokevirtual getReasoning : ()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;
/*     */     //   401: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   404: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   407: athrow
/*     */     //   408: aload #6
/*     */     //   410: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   413: ifeq -> 432
/*     */     //   416: new com/intellij/ml/llm/matterhorn/FailedDependencyException
/*     */     //   419: dup
/*     */     //   420: aload #9
/*     */     //   422: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   425: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   428: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;)V
/*     */     //   431: athrow
/*     */     //   432: aload #6
/*     */     //   434: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   437: ifeq -> 457
/*     */     //   440: aload #9
/*     */     //   442: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   445: dup
/*     */     //   446: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.Artifact<O of com.intellij.ml.llm.matterhorn.ExecutionContext.CancellableArtifact>'
/*     */     //   448: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   451: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   454: goto -> 486
/*     */     //   457: new java/lang/IllegalStateException
/*     */     //   460: dup
/*     */     //   461: aload #9
/*     */     //   463: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   466: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   469: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   472: invokeinterface getSimpleName : ()Ljava/lang/String;
/*     */     //   477: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   482: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   485: athrow
/*     */     //   486: areturn
/*     */     //   487: new java/lang/IllegalStateException
/*     */     //   490: dup
/*     */     //   491: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   493: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   496: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #147	-> 60
/*     */     //   #148	-> 97
/*     */     //   #469	-> 113
/*     */     //   #470	-> 118
/*     */     //   #472	-> 122
/*     */     //   #149	-> 125
/*     */     //   #147	-> 160
/*     */     //   #150	-> 202
/*     */     //   #151	-> 217
/*     */     //   #147	-> 263
/*     */     //   #151	-> 291
/*     */     //   #153	-> 297
/*     */     //   #149	-> 309
/*     */     //   #149	-> 310
/*     */     //   #155	-> 312
/*     */     //   #156	-> 325
/*     */     //   #157	-> 351
/*     */     //   #155	-> 355
/*     */     //   #159	-> 371
/*     */     //   #160	-> 378
/*     */     //   #161	-> 408
/*     */     //   #162	-> 432
/*     */     //   #163	-> 457
/*     */     //   #159	-> 486
/*     */     //   #147	-> 487
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	66	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */     //   187	70	0	this	Lcom/intellij/ml/llm/matterhorn/ExecutionContext$CancellableArtifact;
/*     */     //   110	12	2	this_$iv	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   199	18	7	it	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   297	12	7	it	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   312	51	9	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */     //   371	116	9	artifactResult	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;
/*     */     //   202	64	8	$i$a$-let-ExecutionContext$CancellableArtifact$get$2$artifactResult$1	I
/*     */     //   325	27	8	$i$a$-synchronized-ExecutionContext$CancellableArtifact$get$2$1	I
/*     */     //   125	38	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */     //   113	50	4	$i$f$runWithPause	I
/*     */     //   0	497	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	437	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	430	10	$result	Ljava/lang/Object;
/*     */     //   169	97	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */     //   166	100	4	$i$f$runWithPause	I
/*     */     //   275	34	8	$i$a$-let-ExecutionContext$CancellableArtifact$get$2$artifactResult$1	I
/*     */     //   272	215	5	$i$a$-runWithPause-ExecutionContext$CancellableArtifact$get$2	I
/*     */     //   269	218	4	$i$f$runWithPause	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   321	357	363	finally
/*     */     //   363	365	363	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {141}, i = {0}, s = {"L$0"}, n = {"this"}, m = "cancelAndJoin", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$CancellableArtifact")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$CancellableArtifact$cancelAndJoin$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$CancellableArtifact$cancelAndJoin$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.CancellableArtifact.this.cancelAndJoin((Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ExecutionContext.kt", l = {149, 151}, i = {0}, s = {"L$0"}, n = {"this"}, m = "get", c = "com.intellij.ml.llm.matterhorn.ExecutionContext$CancellableArtifact")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ExecutionContext$CancellableArtifact$get$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     ExecutionContext$CancellableArtifact$get$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ExecutionContext.CancellableArtifact.this.get((Continuation<? super Artifact<O>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ExecutionContext$CancellableArtifact.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */