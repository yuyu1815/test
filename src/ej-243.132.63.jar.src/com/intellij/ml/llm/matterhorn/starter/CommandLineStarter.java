/*     */ package com.intellij.ml.llm.matterhorn.starter;
/*     */ 
/*     */ import com.intellij.ide.CliResult;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*     */ import com.intellij.ml.llm.matterhorn.Artifactual;
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornServiceScope;
/*     */ import com.intellij.ml.llm.matterhorn.MatterhornStarter;
/*     */ import com.intellij.ml.llm.matterhorn.ProjectFileStructure;
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.application.ModernApplicationStarter;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.IntSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\007\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\030\000 \0372\0020\001:\002\037 B\007¢\006\004\b\002\020\003J\034\020\004\032\0020\0052\f\020\006\032\b\022\004\022\0020\b0\007H@¢\006\002\020\tJ\036\020\n\032\004\030\0010\0132\f\020\f\032\b\022\004\022\0020\b0\007H@¢\006\002\020\tJ\b\020\020\032\0020\016H\026J&\020\021\032\0020\0222\f\020\006\032\b\022\004\022\0020\b0\0072\b\020\023\032\004\030\0010\bH@¢\006\002\020\024J6\020\025\032\0020\0052\006\020\026\032\0020\0132\006\020\027\032\0020\b2\006\020\030\032\0020\b2\006\020\031\032\0020\0322\f\020\006\032\b\022\004\022\0020\b0\007H\002J\026\020\033\032\0020\0052\006\020\034\032\0020\035H@¢\006\002\020\036R\024\020\r\032\0020\0168VX\004¢\006\006\032\004\b\r\020\017¨\006!"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;", "Lcom/intellij/openapi/application/ModernApplicationStarter;", "<init>", "()V", "start", "", "args", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadProjectFromExternalCommandLine", "Lcom/intellij/openapi/project/Project;", "commandLineArgs", "isHeadless", "", "()Z", "canProcessExternalCommandLine", "processExternalCommandLine", "Lcom/intellij/ide/CliResult;", "currentDirectory", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startGeneration", "project", "name", "task", "starter", "Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;", "exitApplication", "result", "Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;", "(Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "GenerationResult", "matterhorn"})
/*     */ @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,380:1\n1755#2,3:381\n205#3:384\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter\n*L\n230#1:381,3\n358#1:384\n*E\n"})
/*     */ public final class CommandLineStarter
/*     */   extends ModernApplicationStarter
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020\b\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000R\016\020\007\032\0020\005XT¢\006\002\n\000R\016\020\b\032\0020\005XT¢\006\002\n\000R\016\020\t\032\0020\nXT¢\006\002\n\000R\016\020\013\032\0020\nXT¢\006\002\n\000R\016\020\f\032\0020\nXT¢\006\002\n\000R\023\020\r\032\0070\016¢\006\002\b\017X\004¢\006\002\n\000¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$Companion;", "", "<init>", "()V", "MODE_PREFIX", "", "TARGET_PREFIX", "SERVICE_MODE", "VALIDATE", "ALREADY_RUNNING_EXIT_CODE", "", "SUCCESS_EXIT_CODE", "ERROR_EXIT_CODE", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "Lorg/jetbrains/annotations/NotNull;", "matterhorn"})
/*     */   public static final class Companion
/*     */   {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final String MODE_PREFIX = "--mode=";
/*     */   @NotNull
/*     */   public static final String TARGET_PREFIX = "--target=";
/*     */   @NotNull
/*     */   public static final String SERVICE_MODE = "--service-mode";
/*     */   @NotNull
/*     */   public static final String VALIDATE = "--validate";
/*     */   @NotNull
/* 189 */   public static final Companion Companion = new Companion(null); private static final int ALREADY_RUNNING_EXIT_CODE = 69; private static final int SUCCESS_EXIT_CODE = 0; private static final int ERROR_EXIT_CODE = 1; @NotNull private static final Logger LOG = Logger.getInstance(CommandLineStarter.class); static { Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CommandLineStarter.class), "getInstance(...)"); }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public Object start(@NotNull List args, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$start$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$start$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$start$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 237, 0 -> 88, 1 -> 196
/*     */     //   88: aload #6
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   96: astore_3
/*     */     //   97: getstatic com/intellij/ide/warmup/WarmupStatus.Companion : Lcom/intellij/ide/warmup/WarmupStatus$Companion;
/*     */     //   100: getstatic com/intellij/ide/warmup/WarmupStatus$InProgress.INSTANCE : Lcom/intellij/ide/warmup/WarmupStatus$InProgress;
/*     */     //   103: checkcast com/intellij/ide/warmup/WarmupStatus
/*     */     //   106: invokevirtual statusChanged : (Lcom/intellij/ide/warmup/WarmupStatus;)V
/*     */     //   109: aload_3
/*     */     //   110: invokeinterface getMessageBus : ()Lcom/intellij/util/messages/MessageBus;
/*     */     //   115: getstatic com/intellij/ide/AppLifecycleListener.TOPIC : Lcom/intellij/util/messages/Topic;
/*     */     //   118: astore #5
/*     */     //   120: aload #5
/*     */     //   122: ldc 'TOPIC'
/*     */     //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   127: aload #5
/*     */     //   129: invokeinterface syncPublisher : (Lcom/intellij/util/messages/Topic;)Ljava/lang/Object;
/*     */     //   134: checkcast com/intellij/ide/AppLifecycleListener
/*     */     //   137: astore #4
/*     */     //   139: aload #4
/*     */     //   141: aload_1
/*     */     //   142: invokeinterface appFrameCreated : (Ljava/util/List;)V
/*     */     //   147: aload_1
/*     */     //   148: checkcast java/util/Collection
/*     */     //   151: invokeinterface isEmpty : ()Z
/*     */     //   156: ifne -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: ifeq -> 214
/*     */     //   167: aload_0
/*     */     //   168: aload_1
/*     */     //   169: aload #7
/*     */     //   171: aload #7
/*     */     //   173: aload #4
/*     */     //   175: putfield L$0 : Ljava/lang/Object;
/*     */     //   178: aload #7
/*     */     //   180: iconst_1
/*     */     //   181: putfield label : I
/*     */     //   184: invokespecial loadProjectFromExternalCommandLine : (Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   187: dup
/*     */     //   188: aload #8
/*     */     //   190: if_acmpne -> 213
/*     */     //   193: aload #8
/*     */     //   195: areturn
/*     */     //   196: aload #7
/*     */     //   198: getfield L$0 : Ljava/lang/Object;
/*     */     //   201: checkcast com/intellij/ide/AppLifecycleListener
/*     */     //   204: astore #4
/*     */     //   206: aload #6
/*     */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   211: aload #6
/*     */     //   213: pop
/*     */     //   214: invokestatic onIdeStart : ()V
/*     */     //   217: getstatic com/intellij/diagnostic/LoadingState.COMPONENTS_LOADED : Lcom/intellij/diagnostic/LoadingState;
/*     */     //   220: getstatic com/intellij/diagnostic/LoadingState.APP_STARTED : Lcom/intellij/diagnostic/LoadingState;
/*     */     //   223: invokestatic compareAndSetCurrentState : (Lcom/intellij/diagnostic/LoadingState;Lcom/intellij/diagnostic/LoadingState;)V
/*     */     //   226: aload #4
/*     */     //   228: invokeinterface appStarted : ()V
/*     */     //   233: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   236: areturn
/*     */     //   237: new java/lang/IllegalStateException
/*     */     //   240: dup
/*     */     //   241: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   243: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   246: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #192	-> 60
/*     */     //   #193	-> 93
/*     */     //   #195	-> 97
/*     */     //   #197	-> 109
/*     */     //   #198	-> 139
/*     */     //   #200	-> 147
/*     */     //   #200	-> 164
/*     */     //   #192	-> 193
/*     */     //   #202	-> 213
/*     */     //   #203	-> 217
/*     */     //   #204	-> 226
/*     */     //   #205	-> 233
/*     */     //   #192	-> 237
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	71	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   164	23	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   93	71	1	args	Ljava/util/List;
/*     */     //   164	23	1	args	Ljava/util/List;
/*     */     //   97	23	3	app	Lcom/intellij/openapi/application/Application;
/*     */     //   139	57	4	lifecyclePublisher	Lcom/intellij/ide/AppLifecycleListener;
/*     */     //   206	31	4	lifecyclePublisher	Lcom/intellij/ide/AppLifecycleListener;
/*     */     //   0	247	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	187	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	180	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object loadProjectFromExternalCommandLine(List commandLineArgs, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$loadProjectFromExternalCommandLine$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$loadProjectFromExternalCommandLine$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$loadProjectFromExternalCommandLine$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 219, 0 -> 92, 1 -> 136, 2 -> 197
/*     */     //   92: aload #4
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: getstatic com/intellij/ide/CommandLineProcessor.INSTANCE : Lcom/intellij/ide/CommandLineProcessor;
/*     */     //   100: aload_1
/*     */     //   101: ldc ''
/*     */     //   103: iconst_0
/*     */     //   104: anewarray java/lang/String
/*     */     //   107: invokestatic get : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   110: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   113: iconst_0
/*     */     //   114: aload #5
/*     */     //   116: iconst_4
/*     */     //   117: aconst_null
/*     */     //   118: aload #5
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokestatic processExternalCommandLine$default : (Lcom/intellij/ide/CommandLineProcessor;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #6
/*     */     //   130: if_acmpne -> 143
/*     */     //   133: aload #6
/*     */     //   135: areturn
/*     */     //   136: aload #4
/*     */     //   138: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   141: aload #4
/*     */     //   143: checkcast com/intellij/ide/CommandLineProcessorResult
/*     */     //   146: astore_3
/*     */     //   147: aload_3
/*     */     //   148: invokevirtual getHasError : ()Z
/*     */     //   151: ifeq -> 214
/*     */     //   154: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   157: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   160: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$loadProjectFromExternalCommandLine$2
/*     */     //   163: dup
/*     */     //   164: aconst_null
/*     */     //   165: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   168: checkcast kotlin/jvm/functions/Function2
/*     */     //   171: aload #5
/*     */     //   173: aload #5
/*     */     //   175: aload_3
/*     */     //   176: putfield L$0 : Ljava/lang/Object;
/*     */     //   179: aload #5
/*     */     //   181: iconst_2
/*     */     //   182: putfield label : I
/*     */     //   185: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   188: dup
/*     */     //   189: aload #6
/*     */     //   191: if_acmpne -> 213
/*     */     //   194: aload #6
/*     */     //   196: areturn
/*     */     //   197: aload #5
/*     */     //   199: getfield L$0 : Ljava/lang/Object;
/*     */     //   202: checkcast com/intellij/ide/CommandLineProcessorResult
/*     */     //   205: astore_3
/*     */     //   206: aload #4
/*     */     //   208: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   211: aload #4
/*     */     //   213: pop
/*     */     //   214: aload_3
/*     */     //   215: invokevirtual getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   218: areturn
/*     */     //   219: new java/lang/IllegalStateException
/*     */     //   222: dup
/*     */     //   223: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   225: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   228: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 60
/*     */     //   #208	-> 97
/*     */     //   #207	-> 133
/*     */     //   #210	-> 147
/*     */     //   #211	-> 154
/*     */     //   #207	-> 194
/*     */     //   #216	-> 213
/*     */     //   #207	-> 219
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	30	1	commandLineArgs	Ljava/util/List;
/*     */     //   147	50	3	result	Lcom/intellij/ide/CommandLineProcessorResult;
/*     */     //   206	13	3	result	Lcom/intellij/ide/CommandLineProcessorResult;
/*     */     //   0	229	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	169	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	162	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter$loadProjectFromExternalCommandLine$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class CommandLineStarter$loadProjectFromExternalCommandLine$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object>
/*     */   {
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$loadProjectFromExternalCommandLine$2(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/* 211 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 212 */           ApplicationManager.getApplication().exit(true, true, false);
/* 213 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarter$loadProjectFromExternalCommandLine$2> $completion) {
/*     */       return (Continuation<Unit>)new CommandLineStarter$loadProjectFromExternalCommandLine$2($completion);
/*     */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CommandLineStarter$loadProjectFromExternalCommandLine$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } } public boolean isHeadless() {
/* 220 */     return true;
/*     */   } public boolean canProcessExternalCommandLine() {
/* 222 */     return true;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
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
/*     */   public Object processExternalCommandLine(@NotNull List args, @Nullable String currentDirectory, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$processExternalCommandLine$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$processExternalCommandLine$1
/*     */     //   11: astore #14
/*     */     //   13: aload #14
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #14
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$processExternalCommandLine$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #14
/*     */     //   50: aload #14
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #13
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #15
/*     */     //   62: aload #14
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 1237, 0 -> 100, 1 -> 643, 2 -> 739, 3 -> 873, 4 -> 1080
/*     */     //   100: aload #13
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   108: ldc 'Starting...'
/*     */     //   110: invokevirtual log : (Ljava/lang/String;)V
/*     */     //   113: aload_0
/*     */     //   114: checkcast com/intellij/openapi/application/ApplicationStarter
/*     */     //   117: invokestatic getCommandNameFromExtension : (Lcom/intellij/openapi/application/ApplicationStarter;)Ljava/lang/String;
/*     */     //   120: astore #4
/*     */     //   122: aload #4
/*     */     //   124: aload_1
/*     */     //   125: aload_2
/*     */     //   126: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   131: astore #5
/*     */     //   133: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   136: aload #5
/*     */     //   138: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   141: aload_1
/*     */     //   142: checkcast java/lang/Iterable
/*     */     //   145: astore #6
/*     */     //   147: iconst_0
/*     */     //   148: istore #7
/*     */     //   150: aload #6
/*     */     //   152: instanceof java/util/Collection
/*     */     //   155: ifeq -> 175
/*     */     //   158: aload #6
/*     */     //   160: checkcast java/util/Collection
/*     */     //   163: invokeinterface isEmpty : ()Z
/*     */     //   168: ifeq -> 175
/*     */     //   171: iconst_0
/*     */     //   172: goto -> 229
/*     */     //   175: aload #6
/*     */     //   177: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   182: astore #8
/*     */     //   184: aload #8
/*     */     //   186: invokeinterface hasNext : ()Z
/*     */     //   191: ifeq -> 228
/*     */     //   194: aload #8
/*     */     //   196: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   201: astore #9
/*     */     //   203: aload #9
/*     */     //   205: checkcast java/lang/String
/*     */     //   208: astore #10
/*     */     //   210: iconst_0
/*     */     //   211: istore #11
/*     */     //   213: aload #10
/*     */     //   215: ldc_w '--service-mode'
/*     */     //   218: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   221: ifeq -> 184
/*     */     //   224: iconst_1
/*     */     //   225: goto -> 229
/*     */     //   228: iconst_0
/*     */     //   229: ifeq -> 259
/*     */     //   232: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornCliStarterEP.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornCliStarterEP;
/*     */     //   235: invokevirtual getEP : ()Lcom/intellij/openapi/extensions/ExtensionPointName;
/*     */     //   238: invokevirtual getExtensions : ()[Ljava/lang/Object;
/*     */     //   241: invokestatic first : ([Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   244: checkcast com/intellij/ml/llm/matterhorn/MatterhornCliStarter
/*     */     //   247: astore #6
/*     */     //   249: aload #6
/*     */     //   251: aload_1
/*     */     //   252: aload_2
/*     */     //   253: invokeinterface processExternalCommandLine : (Ljava/util/List;Ljava/lang/String;)Lcom/intellij/ide/CliResult;
/*     */     //   258: areturn
/*     */     //   259: aconst_null
/*     */     //   260: astore #6
/*     */     //   262: aconst_null
/*     */     //   263: astore #7
/*     */     //   265: aload_1
/*     */     //   266: checkcast java/lang/Iterable
/*     */     //   269: iconst_1
/*     */     //   270: invokestatic drop : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   273: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   278: astore #8
/*     */     //   280: aload #8
/*     */     //   282: invokeinterface hasNext : ()Z
/*     */     //   287: ifeq -> 378
/*     */     //   290: aload #8
/*     */     //   292: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   297: checkcast java/lang/String
/*     */     //   300: astore #9
/*     */     //   302: aload #9
/*     */     //   304: ldc_w '--mode='
/*     */     //   307: iconst_0
/*     */     //   308: iconst_2
/*     */     //   309: aconst_null
/*     */     //   310: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   313: ifeq -> 329
/*     */     //   316: aload #9
/*     */     //   318: ldc_w '--mode='
/*     */     //   321: checkcast java/lang/CharSequence
/*     */     //   324: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   327: astore #6
/*     */     //   329: aload #9
/*     */     //   331: ldc_w '--target='
/*     */     //   334: iconst_0
/*     */     //   335: iconst_2
/*     */     //   336: aconst_null
/*     */     //   337: invokestatic startsWith$default : (Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z
/*     */     //   340: ifeq -> 280
/*     */     //   343: aload #9
/*     */     //   345: ldc_w '--target='
/*     */     //   348: checkcast java/lang/CharSequence
/*     */     //   351: invokestatic removePrefix : (Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;
/*     */     //   354: astore #7
/*     */     //   356: aload #7
/*     */     //   358: invokestatic getMATTERHORN_TARGET_ENV_VAR : ()Ljava/lang/String;
/*     */     //   361: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   364: ifeq -> 280
/*     */     //   367: invokestatic getMATTERHORN_TARGET_ENV_VAR : ()Ljava/lang/String;
/*     */     //   370: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   373: astore #7
/*     */     //   375: goto -> 280
/*     */     //   378: aload #7
/*     */     //   380: ifnonnull -> 401
/*     */     //   383: new java/lang/IllegalStateException
/*     */     //   386: dup
/*     */     //   387: aload #4
/*     */     //   389: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   394: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   397: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   400: athrow
/*     */     //   401: aload #6
/*     */     //   403: ifnonnull -> 424
/*     */     //   406: new java/lang/IllegalStateException
/*     */     //   409: dup
/*     */     //   410: aload #4
/*     */     //   412: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   417: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   420: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   423: athrow
/*     */     //   424: nop
/*     */     //   425: aload #7
/*     */     //   427: iconst_0
/*     */     //   428: anewarray java/lang/String
/*     */     //   431: invokestatic of : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   434: astore #8
/*     */     //   436: aload #8
/*     */     //   438: invokeinterface isAbsolute : ()Z
/*     */     //   443: ifne -> 481
/*     */     //   446: aload_2
/*     */     //   447: dup
/*     */     //   448: ifnull -> 471
/*     */     //   451: iconst_1
/*     */     //   452: anewarray java/lang/String
/*     */     //   455: astore #9
/*     */     //   457: aload #9
/*     */     //   459: iconst_0
/*     */     //   460: aload #7
/*     */     //   462: aastore
/*     */     //   463: aload #9
/*     */     //   465: invokestatic of : (Ljava/lang/String;[Ljava/lang/String;)Ljava/nio/file/Path;
/*     */     //   468: goto -> 479
/*     */     //   471: pop
/*     */     //   472: aload #8
/*     */     //   474: invokeinterface toAbsolutePath : ()Ljava/nio/file/Path;
/*     */     //   479: astore #8
/*     */     //   481: aload #8
/*     */     //   483: astore #9
/*     */     //   485: aload #9
/*     */     //   487: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   490: aload #9
/*     */     //   492: astore #9
/*     */     //   494: iconst_0
/*     */     //   495: anewarray java/nio/file/LinkOption
/*     */     //   498: astore #10
/*     */     //   500: aload #9
/*     */     //   502: aload #10
/*     */     //   504: aload #10
/*     */     //   506: arraylength
/*     */     //   507: invokestatic copyOf : ([Ljava/lang/Object;I)[Ljava/lang/Object;
/*     */     //   510: checkcast [Ljava/nio/file/LinkOption;
/*     */     //   513: invokestatic exists : (Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Z
/*     */     //   516: ifne -> 537
/*     */     //   519: new java/lang/IllegalStateException
/*     */     //   522: dup
/*     */     //   523: aload #8
/*     */     //   525: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   530: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   533: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   536: athrow
/*     */     //   537: aload #8
/*     */     //   539: invokeinterface getParent : ()Ljava/nio/file/Path;
/*     */     //   544: astore #9
/*     */     //   546: aload #9
/*     */     //   548: ifnonnull -> 569
/*     */     //   551: new java/lang/IllegalStateException
/*     */     //   554: dup
/*     */     //   555: aload #8
/*     */     //   557: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   562: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   565: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   568: athrow
/*     */     //   569: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStarterEP.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStarterEP;
/*     */     //   572: aload #6
/*     */     //   574: invokevirtual forMode : (Ljava/lang/String;)Ljava/util/List;
/*     */     //   577: invokestatic firstOrNull : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   580: checkcast com/intellij/ml/llm/matterhorn/MatterhornStarter
/*     */     //   583: astore #10
/*     */     //   585: aload #10
/*     */     //   587: ifnonnull -> 673
/*     */     //   590: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */     //   593: ldc_w 'Generation can not start.'
/*     */     //   596: aload #6
/*     */     //   598: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   603: invokevirtual error : (Ljava/lang/String;Ljava/lang/String;)V
/*     */     //   606: aload_0
/*     */     //   607: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   610: aconst_null
/*     */     //   611: iconst_1
/*     */     //   612: aconst_null
/*     */     //   613: invokestatic error$default : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   616: aload #14
/*     */     //   618: aload #14
/*     */     //   620: aload #4
/*     */     //   622: putfield L$0 : Ljava/lang/Object;
/*     */     //   625: aload #14
/*     */     //   627: iconst_1
/*     */     //   628: putfield label : I
/*     */     //   631: invokespecial exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   634: dup
/*     */     //   635: aload #15
/*     */     //   637: if_acmpne -> 661
/*     */     //   640: aload #15
/*     */     //   642: areturn
/*     */     //   643: aload #14
/*     */     //   645: getfield L$0 : Ljava/lang/Object;
/*     */     //   648: checkcast java/lang/String
/*     */     //   651: astore #4
/*     */     //   653: nop
/*     */     //   654: aload #13
/*     */     //   656: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   659: aload #13
/*     */     //   661: pop
/*     */     //   662: new java/lang/IllegalStateException
/*     */     //   665: dup
/*     */     //   666: ldc_w 'Should be unreachable, exitApplication had been called'
/*     */     //   669: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   672: athrow
/*     */     //   673: aload #10
/*     */     //   675: aload #9
/*     */     //   677: aload #14
/*     */     //   679: aload #14
/*     */     //   681: aload_0
/*     */     //   682: putfield L$0 : Ljava/lang/Object;
/*     */     //   685: aload #14
/*     */     //   687: aload_1
/*     */     //   688: putfield L$1 : Ljava/lang/Object;
/*     */     //   691: aload #14
/*     */     //   693: aload #4
/*     */     //   695: putfield L$2 : Ljava/lang/Object;
/*     */     //   698: aload #14
/*     */     //   700: aload #8
/*     */     //   702: putfield L$3 : Ljava/lang/Object;
/*     */     //   705: aload #14
/*     */     //   707: aload #9
/*     */     //   709: putfield L$4 : Ljava/lang/Object;
/*     */     //   712: aload #14
/*     */     //   714: aload #10
/*     */     //   716: putfield L$5 : Ljava/lang/Object;
/*     */     //   719: aload #14
/*     */     //   721: iconst_2
/*     */     //   722: putfield label : I
/*     */     //   725: invokeinterface beforeProjectOpened : (Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   730: dup
/*     */     //   731: aload #15
/*     */     //   733: if_acmpne -> 805
/*     */     //   736: aload #15
/*     */     //   738: areturn
/*     */     //   739: aload #14
/*     */     //   741: getfield L$5 : Ljava/lang/Object;
/*     */     //   744: checkcast com/intellij/ml/llm/matterhorn/MatterhornStarter
/*     */     //   747: astore #10
/*     */     //   749: aload #14
/*     */     //   751: getfield L$4 : Ljava/lang/Object;
/*     */     //   754: checkcast java/nio/file/Path
/*     */     //   757: astore #9
/*     */     //   759: aload #14
/*     */     //   761: getfield L$3 : Ljava/lang/Object;
/*     */     //   764: checkcast java/nio/file/Path
/*     */     //   767: astore #8
/*     */     //   769: aload #14
/*     */     //   771: getfield L$2 : Ljava/lang/Object;
/*     */     //   774: checkcast java/lang/String
/*     */     //   777: astore #4
/*     */     //   779: aload #14
/*     */     //   781: getfield L$1 : Ljava/lang/Object;
/*     */     //   784: checkcast java/util/List
/*     */     //   787: astore_1
/*     */     //   788: aload #14
/*     */     //   790: getfield L$0 : Ljava/lang/Object;
/*     */     //   793: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter
/*     */     //   796: astore_0
/*     */     //   797: nop
/*     */     //   798: aload #13
/*     */     //   800: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   803: aload #13
/*     */     //   805: pop
/*     */     //   806: getstatic com/intellij/ide/impl/ProjectUtil.INSTANCE : Lcom/intellij/ide/impl/ProjectUtil;
/*     */     //   809: aload #9
/*     */     //   811: aconst_null
/*     */     //   812: aload #14
/*     */     //   814: iconst_2
/*     */     //   815: aconst_null
/*     */     //   816: aload #14
/*     */     //   818: aload_0
/*     */     //   819: putfield L$0 : Ljava/lang/Object;
/*     */     //   822: aload #14
/*     */     //   824: aload_1
/*     */     //   825: putfield L$1 : Ljava/lang/Object;
/*     */     //   828: aload #14
/*     */     //   830: aload #4
/*     */     //   832: putfield L$2 : Ljava/lang/Object;
/*     */     //   835: aload #14
/*     */     //   837: aload #8
/*     */     //   839: putfield L$3 : Ljava/lang/Object;
/*     */     //   842: aload #14
/*     */     //   844: aload #10
/*     */     //   846: putfield L$4 : Ljava/lang/Object;
/*     */     //   849: aload #14
/*     */     //   851: aconst_null
/*     */     //   852: putfield L$5 : Ljava/lang/Object;
/*     */     //   855: aload #14
/*     */     //   857: iconst_3
/*     */     //   858: putfield label : I
/*     */     //   861: invokestatic openOrImportAsync$default : (Lcom/intellij/ide/impl/ProjectUtil;Ljava/nio/file/Path;Lcom/intellij/ide/impl/OpenProjectTask;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   864: dup
/*     */     //   865: aload #15
/*     */     //   867: if_acmpne -> 929
/*     */     //   870: aload #15
/*     */     //   872: areturn
/*     */     //   873: aload #14
/*     */     //   875: getfield L$4 : Ljava/lang/Object;
/*     */     //   878: checkcast com/intellij/ml/llm/matterhorn/MatterhornStarter
/*     */     //   881: astore #10
/*     */     //   883: aload #14
/*     */     //   885: getfield L$3 : Ljava/lang/Object;
/*     */     //   888: checkcast java/nio/file/Path
/*     */     //   891: astore #8
/*     */     //   893: aload #14
/*     */     //   895: getfield L$2 : Ljava/lang/Object;
/*     */     //   898: checkcast java/lang/String
/*     */     //   901: astore #4
/*     */     //   903: aload #14
/*     */     //   905: getfield L$1 : Ljava/lang/Object;
/*     */     //   908: checkcast java/util/List
/*     */     //   911: astore_1
/*     */     //   912: aload #14
/*     */     //   914: getfield L$0 : Ljava/lang/Object;
/*     */     //   917: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter
/*     */     //   920: astore_0
/*     */     //   921: nop
/*     */     //   922: aload #13
/*     */     //   924: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   927: aload #13
/*     */     //   929: checkcast com/intellij/openapi/project/Project
/*     */     //   932: dup
/*     */     //   933: ifnonnull -> 951
/*     */     //   936: pop
/*     */     //   937: new java/lang/IllegalStateException
/*     */     //   940: dup
/*     */     //   941: ldc_w 'No project was found to open in directory'
/*     */     //   944: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   947: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   950: athrow
/*     */     //   951: astore #11
/*     */     //   953: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   956: aload #10
/*     */     //   958: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   961: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   964: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   969: invokevirtual log : (Ljava/lang/String;)V
/*     */     //   972: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   975: aload #8
/*     */     //   977: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   982: invokevirtual log : (Ljava/lang/String;)V
/*     */     //   985: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   988: aload #11
/*     */     //   990: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   993: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   998: invokevirtual log : (Ljava/lang/String;)V
/*     */     //   1001: aload #11
/*     */     //   1003: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1006: dup
/*     */     //   1007: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1010: iconst_0
/*     */     //   1011: iconst_1
/*     */     //   1012: invokevirtual refresh : (ZZ)V
/*     */     //   1015: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarterProjectContext;
/*     */     //   1018: aload #11
/*     */     //   1020: aload #14
/*     */     //   1022: aload #14
/*     */     //   1024: aload_0
/*     */     //   1025: putfield L$0 : Ljava/lang/Object;
/*     */     //   1028: aload #14
/*     */     //   1030: aload_1
/*     */     //   1031: putfield L$1 : Ljava/lang/Object;
/*     */     //   1034: aload #14
/*     */     //   1036: aload #4
/*     */     //   1038: putfield L$2 : Ljava/lang/Object;
/*     */     //   1041: aload #14
/*     */     //   1043: aload #8
/*     */     //   1045: putfield L$3 : Ljava/lang/Object;
/*     */     //   1048: aload #14
/*     */     //   1050: aload #10
/*     */     //   1052: putfield L$4 : Ljava/lang/Object;
/*     */     //   1055: aload #14
/*     */     //   1057: aload #11
/*     */     //   1059: putfield L$5 : Ljava/lang/Object;
/*     */     //   1062: aload #14
/*     */     //   1064: iconst_4
/*     */     //   1065: putfield label : I
/*     */     //   1068: invokevirtual setup : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1071: dup
/*     */     //   1072: aload #15
/*     */     //   1074: if_acmpne -> 1146
/*     */     //   1077: aload #15
/*     */     //   1079: areturn
/*     */     //   1080: aload #14
/*     */     //   1082: getfield L$5 : Ljava/lang/Object;
/*     */     //   1085: checkcast com/intellij/openapi/project/Project
/*     */     //   1088: astore #11
/*     */     //   1090: aload #14
/*     */     //   1092: getfield L$4 : Ljava/lang/Object;
/*     */     //   1095: checkcast com/intellij/ml/llm/matterhorn/MatterhornStarter
/*     */     //   1098: astore #10
/*     */     //   1100: aload #14
/*     */     //   1102: getfield L$3 : Ljava/lang/Object;
/*     */     //   1105: checkcast java/nio/file/Path
/*     */     //   1108: astore #8
/*     */     //   1110: aload #14
/*     */     //   1112: getfield L$2 : Ljava/lang/Object;
/*     */     //   1115: checkcast java/lang/String
/*     */     //   1118: astore #4
/*     */     //   1120: aload #14
/*     */     //   1122: getfield L$1 : Ljava/lang/Object;
/*     */     //   1125: checkcast java/util/List
/*     */     //   1128: astore_1
/*     */     //   1129: aload #14
/*     */     //   1131: getfield L$0 : Ljava/lang/Object;
/*     */     //   1134: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter
/*     */     //   1137: astore_0
/*     */     //   1138: nop
/*     */     //   1139: aload #13
/*     */     //   1141: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1144: aload #13
/*     */     //   1146: pop
/*     */     //   1147: aload_0
/*     */     //   1148: aload #11
/*     */     //   1150: aload #8
/*     */     //   1152: astore #12
/*     */     //   1154: aload #12
/*     */     //   1156: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1159: aload #12
/*     */     //   1161: aload #11
/*     */     //   1163: invokestatic relativeName : (Ljava/nio/file/Path;Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */     //   1166: aload #8
/*     */     //   1168: astore #12
/*     */     //   1170: aload #12
/*     */     //   1172: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1175: aload #12
/*     */     //   1177: aconst_null
/*     */     //   1178: iconst_1
/*     */     //   1179: aconst_null
/*     */     //   1180: invokestatic readText$default : (Ljava/nio/file/Path;Ljava/nio/charset/Charset;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1183: aload #10
/*     */     //   1185: aload_1
/*     */     //   1186: invokespecial startGeneration : (Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;Ljava/util/List;)V
/*     */     //   1189: new com/intellij/ide/CliResult
/*     */     //   1192: dup
/*     */     //   1193: bipush #69
/*     */     //   1195: aconst_null
/*     */     //   1196: invokespecial <init> : (ILjava/lang/String;)V
/*     */     //   1199: areturn
/*     */     //   1200: astore #9
/*     */     //   1202: aload #4
/*     */     //   1204: aload #9
/*     */     //   1206: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   1209: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1214: astore #10
/*     */     //   1216: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1219: aload #10
/*     */     //   1221: aload #9
/*     */     //   1223: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1226: new com/intellij/ide/CliResult
/*     */     //   1229: dup
/*     */     //   1230: iconst_1
/*     */     //   1231: aload #10
/*     */     //   1233: invokespecial <init> : (ILjava/lang/String;)V
/*     */     //   1236: areturn
/*     */     //   1237: new java/lang/IllegalStateException
/*     */     //   1240: dup
/*     */     //   1241: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1243: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1246: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 60
/*     */     //   #225	-> 105
/*     */     //   #226	-> 113
/*     */     //   #227	-> 122
/*     */     //   #228	-> 133
/*     */     //   #230	-> 141
/*     */     //   #381	-> 150
/*     */     //   #382	-> 175
/*     */     //   #230	-> 213
/*     */     //   #382	-> 221
/*     */     //   #383	-> 228
/*     */     //   #230	-> 229
/*     */     //   #231	-> 232
/*     */     //   #232	-> 249
/*     */     //   #235	-> 259
/*     */     //   #236	-> 262
/*     */     //   #237	-> 265
/*     */     //   #238	-> 302
/*     */     //   #239	-> 316
/*     */     //   #242	-> 329
/*     */     //   #243	-> 343
/*     */     //   #244	-> 356
/*     */     //   #245	-> 367
/*     */     //   #250	-> 378
/*     */     //   #251	-> 387
/*     */     //   #253	-> 401
/*     */     //   #254	-> 410
/*     */     //   #257	-> 424
/*     */     //   #258	-> 425
/*     */     //   #259	-> 436
/*     */     //   #260	-> 446
/*     */     //   #263	-> 481
/*     */     //   #263	-> 516
/*     */     //   #264	-> 523
/*     */     //   #266	-> 537
/*     */     //   #267	-> 546
/*     */     //   #268	-> 555
/*     */     //   #270	-> 569
/*     */     //   #271	-> 585
/*     */     //   #272	-> 590
/*     */     //   #273	-> 606
/*     */     //   #224	-> 640
/*     */     //   #274	-> 661
/*     */     //   #277	-> 673
/*     */     //   #224	-> 736
/*     */     //   #279	-> 805
/*     */     //   #224	-> 870
/*     */     //   #279	-> 929
/*     */     //   #281	-> 953
/*     */     //   #282	-> 972
/*     */     //   #283	-> 985
/*     */     //   #285	-> 1001
/*     */     //   #286	-> 1015
/*     */     //   #224	-> 1077
/*     */     //   #288	-> 1146
/*     */     //   #289	-> 1189
/*     */     //   #291	-> 1200
/*     */     //   #292	-> 1202
/*     */     //   #293	-> 1216
/*     */     //   #294	-> 1226
/*     */     //   #224	-> 1237
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	70	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   175	46	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   221	7	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   228	1	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   229	3	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   259	124	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   401	5	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   424	92	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   516	3	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   537	14	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   569	65	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   673	66	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   797	76	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   921	159	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   1138	16	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */     //   105	70	1	args	Ljava/util/List;
/*     */     //   175	46	1	args	Ljava/util/List;
/*     */     //   221	7	1	args	Ljava/util/List;
/*     */     //   228	1	1	args	Ljava/util/List;
/*     */     //   229	30	1	args	Ljava/util/List;
/*     */     //   259	124	1	args	Ljava/util/List;
/*     */     //   401	5	1	args	Ljava/util/List;
/*     */     //   424	92	1	args	Ljava/util/List;
/*     */     //   516	3	1	args	Ljava/util/List;
/*     */     //   537	14	1	args	Ljava/util/List;
/*     */     //   569	21	1	args	Ljava/util/List;
/*     */     //   673	66	1	args	Ljava/util/List;
/*     */     //   788	85	1	args	Ljava/util/List;
/*     */     //   912	168	1	args	Ljava/util/List;
/*     */     //   1129	60	1	args	Ljava/util/List;
/*     */     //   105	70	2	currentDirectory	Ljava/lang/String;
/*     */     //   175	46	2	currentDirectory	Ljava/lang/String;
/*     */     //   221	7	2	currentDirectory	Ljava/lang/String;
/*     */     //   228	1	2	currentDirectory	Ljava/lang/String;
/*     */     //   229	30	2	currentDirectory	Ljava/lang/String;
/*     */     //   259	124	2	currentDirectory	Ljava/lang/String;
/*     */     //   401	5	2	currentDirectory	Ljava/lang/String;
/*     */     //   424	33	2	currentDirectory	Ljava/lang/String;
/*     */     //   122	53	4	commandName	Ljava/lang/String;
/*     */     //   175	46	4	commandName	Ljava/lang/String;
/*     */     //   221	7	4	commandName	Ljava/lang/String;
/*     */     //   228	1	4	commandName	Ljava/lang/String;
/*     */     //   229	3	4	commandName	Ljava/lang/String;
/*     */     //   259	142	4	commandName	Ljava/lang/String;
/*     */     //   401	23	4	commandName	Ljava/lang/String;
/*     */     //   424	219	4	commandName	Ljava/lang/String;
/*     */     //   653	86	4	commandName	Ljava/lang/String;
/*     */     //   779	94	4	commandName	Ljava/lang/String;
/*     */     //   903	177	4	commandName	Ljava/lang/String;
/*     */     //   1120	80	4	commandName	Ljava/lang/String;
/*     */     //   1200	37	4	commandName	Ljava/lang/String;
/*     */     //   133	8	5	message	Ljava/lang/String;
/*     */     //   147	28	6	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   175	9	6	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   249	10	6	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornCliStarter;
/*     */     //   262	54	6	mode	Ljava/lang/String;
/*     */     //   329	54	6	mode	Ljava/lang/String;
/*     */     //   401	5	6	mode	Ljava/lang/String;
/*     */     //   424	92	6	mode	Ljava/lang/String;
/*     */     //   516	3	6	mode	Ljava/lang/String;
/*     */     //   537	14	6	mode	Ljava/lang/String;
/*     */     //   569	37	6	mode	Ljava/lang/String;
/*     */     //   265	78	7	target	Ljava/lang/String;
/*     */     //   356	11	7	target	Ljava/lang/String;
/*     */     //   375	8	7	target	Ljava/lang/String;
/*     */     //   401	5	7	target	Ljava/lang/String;
/*     */     //   424	41	7	target	Ljava/lang/String;
/*     */     //   436	21	8	file	Ljava/nio/file/Path;
/*     */     //   471	8	8	file	Ljava/nio/file/Path;
/*     */     //   481	35	8	file	Ljava/nio/file/Path;
/*     */     //   516	21	8	file	Ljava/nio/file/Path;
/*     */     //   537	32	8	file	Ljava/nio/file/Path;
/*     */     //   569	21	8	file	Ljava/nio/file/Path;
/*     */     //   673	66	8	file	Ljava/nio/file/Path;
/*     */     //   769	104	8	file	Ljava/nio/file/Path;
/*     */     //   893	187	8	file	Ljava/nio/file/Path;
/*     */     //   1110	90	8	file	Ljava/nio/file/Path;
/*     */     //   203	25	9	element$iv	Ljava/lang/Object;
/*     */     //   302	54	9	arg	Ljava/lang/String;
/*     */     //   546	5	9	baseDir	Ljava/nio/file/Path;
/*     */     //   569	21	9	baseDir	Ljava/nio/file/Path;
/*     */     //   673	66	9	baseDir	Ljava/nio/file/Path;
/*     */     //   759	105	9	baseDir	Ljava/nio/file/Path;
/*     */     //   1202	35	9	e	Ljava/lang/Throwable;
/*     */     //   210	11	10	it	Ljava/lang/String;
/*     */     //   585	5	10	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   673	66	10	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   749	124	10	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   883	197	10	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   1100	100	10	starter	Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */     //   1216	21	10	errorMessage	Ljava/lang/String;
/*     */     //   953	127	11	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1090	110	11	project	Lcom/intellij/openapi/project/Project;
/*     */     //   213	8	11	$i$a$-any-CommandLineStarter$processExternalCommandLine$2	I
/*     */     //   150	79	7	$i$f$any	I
/*     */     //   0	1247	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	1187	14	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	1180	13	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   424	634	1200	java/lang/Throwable
/*     */     //   653	730	1200	java/lang/Throwable
/*     */     //   797	864	1200	java/lang/Throwable
/*     */     //   921	1071	1200	java/lang/Throwable
/*     */     //   1138	1200	1200	java/lang/Throwable
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final void startGeneration(Project project, String name, String task, MatterhornStarter starter, List<String> args) {
/* 299 */     BuildersKt.launch$default(MatterhornServiceScope.Companion.getScope(project), null, null, new CommandLineStarter$startGeneration$1(starter, name, args, task, this, null), 3, null);
/*     */   }
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {302, 306, 307, 313, 318, 320, 331, 347, 336, 347, 344, 347, 347}, i = {0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 8, 10}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0", "L$0"}, n = {"service", "service", "context", "service", "context", "service", "context", "service", "context", "context", "context", "context", "context"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter$startGeneration$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nCommandLineStarter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,380:1\n31#2,2:381\n*S KotlinDebug\n*F\n+ 1 CommandLineStarter.kt\ncom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1\n*L\n300#1:381,2\n*E\n"})
/*     */   static final class CommandLineStarter$startGeneration$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { Object L$0; Object L$1; int label;
/*     */     CommandLineStarter$startGeneration$1(MatterhornStarter $starter, String $name, List<String> $args, String $task, CommandLineStarter $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #11
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 1284, 0 -> 80, 1 -> 181, 2 -> 259, 3 -> 322, 4 -> 429, 5 -> 540, 6 -> 634, 7 -> 745, 8 -> 791, 9 -> 905, 10 -> 956, 11 -> 1111, 12 -> 1157, 13 -> 1233
/*     */       //   80: aload_1
/*     */       //   81: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   84: aload_0
/*     */       //   85: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   88: checkcast com/intellij/openapi/components/ComponentManager
/*     */       //   91: astore_3
/*     */       //   92: iconst_0
/*     */       //   93: istore #4
/*     */       //   95: ldc com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   97: astore #5
/*     */       //   99: aload_3
/*     */       //   100: aload #5
/*     */       //   102: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   107: dup
/*     */       //   108: ifnonnull -> 119
/*     */       //   111: pop
/*     */       //   112: aload_3
/*     */       //   113: aload #5
/*     */       //   115: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */       //   118: athrow
/*     */       //   119: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   122: astore_2
/*     */       //   123: getstatic com/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider;
/*     */       //   126: aload_2
/*     */       //   127: invokevirtual createLLMProxy : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;)Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   130: astore_3
/*     */       //   131: aload_0
/*     */       //   132: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */       //   135: aload_0
/*     */       //   136: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   139: aload_3
/*     */       //   140: getstatic com/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService.Companion : Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService$Companion;
/*     */       //   143: invokevirtual getInstance : ()Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornSettingsService;
/*     */       //   146: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider
/*     */       //   149: aload_0
/*     */       //   150: getfield $name : Ljava/lang/String;
/*     */       //   153: aload_0
/*     */       //   154: checkcast kotlin/coroutines/Continuation
/*     */       //   157: aload_0
/*     */       //   158: aload_2
/*     */       //   159: putfield L$0 : Ljava/lang/Object;
/*     */       //   162: aload_0
/*     */       //   163: iconst_1
/*     */       //   164: putfield label : I
/*     */       //   167: invokeinterface createRootContext : (Lcom/intellij/openapi/project/Project;Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   172: dup
/*     */       //   173: aload #11
/*     */       //   175: if_acmpne -> 194
/*     */       //   178: aload #11
/*     */       //   180: areturn
/*     */       //   181: aload_0
/*     */       //   182: getfield L$0 : Ljava/lang/Object;
/*     */       //   185: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   188: astore_2
/*     */       //   189: aload_1
/*     */       //   190: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   193: aload_1
/*     */       //   194: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   197: astore #4
/*     */       //   199: aload #4
/*     */       //   201: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */       //   204: invokestatic asRootExecutionContextListener : (Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;)Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;
/*     */       //   207: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListener;)V
/*     */       //   210: nop
/*     */       //   211: aload_0
/*     */       //   212: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */       //   215: aload_0
/*     */       //   216: getfield $name : Ljava/lang/String;
/*     */       //   219: aload_0
/*     */       //   220: getfield $args : Ljava/util/List;
/*     */       //   223: aload #4
/*     */       //   225: aload_0
/*     */       //   226: checkcast kotlin/coroutines/Continuation
/*     */       //   229: aload_0
/*     */       //   230: aload_2
/*     */       //   231: putfield L$0 : Ljava/lang/Object;
/*     */       //   234: aload_0
/*     */       //   235: aload #4
/*     */       //   237: putfield L$1 : Ljava/lang/Object;
/*     */       //   240: aload_0
/*     */       //   241: iconst_2
/*     */       //   242: putfield label : I
/*     */       //   245: invokeinterface configureProject : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   250: dup
/*     */       //   251: aload #11
/*     */       //   253: if_acmpne -> 282
/*     */       //   256: aload #11
/*     */       //   258: areturn
/*     */       //   259: aload_0
/*     */       //   260: getfield L$1 : Ljava/lang/Object;
/*     */       //   263: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   266: astore #4
/*     */       //   268: aload_0
/*     */       //   269: getfield L$0 : Ljava/lang/Object;
/*     */       //   272: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   275: astore_2
/*     */       //   276: nop
/*     */       //   277: aload_1
/*     */       //   278: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   281: aload_1
/*     */       //   282: pop
/*     */       //   283: getstatic com/intellij/ml/llm/matterhorn/ProjectOpener.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ProjectOpener;
/*     */       //   286: aload_0
/*     */       //   287: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   290: aload_0
/*     */       //   291: checkcast kotlin/coroutines/Continuation
/*     */       //   294: aload_0
/*     */       //   295: aload_2
/*     */       //   296: putfield L$0 : Ljava/lang/Object;
/*     */       //   299: aload_0
/*     */       //   300: aload #4
/*     */       //   302: putfield L$1 : Ljava/lang/Object;
/*     */       //   305: aload_0
/*     */       //   306: iconst_3
/*     */       //   307: putfield label : I
/*     */       //   310: invokevirtual awaitProjConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   313: dup
/*     */       //   314: aload #11
/*     */       //   316: if_acmpne -> 345
/*     */       //   319: aload #11
/*     */       //   321: areturn
/*     */       //   322: aload_0
/*     */       //   323: getfield L$1 : Ljava/lang/Object;
/*     */       //   326: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   329: astore #4
/*     */       //   331: aload_0
/*     */       //   332: getfield L$0 : Ljava/lang/Object;
/*     */       //   335: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   338: astore_2
/*     */       //   339: nop
/*     */       //   340: aload_1
/*     */       //   341: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   344: aload_1
/*     */       //   345: checkcast java/util/List
/*     */       //   348: astore #5
/*     */       //   350: aload #5
/*     */       //   352: checkcast java/util/Collection
/*     */       //   355: invokeinterface isEmpty : ()Z
/*     */       //   360: ifne -> 367
/*     */       //   363: iconst_1
/*     */       //   364: goto -> 368
/*     */       //   367: iconst_0
/*     */       //   368: ifeq -> 381
/*     */       //   371: new com/intellij/ml/llm/matterhorn/starter/CannotOpenProjectException
/*     */       //   374: dup
/*     */       //   375: aload #5
/*     */       //   377: invokespecial <init> : (Ljava/util/List;)V
/*     */       //   380: athrow
/*     */       //   381: aload_0
/*     */       //   382: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */       //   385: aload_0
/*     */       //   386: getfield $name : Ljava/lang/String;
/*     */       //   389: aload_0
/*     */       //   390: getfield $args : Ljava/util/List;
/*     */       //   393: aload #4
/*     */       //   395: aload_0
/*     */       //   396: checkcast kotlin/coroutines/Continuation
/*     */       //   399: aload_0
/*     */       //   400: aload_2
/*     */       //   401: putfield L$0 : Ljava/lang/Object;
/*     */       //   404: aload_0
/*     */       //   405: aload #4
/*     */       //   407: putfield L$1 : Ljava/lang/Object;
/*     */       //   410: aload_0
/*     */       //   411: iconst_4
/*     */       //   412: putfield label : I
/*     */       //   415: invokeinterface validateProject : (Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   420: dup
/*     */       //   421: aload #11
/*     */       //   423: if_acmpne -> 452
/*     */       //   426: aload #11
/*     */       //   428: areturn
/*     */       //   429: aload_0
/*     */       //   430: getfield L$1 : Ljava/lang/Object;
/*     */       //   433: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   436: astore #4
/*     */       //   438: aload_0
/*     */       //   439: getfield L$0 : Ljava/lang/Object;
/*     */       //   442: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   445: astore_2
/*     */       //   446: nop
/*     */       //   447: aload_1
/*     */       //   448: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   451: aload_1
/*     */       //   452: checkcast java/util/List
/*     */       //   455: astore #6
/*     */       //   457: aload #6
/*     */       //   459: checkcast java/util/Collection
/*     */       //   462: invokeinterface isEmpty : ()Z
/*     */       //   467: ifne -> 474
/*     */       //   470: iconst_1
/*     */       //   471: goto -> 475
/*     */       //   474: iconst_0
/*     */       //   475: ifeq -> 488
/*     */       //   478: new com/intellij/ml/llm/matterhorn/starter/ValidateProjectException
/*     */       //   481: dup
/*     */       //   482: aload #6
/*     */       //   484: invokespecial <init> : (Ljava/util/List;)V
/*     */       //   487: athrow
/*     */       //   488: aload_0
/*     */       //   489: getfield $starter : Lcom/intellij/ml/llm/matterhorn/MatterhornStarter;
/*     */       //   492: aload_0
/*     */       //   493: getfield $name : Ljava/lang/String;
/*     */       //   496: aload_0
/*     */       //   497: getfield $task : Ljava/lang/String;
/*     */       //   500: aload_0
/*     */       //   501: getfield $args : Ljava/util/List;
/*     */       //   504: aload #4
/*     */       //   506: aload_0
/*     */       //   507: checkcast kotlin/coroutines/Continuation
/*     */       //   510: aload_0
/*     */       //   511: aload_2
/*     */       //   512: putfield L$0 : Ljava/lang/Object;
/*     */       //   515: aload_0
/*     */       //   516: aload #4
/*     */       //   518: putfield L$1 : Ljava/lang/Object;
/*     */       //   521: aload_0
/*     */       //   522: iconst_5
/*     */       //   523: putfield label : I
/*     */       //   526: invokeinterface buildArtifactRequest : (Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   531: dup
/*     */       //   532: aload #11
/*     */       //   534: if_acmpne -> 563
/*     */       //   537: aload #11
/*     */       //   539: areturn
/*     */       //   540: aload_0
/*     */       //   541: getfield L$1 : Ljava/lang/Object;
/*     */       //   544: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   547: astore #4
/*     */       //   549: aload_0
/*     */       //   550: getfield L$0 : Ljava/lang/Object;
/*     */       //   553: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService
/*     */       //   556: astore_2
/*     */       //   557: nop
/*     */       //   558: aload_1
/*     */       //   559: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   562: aload_1
/*     */       //   563: checkcast com/intellij/ml/llm/matterhorn/ArtifactRequest
/*     */       //   566: astore #7
/*     */       //   568: new com/intellij/ml/llm/matterhorn/ProjectFileStructure
/*     */       //   571: dup
/*     */       //   572: invokespecial <init> : ()V
/*     */       //   575: astore #8
/*     */       //   577: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */       //   580: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   583: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1$artifact$1
/*     */       //   586: dup
/*     */       //   587: aload_2
/*     */       //   588: aload #7
/*     */       //   590: aload #8
/*     */       //   592: aload #4
/*     */       //   594: aconst_null
/*     */       //   595: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)V
/*     */       //   598: checkcast kotlin/jvm/functions/Function2
/*     */       //   601: aload_0
/*     */       //   602: checkcast kotlin/coroutines/Continuation
/*     */       //   605: aload_0
/*     */       //   606: aload #4
/*     */       //   608: putfield L$0 : Ljava/lang/Object;
/*     */       //   611: aload_0
/*     */       //   612: aconst_null
/*     */       //   613: putfield L$1 : Ljava/lang/Object;
/*     */       //   616: aload_0
/*     */       //   617: bipush #6
/*     */       //   619: putfield label : I
/*     */       //   622: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   625: dup
/*     */       //   626: aload #11
/*     */       //   628: if_acmpne -> 649
/*     */       //   631: aload #11
/*     */       //   633: areturn
/*     */       //   634: aload_0
/*     */       //   635: getfield L$0 : Ljava/lang/Object;
/*     */       //   638: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   641: astore #4
/*     */       //   643: nop
/*     */       //   644: aload_1
/*     */       //   645: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   648: aload_1
/*     */       //   649: checkcast com/intellij/ml/llm/matterhorn/Artifactual
/*     */       //   652: astore #9
/*     */       //   654: aload #9
/*     */       //   656: instanceof com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */       //   659: ifeq -> 687
/*     */       //   662: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */       //   665: aload #9
/*     */       //   667: checkcast com/intellij/ml/llm/matterhorn/FailedArtifact
/*     */       //   670: invokevirtual getReasoning : ()Lcom/intellij/ml/llm/matterhorn/ArtifactReasoning$Failure;
/*     */       //   673: invokevirtual getReason : ()Lcom/intellij/ml/llm/matterhorn/FailureReason;
/*     */       //   676: invokeinterface getMessage : ()Ljava/lang/String;
/*     */       //   681: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */       //   684: goto -> 696
/*     */       //   687: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */       //   690: aconst_null
/*     */       //   691: iconst_1
/*     */       //   692: aconst_null
/*     */       //   693: invokestatic success$default : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */       //   696: astore #10
/*     */       //   698: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   701: aload #10
/*     */       //   703: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;)Ljava/lang/String;
/*     */       //   708: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   711: aload_0
/*     */       //   712: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */       //   715: aload #10
/*     */       //   717: aload_0
/*     */       //   718: checkcast kotlin/coroutines/Continuation
/*     */       //   721: aload_0
/*     */       //   722: aload #4
/*     */       //   724: putfield L$0 : Ljava/lang/Object;
/*     */       //   727: aload_0
/*     */       //   728: bipush #7
/*     */       //   730: putfield label : I
/*     */       //   733: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   736: dup
/*     */       //   737: aload #11
/*     */       //   739: if_acmpne -> 760
/*     */       //   742: aload #11
/*     */       //   744: areturn
/*     */       //   745: aload_0
/*     */       //   746: getfield L$0 : Ljava/lang/Object;
/*     */       //   749: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   752: astore #4
/*     */       //   754: nop
/*     */       //   755: aload_1
/*     */       //   756: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   759: aload_1
/*     */       //   760: pop
/*     */       //   761: nop
/*     */       //   762: aload #4
/*     */       //   764: aload_0
/*     */       //   765: checkcast kotlin/coroutines/Continuation
/*     */       //   768: aload_0
/*     */       //   769: aconst_null
/*     */       //   770: putfield L$0 : Ljava/lang/Object;
/*     */       //   773: aload_0
/*     */       //   774: bipush #8
/*     */       //   776: putfield label : I
/*     */       //   779: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   782: dup
/*     */       //   783: aload #11
/*     */       //   785: if_acmpne -> 797
/*     */       //   788: aload #11
/*     */       //   790: areturn
/*     */       //   791: nop
/*     */       //   792: aload_1
/*     */       //   793: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   796: aload_1
/*     */       //   797: pop
/*     */       //   798: goto -> 826
/*     */       //   801: astore #5
/*     */       //   803: aload #5
/*     */       //   805: athrow
/*     */       //   806: astore #5
/*     */       //   808: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   811: aload #5
/*     */       //   813: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   816: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   821: aload #5
/*     */       //   823: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   826: goto -> 1280
/*     */       //   829: astore #5
/*     */       //   831: aload #4
/*     */       //   833: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */       //   836: aload #5
/*     */       //   838: invokevirtual onCancellation : (Ljava/util/concurrent/CancellationException;)V
/*     */       //   841: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   844: invokeinterface isExitInProgress : ()Z
/*     */       //   849: ifne -> 921
/*     */       //   852: aload_0
/*     */       //   853: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */       //   856: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */       //   859: aload #5
/*     */       //   861: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   864: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   869: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */       //   872: aload_0
/*     */       //   873: checkcast kotlin/coroutines/Continuation
/*     */       //   876: aload_0
/*     */       //   877: aload #4
/*     */       //   879: putfield L$0 : Ljava/lang/Object;
/*     */       //   882: aload_0
/*     */       //   883: aconst_null
/*     */       //   884: putfield L$1 : Ljava/lang/Object;
/*     */       //   887: aload_0
/*     */       //   888: bipush #9
/*     */       //   890: putfield label : I
/*     */       //   893: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   896: dup
/*     */       //   897: aload #11
/*     */       //   899: if_acmpne -> 920
/*     */       //   902: aload #11
/*     */       //   904: areturn
/*     */       //   905: aload_0
/*     */       //   906: getfield L$0 : Ljava/lang/Object;
/*     */       //   909: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   912: astore #4
/*     */       //   914: nop
/*     */       //   915: aload_1
/*     */       //   916: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   919: aload_1
/*     */       //   920: pop
/*     */       //   921: nop
/*     */       //   922: aload #4
/*     */       //   924: aload_0
/*     */       //   925: checkcast kotlin/coroutines/Continuation
/*     */       //   928: aload_0
/*     */       //   929: aconst_null
/*     */       //   930: putfield L$0 : Ljava/lang/Object;
/*     */       //   933: aload_0
/*     */       //   934: aconst_null
/*     */       //   935: putfield L$1 : Ljava/lang/Object;
/*     */       //   938: aload_0
/*     */       //   939: bipush #10
/*     */       //   941: putfield label : I
/*     */       //   944: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   947: dup
/*     */       //   948: aload #11
/*     */       //   950: if_acmpne -> 962
/*     */       //   953: aload #11
/*     */       //   955: areturn
/*     */       //   956: nop
/*     */       //   957: aload_1
/*     */       //   958: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   961: aload_1
/*     */       //   962: pop
/*     */       //   963: goto -> 991
/*     */       //   966: astore #5
/*     */       //   968: aload #5
/*     */       //   970: athrow
/*     */       //   971: astore #5
/*     */       //   973: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   976: aload #5
/*     */       //   978: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   981: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   986: aload #5
/*     */       //   988: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   991: goto -> 1280
/*     */       //   994: astore #5
/*     */       //   996: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   999: aload #5
/*     */       //   1001: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1004: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1009: aload #5
/*     */       //   1011: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   1014: getstatic com/intellij/ml/llm/matterhorn/helpers/TeamCityLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/helpers/TeamCityLogger;
/*     */       //   1017: ldc_w 'Generation is failed.'
/*     */       //   1020: aload #5
/*     */       //   1022: invokevirtual toString : ()Ljava/lang/String;
/*     */       //   1025: invokevirtual error : (Ljava/lang/String;Ljava/lang/String;)V
/*     */       //   1028: aload #5
/*     */       //   1030: instanceof java/lang/Exception
/*     */       //   1033: ifeq -> 1063
/*     */       //   1036: aload #4
/*     */       //   1038: invokevirtual getListener : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContextListenerProxy;
/*     */       //   1041: aload #5
/*     */       //   1043: checkcast java/lang/Exception
/*     */       //   1046: new com/intellij/ml/llm/matterhorn/ArtifactId
/*     */       //   1049: dup
/*     */       //   1050: aload_0
/*     */       //   1051: getfield $name : Ljava/lang/String;
/*     */       //   1054: invokestatic getRootArtifactType : ()Lcom/intellij/ml/llm/matterhorn/ArtifactType;
/*     */       //   1057: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ArtifactType;)V
/*     */       //   1060: invokevirtual onException : (Ljava/lang/Exception;Lcom/intellij/ml/llm/matterhorn/ArtifactId;)V
/*     */       //   1063: aload_0
/*     */       //   1064: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;
/*     */       //   1067: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */       //   1070: aload #5
/*     */       //   1072: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1075: invokevirtual error : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */       //   1078: aload_0
/*     */       //   1079: checkcast kotlin/coroutines/Continuation
/*     */       //   1082: aload_0
/*     */       //   1083: aload #4
/*     */       //   1085: putfield L$0 : Ljava/lang/Object;
/*     */       //   1088: aload_0
/*     */       //   1089: aconst_null
/*     */       //   1090: putfield L$1 : Ljava/lang/Object;
/*     */       //   1093: aload_0
/*     */       //   1094: bipush #11
/*     */       //   1096: putfield label : I
/*     */       //   1099: invokestatic access$exitApplication : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1102: dup
/*     */       //   1103: aload #11
/*     */       //   1105: if_acmpne -> 1126
/*     */       //   1108: aload #11
/*     */       //   1110: areturn
/*     */       //   1111: aload_0
/*     */       //   1112: getfield L$0 : Ljava/lang/Object;
/*     */       //   1115: checkcast com/intellij/ml/llm/matterhorn/RootExecutionContext
/*     */       //   1118: astore #4
/*     */       //   1120: nop
/*     */       //   1121: aload_1
/*     */       //   1122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1125: aload_1
/*     */       //   1126: pop
/*     */       //   1127: nop
/*     */       //   1128: aload #4
/*     */       //   1130: aload_0
/*     */       //   1131: checkcast kotlin/coroutines/Continuation
/*     */       //   1134: aload_0
/*     */       //   1135: aconst_null
/*     */       //   1136: putfield L$0 : Ljava/lang/Object;
/*     */       //   1139: aload_0
/*     */       //   1140: bipush #12
/*     */       //   1142: putfield label : I
/*     */       //   1145: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1148: dup
/*     */       //   1149: aload #11
/*     */       //   1151: if_acmpne -> 1163
/*     */       //   1154: aload #11
/*     */       //   1156: areturn
/*     */       //   1157: nop
/*     */       //   1158: aload_1
/*     */       //   1159: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1162: aload_1
/*     */       //   1163: pop
/*     */       //   1164: goto -> 1192
/*     */       //   1167: astore #5
/*     */       //   1169: aload #5
/*     */       //   1171: athrow
/*     */       //   1172: astore #5
/*     */       //   1174: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   1177: aload #5
/*     */       //   1179: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1182: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1187: aload #5
/*     */       //   1189: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   1192: goto -> 1280
/*     */       //   1195: astore #5
/*     */       //   1197: nop
/*     */       //   1198: aload #4
/*     */       //   1200: aload_0
/*     */       //   1201: checkcast kotlin/coroutines/Continuation
/*     */       //   1204: aload_0
/*     */       //   1205: aload #5
/*     */       //   1207: putfield L$0 : Ljava/lang/Object;
/*     */       //   1210: aload_0
/*     */       //   1211: aconst_null
/*     */       //   1212: putfield L$1 : Ljava/lang/Object;
/*     */       //   1215: aload_0
/*     */       //   1216: bipush #13
/*     */       //   1218: putfield label : I
/*     */       //   1221: invokevirtual close : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   1224: dup
/*     */       //   1225: aload #11
/*     */       //   1227: if_acmpne -> 1248
/*     */       //   1230: aload #11
/*     */       //   1232: areturn
/*     */       //   1233: aload_0
/*     */       //   1234: getfield L$0 : Ljava/lang/Object;
/*     */       //   1237: checkcast java/lang/Throwable
/*     */       //   1240: astore #5
/*     */       //   1242: nop
/*     */       //   1243: aload_1
/*     */       //   1244: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   1247: aload_1
/*     */       //   1248: pop
/*     */       //   1249: goto -> 1277
/*     */       //   1252: astore #6
/*     */       //   1254: aload #6
/*     */       //   1256: athrow
/*     */       //   1257: astore #6
/*     */       //   1259: invokestatic access$getLOG$cp : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   1262: aload #6
/*     */       //   1264: invokevirtual getMessage : ()Ljava/lang/String;
/*     */       //   1267: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   1272: aload #6
/*     */       //   1274: invokevirtual warn : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   1277: aload #5
/*     */       //   1279: athrow
/*     */       //   1280: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   1283: areturn
/*     */       //   1284: new java/lang/IllegalStateException
/*     */       //   1287: dup
/*     */       //   1288: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   1291: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   1294: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #299	-> 3
/*     */       //   #300	-> 84
/*     */       //   #381	-> 95
/*     */       //   #382	-> 99
/*     */       //   #300	-> 119
/*     */       //   #301	-> 123
/*     */       //   #302	-> 131
/*     */       //   #299	-> 178
/*     */       //   #303	-> 199
/*     */       //   #305	-> 210
/*     */       //   #306	-> 211
/*     */       //   #299	-> 256
/*     */       //   #307	-> 282
/*     */       //   #299	-> 319
/*     */       //   #309	-> 350
/*     */       //   #309	-> 368
/*     */       //   #310	-> 371
/*     */       //   #313	-> 381
/*     */       //   #299	-> 426
/*     */       //   #314	-> 457
/*     */       //   #314	-> 475
/*     */       //   #315	-> 478
/*     */       //   #318	-> 488
/*     */       //   #299	-> 537
/*     */       //   #319	-> 568
/*     */       //   #320	-> 577
/*     */       //   #299	-> 631
/*     */       //   #324	-> 654
/*     */       //   #325	-> 662
/*     */       //   #328	-> 687
/*     */       //   #324	-> 696
/*     */       //   #330	-> 698
/*     */       //   #331	-> 711
/*     */       //   #299	-> 742
/*     */       //   #346	-> 760
/*     */       //   #347	-> 762
/*     */       //   #299	-> 788
/*     */       //   #347	-> 797
/*     */       //   #348	-> 801
/*     */       //   #349	-> 803
/*     */       //   #350	-> 806
/*     */       //   #351	-> 808
/*     */       //   #353	-> 826
/*     */       //   #333	-> 829
/*     */       //   #334	-> 831
/*     */       //   #335	-> 841
/*     */       //   #336	-> 852
/*     */       //   #299	-> 902
/*     */       //   #346	-> 920
/*     */       //   #347	-> 922
/*     */       //   #299	-> 953
/*     */       //   #347	-> 962
/*     */       //   #348	-> 966
/*     */       //   #349	-> 968
/*     */       //   #350	-> 971
/*     */       //   #351	-> 973
/*     */       //   #353	-> 991
/*     */       //   #338	-> 994
/*     */       //   #339	-> 996
/*     */       //   #340	-> 1014
/*     */       //   #341	-> 1028
/*     */       //   #342	-> 1036
/*     */       //   #344	-> 1063
/*     */       //   #299	-> 1108
/*     */       //   #346	-> 1126
/*     */       //   #347	-> 1128
/*     */       //   #299	-> 1154
/*     */       //   #347	-> 1163
/*     */       //   #348	-> 1167
/*     */       //   #349	-> 1169
/*     */       //   #350	-> 1172
/*     */       //   #351	-> 1174
/*     */       //   #353	-> 1192
/*     */       //   #346	-> 1195
/*     */       //   #347	-> 1198
/*     */       //   #299	-> 1230
/*     */       //   #347	-> 1248
/*     */       //   #348	-> 1252
/*     */       //   #349	-> 1254
/*     */       //   #350	-> 1257
/*     */       //   #351	-> 1259
/*     */       //   #354	-> 1280
/*     */       //   #299	-> 1284
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   123	58	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   189	70	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   276	46	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   339	90	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   446	94	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   557	68	2	service	Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;
/*     */       //   92	27	3	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */       //   131	41	3	llmProxy	Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;
/*     */       //   199	60	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   268	54	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   331	98	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   438	102	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   549	85	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   643	102	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   754	28	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   829	76	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   914	33	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   994	117	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   1120	28	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   1195	29	4	context	Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */       //   99	20	5	serviceClass$iv	Ljava/lang/Class;
/*     */       //   350	18	5	openProblems	Ljava/util/List;
/*     */       //   368	13	5	openProblems	Ljava/util/List;
/*     */       //   803	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */       //   808	18	5	th	Ljava/lang/Throwable;
/*     */       //   831	65	5	e	Ljava/util/concurrent/CancellationException;
/*     */       //   968	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */       //   973	18	5	th	Ljava/lang/Throwable;
/*     */       //   996	106	5	e	Ljava/lang/Throwable;
/*     */       //   1169	3	5	th	Ljava/util/concurrent/CancellationException;
/*     */       //   1174	18	5	th	Ljava/lang/Throwable;
/*     */       //   457	18	6	projectProblem	Ljava/util/List;
/*     */       //   475	13	6	projectProblem	Ljava/util/List;
/*     */       //   1254	3	6	th	Ljava/util/concurrent/CancellationException;
/*     */       //   1259	18	6	th	Ljava/lang/Throwable;
/*     */       //   568	57	7	request	Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;
/*     */       //   577	48	8	source	Lcom/intellij/ml/llm/matterhorn/ProjectFileStructure;
/*     */       //   654	33	9	artifact	Lcom/intellij/ml/llm/matterhorn/Artifactual;
/*     */       //   698	38	10	exitCode	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */       //   95	24	4	$i$f$service	I
/*     */       //   0	1295	0	this	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$startGeneration$1;
/*     */       //   84	1200	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   210	250	829	java/util/concurrent/CancellationException
/*     */       //   210	250	994	java/lang/Throwable
/*     */       //   210	250	1195	finally
/*     */       //   276	313	829	java/util/concurrent/CancellationException
/*     */       //   276	313	994	java/lang/Throwable
/*     */       //   276	313	1195	finally
/*     */       //   339	420	829	java/util/concurrent/CancellationException
/*     */       //   339	420	994	java/lang/Throwable
/*     */       //   339	420	1195	finally
/*     */       //   446	531	829	java/util/concurrent/CancellationException
/*     */       //   446	531	994	java/lang/Throwable
/*     */       //   446	531	1195	finally
/*     */       //   557	625	829	java/util/concurrent/CancellationException
/*     */       //   557	625	994	java/lang/Throwable
/*     */       //   557	625	1195	finally
/*     */       //   643	736	829	java/util/concurrent/CancellationException
/*     */       //   643	736	994	java/lang/Throwable
/*     */       //   643	736	1195	finally
/*     */       //   754	761	829	java/util/concurrent/CancellationException
/*     */       //   754	761	994	java/lang/Throwable
/*     */       //   754	761	1195	finally
/*     */       //   761	782	801	java/util/concurrent/CancellationException
/*     */       //   761	782	806	java/lang/Throwable
/*     */       //   791	798	801	java/util/concurrent/CancellationException
/*     */       //   791	798	806	java/lang/Throwable
/*     */       //   829	896	1195	finally
/*     */       //   914	921	1195	finally
/*     */       //   921	947	966	java/util/concurrent/CancellationException
/*     */       //   921	947	971	java/lang/Throwable
/*     */       //   956	963	966	java/util/concurrent/CancellationException
/*     */       //   956	963	971	java/lang/Throwable
/*     */       //   994	1102	1195	finally
/*     */       //   1120	1127	1195	finally
/*     */       //   1127	1148	1167	java/util/concurrent/CancellationException
/*     */       //   1127	1148	1172	java/lang/Throwable
/*     */       //   1157	1164	1167	java/util/concurrent/CancellationException
/*     */       //   1157	1164	1172	java/lang/Throwable
/*     */       //   1195	1197	1195	finally
/*     */       //   1197	1224	1252	java/util/concurrent/CancellationException
/*     */       //   1197	1224	1257	java/lang/Throwable
/*     */       //   1242	1249	1252	java/util/concurrent/CancellationException
/*     */       //   1242	1249	1257	java/lang/Throwable
/*     */     }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarter$startGeneration$1> $completion) {
/*     */       return (Continuation<Unit>)new CommandLineStarter$startGeneration$1(this.$starter, this.$name, this.$args, this.$task, CommandLineStarter.this, $completion);
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((CommandLineStarter$startGeneration$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     @DebugMetadata(f = "CommandLineStarter.kt", l = {321}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter$startGeneration$1$artifact$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/Artifactual;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */     static final class CommandLineStarter$startGeneration$1$artifact$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Artifactual>, Object> { public final Object invokeSuspend(Object $result) {
/* 320 */         Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 321 */             this.label = 1; if (ArtifactRequestExecutorService.getOrCreateArtifact$default(this.$service, this.$request, this.$source, new ExecutionContext(this.$context, null, this.$request, this.$source, null, 16, null), null, (Continuation)this, 8, null) == object) return object;  return ((ArtifactRequestExecutorService.ArtifactResult)ArtifactRequestExecutorService.getOrCreateArtifact$default(this.$service, this.$request, this.$source, new ExecutionContext(this.$context, null, this.$request, this.$source, null, 16, null), null, (Continuation)this, 8, null)).getArtifact();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return ((ArtifactRequestExecutorService.ArtifactResult)SYNTHETIC_LOCAL_VARIABLE_1).getArtifact(); }
/*     */         
/*     */         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */       }
/*     */ 
/*     */       
/*     */       int label;
/*     */ 
/*     */       
/*     */       CommandLineStarter$startGeneration$1$artifact$1(ArtifactRequestExecutorService $service, ArtifactRequest<?, ?> $request, ProjectFileStructure $source, RootExecutionContext $context, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */ 
/*     */       
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super CommandLineStarter$startGeneration$1$artifact$1> $completion) {
/*     */         return (Continuation<Unit>)new CommandLineStarter$startGeneration$1$artifact$1(this.$service, this.$request, this.$source, this.$context, $completion);
/*     */       }
/*     */ 
/*     */       
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((CommandLineStarter$startGeneration$1$artifact$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       } }
/*     */      }
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object exitApplication(GenerationResult result, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$exitApplication$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$exitApplication$1
/*     */     //   11: astore #6
/*     */     //   13: aload #6
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #6
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$exitApplication$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 207, 0 -> 88, 1 -> 168
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: getstatic com/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger.INSTANCE : Lcom/intellij/ml/llm/matterhorn/starter/MatterhornStatusLogger;
/*     */     //   96: getstatic kotlinx/serialization/json/Json.Default : Lkotlinx/serialization/json/Json$Default;
/*     */     //   99: checkcast kotlinx/serialization/json/Json
/*     */     //   102: astore_3
/*     */     //   103: iconst_0
/*     */     //   104: istore #4
/*     */     //   106: aload_3
/*     */     //   107: aload_3
/*     */     //   108: invokevirtual getSerializersModule : ()Lkotlinx/serialization/modules/SerializersModule;
/*     */     //   111: pop
/*     */     //   112: getstatic com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult.Companion : Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;
/*     */     //   115: invokevirtual serializer : ()Lkotlinx/serialization/KSerializer;
/*     */     //   118: checkcast kotlinx/serialization/SerializationStrategy
/*     */     //   121: aload_1
/*     */     //   122: invokevirtual encodeToString : (Lkotlinx/serialization/SerializationStrategy;Ljava/lang/Object;)Ljava/lang/String;
/*     */     //   125: invokevirtual log : (Ljava/lang/String;)V
/*     */     //   128: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*     */     //   131: invokeinterface size : ()I
/*     */     //   136: ifeq -> 188
/*     */     //   139: ldc2_w 10
/*     */     //   142: aload #6
/*     */     //   144: aload #6
/*     */     //   146: aload_1
/*     */     //   147: putfield L$0 : Ljava/lang/Object;
/*     */     //   150: aload #6
/*     */     //   152: iconst_1
/*     */     //   153: putfield label : I
/*     */     //   156: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   159: dup
/*     */     //   160: aload #7
/*     */     //   162: if_acmpne -> 184
/*     */     //   165: aload #7
/*     */     //   167: areturn
/*     */     //   168: aload #6
/*     */     //   170: getfield L$0 : Ljava/lang/Object;
/*     */     //   173: checkcast com/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult
/*     */     //   176: astore_1
/*     */     //   177: aload #5
/*     */     //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   182: aload #5
/*     */     //   184: pop
/*     */     //   185: goto -> 128
/*     */     //   188: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   191: iconst_1
/*     */     //   192: iconst_1
/*     */     //   193: iconst_0
/*     */     //   194: aload_1
/*     */     //   195: invokevirtual getExitCode : ()I
/*     */     //   198: invokeinterface exit : (ZZZI)V
/*     */     //   203: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   206: areturn
/*     */     //   207: new java/lang/IllegalStateException
/*     */     //   210: dup
/*     */     //   211: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   213: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   216: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #357	-> 60
/*     */     //   #358	-> 93
/*     */     //   #384	-> 106
/*     */     //   #358	-> 125
/*     */     //   #360	-> 128
/*     */     //   #361	-> 139
/*     */     //   #357	-> 165
/*     */     //   #361	-> 184
/*     */     //   #363	-> 188
/*     */     //   #364	-> 203
/*     */     //   #357	-> 207
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	32	1	result	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   125	43	1	result	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   177	30	1	result	Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;
/*     */     //   103	22	3	this_$iv	Lkotlinx/serialization/json/Json;
/*     */     //   106	19	4	$i$f$encodeToString	I
/*     */     //   0	217	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	157	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	150	5	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\t\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0332\0020\001:\002\033\034B\031\022\b\b\002\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007B-\b\020\022\006\020\b\032\0020\003\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\004\b\006\020\013J\b\020\022\032\0020\005H\026J%\020\023\032\0020\0242\006\020\025\032\0020\0002\006\020\026\032\0020\0272\006\020\030\032\0020\031H\001¢\006\002\b\032R\034\020\002\032\0020\0038\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\020\020\021¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;", "", "exitCode", "", "message", "", "<init>", "(ILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExitCode$annotations", "()V", "getExitCode", "()I", "getMessage", "()Ljava/lang/String;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$matterhorn", "Companion", "$serializer", "matterhorn"})
/*     */   public static final class GenerationResult
/*     */   {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     
/*     */     private final int exitCode;
/*     */     
/*     */     @NotNull
/*     */     private final String message;
/*     */     
/*     */     @NotNull
/*     */     private static final String DEFAULT_ERROR_MESSAGE = "Project generation failed.";
/*     */     
/*     */     public GenerationResult(int exitCode, @NotNull String message) {
/* 368 */       this.exitCode = exitCode; this.message = message; } public final int getExitCode() { return this.exitCode; } @NotNull public final String getMessage() { return this.message; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\b\b\002\020\006\032\0020\007J\022\020\t\032\0020\0052\n\b\002\020\006\032\004\030\0010\007J\f\020\n\032\b\022\004\022\0020\0050\013R\016\020\b\032\0020\007XT¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;", "", "<init>", "()V", "success", "Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;", "message", "", "DEFAULT_ERROR_MESSAGE", "error", "serializer", "Lkotlinx/serialization/KSerializer;", "matterhorn"}) public static final class Companion { private Companion() {} @NotNull
/* 369 */       public final KSerializer<CommandLineStarter.GenerationResult> serializer() { return (KSerializer<CommandLineStarter.GenerationResult>)CommandLineStarter.GenerationResult.$serializer.INSTANCE; } @NotNull
/* 370 */       public final CommandLineStarter.GenerationResult success(@NotNull String message) { Intrinsics.checkNotNullParameter(message, "message"); return new CommandLineStarter.GenerationResult(0, message); } @NotNull
/*     */       public final CommandLineStarter.GenerationResult error(@Nullable String message) {
/* 372 */         if (message == null); super(message, "Project generation failed."); return new CommandLineStarter.GenerationResult();
/*     */       } }
/*     */     @NotNull
/*     */     public String toString() {
/* 376 */       return "GenerationResult(exitCode=" + this.exitCode + ", message='" + this.message + "')";
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\b\b\002\020\006\032\0020\007J\022\020\t\032\0020\0052\n\b\002\020\006\032\004\030\0010\007J\f\020\n\032\b\022\004\022\0020\0050\013R\016\020\b\032\0020\007XT¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult$Companion;", "", "<init>", "()V", "success", "Lcom/intellij/ml/llm/matterhorn/starter/CommandLineStarter$GenerationResult;", "message", "", "DEFAULT_ERROR_MESSAGE", "error", "serializer", "Lkotlinx/serialization/KSerializer;", "matterhorn"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<CommandLineStarter.GenerationResult> serializer() {
/*     */       return (KSerializer<CommandLineStarter.GenerationResult>)CommandLineStarter.GenerationResult.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CommandLineStarter.GenerationResult success(@NotNull String message) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return new CommandLineStarter.GenerationResult(0, message);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CommandLineStarter.GenerationResult error(@Nullable String message) {
/*     */       if (message == null);
/*     */       super(message, "Project generation failed.");
/*     */       return new CommandLineStarter.GenerationResult();
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {361}, i = {0}, s = {"L$0"}, n = {"result"}, m = "exitApplication", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarter$exitApplication$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$exitApplication$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarter.this.exitApplication(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {208, 211}, i = {1}, s = {"L$0"}, n = {"result"}, m = "loadProjectFromExternalCommandLine", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarter$loadProjectFromExternalCommandLine$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$loadProjectFromExternalCommandLine$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarter.this.loadProjectFromExternalCommandLine(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {273, 277, 279, 286}, i = {0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"commandName", "this", "args", "commandName", "file", "baseDir", "starter", "this", "args", "commandName", "file", "starter", "this", "args", "commandName", "file", "starter", "project"}, m = "processExternalCommandLine", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarter$processExternalCommandLine$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$processExternalCommandLine$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarter.this.processExternalCommandLine(null, null, (Continuation<? super CliResult>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "CommandLineStarter.kt", l = {200}, i = {0}, s = {"L$0"}, n = {"lifecyclePublisher"}, m = "start", c = "com.intellij.ml.llm.matterhorn.starter.CommandLineStarter")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandLineStarter$start$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     CommandLineStarter$start$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandLineStarter.this.start(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CommandLineStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */