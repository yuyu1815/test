/*     */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*     */ 
/*     */ import com.intellij.openapi.module.Module;
/*     */ import com.intellij.openapi.module.ModuleManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.projectRoots.ProjectJdkTable;
/*     */ import com.intellij.openapi.projectRoots.Sdk;
/*     */ import com.intellij.openapi.projectRoots.SdkAdditionalData;
/*     */ import com.intellij.openapi.roots.ModuleRootModificationUtil;
/*     */ import com.intellij.openapi.roots.ProjectRootManager;
/*     */ import com.jetbrains.python.sdk.PyTransferredSdkRootsKt;
/*     */ import com.jetbrains.python.sdk.flavors.conda.PyCondaEnvIdentity;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\030\000 \0272\0020\001:\001\027B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\030\020\n\032\004\030\0010\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\b\020\017\032\0020\003H\026J\026\020\020\032\n\022\004\022\0020\022\030\0010\021H@¢\006\002\020\023J\020\020\024\032\0020\0252\006\020\026\032\0020\013H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "", "condaBinaries", "", "condaEnvName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCondaBinaries", "()Ljava/lang/String;", "getCondaEnvName", "setupSdkForCondaEnvironment", "Lcom/intellij/openapi/projectRoots/Sdk;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "detectCondaEnvironments", "", "Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCondaSdk", "", "sdk", "Companion", "ej-pycharm"})
/*     */ @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,171:1\n295#2,2:172\n1557#2:174\n1628#2,3:175\n13409#3,2:178\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround\n*L\n122#1:172,2\n163#1:174\n163#1:175,3\n143#1:178,2\n*E\n"})
/*     */ public final class SetupExistingCondaInterpreterWorkaround
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final String condaBinaries;
/*     */   @NotNull
/*     */   private final String condaEnvName;
/*     */   @NotNull
/*     */   public static final String CONDA_BINARIES_ENV_VAR = "CONDA_BINARIES";
/*     */   @NotNull
/*     */   public static final String CONDA_ENV_NAME_ENV_VAR = "CONDA_ENV_NAME";
/*     */   
/*     */   public SetupExistingCondaInterpreterWorkaround(@NotNull String condaBinaries, @NotNull String condaEnvName) {
/*  98 */     this.condaBinaries = condaBinaries; this.condaEnvName = condaEnvName; } @NotNull public final String getCondaBinaries() { return this.condaBinaries; } @NotNull public final String getCondaEnvName() { return this.condaEnvName; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\007\032\004\030\0010\bR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;", "", "<init>", "()V", "CONDA_BINARIES_ENV_VAR", "", "CONDA_ENV_NAME_ENV_VAR", "fromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "ej-pycharm"})
/*     */   @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,171:1\n61#2,5:172\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n*L\n109#1:172,5\n*E\n"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     @Nullable
/*     */     public final CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround fromEnvironment() {
/*     */       // Byte code:
/*     */       //   0: ldc 'CONDA_BINARIES'
/*     */       //   2: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   5: astore_1
/*     */       //   6: ldc 'CONDA_ENV_NAME'
/*     */       //   8: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   11: astore_2
/*     */       //   12: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */       //   15: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   18: astore_3
/*     */       //   19: aconst_null
/*     */       //   20: astore #4
/*     */       //   22: iconst_0
/*     */       //   23: istore #5
/*     */       //   25: aload_3
/*     */       //   26: invokevirtual isDebugEnabled : ()Z
/*     */       //   29: ifeq -> 53
/*     */       //   32: aload_3
/*     */       //   33: astore #7
/*     */       //   35: iconst_0
/*     */       //   36: istore #6
/*     */       //   38: aload_1
/*     */       //   39: aload_2
/*     */       //   40: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */       //   45: aload #7
/*     */       //   47: swap
/*     */       //   48: aload #4
/*     */       //   50: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   53: nop
/*     */       //   54: aload_1
/*     */       //   55: ifnull -> 62
/*     */       //   58: aload_2
/*     */       //   59: ifnonnull -> 64
/*     */       //   62: aconst_null
/*     */       //   63: areturn
/*     */       //   64: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround
/*     */       //   67: dup
/*     */       //   68: aload_1
/*     */       //   69: aload_2
/*     */       //   70: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   73: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #106	-> 0
/*     */       //   #107	-> 6
/*     */       //   #109	-> 12
/*     */       //   #172	-> 19
/*     */       //   #173	-> 25
/*     */       //   #174	-> 32
/*     */       //   #110	-> 38
/*     */       //   #174	-> 48
/*     */       //   #176	-> 53
/*     */       //   #113	-> 54
/*     */       //   #115	-> 64
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   38	7	6	$i$a$-debug$default-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion$fromEnvironment$1	I
/*     */       //   25	29	5	$i$f$debug	I
/*     */       //   19	35	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   22	32	4	e$iv	Ljava/lang/Exception;
/*     */       //   6	68	1	condaBinaries	Ljava/lang/String;
/*     */       //   12	62	2	condaEnvName	Ljava/lang/String;
/*     */       //   0	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object setupSdkForCondaEnvironment(@NotNull Project project, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */     //   11: astore #13
/*     */     //   13: aload #13
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #13
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #13
/*     */     //   50: aload #13
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #12
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #13
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 452, 0 -> 96, 1 -> 134, 2 -> 354, 3 -> 431
/*     */     //   96: aload #12
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload #13
/*     */     //   104: aload #13
/*     */     //   106: aload_0
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #13
/*     */     //   112: aload_1
/*     */     //   113: putfield L$1 : Ljava/lang/Object;
/*     */     //   116: aload #13
/*     */     //   118: iconst_1
/*     */     //   119: putfield label : I
/*     */     //   122: invokespecial detectCondaEnvironments : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   125: dup
/*     */     //   126: aload #14
/*     */     //   128: if_acmpne -> 159
/*     */     //   131: aload #14
/*     */     //   133: areturn
/*     */     //   134: aload #13
/*     */     //   136: getfield L$1 : Ljava/lang/Object;
/*     */     //   139: checkcast com/intellij/openapi/project/Project
/*     */     //   142: astore_1
/*     */     //   143: aload #13
/*     */     //   145: getfield L$0 : Ljava/lang/Object;
/*     */     //   148: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround
/*     */     //   151: astore_0
/*     */     //   152: aload #12
/*     */     //   154: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   157: aload #12
/*     */     //   159: checkcast java/util/List
/*     */     //   162: dup
/*     */     //   163: ifnonnull -> 169
/*     */     //   166: pop
/*     */     //   167: aconst_null
/*     */     //   168: areturn
/*     */     //   169: astore_3
/*     */     //   170: aload_3
/*     */     //   171: checkcast java/lang/Iterable
/*     */     //   174: astore #6
/*     */     //   176: iconst_0
/*     */     //   177: istore #7
/*     */     //   179: aload #6
/*     */     //   181: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   186: astore #8
/*     */     //   188: aload #8
/*     */     //   190: invokeinterface hasNext : ()Z
/*     */     //   195: ifeq -> 256
/*     */     //   198: aload #8
/*     */     //   200: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   205: astore #9
/*     */     //   207: aload #9
/*     */     //   209: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity
/*     */     //   212: astore #10
/*     */     //   214: iconst_0
/*     */     //   215: istore #11
/*     */     //   217: aload #10
/*     */     //   219: instanceof com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity$NamedEnv
/*     */     //   222: ifeq -> 247
/*     */     //   225: aload #10
/*     */     //   227: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity$NamedEnv
/*     */     //   230: invokevirtual getEnvName : ()Ljava/lang/String;
/*     */     //   233: aload_0
/*     */     //   234: getfield condaEnvName : Ljava/lang/String;
/*     */     //   237: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   240: ifeq -> 247
/*     */     //   243: iconst_1
/*     */     //   244: goto -> 248
/*     */     //   247: iconst_0
/*     */     //   248: ifeq -> 188
/*     */     //   251: aload #9
/*     */     //   253: goto -> 257
/*     */     //   256: aconst_null
/*     */     //   257: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity
/*     */     //   260: dup
/*     */     //   261: ifnonnull -> 267
/*     */     //   264: pop
/*     */     //   265: aconst_null
/*     */     //   266: areturn
/*     */     //   267: astore #4
/*     */     //   269: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   272: aload #4
/*     */     //   274: invokevirtual getUserReadableName : ()Ljava/lang/String;
/*     */     //   277: invokevirtual findJdk : (Ljava/lang/String;)Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   280: astore #5
/*     */     //   282: aload #5
/*     */     //   284: ifnull -> 299
/*     */     //   287: aload_0
/*     */     //   288: aload #5
/*     */     //   290: invokespecial isCondaSdk : (Lcom/intellij/openapi/projectRoots/Sdk;)Z
/*     */     //   293: ifeq -> 299
/*     */     //   296: aload #5
/*     */     //   298: areturn
/*     */     //   299: new com/jetbrains/python/sdk/flavors/conda/PyCondaCommand
/*     */     //   302: dup
/*     */     //   303: aload_0
/*     */     //   304: getfield condaBinaries : Ljava/lang/String;
/*     */     //   307: aconst_null
/*     */     //   308: aload_1
/*     */     //   309: aconst_null
/*     */     //   310: bipush #8
/*     */     //   312: aconst_null
/*     */     //   313: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/execution/target/TargetEnvironmentConfiguration;Lcom/intellij/openapi/project/Project;Lcom/intellij/execution/target/TargetProgressIndicator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   316: aload #4
/*     */     //   318: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   321: aload_1
/*     */     //   322: aload #13
/*     */     //   324: aload #13
/*     */     //   326: aload_1
/*     */     //   327: putfield L$0 : Ljava/lang/Object;
/*     */     //   330: aload #13
/*     */     //   332: aconst_null
/*     */     //   333: putfield L$1 : Ljava/lang/Object;
/*     */     //   336: aload #13
/*     */     //   338: iconst_2
/*     */     //   339: putfield label : I
/*     */     //   342: invokestatic createCondaSdkFromExistingEnv : (Lcom/jetbrains/python/sdk/flavors/conda/PyCondaCommand;Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;Ljava/util/List;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   345: dup
/*     */     //   346: aload #14
/*     */     //   348: if_acmpne -> 370
/*     */     //   351: aload #14
/*     */     //   353: areturn
/*     */     //   354: aload #13
/*     */     //   356: getfield L$0 : Ljava/lang/Object;
/*     */     //   359: checkcast com/intellij/openapi/project/Project
/*     */     //   362: astore_1
/*     */     //   363: aload #12
/*     */     //   365: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   368: aload #12
/*     */     //   370: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   373: astore #6
/*     */     //   375: aload #6
/*     */     //   377: invokeinterface getSdkType : ()Lcom/intellij/openapi/projectRoots/SdkTypeId;
/*     */     //   382: dup
/*     */     //   383: ldc 'null cannot be cast to non-null type com.jetbrains.python.sdk.PythonSdkType'
/*     */     //   385: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   388: checkcast com/jetbrains/python/sdk/PythonSdkType
/*     */     //   391: aload #6
/*     */     //   393: invokevirtual setupSdkPaths : (Lcom/intellij/openapi/projectRoots/Sdk;)V
/*     */     //   396: aload #6
/*     */     //   398: aload_1
/*     */     //   399: <illegal opcode> invoke : (Lcom/intellij/openapi/projectRoots/Sdk;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*     */     //   404: aload #13
/*     */     //   406: aload #13
/*     */     //   408: aload #6
/*     */     //   410: putfield L$0 : Ljava/lang/Object;
/*     */     //   413: aload #13
/*     */     //   415: iconst_3
/*     */     //   416: putfield label : I
/*     */     //   419: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   422: dup
/*     */     //   423: aload #14
/*     */     //   425: if_acmpne -> 448
/*     */     //   428: aload #14
/*     */     //   430: areturn
/*     */     //   431: aload #13
/*     */     //   433: getfield L$0 : Ljava/lang/Object;
/*     */     //   436: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   439: astore #6
/*     */     //   441: aload #12
/*     */     //   443: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   446: aload #12
/*     */     //   448: pop
/*     */     //   449: aload #6
/*     */     //   451: areturn
/*     */     //   452: new java/lang/IllegalStateException
/*     */     //   455: dup
/*     */     //   456: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   458: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   461: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 60
/*     */     //   #121	-> 101
/*     */     //   #119	-> 131
/*     */     //   #121	-> 159
/*     */     //   #122	-> 170
/*     */     //   #172	-> 179
/*     */     //   #123	-> 217
/*     */     //   #172	-> 248
/*     */     //   #173	-> 256
/*     */     //   #122	-> 257
/*     */     //   #124	-> 265
/*     */     //   #122	-> 267
/*     */     //   #126	-> 269
/*     */     //   #127	-> 282
/*     */     //   #128	-> 296
/*     */     //   #131	-> 299
/*     */     //   #132	-> 316
/*     */     //   #119	-> 351
/*     */     //   #131	-> 373
/*     */     //   #134	-> 375
/*     */     //   #138	-> 396
/*     */     //   #119	-> 428
/*     */     //   #149	-> 448
/*     */     //   #119	-> 452
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   152	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   169	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   248	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   256	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   257	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   267	29	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   299	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   101	33	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   143	23	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   169	79	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   248	8	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   256	1	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   257	7	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   267	29	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   299	55	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   363	59	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   170	6	3	all	Ljava/util/List;
/*     */     //   269	27	4	matchingEnv	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */     //   299	46	4	matchingEnv	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */     //   282	17	5	existingSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   176	12	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */     //   375	56	6	result	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   441	11	6	result	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   207	49	9	element$iv	Ljava/lang/Object;
/*     */     //   214	33	10	it	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */     //   217	31	11	$i$a$-firstOrNull-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$matchingEnv$1	I
/*     */     //   179	78	7	$i$f$firstOrNull	I
/*     */     //   0	462	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	402	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	395	12	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit setupSdkForCondaEnvironment$lambda$2(Sdk $result, Project $project) {
/* 139 */     ProjectJdkTable.getInstance().addJdk($result);
/* 140 */     ProjectRootManager.getInstance($project).setProjectSdk($result);
/* 141 */     PyTransferredSdkRootsKt.transferRootsToModulesWithInheritedSdk($project, $result);
/*     */     
/* 143 */     Module[] arrayOfModule = ModuleManager.Companion.getInstance($project).getModules(); int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 178 */     byte b = 0; int i = arrayOfModule.length; if (b < i) { Object element$iv = arrayOfModule[b], object1 = element$iv; int $i$a$-forEach-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$2$1 = 0;
/*     */       ModuleRootModificationUtil.setModuleSdk((Module)object1, $result);
/*     */       PyTransferredSdkRootsKt.transferRoots((Module)object1, $result); }
/*     */     
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return super.toString() + "(" + super.toString() + ", " + this.condaBinaries + ")";
/*     */   }
/*     */   
/*     */   private final Object detectCondaEnvironments(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */     //   11: astore #15
/*     */     //   13: aload #15
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #15
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #15
/*     */     //   50: aload #15
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #14
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #16
/*     */     //   62: aload #15
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 298, 0 -> 88, 1 -> 142
/*     */     //   88: aload #14
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: new com/jetbrains/python/sdk/conda/TargetEnvironmentRequestCommandExecutor
/*     */     //   96: dup
/*     */     //   97: new com/intellij/execution/target/local/LocalTargetEnvironmentRequest
/*     */     //   100: dup
/*     */     //   101: invokespecial <init> : ()V
/*     */     //   104: checkcast com/intellij/execution/target/TargetEnvironmentRequest
/*     */     //   107: invokespecial <init> : (Lcom/intellij/execution/target/TargetEnvironmentRequest;)V
/*     */     //   110: astore_2
/*     */     //   111: getstatic com/jetbrains/python/sdk/flavors/conda/PyCondaEnv.Companion : Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnv$Companion;
/*     */     //   114: aload_2
/*     */     //   115: checkcast com/jetbrains/python/sdk/conda/TargetCommandExecutor
/*     */     //   118: aload_0
/*     */     //   119: getfield condaBinaries : Ljava/lang/String;
/*     */     //   122: aload #15
/*     */     //   124: aload #15
/*     */     //   126: iconst_1
/*     */     //   127: putfield label : I
/*     */     //   130: invokevirtual getEnvs-0E7RQCE : (Lcom/jetbrains/python/sdk/conda/TargetCommandExecutor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   133: dup
/*     */     //   134: aload #16
/*     */     //   136: if_acmpne -> 155
/*     */     //   139: aload #16
/*     */     //   141: areturn
/*     */     //   142: aload #14
/*     */     //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   147: aload #14
/*     */     //   149: checkcast kotlin/Result
/*     */     //   152: invokevirtual unbox-impl : ()Ljava/lang/Object;
/*     */     //   155: astore #4
/*     */     //   157: aload #4
/*     */     //   159: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */     //   162: dup
/*     */     //   163: ifnonnull -> 172
/*     */     //   166: pop
/*     */     //   167: aload #4
/*     */     //   169: goto -> 193
/*     */     //   172: astore #5
/*     */     //   174: iconst_0
/*     */     //   175: istore #6
/*     */     //   177: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   180: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   183: ldc_w 'Failed to detect conda environments'
/*     */     //   186: aload #5
/*     */     //   188: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   191: aconst_null
/*     */     //   192: areturn
/*     */     //   193: checkcast java/util/List
/*     */     //   196: astore_3
/*     */     //   197: aload_3
/*     */     //   198: checkcast java/lang/Iterable
/*     */     //   201: astore #4
/*     */     //   203: iconst_0
/*     */     //   204: istore #5
/*     */     //   206: aload #4
/*     */     //   208: astore #6
/*     */     //   210: new java/util/ArrayList
/*     */     //   213: dup
/*     */     //   214: aload #4
/*     */     //   216: bipush #10
/*     */     //   218: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   221: invokespecial <init> : (I)V
/*     */     //   224: checkcast java/util/Collection
/*     */     //   227: astore #7
/*     */     //   229: iconst_0
/*     */     //   230: istore #8
/*     */     //   232: aload #6
/*     */     //   234: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   239: astore #9
/*     */     //   241: aload #9
/*     */     //   243: invokeinterface hasNext : ()Z
/*     */     //   248: ifeq -> 291
/*     */     //   251: aload #9
/*     */     //   253: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   258: astore #10
/*     */     //   260: aload #7
/*     */     //   262: aload #10
/*     */     //   264: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnv
/*     */     //   267: astore #11
/*     */     //   269: astore #13
/*     */     //   271: iconst_0
/*     */     //   272: istore #12
/*     */     //   274: aload #11
/*     */     //   276: invokevirtual getEnvIdentity : ()Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */     //   279: aload #13
/*     */     //   281: swap
/*     */     //   282: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   287: pop
/*     */     //   288: goto -> 241
/*     */     //   291: aload #7
/*     */     //   293: checkcast java/util/List
/*     */     //   296: nop
/*     */     //   297: areturn
/*     */     //   298: new java/lang/IllegalStateException
/*     */     //   301: dup
/*     */     //   302: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   304: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   307: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #156	-> 60
/*     */     //   #158	-> 93
/*     */     //   #159	-> 111
/*     */     //   #156	-> 139
/*     */     //   #159	-> 155
/*     */     //   #160	-> 177
/*     */     //   #161	-> 191
/*     */     //   #159	-> 193
/*     */     //   #163	-> 197
/*     */     //   #174	-> 206
/*     */     //   #175	-> 232
/*     */     //   #176	-> 260
/*     */     //   #163	-> 274
/*     */     //   #176	-> 282
/*     */     //   #177	-> 291
/*     */     //   #174	-> 296
/*     */     //   #163	-> 297
/*     */     //   #156	-> 298
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   111	22	2	commandExecutor	Lcom/jetbrains/python/sdk/conda/TargetEnvironmentRequestCommandExecutor;
/*     */     //   197	6	3	environments	Ljava/util/List;
/*     */     //   203	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   174	19	5	it	Ljava/lang/Throwable;
/*     */     //   229	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   229	64	7	destination$iv$iv	Ljava/util/Collection;
/*     */     //   260	28	10	item$iv$iv	Ljava/lang/Object;
/*     */     //   271	8	11	it	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnv;
/*     */     //   177	16	6	$i$a$-getOrElse-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$environments$1	I
/*     */     //   274	5	12	$i$a$-map-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$2	I
/*     */     //   232	61	8	$i$f$mapTo	I
/*     */     //   206	91	5	$i$f$map	I
/*     */     //   0	308	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	248	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	241	14	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final boolean isCondaSdk(Sdk sdk) {
/*     */     SdkAdditionalData sdkAdditionalData = sdk.getSdkAdditionalData();
/*     */     ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData();
/*     */     return (((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null) != null && ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData() != null) ? ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData().getData() : null instanceof com.jetbrains.python.sdk.flavors.conda.PyCondaFlavorData;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandExecutorUtils.kt", l = {159}, i = {}, s = {}, n = {}, m = "detectCondaEnvironments", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround.this.detectCondaEnvironments((Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandExecutorUtils.kt", l = {121, 132, 138}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "project", "project", "result"}, m = "setupSdkForCondaEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround.this.setupSdkForCondaEnvironment(null, (Continuation<? super Sdk>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */