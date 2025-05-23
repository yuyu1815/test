/*     */ package com.intellij.ml.llm.matterhorn;
/*     */ 
/*     */ import com.intellij.openapi.components.Service;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ @Service({Service.Level.PROJECT})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000l\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001:\001-B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\020\032\0020\tH\002J\026\020\021\032\b\022\002\b\003\030\0010\0222\006\020\023\032\0020\024H\002J$\020\025\032\004\030\0010\0262\n\020\027\032\006\022\002\b\0030\0222\006\020\023\032\0020\024H@¢\006\002\020\030J,\020\031\032\004\030\0010\026\"\004\b\000\020\0322\f\020\027\032\b\022\004\022\002H\0320\0222\006\020\023\032\0020\024H@¢\006\002\020\030J,\020\031\032\004\030\0010\026\"\004\b\000\020\0322\f\020\033\032\b\022\004\022\002H\0320\0342\006\020\023\032\0020\024H@¢\006\002\020\035JL\020\036\032\0020\037\"\004\b\000\020 \"\004\b\001\020\0322\022\020!\032\016\022\004\022\002H \022\004\022\002H\0320\"2\b\020#\032\004\030\0010$2\006\020\023\032\0020\0242\n\b\002\020%\032\004\030\0010&H@¢\006\002\020'J\024\020(\032\0020)2\n\020*\032\0060+j\002`,H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\n\020\013R\021\020\f\032\0020\r8F¢\006\006\032\004\b\016\020\017¨\006."}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "getProject", "()Lcom/intellij/openapi/project/Project;", "caches", "Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "getCaches", "()Lcom/intellij/ml/llm/matterhorn/MatterhornCaches;", "projectPath", "Lcom/intellij/openapi/vfs/VirtualFile;", "getProjectPath", "()Lcom/intellij/openapi/vfs/VirtualFile;", "createCaches", "getRequesterArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactId;", "context", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "getArtifactCore", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "artifactId", "(Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getArtifact", "O", "type", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "(Lcom/intellij/ml/llm/matterhorn/ArtifactType;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrCreateArtifact", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;", "I", "request", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "source", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;", "supervisorScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFailureReason", "Lcom/intellij/ml/llm/matterhorn/FailureReason;", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ArtifactResult", "core"})
/*     */ @SourceDebugExtension({"SMAP\nArtifactRequestExecutorService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,383:1\n14#2:384\n14#2:385\n14#2:386\n*S KotlinDebug\n*F\n+ 1 ArtifactRequestExecutorService.kt\ncom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService\n*L\n292#1:384\n294#1:385\n296#1:386\n*E\n"})
/*     */ public final class ArtifactRequestExecutorService
/*     */ {
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final MatterhornCaches caches;
/*     */   
/*     */   public ArtifactRequestExecutorService(@NotNull Project project) {
/* 136 */     this.project = project;
/* 137 */     this.caches = createCaches(); } @NotNull public final Project getProject() { return this.project; } @NotNull public final MatterhornCaches getCaches() { return this.caches; } @NotNull
/* 138 */   public final VirtualFile getProjectPath() { Intrinsics.checkNotNull(ProjectUtil.guessProjectDir(this.project)); return ProjectUtil.guessProjectDir(this.project); }
/*     */   
/*     */   private final MatterhornCaches createCaches() {
/* 141 */     return new FileMatterhornCaches(this.project);
/*     */   }
/*     */   
/*     */   private final ArtifactId<?> getRequesterArtifact(ExecutionContext context) {
/* 145 */     return (context.getParent() != null) ? context.getArtifact() : null;
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
/*     */   
/*     */   private final Object getArtifactCore(ArtifactId artifactId, ExecutionContext context, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifactCore$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifactCore$1
/*     */     //   11: astore #10
/*     */     //   13: aload #10
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #10
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifactCore$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 528, 0 -> 100, 1 -> 160, 2 -> 334, 3 -> 405, 4 -> 476
/*     */     //   100: aload #9
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_2
/*     */     //   106: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   109: aload_1
/*     */     //   110: invokevirtual lookupArtifactInCaches : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   113: astore #4
/*     */     //   115: aload #4
/*     */     //   117: ifnull -> 123
/*     */     //   120: aload #4
/*     */     //   122: areturn
/*     */     //   123: aload_2
/*     */     //   124: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   127: aload_1
/*     */     //   128: aload #10
/*     */     //   130: aload #10
/*     */     //   132: aload_0
/*     */     //   133: putfield L$0 : Ljava/lang/Object;
/*     */     //   136: aload #10
/*     */     //   138: aload_2
/*     */     //   139: putfield L$1 : Ljava/lang/Object;
/*     */     //   142: aload #10
/*     */     //   144: iconst_1
/*     */     //   145: putfield label : I
/*     */     //   148: invokevirtual lookupArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   151: dup
/*     */     //   152: aload #11
/*     */     //   154: if_acmpne -> 185
/*     */     //   157: aload #11
/*     */     //   159: areturn
/*     */     //   160: aload #10
/*     */     //   162: getfield L$1 : Ljava/lang/Object;
/*     */     //   165: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   168: astore_2
/*     */     //   169: aload #10
/*     */     //   171: getfield L$0 : Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   177: astore_0
/*     */     //   178: aload #9
/*     */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   183: aload #9
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   188: astore #5
/*     */     //   190: aload #5
/*     */     //   192: ifnull -> 526
/*     */     //   195: aload_0
/*     */     //   196: aload_2
/*     */     //   197: invokespecial getRequesterArtifact : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   200: astore #6
/*     */     //   202: new com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   205: dup
/*     */     //   206: aload #5
/*     */     //   208: invokeinterface getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   213: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   216: getstatic kotlinx/serialization/internal/UnitSerializer.INSTANCE : Lkotlinx/serialization/internal/UnitSerializer;
/*     */     //   219: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Ljava/lang/Object;Lkotlinx/serialization/KSerializer;)V
/*     */     //   222: astore #7
/*     */     //   224: aload_2
/*     */     //   225: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   228: new com/intellij/ml/llm/matterhorn/UnfinishedArtifact
/*     */     //   231: dup
/*     */     //   232: aload #7
/*     */     //   234: aconst_null
/*     */     //   235: aconst_null
/*     */     //   236: aconst_null
/*     */     //   237: aconst_null
/*     */     //   238: bipush #30
/*     */     //   240: aconst_null
/*     */     //   241: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   244: aload #6
/*     */     //   246: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   249: aload_2
/*     */     //   250: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   253: new com/intellij/ml/llm/matterhorn/UnfinishedArtifact
/*     */     //   256: dup
/*     */     //   257: aload #7
/*     */     //   259: aconst_null
/*     */     //   260: aconst_null
/*     */     //   261: aload #5
/*     */     //   263: invokeinterface getDependencies : ()Ljava/util/List;
/*     */     //   268: aconst_null
/*     */     //   269: bipush #22
/*     */     //   271: aconst_null
/*     */     //   272: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   275: aload #6
/*     */     //   277: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   280: aload #5
/*     */     //   282: astore #8
/*     */     //   284: aload #8
/*     */     //   286: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   289: ifeq -> 355
/*     */     //   292: aload_2
/*     */     //   293: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   296: aload #5
/*     */     //   298: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   301: aload #10
/*     */     //   303: aload #10
/*     */     //   305: aload #5
/*     */     //   307: putfield L$0 : Ljava/lang/Object;
/*     */     //   310: aload #10
/*     */     //   312: aconst_null
/*     */     //   313: putfield L$1 : Ljava/lang/Object;
/*     */     //   316: aload #10
/*     */     //   318: iconst_2
/*     */     //   319: putfield label : I
/*     */     //   322: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   325: dup
/*     */     //   326: aload #11
/*     */     //   328: if_acmpne -> 351
/*     */     //   331: aload #11
/*     */     //   333: areturn
/*     */     //   334: aload #10
/*     */     //   336: getfield L$0 : Ljava/lang/Object;
/*     */     //   339: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   342: astore #5
/*     */     //   344: aload #9
/*     */     //   346: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   349: aload #9
/*     */     //   351: pop
/*     */     //   352: goto -> 523
/*     */     //   355: aload #8
/*     */     //   357: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   360: ifeq -> 426
/*     */     //   363: aload_2
/*     */     //   364: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   367: aload #5
/*     */     //   369: checkcast com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   372: aload #10
/*     */     //   374: aload #10
/*     */     //   376: aload #5
/*     */     //   378: putfield L$0 : Ljava/lang/Object;
/*     */     //   381: aload #10
/*     */     //   383: aconst_null
/*     */     //   384: putfield L$1 : Ljava/lang/Object;
/*     */     //   387: aload #10
/*     */     //   389: iconst_3
/*     */     //   390: putfield label : I
/*     */     //   393: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   396: dup
/*     */     //   397: aload #11
/*     */     //   399: if_acmpne -> 422
/*     */     //   402: aload #11
/*     */     //   404: areturn
/*     */     //   405: aload #10
/*     */     //   407: getfield L$0 : Ljava/lang/Object;
/*     */     //   410: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   413: astore #5
/*     */     //   415: aload #9
/*     */     //   417: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   420: aload #9
/*     */     //   422: pop
/*     */     //   423: goto -> 523
/*     */     //   426: aload #8
/*     */     //   428: instanceof com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   431: ifeq -> 497
/*     */     //   434: aload_2
/*     */     //   435: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   438: aload #5
/*     */     //   440: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   443: aload #10
/*     */     //   445: aload #10
/*     */     //   447: aload #5
/*     */     //   449: putfield L$0 : Ljava/lang/Object;
/*     */     //   452: aload #10
/*     */     //   454: aconst_null
/*     */     //   455: putfield L$1 : Ljava/lang/Object;
/*     */     //   458: aload #10
/*     */     //   460: iconst_4
/*     */     //   461: putfield label : I
/*     */     //   464: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/Artifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   467: dup
/*     */     //   468: aload #11
/*     */     //   470: if_acmpne -> 493
/*     */     //   473: aload #11
/*     */     //   475: areturn
/*     */     //   476: aload #10
/*     */     //   478: getfield L$0 : Ljava/lang/Object;
/*     */     //   481: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   484: astore #5
/*     */     //   486: aload #9
/*     */     //   488: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   491: aload #9
/*     */     //   493: pop
/*     */     //   494: goto -> 523
/*     */     //   497: aload #8
/*     */     //   499: instanceof com/intellij/ml/llm/matterhorn/UnfinishedArtifact
/*     */     //   502: ifeq -> 515
/*     */     //   505: new java/lang/IllegalStateException
/*     */     //   508: dup
/*     */     //   509: ldc 'Can't register unfinished artifact'
/*     */     //   511: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   514: athrow
/*     */     //   515: new kotlin/NoWhenBranchMatchedException
/*     */     //   518: dup
/*     */     //   519: invokespecial <init> : ()V
/*     */     //   522: athrow
/*     */     //   523: aload #5
/*     */     //   525: areturn
/*     */     //   526: aconst_null
/*     */     //   527: areturn
/*     */     //   528: new java/lang/IllegalStateException
/*     */     //   531: dup
/*     */     //   532: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   534: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   537: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #148	-> 60
/*     */     //   #149	-> 105
/*     */     //   #150	-> 115
/*     */     //   #151	-> 120
/*     */     //   #154	-> 123
/*     */     //   #148	-> 157
/*     */     //   #155	-> 190
/*     */     //   #156	-> 195
/*     */     //   #157	-> 202
/*     */     //   #160	-> 224
/*     */     //   #162	-> 249
/*     */     //   #163	-> 280
/*     */     //   #164	-> 284
/*     */     //   #148	-> 331
/*     */     //   #164	-> 351
/*     */     //   #165	-> 355
/*     */     //   #148	-> 402
/*     */     //   #165	-> 422
/*     */     //   #166	-> 426
/*     */     //   #148	-> 473
/*     */     //   #166	-> 493
/*     */     //   #167	-> 497
/*     */     //   #163	-> 515
/*     */     //   #169	-> 523
/*     */     //   #172	-> 526
/*     */     //   #148	-> 528
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	55	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   178	24	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   105	15	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   123	28	1	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   105	55	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   169	156	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   355	41	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   426	41	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   115	8	4	cached	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   190	144	5	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   344	61	5	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   415	61	5	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   486	11	5	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   523	5	5	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   202	78	6	requestId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   224	56	7	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   0	538	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	478	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	471	9	$result	Ljava/lang/Object;
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
/*     */   @Nullable
/*     */   public final <O> Object getArtifact(@NotNull ArtifactId<?> artifactId, @NotNull ExecutionContext context, @NotNull Continuation<? super Artifactual> $completion) {
/* 177 */     if (context.getParent() != null) {
/* 178 */       UnfinishedArtifact<Object, Object> unfinishedParentArtifact = new UnfinishedArtifact<>(context.getRequest(), context.getStatistics(), context.getTitle(), context.getDependencies(), null, 16, null);
/* 179 */       context.getRoot().registerArtifact(unfinishedParentArtifact, getRequesterArtifact(context.getParent()));
/*     */     } 
/*     */     
/* 182 */     return getArtifactCore(artifactId, context, $completion);
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final <O> Object getArtifact(@NotNull ArtifactType type, @NotNull ExecutionContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifact$2
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifact$2
/*     */     //   11: astore #8
/*     */     //   13: aload #8
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #8
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getArtifact$2
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #8
/*     */     //   50: aload #8
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #7
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #9
/*     */     //   62: aload #8
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 283, 0 -> 88, 1 -> 210
/*     */     //   88: aload #7
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_2
/*     */     //   94: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   97: ifnull -> 146
/*     */     //   100: new com/intellij/ml/llm/matterhorn/UnfinishedArtifact
/*     */     //   103: dup
/*     */     //   104: aload_2
/*     */     //   105: invokevirtual getRequest : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   108: aload_2
/*     */     //   109: invokevirtual getStatistics : ()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   112: aload_2
/*     */     //   113: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   116: aload_2
/*     */     //   117: invokevirtual getDependencies : ()Ljava/util/List;
/*     */     //   120: aconst_null
/*     */     //   121: bipush #16
/*     */     //   123: aconst_null
/*     */     //   124: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   127: astore #4
/*     */     //   129: aload_2
/*     */     //   130: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   133: aload #4
/*     */     //   135: aload_0
/*     */     //   136: aload_2
/*     */     //   137: invokevirtual getParent : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   140: invokespecial getRequesterArtifact : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   143: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   146: aload_2
/*     */     //   147: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   150: aload_1
/*     */     //   151: invokevirtual changeType : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   154: astore #4
/*     */     //   156: aload #4
/*     */     //   158: ifnull -> 281
/*     */     //   161: aload_0
/*     */     //   162: aload #4
/*     */     //   164: aload_2
/*     */     //   165: aload #8
/*     */     //   167: aload #8
/*     */     //   169: aload_0
/*     */     //   170: putfield L$0 : Ljava/lang/Object;
/*     */     //   173: aload #8
/*     */     //   175: aload_1
/*     */     //   176: putfield L$1 : Ljava/lang/Object;
/*     */     //   179: aload #8
/*     */     //   181: aload_2
/*     */     //   182: putfield L$2 : Ljava/lang/Object;
/*     */     //   185: aload #8
/*     */     //   187: aload #4
/*     */     //   189: putfield L$3 : Ljava/lang/Object;
/*     */     //   192: aload #8
/*     */     //   194: iconst_1
/*     */     //   195: putfield label : I
/*     */     //   198: invokespecial getArtifactCore : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   201: dup
/*     */     //   202: aload #9
/*     */     //   204: if_acmpne -> 254
/*     */     //   207: aload #9
/*     */     //   209: areturn
/*     */     //   210: aload #8
/*     */     //   212: getfield L$3 : Ljava/lang/Object;
/*     */     //   215: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   218: astore #4
/*     */     //   220: aload #8
/*     */     //   222: getfield L$2 : Ljava/lang/Object;
/*     */     //   225: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   228: astore_2
/*     */     //   229: aload #8
/*     */     //   231: getfield L$1 : Ljava/lang/Object;
/*     */     //   234: checkcast com/intellij/ml/llm/matterhorn/ArtifactType
/*     */     //   237: astore_1
/*     */     //   238: aload #8
/*     */     //   240: getfield L$0 : Ljava/lang/Object;
/*     */     //   243: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   246: astore_0
/*     */     //   247: aload #7
/*     */     //   249: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   252: aload #7
/*     */     //   254: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   257: dup
/*     */     //   258: ifnull -> 269
/*     */     //   261: astore #5
/*     */     //   263: iconst_0
/*     */     //   264: istore #6
/*     */     //   266: aload #5
/*     */     //   268: areturn
/*     */     //   269: pop
/*     */     //   270: aload #4
/*     */     //   272: aload_1
/*     */     //   273: invokevirtual parentOfType : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   276: astore #4
/*     */     //   278: goto -> 156
/*     */     //   281: aconst_null
/*     */     //   282: areturn
/*     */     //   283: new java/lang/IllegalStateException
/*     */     //   286: dup
/*     */     //   287: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   289: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   292: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #185	-> 60
/*     */     //   #186	-> 93
/*     */     //   #187	-> 100
/*     */     //   #188	-> 129
/*     */     //   #191	-> 146
/*     */     //   #192	-> 156
/*     */     //   #193	-> 161
/*     */     //   #185	-> 207
/*     */     //   #193	-> 254
/*     */     //   #194	-> 266
/*     */     //   #196	-> 270
/*     */     //   #199	-> 281
/*     */     //   #185	-> 283
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	117	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   247	36	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   93	117	1	type	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   238	45	1	type	Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   93	117	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   229	54	2	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   129	17	4	unfinishedParentArtifact	Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;
/*     */     //   156	54	4	relativePath	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   220	63	4	relativePath	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   263	6	5	it	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   266	3	6	$i$a$-let-ArtifactRequestExecutorService$getArtifact$3	I
/*     */     //   0	293	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	233	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	226	7	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\f\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0052\b\020\020\032\004\030\0010\001HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult;", "", "artifact", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "cached", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/Artifactual;Z)V", "getArtifact", "()Lcom/intellij/ml/llm/matterhorn/Artifactual;", "getCached", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "core"})
/*     */   public static final class ArtifactResult
/*     */   {
/*     */     @NotNull
/*     */     private final Artifactual artifact;
/*     */     
/*     */     private final boolean cached;
/*     */ 
/*     */     
/*     */     public ArtifactResult(@NotNull Artifactual artifact, boolean cached) {
/* 202 */       this.artifact = artifact; this.cached = cached; } @NotNull public final Artifactual getArtifact() { return this.artifact; } @NotNull public final Artifactual component1() { return this.artifact; } public final boolean component2() { return this.cached; } @NotNull public final ArtifactResult copy(@NotNull Artifactual artifact, boolean cached) { Intrinsics.checkNotNullParameter(artifact, "artifact"); return new ArtifactResult(artifact, cached); } public final boolean getCached() { return this.cached; }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "ArtifactResult(artifact=" + this.artifact + ", cached=" + this.cached + ")";
/*     */     }
/*     */     public int hashCode() {
/*     */       result = this.artifact.hashCode();
/*     */       return result * 31 + Boolean.hashCode(this.cached);
/*     */     }
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof ArtifactResult))
/*     */         return false; 
/*     */       ArtifactResult artifactResult = (ArtifactResult)other;
/*     */       return !Intrinsics.areEqual(this.artifact, artifactResult.artifact) ? false : (!(this.cached != artifactResult.cached));
/*     */     }
/*     */   }
/*     */   @Nullable
/*     */   public final <I, O> Object getOrCreateArtifact(@NotNull ArtifactRequest request, @Nullable ProjectFileStructure source, @NotNull ExecutionContext context, @Nullable CoroutineScope supervisorScope, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getOrCreateArtifact$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getOrCreateArtifact$1
/*     */     //   13: astore #22
/*     */     //   15: aload #22
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #22
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getOrCreateArtifact$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #22
/*     */     //   53: aload #22
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #21
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #23
/*     */     //   65: aload #22
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 2513, 0 -> 140, 1 -> 213, 2 -> 568, 3 -> 869, 4 -> 1071, 5 -> 1272, 6 -> 1543, 7 -> 1769, 8 -> 1851, 9 -> 2161, 10 -> 2232, 11 -> 2303, 12 -> 2385, 13 -> 2492
/*     */     //   140: aload #21
/*     */     //   142: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   145: aload_1
/*     */     //   146: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   149: astore #6
/*     */     //   151: aload_0
/*     */     //   152: aload #6
/*     */     //   154: aload_3
/*     */     //   155: aload #22
/*     */     //   157: aload #22
/*     */     //   159: aload_0
/*     */     //   160: putfield L$0 : Ljava/lang/Object;
/*     */     //   163: aload #22
/*     */     //   165: aload_1
/*     */     //   166: putfield L$1 : Ljava/lang/Object;
/*     */     //   169: aload #22
/*     */     //   171: aload_2
/*     */     //   172: putfield L$2 : Ljava/lang/Object;
/*     */     //   175: aload #22
/*     */     //   177: aload_3
/*     */     //   178: putfield L$3 : Ljava/lang/Object;
/*     */     //   181: aload #22
/*     */     //   183: aload #4
/*     */     //   185: putfield L$4 : Ljava/lang/Object;
/*     */     //   188: aload #22
/*     */     //   190: aload #6
/*     */     //   192: putfield L$5 : Ljava/lang/Object;
/*     */     //   195: aload #22
/*     */     //   197: iconst_1
/*     */     //   198: putfield label : I
/*     */     //   201: invokevirtual getArtifact : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   204: dup
/*     */     //   205: aload #23
/*     */     //   207: if_acmpne -> 276
/*     */     //   210: aload #23
/*     */     //   212: areturn
/*     */     //   213: aload #22
/*     */     //   215: getfield L$5 : Ljava/lang/Object;
/*     */     //   218: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   221: astore #6
/*     */     //   223: aload #22
/*     */     //   225: getfield L$4 : Ljava/lang/Object;
/*     */     //   228: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   231: astore #4
/*     */     //   233: aload #22
/*     */     //   235: getfield L$3 : Ljava/lang/Object;
/*     */     //   238: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   241: astore_3
/*     */     //   242: aload #22
/*     */     //   244: getfield L$2 : Ljava/lang/Object;
/*     */     //   247: checkcast com/intellij/ml/llm/matterhorn/ProjectFileStructure
/*     */     //   250: astore_2
/*     */     //   251: aload #22
/*     */     //   253: getfield L$1 : Ljava/lang/Object;
/*     */     //   256: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   259: astore_1
/*     */     //   260: aload #22
/*     */     //   262: getfield L$0 : Ljava/lang/Object;
/*     */     //   265: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   268: astore_0
/*     */     //   269: aload #21
/*     */     //   271: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   274: aload #21
/*     */     //   276: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   279: astore #7
/*     */     //   281: aload #7
/*     */     //   283: instanceof com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   286: ifeq -> 298
/*     */     //   289: aload #4
/*     */     //   291: ifnonnull -> 298
/*     */     //   294: iconst_1
/*     */     //   295: goto -> 299
/*     */     //   298: iconst_0
/*     */     //   299: istore #8
/*     */     //   301: aload #7
/*     */     //   303: ifnull -> 322
/*     */     //   306: iload #8
/*     */     //   308: ifne -> 322
/*     */     //   311: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   314: dup
/*     */     //   315: aload #7
/*     */     //   317: iconst_1
/*     */     //   318: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Z)V
/*     */     //   321: areturn
/*     */     //   322: aload_1
/*     */     //   323: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   326: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   329: invokevirtual getExecutor : ()Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   332: astore #9
/*     */     //   334: aload #9
/*     */     //   336: ifnonnull -> 357
/*     */     //   339: new java/lang/Exception
/*     */     //   342: dup
/*     */     //   343: aload #6
/*     */     //   345: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   348: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Ljava/lang/String;
/*     */     //   353: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   356: athrow
/*     */     //   357: aload #9
/*     */     //   359: astore #10
/*     */     //   361: aload_3
/*     */     //   362: aload_1
/*     */     //   363: aload_2
/*     */     //   364: invokevirtual createChildContext : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;)Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   367: astore #11
/*     */     //   369: new com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   372: dup
/*     */     //   373: iconst_1
/*     */     //   374: invokespecial <init> : (Z)V
/*     */     //   377: astore #12
/*     */     //   379: aload #6
/*     */     //   381: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   384: aload #6
/*     */     //   386: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */     //   389: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)Ljava/lang/String;
/*     */     //   394: astore #13
/*     */     //   396: aload #13
/*     */     //   398: astore #14
/*     */     //   400: nop
/*     */     //   401: aload_0
/*     */     //   402: aload_3
/*     */     //   403: invokespecial getRequesterArtifact : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;)Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   406: astore #15
/*     */     //   408: aload_3
/*     */     //   409: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   412: new com/intellij/ml/llm/matterhorn/UnfinishedArtifact
/*     */     //   415: dup
/*     */     //   416: aload_1
/*     */     //   417: aconst_null
/*     */     //   418: aconst_null
/*     */     //   419: aconst_null
/*     */     //   420: aconst_null
/*     */     //   421: bipush #30
/*     */     //   423: aconst_null
/*     */     //   424: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   427: aload #15
/*     */     //   429: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/UnfinishedArtifact;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */     //   432: aload #10
/*     */     //   434: instanceof com/intellij/ml/llm/matterhorn/TeamCityReporter
/*     */     //   437: ifeq -> 450
/*     */     //   440: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   443: aload #13
/*     */     //   445: aload #14
/*     */     //   447: invokevirtual testStarted : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   450: aload_3
/*     */     //   451: new com/intellij/ml/llm/matterhorn/BeforeArtifactBuildingStarted
/*     */     //   454: dup
/*     */     //   455: aload_1
/*     */     //   456: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   459: invokestatic toSerializable : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;
/*     */     //   462: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;)V
/*     */     //   465: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   468: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   471: aload #10
/*     */     //   473: aload_1
/*     */     //   474: invokevirtual getDescription : ()Ljava/lang/Object;
/*     */     //   477: aload #11
/*     */     //   479: aload #22
/*     */     //   481: aload #22
/*     */     //   483: aload_0
/*     */     //   484: putfield L$0 : Ljava/lang/Object;
/*     */     //   487: aload #22
/*     */     //   489: aload_1
/*     */     //   490: putfield L$1 : Ljava/lang/Object;
/*     */     //   493: aload #22
/*     */     //   495: aload_3
/*     */     //   496: putfield L$2 : Ljava/lang/Object;
/*     */     //   499: aload #22
/*     */     //   501: aload #4
/*     */     //   503: putfield L$3 : Ljava/lang/Object;
/*     */     //   506: aload #22
/*     */     //   508: aload #6
/*     */     //   510: putfield L$4 : Ljava/lang/Object;
/*     */     //   513: aload #22
/*     */     //   515: aload #10
/*     */     //   517: putfield L$5 : Ljava/lang/Object;
/*     */     //   520: aload #22
/*     */     //   522: aload #11
/*     */     //   524: putfield L$6 : Ljava/lang/Object;
/*     */     //   527: aload #22
/*     */     //   529: aload #12
/*     */     //   531: putfield L$7 : Ljava/lang/Object;
/*     */     //   534: aload #22
/*     */     //   536: aload #13
/*     */     //   538: putfield L$8 : Ljava/lang/Object;
/*     */     //   541: aload #22
/*     */     //   543: aload #14
/*     */     //   545: putfield L$9 : Ljava/lang/Object;
/*     */     //   548: aload #22
/*     */     //   550: iconst_2
/*     */     //   551: putfield label : I
/*     */     //   554: invokeinterface produceArtifact : (Ljava/lang/Object;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   559: dup
/*     */     //   560: aload #23
/*     */     //   562: if_acmpne -> 673
/*     */     //   565: aload #23
/*     */     //   567: areturn
/*     */     //   568: aload #22
/*     */     //   570: getfield L$9 : Ljava/lang/Object;
/*     */     //   573: checkcast java/lang/String
/*     */     //   576: astore #14
/*     */     //   578: aload #22
/*     */     //   580: getfield L$8 : Ljava/lang/Object;
/*     */     //   583: checkcast java/lang/String
/*     */     //   586: astore #13
/*     */     //   588: aload #22
/*     */     //   590: getfield L$7 : Ljava/lang/Object;
/*     */     //   593: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   596: astore #12
/*     */     //   598: aload #22
/*     */     //   600: getfield L$6 : Ljava/lang/Object;
/*     */     //   603: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   606: astore #11
/*     */     //   608: aload #22
/*     */     //   610: getfield L$5 : Ljava/lang/Object;
/*     */     //   613: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutor
/*     */     //   616: astore #10
/*     */     //   618: aload #22
/*     */     //   620: getfield L$4 : Ljava/lang/Object;
/*     */     //   623: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   626: astore #6
/*     */     //   628: aload #22
/*     */     //   630: getfield L$3 : Ljava/lang/Object;
/*     */     //   633: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   636: astore #4
/*     */     //   638: aload #22
/*     */     //   640: getfield L$2 : Ljava/lang/Object;
/*     */     //   643: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   646: astore_3
/*     */     //   647: aload #22
/*     */     //   649: getfield L$1 : Ljava/lang/Object;
/*     */     //   652: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */     //   655: astore_1
/*     */     //   656: aload #22
/*     */     //   658: getfield L$0 : Ljava/lang/Object;
/*     */     //   661: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   664: astore_0
/*     */     //   665: nop
/*     */     //   666: aload #21
/*     */     //   668: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   671: aload #21
/*     */     //   673: checkcast com/intellij/ml/llm/matterhorn/ArtifactResponse
/*     */     //   676: astore #16
/*     */     //   678: aload_3
/*     */     //   679: new com/intellij/ml/llm/matterhorn/AfterArtifactBuildingFinished
/*     */     //   682: dup
/*     */     //   683: aload_1
/*     */     //   684: invokevirtual getArtifact : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   687: invokestatic toSerializable : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;)Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;
/*     */     //   690: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/SerializableArtifactId;)V
/*     */     //   693: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   696: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   699: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   702: aload_1
/*     */     //   703: invokevirtual getSerializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   706: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   709: aload_1
/*     */     //   710: invokevirtual getDescription : ()Ljava/lang/Object;
/*     */     //   713: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   716: astore #17
/*     */     //   718: new com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   721: dup
/*     */     //   722: aload #6
/*     */     //   724: aload #11
/*     */     //   726: invokevirtual getStatistics : ()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   729: aload #12
/*     */     //   731: invokevirtual elapsedTimeSeconds : ()J
/*     */     //   734: invokevirtual withTotalTimeSpent : (J)Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   737: aload #11
/*     */     //   739: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   742: aload #17
/*     */     //   744: aload #11
/*     */     //   746: invokevirtual getDependencies : ()Ljava/util/List;
/*     */     //   749: new com/intellij/ml/llm/matterhorn/ArtifactReasoning$Success
/*     */     //   752: dup
/*     */     //   753: aload #16
/*     */     //   755: invokevirtual getReasoning : ()Ljava/lang/String;
/*     */     //   758: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   761: checkcast com/intellij/ml/llm/matterhorn/ArtifactReasoning
/*     */     //   764: aload #16
/*     */     //   766: invokevirtual getContent : ()Ljava/lang/Object;
/*     */     //   769: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning;Ljava/lang/Object;)V
/*     */     //   772: astore #18
/*     */     //   774: aload #11
/*     */     //   776: aload #18
/*     */     //   778: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   781: aload #22
/*     */     //   783: aload #22
/*     */     //   785: aload_0
/*     */     //   786: putfield L$0 : Ljava/lang/Object;
/*     */     //   789: aload #22
/*     */     //   791: aload_3
/*     */     //   792: putfield L$1 : Ljava/lang/Object;
/*     */     //   795: aload #22
/*     */     //   797: aload #4
/*     */     //   799: putfield L$2 : Ljava/lang/Object;
/*     */     //   802: aload #22
/*     */     //   804: aload #6
/*     */     //   806: putfield L$3 : Ljava/lang/Object;
/*     */     //   809: aload #22
/*     */     //   811: aload #10
/*     */     //   813: putfield L$4 : Ljava/lang/Object;
/*     */     //   816: aload #22
/*     */     //   818: aload #11
/*     */     //   820: putfield L$5 : Ljava/lang/Object;
/*     */     //   823: aload #22
/*     */     //   825: aload #12
/*     */     //   827: putfield L$6 : Ljava/lang/Object;
/*     */     //   830: aload #22
/*     */     //   832: aload #13
/*     */     //   834: putfield L$7 : Ljava/lang/Object;
/*     */     //   837: aload #22
/*     */     //   839: aload #14
/*     */     //   841: putfield L$8 : Ljava/lang/Object;
/*     */     //   844: aload #22
/*     */     //   846: aload #18
/*     */     //   848: putfield L$9 : Ljava/lang/Object;
/*     */     //   851: aload #22
/*     */     //   853: iconst_3
/*     */     //   854: putfield label : I
/*     */     //   857: invokevirtual dumpSourceCode : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   860: dup
/*     */     //   861: aload #23
/*     */     //   863: if_acmpne -> 975
/*     */     //   866: aload #23
/*     */     //   868: areturn
/*     */     //   869: aload #22
/*     */     //   871: getfield L$9 : Ljava/lang/Object;
/*     */     //   874: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   877: astore #18
/*     */     //   879: aload #22
/*     */     //   881: getfield L$8 : Ljava/lang/Object;
/*     */     //   884: checkcast java/lang/String
/*     */     //   887: astore #14
/*     */     //   889: aload #22
/*     */     //   891: getfield L$7 : Ljava/lang/Object;
/*     */     //   894: checkcast java/lang/String
/*     */     //   897: astore #13
/*     */     //   899: aload #22
/*     */     //   901: getfield L$6 : Ljava/lang/Object;
/*     */     //   904: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   907: astore #12
/*     */     //   909: aload #22
/*     */     //   911: getfield L$5 : Ljava/lang/Object;
/*     */     //   914: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   917: astore #11
/*     */     //   919: aload #22
/*     */     //   921: getfield L$4 : Ljava/lang/Object;
/*     */     //   924: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutor
/*     */     //   927: astore #10
/*     */     //   929: aload #22
/*     */     //   931: getfield L$3 : Ljava/lang/Object;
/*     */     //   934: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   937: astore #6
/*     */     //   939: aload #22
/*     */     //   941: getfield L$2 : Ljava/lang/Object;
/*     */     //   944: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   947: astore #4
/*     */     //   949: aload #22
/*     */     //   951: getfield L$1 : Ljava/lang/Object;
/*     */     //   954: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   957: astore_3
/*     */     //   958: aload #22
/*     */     //   960: getfield L$0 : Ljava/lang/Object;
/*     */     //   963: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   966: astore_0
/*     */     //   967: nop
/*     */     //   968: aload #21
/*     */     //   970: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   973: aload #21
/*     */     //   975: pop
/*     */     //   976: aload #11
/*     */     //   978: aload #18
/*     */     //   980: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   983: aload #22
/*     */     //   985: aload #22
/*     */     //   987: aload_0
/*     */     //   988: putfield L$0 : Ljava/lang/Object;
/*     */     //   991: aload #22
/*     */     //   993: aload_3
/*     */     //   994: putfield L$1 : Ljava/lang/Object;
/*     */     //   997: aload #22
/*     */     //   999: aload #4
/*     */     //   1001: putfield L$2 : Ljava/lang/Object;
/*     */     //   1004: aload #22
/*     */     //   1006: aload #6
/*     */     //   1008: putfield L$3 : Ljava/lang/Object;
/*     */     //   1011: aload #22
/*     */     //   1013: aload #10
/*     */     //   1015: putfield L$4 : Ljava/lang/Object;
/*     */     //   1018: aload #22
/*     */     //   1020: aload #11
/*     */     //   1022: putfield L$5 : Ljava/lang/Object;
/*     */     //   1025: aload #22
/*     */     //   1027: aload #12
/*     */     //   1029: putfield L$6 : Ljava/lang/Object;
/*     */     //   1032: aload #22
/*     */     //   1034: aload #13
/*     */     //   1036: putfield L$7 : Ljava/lang/Object;
/*     */     //   1039: aload #22
/*     */     //   1041: aload #14
/*     */     //   1043: putfield L$8 : Ljava/lang/Object;
/*     */     //   1046: aload #22
/*     */     //   1048: aload #18
/*     */     //   1050: putfield L$9 : Ljava/lang/Object;
/*     */     //   1053: aload #22
/*     */     //   1055: iconst_4
/*     */     //   1056: putfield label : I
/*     */     //   1059: invokevirtual dumpArtifactTextRepresentation : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1062: dup
/*     */     //   1063: aload #23
/*     */     //   1065: if_acmpne -> 1177
/*     */     //   1068: aload #23
/*     */     //   1070: areturn
/*     */     //   1071: aload #22
/*     */     //   1073: getfield L$9 : Ljava/lang/Object;
/*     */     //   1076: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   1079: astore #18
/*     */     //   1081: aload #22
/*     */     //   1083: getfield L$8 : Ljava/lang/Object;
/*     */     //   1086: checkcast java/lang/String
/*     */     //   1089: astore #14
/*     */     //   1091: aload #22
/*     */     //   1093: getfield L$7 : Ljava/lang/Object;
/*     */     //   1096: checkcast java/lang/String
/*     */     //   1099: astore #13
/*     */     //   1101: aload #22
/*     */     //   1103: getfield L$6 : Ljava/lang/Object;
/*     */     //   1106: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   1109: astore #12
/*     */     //   1111: aload #22
/*     */     //   1113: getfield L$5 : Ljava/lang/Object;
/*     */     //   1116: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1119: astore #11
/*     */     //   1121: aload #22
/*     */     //   1123: getfield L$4 : Ljava/lang/Object;
/*     */     //   1126: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutor
/*     */     //   1129: astore #10
/*     */     //   1131: aload #22
/*     */     //   1133: getfield L$3 : Ljava/lang/Object;
/*     */     //   1136: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   1139: astore #6
/*     */     //   1141: aload #22
/*     */     //   1143: getfield L$2 : Ljava/lang/Object;
/*     */     //   1146: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   1149: astore #4
/*     */     //   1151: aload #22
/*     */     //   1153: getfield L$1 : Ljava/lang/Object;
/*     */     //   1156: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1159: astore_3
/*     */     //   1160: aload #22
/*     */     //   1162: getfield L$0 : Ljava/lang/Object;
/*     */     //   1165: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   1168: astore_0
/*     */     //   1169: nop
/*     */     //   1170: aload #21
/*     */     //   1172: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1175: aload #21
/*     */     //   1177: pop
/*     */     //   1178: aload_3
/*     */     //   1179: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   1182: aload #18
/*     */     //   1184: aload #22
/*     */     //   1186: aload #22
/*     */     //   1188: aload_0
/*     */     //   1189: putfield L$0 : Ljava/lang/Object;
/*     */     //   1192: aload #22
/*     */     //   1194: aload_3
/*     */     //   1195: putfield L$1 : Ljava/lang/Object;
/*     */     //   1198: aload #22
/*     */     //   1200: aload #4
/*     */     //   1202: putfield L$2 : Ljava/lang/Object;
/*     */     //   1205: aload #22
/*     */     //   1207: aload #6
/*     */     //   1209: putfield L$3 : Ljava/lang/Object;
/*     */     //   1212: aload #22
/*     */     //   1214: aload #10
/*     */     //   1216: putfield L$4 : Ljava/lang/Object;
/*     */     //   1219: aload #22
/*     */     //   1221: aload #11
/*     */     //   1223: putfield L$5 : Ljava/lang/Object;
/*     */     //   1226: aload #22
/*     */     //   1228: aload #12
/*     */     //   1230: putfield L$6 : Ljava/lang/Object;
/*     */     //   1233: aload #22
/*     */     //   1235: aload #13
/*     */     //   1237: putfield L$7 : Ljava/lang/Object;
/*     */     //   1240: aload #22
/*     */     //   1242: aload #14
/*     */     //   1244: putfield L$8 : Ljava/lang/Object;
/*     */     //   1247: aload #22
/*     */     //   1249: aload #18
/*     */     //   1251: putfield L$9 : Ljava/lang/Object;
/*     */     //   1254: aload #22
/*     */     //   1256: iconst_5
/*     */     //   1257: putfield label : I
/*     */     //   1260: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/Artifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1263: dup
/*     */     //   1264: aload #23
/*     */     //   1266: if_acmpne -> 1378
/*     */     //   1269: aload #23
/*     */     //   1271: areturn
/*     */     //   1272: aload #22
/*     */     //   1274: getfield L$9 : Ljava/lang/Object;
/*     */     //   1277: checkcast com/intellij/ml/llm/matterhorn/Artifact
/*     */     //   1280: astore #18
/*     */     //   1282: aload #22
/*     */     //   1284: getfield L$8 : Ljava/lang/Object;
/*     */     //   1287: checkcast java/lang/String
/*     */     //   1290: astore #14
/*     */     //   1292: aload #22
/*     */     //   1294: getfield L$7 : Ljava/lang/Object;
/*     */     //   1297: checkcast java/lang/String
/*     */     //   1300: astore #13
/*     */     //   1302: aload #22
/*     */     //   1304: getfield L$6 : Ljava/lang/Object;
/*     */     //   1307: checkcast com/intellij/ml/llm/matterhorn/helpers/Stopwatch
/*     */     //   1310: astore #12
/*     */     //   1312: aload #22
/*     */     //   1314: getfield L$5 : Ljava/lang/Object;
/*     */     //   1317: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1320: astore #11
/*     */     //   1322: aload #22
/*     */     //   1324: getfield L$4 : Ljava/lang/Object;
/*     */     //   1327: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutor
/*     */     //   1330: astore #10
/*     */     //   1332: aload #22
/*     */     //   1334: getfield L$3 : Ljava/lang/Object;
/*     */     //   1337: checkcast com/intellij/ml/llm/matterhorn/ArtifactId
/*     */     //   1340: astore #6
/*     */     //   1342: aload #22
/*     */     //   1344: getfield L$2 : Ljava/lang/Object;
/*     */     //   1347: checkcast kotlinx/coroutines/CoroutineScope
/*     */     //   1350: astore #4
/*     */     //   1352: aload #22
/*     */     //   1354: getfield L$1 : Ljava/lang/Object;
/*     */     //   1357: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1360: astore_3
/*     */     //   1361: aload #22
/*     */     //   1363: getfield L$0 : Ljava/lang/Object;
/*     */     //   1366: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   1369: astore_0
/*     */     //   1370: nop
/*     */     //   1371: aload #21
/*     */     //   1373: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1376: aload #21
/*     */     //   1378: pop
/*     */     //   1379: aload #10
/*     */     //   1381: instanceof com/intellij/ml/llm/matterhorn/TeamCityReporter
/*     */     //   1384: ifeq -> 1442
/*     */     //   1387: aload_3
/*     */     //   1388: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   1391: checkcast java/lang/CharSequence
/*     */     //   1394: ldc_w '[FAIL]'
/*     */     //   1397: checkcast java/lang/CharSequence
/*     */     //   1400: iconst_0
/*     */     //   1401: iconst_2
/*     */     //   1402: aconst_null
/*     */     //   1403: invokestatic contains$default : (Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z
/*     */     //   1406: ifeq -> 1427
/*     */     //   1409: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   1412: aload #13
/*     */     //   1414: aload #14
/*     */     //   1416: aload #12
/*     */     //   1418: invokevirtual elapsedTimeMillis : ()J
/*     */     //   1421: invokevirtual testFailed : (Ljava/lang/String;Ljava/lang/String;J)V
/*     */     //   1424: goto -> 1442
/*     */     //   1427: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   1430: aload #13
/*     */     //   1432: aload #14
/*     */     //   1434: aload #12
/*     */     //   1436: invokevirtual elapsedTimeMillis : ()J
/*     */     //   1439: invokevirtual testFinished : (Ljava/lang/String;Ljava/lang/String;J)V
/*     */     //   1442: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   1445: dup
/*     */     //   1446: aload #18
/*     */     //   1448: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   1451: iconst_0
/*     */     //   1452: iconst_2
/*     */     //   1453: aconst_null
/*     */     //   1454: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1457: astore #19
/*     */     //   1459: aload #11
/*     */     //   1461: aload #22
/*     */     //   1463: aload #22
/*     */     //   1465: aload #19
/*     */     //   1467: putfield L$0 : Ljava/lang/Object;
/*     */     //   1470: aload #22
/*     */     //   1472: aconst_null
/*     */     //   1473: putfield L$1 : Ljava/lang/Object;
/*     */     //   1476: aload #22
/*     */     //   1478: aconst_null
/*     */     //   1479: putfield L$2 : Ljava/lang/Object;
/*     */     //   1482: aload #22
/*     */     //   1484: aconst_null
/*     */     //   1485: putfield L$3 : Ljava/lang/Object;
/*     */     //   1488: aload #22
/*     */     //   1490: aconst_null
/*     */     //   1491: putfield L$4 : Ljava/lang/Object;
/*     */     //   1494: aload #22
/*     */     //   1496: aconst_null
/*     */     //   1497: putfield L$5 : Ljava/lang/Object;
/*     */     //   1500: aload #22
/*     */     //   1502: aconst_null
/*     */     //   1503: putfield L$6 : Ljava/lang/Object;
/*     */     //   1506: aload #22
/*     */     //   1508: aconst_null
/*     */     //   1509: putfield L$7 : Ljava/lang/Object;
/*     */     //   1512: aload #22
/*     */     //   1514: aconst_null
/*     */     //   1515: putfield L$8 : Ljava/lang/Object;
/*     */     //   1518: aload #22
/*     */     //   1520: aconst_null
/*     */     //   1521: putfield L$9 : Ljava/lang/Object;
/*     */     //   1524: aload #22
/*     */     //   1526: bipush #6
/*     */     //   1528: putfield label : I
/*     */     //   1531: invokevirtual flushArtifactRequestResponseLog : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1534: dup
/*     */     //   1535: aload #23
/*     */     //   1537: if_acmpne -> 1560
/*     */     //   1540: aload #23
/*     */     //   1542: areturn
/*     */     //   1543: aload #22
/*     */     //   1545: getfield L$0 : Ljava/lang/Object;
/*     */     //   1548: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   1551: astore #19
/*     */     //   1553: aload #21
/*     */     //   1555: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1558: aload #21
/*     */     //   1560: pop
/*     */     //   1561: aload #19
/*     */     //   1563: areturn
/*     */     //   1564: astore #16
/*     */     //   1566: aload #4
/*     */     //   1568: dup
/*     */     //   1569: ifnull -> 1587
/*     */     //   1572: invokestatic isActive : (Lkotlinx/coroutines/CoroutineScope;)Z
/*     */     //   1575: iconst_1
/*     */     //   1576: if_icmpne -> 1583
/*     */     //   1579: iconst_1
/*     */     //   1580: goto -> 1589
/*     */     //   1583: iconst_0
/*     */     //   1584: goto -> 1589
/*     */     //   1587: pop
/*     */     //   1588: iconst_0
/*     */     //   1589: ifne -> 1595
/*     */     //   1592: aload #16
/*     */     //   1594: athrow
/*     */     //   1595: aload #10
/*     */     //   1597: instanceof com/intellij/ml/llm/matterhorn/TeamCityReporter
/*     */     //   1600: ifeq -> 1618
/*     */     //   1603: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   1606: aload #13
/*     */     //   1608: aload #14
/*     */     //   1610: aload #12
/*     */     //   1612: invokevirtual elapsedTimeMillis : ()J
/*     */     //   1615: invokevirtual testFinished : (Ljava/lang/String;Ljava/lang/String;J)V
/*     */     //   1618: new com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   1621: dup
/*     */     //   1622: aload #6
/*     */     //   1624: aload #11
/*     */     //   1626: invokevirtual getStatistics : ()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   1629: aload #12
/*     */     //   1631: invokevirtual elapsedTimeSeconds : ()J
/*     */     //   1634: invokevirtual withTotalTimeSpent : (J)Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   1637: aload #11
/*     */     //   1639: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   1642: aload #11
/*     */     //   1644: invokevirtual getDependencies : ()Ljava/util/List;
/*     */     //   1647: new com/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled
/*     */     //   1650: dup
/*     */     //   1651: aload #16
/*     */     //   1653: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1656: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1659: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Cancelled;)V
/*     */     //   1662: astore #17
/*     */     //   1664: getstatic kotlinx/coroutines/NonCancellable.INSTANCE : Lkotlinx/coroutines/NonCancellable;
/*     */     //   1667: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   1670: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$getOrCreateArtifact$2
/*     */     //   1673: dup
/*     */     //   1674: aload_3
/*     */     //   1675: aload #17
/*     */     //   1677: aload #11
/*     */     //   1679: aconst_null
/*     */     //   1680: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   1683: checkcast kotlin/jvm/functions/Function2
/*     */     //   1686: aload #22
/*     */     //   1688: aload #22
/*     */     //   1690: aload #11
/*     */     //   1692: putfield L$0 : Ljava/lang/Object;
/*     */     //   1695: aload #22
/*     */     //   1697: aload #17
/*     */     //   1699: putfield L$1 : Ljava/lang/Object;
/*     */     //   1702: aload #22
/*     */     //   1704: aconst_null
/*     */     //   1705: putfield L$2 : Ljava/lang/Object;
/*     */     //   1708: aload #22
/*     */     //   1710: aconst_null
/*     */     //   1711: putfield L$3 : Ljava/lang/Object;
/*     */     //   1714: aload #22
/*     */     //   1716: aconst_null
/*     */     //   1717: putfield L$4 : Ljava/lang/Object;
/*     */     //   1720: aload #22
/*     */     //   1722: aconst_null
/*     */     //   1723: putfield L$5 : Ljava/lang/Object;
/*     */     //   1726: aload #22
/*     */     //   1728: aconst_null
/*     */     //   1729: putfield L$6 : Ljava/lang/Object;
/*     */     //   1732: aload #22
/*     */     //   1734: aconst_null
/*     */     //   1735: putfield L$7 : Ljava/lang/Object;
/*     */     //   1738: aload #22
/*     */     //   1740: aconst_null
/*     */     //   1741: putfield L$8 : Ljava/lang/Object;
/*     */     //   1744: aload #22
/*     */     //   1746: aconst_null
/*     */     //   1747: putfield L$9 : Ljava/lang/Object;
/*     */     //   1750: aload #22
/*     */     //   1752: bipush #7
/*     */     //   1754: putfield label : I
/*     */     //   1757: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1760: dup
/*     */     //   1761: aload #23
/*     */     //   1763: if_acmpne -> 1797
/*     */     //   1766: aload #23
/*     */     //   1768: areturn
/*     */     //   1769: aload #22
/*     */     //   1771: getfield L$1 : Ljava/lang/Object;
/*     */     //   1774: checkcast com/intellij/ml/llm/matterhorn/CancelledArtifact
/*     */     //   1777: astore #17
/*     */     //   1779: aload #22
/*     */     //   1781: getfield L$0 : Ljava/lang/Object;
/*     */     //   1784: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   1787: astore #11
/*     */     //   1789: nop
/*     */     //   1790: aload #21
/*     */     //   1792: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1795: aload #21
/*     */     //   1797: pop
/*     */     //   1798: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   1801: dup
/*     */     //   1802: aload #17
/*     */     //   1804: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   1807: iconst_0
/*     */     //   1808: iconst_2
/*     */     //   1809: aconst_null
/*     */     //   1810: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1813: astore #18
/*     */     //   1815: aload #11
/*     */     //   1817: aload #22
/*     */     //   1819: aload #22
/*     */     //   1821: aload #18
/*     */     //   1823: putfield L$0 : Ljava/lang/Object;
/*     */     //   1826: aload #22
/*     */     //   1828: aconst_null
/*     */     //   1829: putfield L$1 : Ljava/lang/Object;
/*     */     //   1832: aload #22
/*     */     //   1834: bipush #8
/*     */     //   1836: putfield label : I
/*     */     //   1839: invokevirtual flushArtifactRequestResponseLog : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1842: dup
/*     */     //   1843: aload #23
/*     */     //   1845: if_acmpne -> 1868
/*     */     //   1848: aload #23
/*     */     //   1850: areturn
/*     */     //   1851: aload #22
/*     */     //   1853: getfield L$0 : Ljava/lang/Object;
/*     */     //   1856: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   1859: astore #18
/*     */     //   1861: aload #21
/*     */     //   1863: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1866: aload #21
/*     */     //   1868: pop
/*     */     //   1869: aload #18
/*     */     //   1871: areturn
/*     */     //   1872: astore #16
/*     */     //   1874: getstatic com/intellij/ml/llm/matterhorn/LLMPaymentRequiredException.Companion : Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException$Companion;
/*     */     //   1877: aload #16
/*     */     //   1879: invokevirtual fromException : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   1882: astore #17
/*     */     //   1884: aload #17
/*     */     //   1886: ifnull -> 1915
/*     */     //   1889: iconst_0
/*     */     //   1890: istore #18
/*     */     //   1892: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   1894: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1897: dup
/*     */     //   1898: ldc_w 'getInstance(...)'
/*     */     //   1901: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1904: aload #17
/*     */     //   1906: checkcast java/lang/Throwable
/*     */     //   1909: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   1912: goto -> 1972
/*     */     //   1915: aload #16
/*     */     //   1917: instanceof com/intellij/ml/llm/matterhorn/ShellExecutor$ShellInitException
/*     */     //   1920: ifeq -> 1949
/*     */     //   1923: iconst_0
/*     */     //   1924: istore #18
/*     */     //   1926: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   1928: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1931: dup
/*     */     //   1932: ldc_w 'getInstance(...)'
/*     */     //   1935: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1938: aload #16
/*     */     //   1940: checkcast java/lang/Throwable
/*     */     //   1943: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   1946: goto -> 1972
/*     */     //   1949: iconst_0
/*     */     //   1950: istore #18
/*     */     //   1952: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */     //   1954: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1957: dup
/*     */     //   1958: ldc_w 'getInstance(...)'
/*     */     //   1961: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1964: aload #16
/*     */     //   1966: checkcast java/lang/Throwable
/*     */     //   1969: invokevirtual error : (Ljava/lang/Throwable;)V
/*     */     //   1972: aload #10
/*     */     //   1974: instanceof com/intellij/ml/llm/matterhorn/TeamCityReporter
/*     */     //   1977: ifeq -> 2021
/*     */     //   1980: aload #16
/*     */     //   1982: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1985: dup
/*     */     //   1986: ifnonnull -> 1993
/*     */     //   1989: pop
/*     */     //   1990: ldc_w ''
/*     */     //   1993: astore #18
/*     */     //   1995: aload #16
/*     */     //   1997: invokestatic exceptionToString : (Ljava/lang/Exception;)Ljava/lang/String;
/*     */     //   2000: astore #19
/*     */     //   2002: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   2005: aload #13
/*     */     //   2007: aload #14
/*     */     //   2009: aload #18
/*     */     //   2011: aload #19
/*     */     //   2013: aload #12
/*     */     //   2015: invokevirtual elapsedTimeMillis : ()J
/*     */     //   2018: invokevirtual testFailed : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V
/*     */     //   2021: aload_0
/*     */     //   2022: aload #16
/*     */     //   2024: invokespecial getFailureReason : (Ljava/lang/Exception;)Lcom/intellij/ml/llm/matterhorn/FailureReason;
/*     */     //   2027: astore #18
/*     */     //   2029: new com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   2032: dup
/*     */     //   2033: aload #6
/*     */     //   2035: aload #11
/*     */     //   2037: invokevirtual getStatistics : ()Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   2040: aload #12
/*     */     //   2042: invokevirtual elapsedTimeSeconds : ()J
/*     */     //   2045: invokevirtual withTotalTimeSpent : (J)Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;
/*     */     //   2048: aload #11
/*     */     //   2050: invokevirtual getTitle : ()Ljava/lang/String;
/*     */     //   2053: aload #11
/*     */     //   2055: invokevirtual getDependencies : ()Ljava/util/List;
/*     */     //   2058: new com/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure
/*     */     //   2061: dup
/*     */     //   2062: aload #18
/*     */     //   2064: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/FailureReason;)V
/*     */     //   2067: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lcom/intellij/ml/llm/matterhorn/ArtifactStatistic;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;)V
/*     */     //   2070: astore #19
/*     */     //   2072: aload_3
/*     */     //   2073: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   2076: aload #19
/*     */     //   2078: aload #22
/*     */     //   2080: aload #22
/*     */     //   2082: aload #11
/*     */     //   2084: putfield L$0 : Ljava/lang/Object;
/*     */     //   2087: aload #22
/*     */     //   2089: aload #19
/*     */     //   2091: putfield L$1 : Ljava/lang/Object;
/*     */     //   2094: aload #22
/*     */     //   2096: aconst_null
/*     */     //   2097: putfield L$2 : Ljava/lang/Object;
/*     */     //   2100: aload #22
/*     */     //   2102: aconst_null
/*     */     //   2103: putfield L$3 : Ljava/lang/Object;
/*     */     //   2106: aload #22
/*     */     //   2108: aconst_null
/*     */     //   2109: putfield L$4 : Ljava/lang/Object;
/*     */     //   2112: aload #22
/*     */     //   2114: aconst_null
/*     */     //   2115: putfield L$5 : Ljava/lang/Object;
/*     */     //   2118: aload #22
/*     */     //   2120: aconst_null
/*     */     //   2121: putfield L$6 : Ljava/lang/Object;
/*     */     //   2124: aload #22
/*     */     //   2126: aconst_null
/*     */     //   2127: putfield L$7 : Ljava/lang/Object;
/*     */     //   2130: aload #22
/*     */     //   2132: aconst_null
/*     */     //   2133: putfield L$8 : Ljava/lang/Object;
/*     */     //   2136: aload #22
/*     */     //   2138: aconst_null
/*     */     //   2139: putfield L$9 : Ljava/lang/Object;
/*     */     //   2142: aload #22
/*     */     //   2144: bipush #9
/*     */     //   2146: putfield label : I
/*     */     //   2149: invokevirtual registerArtifact : (Lcom/intellij/ml/llm/matterhorn/FailedArtifact;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2152: dup
/*     */     //   2153: aload #23
/*     */     //   2155: if_acmpne -> 2189
/*     */     //   2158: aload #23
/*     */     //   2160: areturn
/*     */     //   2161: aload #22
/*     */     //   2163: getfield L$1 : Ljava/lang/Object;
/*     */     //   2166: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   2169: astore #19
/*     */     //   2171: aload #22
/*     */     //   2173: getfield L$0 : Ljava/lang/Object;
/*     */     //   2176: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2179: astore #11
/*     */     //   2181: nop
/*     */     //   2182: aload #21
/*     */     //   2184: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2187: aload #21
/*     */     //   2189: pop
/*     */     //   2190: aload #11
/*     */     //   2192: aload #19
/*     */     //   2194: invokevirtual getId : ()Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   2197: aload #22
/*     */     //   2199: aload #22
/*     */     //   2201: aload #11
/*     */     //   2203: putfield L$0 : Ljava/lang/Object;
/*     */     //   2206: aload #22
/*     */     //   2208: aload #19
/*     */     //   2210: putfield L$1 : Ljava/lang/Object;
/*     */     //   2213: aload #22
/*     */     //   2215: bipush #10
/*     */     //   2217: putfield label : I
/*     */     //   2220: invokevirtual dumpSourceCode : (Lcom/intellij/ml/llm/matterhorn/ArtifactId;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2223: dup
/*     */     //   2224: aload #23
/*     */     //   2226: if_acmpne -> 2260
/*     */     //   2229: aload #23
/*     */     //   2231: areturn
/*     */     //   2232: aload #22
/*     */     //   2234: getfield L$1 : Ljava/lang/Object;
/*     */     //   2237: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   2240: astore #19
/*     */     //   2242: aload #22
/*     */     //   2244: getfield L$0 : Ljava/lang/Object;
/*     */     //   2247: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2250: astore #11
/*     */     //   2252: nop
/*     */     //   2253: aload #21
/*     */     //   2255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2258: aload #21
/*     */     //   2260: pop
/*     */     //   2261: aload #11
/*     */     //   2263: aload #19
/*     */     //   2265: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   2268: aload #22
/*     */     //   2270: aload #22
/*     */     //   2272: aload #11
/*     */     //   2274: putfield L$0 : Ljava/lang/Object;
/*     */     //   2277: aload #22
/*     */     //   2279: aload #19
/*     */     //   2281: putfield L$1 : Ljava/lang/Object;
/*     */     //   2284: aload #22
/*     */     //   2286: bipush #11
/*     */     //   2288: putfield label : I
/*     */     //   2291: invokevirtual dumpArtifactTextRepresentation : (Lcom/intellij/ml/llm/matterhorn/Artifactual;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2294: dup
/*     */     //   2295: aload #23
/*     */     //   2297: if_acmpne -> 2331
/*     */     //   2300: aload #23
/*     */     //   2302: areturn
/*     */     //   2303: aload #22
/*     */     //   2305: getfield L$1 : Ljava/lang/Object;
/*     */     //   2308: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */     //   2311: astore #19
/*     */     //   2313: aload #22
/*     */     //   2315: getfield L$0 : Ljava/lang/Object;
/*     */     //   2318: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   2321: astore #11
/*     */     //   2323: nop
/*     */     //   2324: aload #21
/*     */     //   2326: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2329: aload #21
/*     */     //   2331: pop
/*     */     //   2332: new com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   2335: dup
/*     */     //   2336: aload #19
/*     */     //   2338: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */     //   2341: iconst_0
/*     */     //   2342: iconst_2
/*     */     //   2343: aconst_null
/*     */     //   2344: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/Artifactual;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   2347: astore #20
/*     */     //   2349: aload #11
/*     */     //   2351: aload #22
/*     */     //   2353: aload #22
/*     */     //   2355: aload #20
/*     */     //   2357: putfield L$0 : Ljava/lang/Object;
/*     */     //   2360: aload #22
/*     */     //   2362: aconst_null
/*     */     //   2363: putfield L$1 : Ljava/lang/Object;
/*     */     //   2366: aload #22
/*     */     //   2368: bipush #12
/*     */     //   2370: putfield label : I
/*     */     //   2373: invokevirtual flushArtifactRequestResponseLog : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2376: dup
/*     */     //   2377: aload #23
/*     */     //   2379: if_acmpne -> 2402
/*     */     //   2382: aload #23
/*     */     //   2384: areturn
/*     */     //   2385: aload #22
/*     */     //   2387: getfield L$0 : Ljava/lang/Object;
/*     */     //   2390: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService$ArtifactResult
/*     */     //   2393: astore #20
/*     */     //   2395: aload #21
/*     */     //   2397: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2400: aload #21
/*     */     //   2402: pop
/*     */     //   2403: aload #20
/*     */     //   2405: areturn
/*     */     //   2406: astore #16
/*     */     //   2408: aload #11
/*     */     //   2410: aload #22
/*     */     //   2412: aload #22
/*     */     //   2414: aload #16
/*     */     //   2416: putfield L$0 : Ljava/lang/Object;
/*     */     //   2419: aload #22
/*     */     //   2421: aconst_null
/*     */     //   2422: putfield L$1 : Ljava/lang/Object;
/*     */     //   2425: aload #22
/*     */     //   2427: aconst_null
/*     */     //   2428: putfield L$2 : Ljava/lang/Object;
/*     */     //   2431: aload #22
/*     */     //   2433: aconst_null
/*     */     //   2434: putfield L$3 : Ljava/lang/Object;
/*     */     //   2437: aload #22
/*     */     //   2439: aconst_null
/*     */     //   2440: putfield L$4 : Ljava/lang/Object;
/*     */     //   2443: aload #22
/*     */     //   2445: aconst_null
/*     */     //   2446: putfield L$5 : Ljava/lang/Object;
/*     */     //   2449: aload #22
/*     */     //   2451: aconst_null
/*     */     //   2452: putfield L$6 : Ljava/lang/Object;
/*     */     //   2455: aload #22
/*     */     //   2457: aconst_null
/*     */     //   2458: putfield L$7 : Ljava/lang/Object;
/*     */     //   2461: aload #22
/*     */     //   2463: aconst_null
/*     */     //   2464: putfield L$8 : Ljava/lang/Object;
/*     */     //   2467: aload #22
/*     */     //   2469: aconst_null
/*     */     //   2470: putfield L$9 : Ljava/lang/Object;
/*     */     //   2473: aload #22
/*     */     //   2475: bipush #13
/*     */     //   2477: putfield label : I
/*     */     //   2480: invokevirtual flushArtifactRequestResponseLog : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2483: dup
/*     */     //   2484: aload #23
/*     */     //   2486: if_acmpne -> 2509
/*     */     //   2489: aload #23
/*     */     //   2491: areturn
/*     */     //   2492: aload #22
/*     */     //   2494: getfield L$0 : Ljava/lang/Object;
/*     */     //   2497: checkcast java/lang/Throwable
/*     */     //   2500: astore #16
/*     */     //   2502: aload #21
/*     */     //   2504: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2507: aload #21
/*     */     //   2509: pop
/*     */     //   2510: aload #16
/*     */     //   2512: athrow
/*     */     //   2513: new java/lang/IllegalStateException
/*     */     //   2516: dup
/*     */     //   2517: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   2519: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   2522: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #205	-> 63
/*     */     //   #206	-> 145
/*     */     //   #208	-> 151
/*     */     //   #205	-> 210
/*     */     //   #210	-> 281
/*     */     //   #211	-> 301
/*     */     //   #212	-> 311
/*     */     //   #215	-> 322
/*     */     //   #216	-> 334
/*     */     //   #217	-> 339
/*     */     //   #220	-> 357
/*     */     //   #219	-> 359
/*     */     //   #221	-> 361
/*     */     //   #223	-> 369
/*     */     //   #224	-> 379
/*     */     //   #225	-> 396
/*     */     //   #227	-> 400
/*     */     //   #228	-> 401
/*     */     //   #230	-> 408
/*     */     //   #232	-> 432
/*     */     //   #233	-> 440
/*     */     //   #236	-> 450
/*     */     //   #238	-> 471
/*     */     //   #205	-> 565
/*     */     //   #239	-> 678
/*     */     //   #240	-> 699
/*     */     //   #241	-> 718
/*     */     //   #242	-> 722
/*     */     //   #243	-> 724
/*     */     //   #244	-> 737
/*     */     //   #245	-> 742
/*     */     //   #246	-> 744
/*     */     //   #247	-> 749
/*     */     //   #248	-> 764
/*     */     //   #241	-> 769
/*     */     //   #250	-> 774
/*     */     //   #205	-> 866
/*     */     //   #251	-> 975
/*     */     //   #205	-> 1068
/*     */     //   #253	-> 1177
/*     */     //   #205	-> 1269
/*     */     //   #255	-> 1378
/*     */     //   #256	-> 1387
/*     */     //   #257	-> 1409
/*     */     //   #259	-> 1427
/*     */     //   #262	-> 1442
/*     */     //   #322	-> 1459
/*     */     //   #205	-> 1540
/*     */     //   #262	-> 1560
/*     */     //   #264	-> 1564
/*     */     //   #266	-> 1566
/*     */     //   #267	-> 1592
/*     */     //   #269	-> 1595
/*     */     //   #270	-> 1603
/*     */     //   #273	-> 1618
/*     */     //   #274	-> 1622
/*     */     //   #275	-> 1624
/*     */     //   #276	-> 1637
/*     */     //   #277	-> 1642
/*     */     //   #278	-> 1647
/*     */     //   #273	-> 1659
/*     */     //   #281	-> 1664
/*     */     //   #205	-> 1766
/*     */     //   #287	-> 1797
/*     */     //   #322	-> 1815
/*     */     //   #205	-> 1848
/*     */     //   #287	-> 1868
/*     */     //   #289	-> 1872
/*     */     //   #290	-> 1874
/*     */     //   #291	-> 1884
/*     */     //   #292	-> 1889
/*     */     //   #384	-> 1892
/*     */     //   #292	-> 1904
/*     */     //   #293	-> 1915
/*     */     //   #294	-> 1923
/*     */     //   #385	-> 1926
/*     */     //   #294	-> 1938
/*     */     //   #296	-> 1949
/*     */     //   #386	-> 1952
/*     */     //   #296	-> 1964
/*     */     //   #299	-> 1972
/*     */     //   #300	-> 1980
/*     */     //   #301	-> 1995
/*     */     //   #303	-> 2002
/*     */     //   #306	-> 2021
/*     */     //   #307	-> 2029
/*     */     //   #308	-> 2033
/*     */     //   #309	-> 2035
/*     */     //   #310	-> 2048
/*     */     //   #311	-> 2053
/*     */     //   #312	-> 2058
/*     */     //   #307	-> 2067
/*     */     //   #315	-> 2072
/*     */     //   #205	-> 2158
/*     */     //   #316	-> 2189
/*     */     //   #205	-> 2229
/*     */     //   #317	-> 2260
/*     */     //   #205	-> 2300
/*     */     //   #319	-> 2331
/*     */     //   #322	-> 2349
/*     */     //   #205	-> 2382
/*     */     //   #319	-> 2402
/*     */     //   #322	-> 2406
/*     */     //   #205	-> 2489
/*     */     //   #322	-> 2509
/*     */     //   #205	-> 2513
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   145	68	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   269	42	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   322	17	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   357	211	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   665	204	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   967	104	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1169	103	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1370	89	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1872	32	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1904	34	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1938	26	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   1964	65	0	this	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */     //   145	68	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   260	51	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   322	17	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   357	211	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   656	62	1	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */     //   145	68	2	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   251	60	2	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   322	17	2	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   357	12	2	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */     //   145	68	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   242	69	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   322	17	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   357	211	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   647	222	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   958	113	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1160	112	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1361	98	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1564	28	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1595	165	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1872	32	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1904	34	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1938	26	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1964	188	3	context	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   145	68	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   233	78	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   322	17	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   357	211	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   638	231	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   949	122	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1151	121	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1352	107	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   1564	19	4	supervisorScope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   151	62	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   223	88	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   322	35	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   357	211	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   628	241	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   939	132	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1141	131	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1342	117	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1564	28	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1595	29	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1872	32	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1904	34	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1938	26	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   1964	71	6	artifactId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   281	41	7	cached	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */     //   301	10	8	shouldRecreate	Z
/*     */     //   334	5	9	executorUnsafe	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   357	2	9	executorUnsafe	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   361	207	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   618	251	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   929	142	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1131	141	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1332	127	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1564	28	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1595	8	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1872	32	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1904	34	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1938	26	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   1964	16	10	executor	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutor;
/*     */     //   369	199	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   608	261	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   919	152	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1121	151	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1322	212	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1564	205	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1789	53	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1872	32	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1904	34	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1938	26	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1964	197	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2181	51	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2252	51	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2323	53	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   2406	77	11	subContext	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   379	189	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   598	271	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   909	162	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1111	161	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1312	147	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1564	28	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1595	42	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1872	32	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1904	34	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1938	26	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   1964	84	12	stopwatch	Lcom/intellij/ml/llm/matterhorn/helpers/Stopwatch;
/*     */     //   396	172	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   588	281	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   899	172	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1101	171	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1302	157	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1564	28	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1595	23	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1872	32	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1904	34	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1938	26	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   1964	57	13	teamCityTestCase	Ljava/lang/String;
/*     */     //   400	168	14	flowId	Ljava/lang/String;
/*     */     //   578	291	14	flowId	Ljava/lang/String;
/*     */     //   889	182	14	flowId	Ljava/lang/String;
/*     */     //   1091	181	14	flowId	Ljava/lang/String;
/*     */     //   1292	167	14	flowId	Ljava/lang/String;
/*     */     //   1564	28	14	flowId	Ljava/lang/String;
/*     */     //   1595	23	14	flowId	Ljava/lang/String;
/*     */     //   1872	32	14	flowId	Ljava/lang/String;
/*     */     //   1904	34	14	flowId	Ljava/lang/String;
/*     */     //   1938	26	14	flowId	Ljava/lang/String;
/*     */     //   1964	57	14	flowId	Ljava/lang/String;
/*     */     //   408	24	15	requestId	Lcom/intellij/ml/llm/matterhorn/ArtifactId;
/*     */     //   678	91	16	response	Lcom/intellij/ml/llm/matterhorn/ArtifactResponse;
/*     */     //   1566	29	16	e	Ljava/util/concurrent/CancellationException;
/*     */     //   1595	64	16	e	Ljava/util/concurrent/CancellationException;
/*     */     //   1874	30	16	e	Ljava/lang/Exception;
/*     */     //   1904	34	16	e	Ljava/lang/Exception;
/*     */     //   1938	26	16	e	Ljava/lang/Exception;
/*     */     //   1964	65	16	e	Ljava/lang/Exception;
/*     */     //   718	26	17	descriptionText	Ljava/lang/String;
/*     */     //   1664	105	17	cancelledArtifact	Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;
/*     */     //   1779	36	17	cancelledArtifact	Lcom/intellij/ml/llm/matterhorn/CancelledArtifact;
/*     */     //   1884	20	17	paymentError	Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   1904	11	17	paymentError	Lcom/intellij/ml/llm/matterhorn/LLMPaymentRequiredException;
/*     */     //   774	95	18	requestedArtifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   879	192	18	requestedArtifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   1081	191	18	requestedArtifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   1282	177	18	requestedArtifact	Lcom/intellij/ml/llm/matterhorn/Artifact;
/*     */     //   1995	26	18	message	Ljava/lang/String;
/*     */     //   2029	38	18	reason	Lcom/intellij/ml/llm/matterhorn/FailureReason;
/*     */     //   2002	19	19	details	Ljava/lang/String;
/*     */     //   2072	89	19	failedArtifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   2171	61	19	failedArtifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   2242	61	19	failedArtifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   2313	36	19	failedArtifact	Lcom/intellij/ml/llm/matterhorn/FailedArtifact;
/*     */     //   1892	12	18	$i$f$logger	I
/*     */     //   1926	12	18	$i$f$logger	I
/*     */     //   1952	12	18	$i$f$logger	I
/*     */     //   0	2523	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	2460	22	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	2453	21	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   400	559	1564	java/util/concurrent/CancellationException
/*     */     //   400	559	1872	java/lang/Exception
/*     */     //   400	559	2406	finally
/*     */     //   665	860	1564	java/util/concurrent/CancellationException
/*     */     //   665	860	1872	java/lang/Exception
/*     */     //   665	860	2406	finally
/*     */     //   967	1062	1564	java/util/concurrent/CancellationException
/*     */     //   967	1062	1872	java/lang/Exception
/*     */     //   967	1062	2406	finally
/*     */     //   1169	1263	1564	java/util/concurrent/CancellationException
/*     */     //   1169	1263	1872	java/lang/Exception
/*     */     //   1169	1263	2406	finally
/*     */     //   1370	1459	1564	java/util/concurrent/CancellationException
/*     */     //   1370	1459	1872	java/lang/Exception
/*     */     //   1370	1459	2406	finally
/*     */     //   1564	1760	2406	finally
/*     */     //   1789	1815	2406	finally
/*     */     //   1872	2152	2406	finally
/*     */     //   2181	2223	2406	finally
/*     */     //   2252	2294	2406	finally
/*     */     //   2323	2349	2406	finally
/*     */     //   2406	2408	2406	finally
/*     */   }
/*     */   @DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {193}, i = {0, 0, 0, 0}, s = {"L$0", "L$1", "L$2", "L$3"}, n = {"this", "type", "context", "relativePath"}, m = "getArtifact", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ArtifactRequestExecutorService$getArtifact$2<O> extends ContinuationImpl { Object L$0; Object L$1; Object L$2; Object L$3; int label;
/*     */     ArtifactRequestExecutorService$getArtifact$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ArtifactRequestExecutorService.this.getArtifact((ArtifactType<?>)null, (ExecutionContext)null, (Continuation<? super Artifactual>)this);
/*     */     } }
/*     */   @DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {154, 164, 165, 166}, i = {0, 0, 1, 2, 3}, s = {"L$0", "L$1", "L$0", "L$0", "L$0"}, n = {"this", "context", "artifact", "artifact", "artifact"}, m = "getArtifactCore", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ArtifactRequestExecutorService$getArtifactCore$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; int label;
/*     */     ArtifactRequestExecutorService$getArtifactCore$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ArtifactRequestExecutorService.this.getArtifactCore(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {208, 238, 250, 251, 253, 322, 281, 322, 315, 316, 317, 322, 322}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 6, 6, 8, 8, 9, 9, 10, 10}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, n = {"this", "request", "source", "context", "supervisorScope", "artifactId", "this", "request", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "this", "context", "supervisorScope", "artifactId", "executor", "subContext", "stopwatch", "teamCityTestCase", "flowId", "requestedArtifact", "subContext", "cancelledArtifact", "subContext", "failedArtifact", "subContext", "failedArtifact", "subContext", "failedArtifact"}, m = "getOrCreateArtifact", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class ArtifactRequestExecutorService$getOrCreateArtifact$1<I, O> extends ContinuationImpl { Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     Object L$9;
/*     */     int label;
/*     */     
/*     */     ArtifactRequestExecutorService$getOrCreateArtifact$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return ArtifactRequestExecutorService.this.getOrCreateArtifact(null, null, null, null, (Continuation<? super ArtifactRequestExecutorService.ArtifactResult>)this);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "ArtifactRequestExecutorService.kt", l = {282, 283, 284}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService$getOrCreateArtifact$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class ArtifactRequestExecutorService$getOrCreateArtifact$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { public final Object invokeSuspend(Object $result) {
/* 281 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 282 */           this.label = 1; if (this.$context.getRoot().registerArtifact(this.$cancelledArtifact, (Continuation<? super Unit>)this) == object) return object;  this.$context.getRoot().registerArtifact(this.$cancelledArtifact, (Continuation<? super Unit>)this);
/* 283 */           this.label = 2; if (this.$subContext.dumpSourceCode(this.$cancelledArtifact.getId(), (Continuation<? super Unit>)this) == object) return object;  this.$subContext.dumpSourceCode(this.$cancelledArtifact.getId(), (Continuation<? super Unit>)this);
/* 284 */           this.label = 3; if (this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this) == object) return object;  this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this);
/* 285 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 2; if (this.$subContext.dumpSourceCode(this.$cancelledArtifact.getId(), (Continuation<? super Unit>)this) == object) return object;  this.$subContext.dumpSourceCode(this.$cancelledArtifact.getId(), (Continuation<? super Unit>)this); this.label = 3; if (this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this) == object) return object;  this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 2: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 3; if (this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this) == object) return object;  this.$subContext.dumpArtifactTextRepresentation(this.$cancelledArtifact, (Continuation<? super Unit>)this); return Unit.INSTANCE;case 3: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     int label;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     ArtifactRequestExecutorService$getOrCreateArtifact$2(ExecutionContext $context, CancelledArtifact $cancelledArtifact, ExecutionContext $subContext, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super ArtifactRequestExecutorService$getOrCreateArtifact$2> $completion) {
/*     */       return (Continuation<Unit>)new ArtifactRequestExecutorService$getOrCreateArtifact$2(this.$context, this.$cancelledArtifact, this.$subContext, $completion);
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((ArtifactRequestExecutorService$getOrCreateArtifact$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final FailureReason getFailureReason(Exception e) {
/* 327 */     Exception exception = e;
/* 328 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 329 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 330 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 331 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 332 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 333 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 334 */     if (e.getMessage() == null) e.getMessage();  super("");
/*     */     
/* 336 */     if (e.getMessage() == null) e.getMessage();  super("");
/* 337 */     if (e.getMessage() == null) e.getMessage();  super(""); return (exception instanceof CostLimitExceededException) ? new FailureReason.CostExceeded() : ((exception instanceof TooManyAttemptsWithoutSuccessException) ? new FailureReason.FormatError() : ((exception instanceof io.ktor.client.plugins.HttpRequestTimeoutException) ? new FailureReason.InferenceServerTimeout() : ((exception instanceof LLMPaymentRequiredException) ? new FailureReason.PaymentRequired() : ((exception instanceof LLMBadResponseException) ? new FailureReason.BadResponseException() : ((exception instanceof LLMContextLengthExceeded) ? new FailureReason.ContextLengthExceeded() : ((exception instanceof LLMCountryForbiddenException) ? new FailureReason.CountryForbidden() : ((exception instanceof FailedDependencyException) ? ((FailedDependencyException)e).getArtifact().getReasoning().getReason() : ((exception instanceof ShellExecutor.ShellInitException) ? new FailureReason.ProblemsWithShell() : new FailureReason.UnexpectedException()))))))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactRequestExecutorService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */