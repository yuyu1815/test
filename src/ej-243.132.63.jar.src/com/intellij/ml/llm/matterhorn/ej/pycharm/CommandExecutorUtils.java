/*     */ package com.intellij.ml.llm.matterhorn.ej.pycharm;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.module.Module;
/*     */ import com.intellij.openapi.module.ModuleManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.projectRoots.Sdk;
/*     */ import com.intellij.openapi.projectRoots.SdkAdditionalData;
/*     */ import com.intellij.openapi.roots.ProjectRootManager;
/*     */ import com.jetbrains.python.sdk.PyTransferredSdkRootsKt;
/*     */ import com.jetbrains.python.sdk.flavors.conda.PyCondaEnvIdentity;
/*     */ import java.nio.file.Path;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\bÆ\002\030\0002\0020\001:\001\026B\t\b\002¢\006\004\b\002\020\003J&\020\n\032\0020\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\006\020\020\032\0020\021H@¢\006\002\020\022J\034\020\023\032\004\030\0010\024*\0020\0212\006\020\016\032\0020\017H@¢\006\002\020\025R\033\020\004\032\0020\0058BX\002¢\006\f\n\004\b\b\020\t\032\004\b\006\020\007¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;", "", "<init>", "()V", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "getLOG", "()Lcom/intellij/openapi/diagnostic/Logger;", "LOG$delegate", "Lkotlin/Lazy;", "setupPythonCommandExecutor", "", "executor", "Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;", "executionDir", "Ljava/nio/file/Path;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findExistingSdkForPath", "Lcom/intellij/openapi/projectRoots/Sdk;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SetupExistingCondaInterpreterWorkaround", "ej-pycharm"})
/*     */ @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,171:1\n61#2,5:172\n61#2,5:177\n61#2,5:182\n61#2,5:187\n61#2,5:192\n61#2,5:197\n14#2:202\n1#3:203\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils\n*L\n42#1:172,5\n48#1:177,5\n50#1:182,5\n51#1:187,5\n65#1:192,5\n74#1:197,5\n32#1:202\n*E\n"})
/*     */ public final class CommandExecutorUtils {
/*     */   @NotNull
/*  31 */   public static final CommandExecutorUtils INSTANCE = new CommandExecutorUtils(); @NotNull private static final Lazy LOG$delegate = LazyKt.lazy(CommandExecutorUtils::LOG_delegate$lambda$1); private final Logger getLOG() { Lazy lazy = LOG$delegate; return (Logger)lazy.getValue(); } private static final Logger LOG_delegate$lambda$1() {
/*  32 */     int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 202 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(CommandExecutorUtils.class), "getInstance(...)"); Logger logger1 = Logger.getInstance(CommandExecutorUtils.class); Logger it = logger1;
/* 203 */     int $i$a$-also-CommandExecutorUtils$LOG$2$1 = 0;
/*     */     it.setLevel(LogLevel.ALL);
/*     */     return logger1;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object setupPythonCommandExecutor(@NotNull ExecutionSession executor, @NotNull Path executionDir, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$setupPythonCommandExecutor$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$setupPythonCommandExecutor$1
/*     */     //   13: astore #19
/*     */     //   15: aload #19
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #19
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$setupPythonCommandExecutor$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #19
/*     */     //   53: aload #19
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #18
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #20
/*     */     //   65: aload #19
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 947, 0 -> 104, 1 -> 156, 2 -> 356, 3 -> 530, 4 -> 847
/*     */     //   104: aload #18
/*     */     //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   109: aload_0
/*     */     //   110: aload_3
/*     */     //   111: aload_2
/*     */     //   112: aload #19
/*     */     //   114: aload #19
/*     */     //   116: aload_0
/*     */     //   117: putfield L$0 : Ljava/lang/Object;
/*     */     //   120: aload #19
/*     */     //   122: aload_1
/*     */     //   123: putfield L$1 : Ljava/lang/Object;
/*     */     //   126: aload #19
/*     */     //   128: aload_2
/*     */     //   129: putfield L$2 : Ljava/lang/Object;
/*     */     //   132: aload #19
/*     */     //   134: aload_3
/*     */     //   135: putfield L$3 : Ljava/lang/Object;
/*     */     //   138: aload #19
/*     */     //   140: iconst_1
/*     */     //   141: putfield label : I
/*     */     //   144: invokevirtual findExistingSdkForPath : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   147: dup
/*     */     //   148: aload #20
/*     */     //   150: if_acmpne -> 199
/*     */     //   153: aload #20
/*     */     //   155: areturn
/*     */     //   156: aload #19
/*     */     //   158: getfield L$3 : Ljava/lang/Object;
/*     */     //   161: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   164: astore_3
/*     */     //   165: aload #19
/*     */     //   167: getfield L$2 : Ljava/lang/Object;
/*     */     //   170: checkcast java/nio/file/Path
/*     */     //   173: astore_2
/*     */     //   174: aload #19
/*     */     //   176: getfield L$1 : Ljava/lang/Object;
/*     */     //   179: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   182: astore_1
/*     */     //   183: aload #19
/*     */     //   185: getfield L$0 : Ljava/lang/Object;
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils
/*     */     //   191: astore_0
/*     */     //   192: aload #18
/*     */     //   194: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   197: aload #18
/*     */     //   199: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   202: astore #5
/*     */     //   204: aload_0
/*     */     //   205: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   208: astore #6
/*     */     //   210: aconst_null
/*     */     //   211: astore #7
/*     */     //   213: iconst_0
/*     */     //   214: istore #8
/*     */     //   216: aload #6
/*     */     //   218: invokevirtual isDebugEnabled : ()Z
/*     */     //   221: ifeq -> 247
/*     */     //   224: aload #6
/*     */     //   226: astore #17
/*     */     //   228: iconst_0
/*     */     //   229: istore #9
/*     */     //   231: aload_2
/*     */     //   232: aload #5
/*     */     //   234: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   239: aload #17
/*     */     //   241: swap
/*     */     //   242: aload #7
/*     */     //   244: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   247: nop
/*     */     //   248: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround.Companion : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;
/*     */     //   251: invokevirtual fromEnvironment : ()Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   254: astore #6
/*     */     //   256: aload #6
/*     */     //   258: ifnull -> 613
/*     */     //   261: aload_0
/*     */     //   262: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   265: astore #7
/*     */     //   267: aconst_null
/*     */     //   268: astore #8
/*     */     //   270: iconst_0
/*     */     //   271: istore #9
/*     */     //   273: aload #7
/*     */     //   275: invokevirtual isDebugEnabled : ()Z
/*     */     //   278: ifeq -> 303
/*     */     //   281: aload #7
/*     */     //   283: astore #17
/*     */     //   285: iconst_0
/*     */     //   286: istore #10
/*     */     //   288: aload #6
/*     */     //   290: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;)Ljava/lang/String;
/*     */     //   295: aload #17
/*     */     //   297: swap
/*     */     //   298: aload #8
/*     */     //   300: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   303: nop
/*     */     //   304: aload #6
/*     */     //   306: aload_3
/*     */     //   307: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   312: aload #19
/*     */     //   314: aload #19
/*     */     //   316: aload_0
/*     */     //   317: putfield L$0 : Ljava/lang/Object;
/*     */     //   320: aload #19
/*     */     //   322: aload_1
/*     */     //   323: putfield L$1 : Ljava/lang/Object;
/*     */     //   326: aload #19
/*     */     //   328: aload_2
/*     */     //   329: putfield L$2 : Ljava/lang/Object;
/*     */     //   332: aload #19
/*     */     //   334: aload_3
/*     */     //   335: putfield L$3 : Ljava/lang/Object;
/*     */     //   338: aload #19
/*     */     //   340: iconst_2
/*     */     //   341: putfield label : I
/*     */     //   344: invokevirtual setupSdkForCondaEnvironment : (Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   347: dup
/*     */     //   348: aload #20
/*     */     //   350: if_acmpne -> 399
/*     */     //   353: aload #20
/*     */     //   355: areturn
/*     */     //   356: aload #19
/*     */     //   358: getfield L$3 : Ljava/lang/Object;
/*     */     //   361: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   364: astore_3
/*     */     //   365: aload #19
/*     */     //   367: getfield L$2 : Ljava/lang/Object;
/*     */     //   370: checkcast java/nio/file/Path
/*     */     //   373: astore_2
/*     */     //   374: aload #19
/*     */     //   376: getfield L$1 : Ljava/lang/Object;
/*     */     //   379: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   382: astore_1
/*     */     //   383: aload #19
/*     */     //   385: getfield L$0 : Ljava/lang/Object;
/*     */     //   388: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils
/*     */     //   391: astore_0
/*     */     //   392: aload #18
/*     */     //   394: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   397: aload #18
/*     */     //   399: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   402: astore #7
/*     */     //   404: aload_0
/*     */     //   405: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   408: astore #8
/*     */     //   410: aconst_null
/*     */     //   411: astore #9
/*     */     //   413: iconst_0
/*     */     //   414: istore #10
/*     */     //   416: aload #8
/*     */     //   418: invokevirtual isDebugEnabled : ()Z
/*     */     //   421: ifeq -> 446
/*     */     //   424: aload #8
/*     */     //   426: astore #17
/*     */     //   428: iconst_0
/*     */     //   429: istore #11
/*     */     //   431: aload #7
/*     */     //   433: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   438: aload #17
/*     */     //   440: swap
/*     */     //   441: aload #9
/*     */     //   443: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   446: nop
/*     */     //   447: aload_0
/*     */     //   448: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   451: astore #8
/*     */     //   453: aconst_null
/*     */     //   454: astore #9
/*     */     //   456: iconst_0
/*     */     //   457: istore #10
/*     */     //   459: aload #8
/*     */     //   461: invokevirtual isDebugEnabled : ()Z
/*     */     //   464: ifeq -> 612
/*     */     //   467: aload #8
/*     */     //   469: astore #17
/*     */     //   471: iconst_0
/*     */     //   472: istore #11
/*     */     //   474: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   477: aload_3
/*     */     //   478: aload_2
/*     */     //   479: aload #19
/*     */     //   481: aload #19
/*     */     //   483: aload_0
/*     */     //   484: putfield L$0 : Ljava/lang/Object;
/*     */     //   487: aload #19
/*     */     //   489: aload_1
/*     */     //   490: putfield L$1 : Ljava/lang/Object;
/*     */     //   493: aload #19
/*     */     //   495: aload_2
/*     */     //   496: putfield L$2 : Ljava/lang/Object;
/*     */     //   499: aload #19
/*     */     //   501: aload_3
/*     */     //   502: putfield L$3 : Ljava/lang/Object;
/*     */     //   505: aload #19
/*     */     //   507: aload #17
/*     */     //   509: putfield L$4 : Ljava/lang/Object;
/*     */     //   512: aload #19
/*     */     //   514: iconst_3
/*     */     //   515: putfield label : I
/*     */     //   518: invokevirtual findExistingSdkForPath : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   521: dup
/*     */     //   522: aload #20
/*     */     //   524: if_acmpne -> 592
/*     */     //   527: aload #20
/*     */     //   529: areturn
/*     */     //   530: iconst_0
/*     */     //   531: istore #10
/*     */     //   533: iconst_0
/*     */     //   534: istore #11
/*     */     //   536: aload #19
/*     */     //   538: getfield L$4 : Ljava/lang/Object;
/*     */     //   541: checkcast com/intellij/openapi/diagnostic/Logger
/*     */     //   544: astore #17
/*     */     //   546: aconst_null
/*     */     //   547: astore #9
/*     */     //   549: aload #19
/*     */     //   551: getfield L$3 : Ljava/lang/Object;
/*     */     //   554: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   557: astore_3
/*     */     //   558: aload #19
/*     */     //   560: getfield L$2 : Ljava/lang/Object;
/*     */     //   563: checkcast java/nio/file/Path
/*     */     //   566: astore_2
/*     */     //   567: aload #19
/*     */     //   569: getfield L$1 : Ljava/lang/Object;
/*     */     //   572: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   575: astore_1
/*     */     //   576: aload #19
/*     */     //   578: getfield L$0 : Ljava/lang/Object;
/*     */     //   581: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils
/*     */     //   584: astore_0
/*     */     //   585: aload #18
/*     */     //   587: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   590: aload #18
/*     */     //   592: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   595: astore #12
/*     */     //   597: aload #12
/*     */     //   599: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   604: aload #17
/*     */     //   606: swap
/*     */     //   607: aload #9
/*     */     //   609: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   612: nop
/*     */     //   613: aload_3
/*     */     //   614: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   619: invokestatic createTerminalRunner : (Lcom/intellij/openapi/project/Project;)Lorg/jetbrains/plugins/terminal/LocalTerminalDirectRunner;
/*     */     //   622: astore #8
/*     */     //   624: aload #8
/*     */     //   626: ldc 'createTerminalRunner(...)'
/*     */     //   628: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   631: aload #8
/*     */     //   633: astore #7
/*     */     //   635: new org/jetbrains/plugins/terminal/ShellStartupOptions$Builder
/*     */     //   638: dup
/*     */     //   639: invokespecial <init> : ()V
/*     */     //   642: invokevirtual build : ()Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   645: astore #8
/*     */     //   647: aload #7
/*     */     //   649: aload #8
/*     */     //   651: invokevirtual configureStartupOptions : (Lorg/jetbrains/plugins/terminal/ShellStartupOptions;)Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   654: astore #10
/*     */     //   656: aload #10
/*     */     //   658: ldc 'configureStartupOptions(...)'
/*     */     //   660: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   663: aload #10
/*     */     //   665: astore #9
/*     */     //   667: aload #9
/*     */     //   669: invokevirtual getEnvVariables : ()Ljava/util/Map;
/*     */     //   672: ldc 'JEDITERM_SOURCE'
/*     */     //   674: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   679: checkcast java/lang/String
/*     */     //   682: dup
/*     */     //   683: ifnonnull -> 689
/*     */     //   686: pop
/*     */     //   687: ldc ''
/*     */     //   689: astore #10
/*     */     //   691: aload #9
/*     */     //   693: invokevirtual getEnvVariables : ()Ljava/util/Map;
/*     */     //   696: ldc 'JEDITERM_SOURCE_ARGS'
/*     */     //   698: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   703: checkcast java/lang/String
/*     */     //   706: dup
/*     */     //   707: ifnonnull -> 713
/*     */     //   710: pop
/*     */     //   711: ldc ''
/*     */     //   713: astore #11
/*     */     //   715: aload_0
/*     */     //   716: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   719: astore #12
/*     */     //   721: aconst_null
/*     */     //   722: astore #13
/*     */     //   724: iconst_0
/*     */     //   725: istore #14
/*     */     //   727: aload #12
/*     */     //   729: invokevirtual isDebugEnabled : ()Z
/*     */     //   732: ifeq -> 759
/*     */     //   735: aload #12
/*     */     //   737: astore #17
/*     */     //   739: iconst_0
/*     */     //   740: istore #15
/*     */     //   742: aload #10
/*     */     //   744: aload #11
/*     */     //   746: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   751: aload #17
/*     */     //   753: swap
/*     */     //   754: aload #13
/*     */     //   756: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   759: nop
/*     */     //   760: aload #10
/*     */     //   762: checkcast java/lang/CharSequence
/*     */     //   765: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   768: ifne -> 775
/*     */     //   771: iconst_1
/*     */     //   772: goto -> 776
/*     */     //   775: iconst_0
/*     */     //   776: ifeq -> 859
/*     */     //   779: aload #10
/*     */     //   781: aload #11
/*     */     //   783: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   788: astore #12
/*     */     //   790: aload_1
/*     */     //   791: aload #12
/*     */     //   793: aconst_null
/*     */     //   794: aload_2
/*     */     //   795: aload #19
/*     */     //   797: iconst_2
/*     */     //   798: aconst_null
/*     */     //   799: aload #19
/*     */     //   801: aconst_null
/*     */     //   802: putfield L$0 : Ljava/lang/Object;
/*     */     //   805: aload #19
/*     */     //   807: aconst_null
/*     */     //   808: putfield L$1 : Ljava/lang/Object;
/*     */     //   811: aload #19
/*     */     //   813: aconst_null
/*     */     //   814: putfield L$2 : Ljava/lang/Object;
/*     */     //   817: aload #19
/*     */     //   819: aconst_null
/*     */     //   820: putfield L$3 : Ljava/lang/Object;
/*     */     //   823: aload #19
/*     */     //   825: aconst_null
/*     */     //   826: putfield L$4 : Ljava/lang/Object;
/*     */     //   829: aload #19
/*     */     //   831: iconst_4
/*     */     //   832: putfield label : I
/*     */     //   835: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   838: dup
/*     */     //   839: aload #20
/*     */     //   841: if_acmpne -> 854
/*     */     //   844: aload #20
/*     */     //   846: areturn
/*     */     //   847: aload #18
/*     */     //   849: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   852: aload #18
/*     */     //   854: pop
/*     */     //   855: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   858: areturn
/*     */     //   859: aload_0
/*     */     //   860: invokespecial getLOG : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   863: astore #12
/*     */     //   865: aconst_null
/*     */     //   866: astore #13
/*     */     //   868: iconst_0
/*     */     //   869: istore #14
/*     */     //   871: aload #12
/*     */     //   873: invokevirtual isDebugEnabled : ()Z
/*     */     //   876: ifeq -> 942
/*     */     //   879: aload #12
/*     */     //   881: astore #17
/*     */     //   883: iconst_0
/*     */     //   884: istore #15
/*     */     //   886: getstatic org/jetbrains/plugins/terminal/LocalTerminalCustomizer.EP_NAME : Lcom/intellij/openapi/extensions/ExtensionPointName;
/*     */     //   889: invokevirtual getExtensionList : ()Ljava/util/List;
/*     */     //   892: checkcast java/lang/Iterable
/*     */     //   895: ldc ', '
/*     */     //   897: checkcast java/lang/CharSequence
/*     */     //   900: ldc '['
/*     */     //   902: checkcast java/lang/CharSequence
/*     */     //   905: ldc ']'
/*     */     //   907: checkcast java/lang/CharSequence
/*     */     //   910: iconst_0
/*     */     //   911: aconst_null
/*     */     //   912: aconst_null
/*     */     //   913: bipush #56
/*     */     //   915: aconst_null
/*     */     //   916: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   919: astore #16
/*     */     //   921: aload #16
/*     */     //   923: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   928: aconst_null
/*     */     //   929: iconst_1
/*     */     //   930: aconst_null
/*     */     //   931: invokestatic trimMargin$default : (Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   934: aload #17
/*     */     //   936: swap
/*     */     //   937: aload #13
/*     */     //   939: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   942: nop
/*     */     //   943: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   946: areturn
/*     */     //   947: new java/lang/IllegalStateException
/*     */     //   950: dup
/*     */     //   951: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   953: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   956: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 63
/*     */     //   #41	-> 109
/*     */     //   #36	-> 153
/*     */     //   #42	-> 204
/*     */     //   #172	-> 210
/*     */     //   #173	-> 216
/*     */     //   #174	-> 224
/*     */     //   #43	-> 231
/*     */     //   #174	-> 242
/*     */     //   #176	-> 247
/*     */     //   #46	-> 248
/*     */     //   #47	-> 256
/*     */     //   #48	-> 261
/*     */     //   #177	-> 267
/*     */     //   #178	-> 273
/*     */     //   #179	-> 281
/*     */     //   #48	-> 288
/*     */     //   #179	-> 298
/*     */     //   #181	-> 303
/*     */     //   #49	-> 304
/*     */     //   #36	-> 353
/*     */     //   #50	-> 404
/*     */     //   #182	-> 410
/*     */     //   #183	-> 416
/*     */     //   #184	-> 424
/*     */     //   #50	-> 431
/*     */     //   #184	-> 441
/*     */     //   #186	-> 446
/*     */     //   #51	-> 447
/*     */     //   #187	-> 453
/*     */     //   #188	-> 459
/*     */     //   #189	-> 467
/*     */     //   #52	-> 474
/*     */     //   #36	-> 527
/*     */     //   #53	-> 597
/*     */     //   #189	-> 607
/*     */     //   #191	-> 612
/*     */     //   #57	-> 613
/*     */     //   #58	-> 635
/*     */     //   #59	-> 647
/*     */     //   #62	-> 667
/*     */     //   #63	-> 691
/*     */     //   #65	-> 715
/*     */     //   #192	-> 721
/*     */     //   #193	-> 727
/*     */     //   #194	-> 735
/*     */     //   #66	-> 742
/*     */     //   #194	-> 754
/*     */     //   #196	-> 759
/*     */     //   #69	-> 760
/*     */     //   #69	-> 776
/*     */     //   #70	-> 779
/*     */     //   #71	-> 790
/*     */     //   #36	-> 844
/*     */     //   #81	-> 854
/*     */     //   #74	-> 859
/*     */     //   #197	-> 865
/*     */     //   #198	-> 871
/*     */     //   #199	-> 879
/*     */     //   #75	-> 886
/*     */     //   #78	-> 921
/*     */     //   #199	-> 937
/*     */     //   #201	-> 942
/*     */     //   #81	-> 943
/*     */     //   #36	-> 947
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   109	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   192	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   239	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   248	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   295	61	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   392	46	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   438	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   585	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   604	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   613	138	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   751	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   760	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   776	3	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   859	6	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   109	47	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   183	56	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   239	9	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   248	47	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   295	61	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   383	55	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   438	92	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   576	28	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   604	9	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   613	138	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   751	9	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   760	16	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   776	62	1	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   109	47	2	executionDir	Ljava/nio/file/Path;
/*     */     //   174	65	2	executionDir	Ljava/nio/file/Path;
/*     */     //   239	9	2	executionDir	Ljava/nio/file/Path;
/*     */     //   248	47	2	executionDir	Ljava/nio/file/Path;
/*     */     //   295	61	2	executionDir	Ljava/nio/file/Path;
/*     */     //   374	64	2	executionDir	Ljava/nio/file/Path;
/*     */     //   438	92	2	executionDir	Ljava/nio/file/Path;
/*     */     //   567	37	2	executionDir	Ljava/nio/file/Path;
/*     */     //   604	9	2	executionDir	Ljava/nio/file/Path;
/*     */     //   613	138	2	executionDir	Ljava/nio/file/Path;
/*     */     //   751	9	2	executionDir	Ljava/nio/file/Path;
/*     */     //   760	16	2	executionDir	Ljava/nio/file/Path;
/*     */     //   776	62	2	executionDir	Ljava/nio/file/Path;
/*     */     //   109	47	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   165	74	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   239	9	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   248	47	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   295	61	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   365	73	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   438	92	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   558	46	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   604	9	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   613	11	3	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   204	35	5	sdkByDirectory	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   210	18	6	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   256	39	6	workaround	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   295	9	6	workaround	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   304	43	6	workaround	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */     //   213	26	7	e$iv	Ljava/lang/Exception;
/*     */     //   239	8	7	e$iv	Ljava/lang/Exception;
/*     */     //   267	18	7	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   404	34	7	sdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   635	21	7	runner	Lorg/jetbrains/plugins/terminal/LocalTerminalDirectRunner;
/*     */     //   270	25	8	e$iv	Ljava/lang/Exception;
/*     */     //   295	8	8	e$iv	Ljava/lang/Exception;
/*     */     //   410	18	8	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   453	18	8	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   647	9	8	initialStartupOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   413	25	9	e$iv	Ljava/lang/Exception;
/*     */     //   438	8	9	e$iv	Ljava/lang/Exception;
/*     */     //   456	74	9	e$iv	Ljava/lang/Exception;
/*     */     //   558	46	9	e$iv	Ljava/lang/Exception;
/*     */     //   604	8	9	e$iv	Ljava/lang/Exception;
/*     */     //   667	39	9	customizedOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   691	60	10	source	Ljava/lang/String;
/*     */     //   751	9	10	source	Ljava/lang/String;
/*     */     //   760	16	10	source	Ljava/lang/String;
/*     */     //   776	14	10	source	Ljava/lang/String;
/*     */     //   715	36	11	args	Ljava/lang/String;
/*     */     //   751	9	11	args	Ljava/lang/String;
/*     */     //   760	16	11	args	Ljava/lang/String;
/*     */     //   776	14	11	args	Ljava/lang/String;
/*     */     //   597	7	12	secondAttempt	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   721	18	12	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   790	48	12	activation	Ljava/lang/String;
/*     */     //   865	18	12	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   724	27	13	e$iv	Ljava/lang/Exception;
/*     */     //   751	8	13	e$iv	Ljava/lang/Exception;
/*     */     //   868	66	13	e$iv	Ljava/lang/Exception;
/*     */     //   934	8	13	e$iv	Ljava/lang/Exception;
/*     */     //   921	13	16	customizersStr	Ljava/lang/String;
/*     */     //   231	8	9	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$2	I
/*     */     //   216	32	8	$i$f$debug	I
/*     */     //   288	7	10	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$3	I
/*     */     //   273	31	9	$i$f$debug	I
/*     */     //   431	7	11	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$4	I
/*     */     //   416	31	10	$i$f$debug	I
/*     */     //   474	56	11	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$5	I
/*     */     //   459	71	10	$i$f$debug	I
/*     */     //   742	9	15	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$6	I
/*     */     //   727	33	14	$i$f$debug	I
/*     */     //   886	48	15	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$7	I
/*     */     //   871	72	14	$i$f$debug	I
/*     */     //   0	957	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	894	19	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	887	18	$result	Ljava/lang/Object;
/*     */     //   536	68	11	$i$a$-debug$default-CommandExecutorUtils$setupPythonCommandExecutor$5	I
/*     */     //   533	80	10	$i$f$debug	I
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object findExistingSdkForPath(@NotNull ExecutionAgentContext $this$findExistingSdkForPath, @NotNull Path executionDir, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_2
/*     */     //   2: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/nio/file/Path;)Lkotlin/jvm/functions/Function0;
/*     */     //   7: aload_3
/*     */     //   8: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   11: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #84	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */     //   0	12	1	$this$findExistingSdkForPath	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   0	12	2	executionDir	Ljava/nio/file/Path;
/*     */     //   0	12	3	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*     */   private static final Sdk findExistingSdkForPath$lambda$8(ExecutionAgentContext $this_findExistingSdkForPath, Path $executionDir) {
/*     */     return PySdkUtil.findSdkForDirectory($this_findExistingSdkForPath.getProject(), $executionDir, false);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\003\030\000 \0272\0020\001:\001\027B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\030\020\n\032\004\030\0010\0132\006\020\f\032\0020\rH@¢\006\002\020\016J\b\020\017\032\0020\003H\026J\026\020\020\032\n\022\004\022\0020\022\030\0010\021H@¢\006\002\020\023J\020\020\024\032\0020\0252\006\020\026\032\0020\013H\002R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\030"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "", "condaBinaries", "", "condaEnvName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCondaBinaries", "()Ljava/lang/String;", "getCondaEnvName", "setupSdkForCondaEnvironment", "Lcom/intellij/openapi/projectRoots/Sdk;", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toString", "detectCondaEnvironments", "", "Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isCondaSdk", "", "sdk", "Companion", "ej-pycharm"})
/*     */   @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,171:1\n295#2,2:172\n1557#2:174\n1628#2,3:175\n13409#3,2:178\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround\n*L\n122#1:172,2\n163#1:174\n163#1:175,3\n143#1:178,2\n*E\n"})
/*     */   public static final class SetupExistingCondaInterpreterWorkaround {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final String condaBinaries;
/*     */     @NotNull
/*     */     private final String condaEnvName;
/*     */     @NotNull
/*     */     public static final String CONDA_BINARIES_ENV_VAR = "CONDA_BINARIES";
/*     */     @NotNull
/*     */     public static final String CONDA_ENV_NAME_ENV_VAR = "CONDA_ENV_NAME";
/*     */     
/*     */     public SetupExistingCondaInterpreterWorkaround(@NotNull String condaBinaries, @NotNull String condaEnvName) {
/*     */       this.condaBinaries = condaBinaries;
/*     */       this.condaEnvName = condaEnvName;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getCondaBinaries() {
/*     */       return this.condaBinaries;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getCondaEnvName() {
/*     */       return this.condaEnvName;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\007\032\004\030\0010\bR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;", "", "<init>", "()V", "CONDA_BINARIES_ENV_VAR", "", "CONDA_ENV_NAME_ENV_VAR", "fromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "ej-pycharm"})
/*     */     @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,171:1\n61#2,5:172\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n*L\n109#1:172,5\n*E\n"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @Nullable
/*     */       public final CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround fromEnvironment() {
/*     */         // Byte code:
/*     */         //   0: ldc 'CONDA_BINARIES'
/*     */         //   2: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */         //   5: astore_1
/*     */         //   6: ldc 'CONDA_ENV_NAME'
/*     */         //   8: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */         //   11: astore_2
/*     */         //   12: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */         //   15: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   18: astore_3
/*     */         //   19: aconst_null
/*     */         //   20: astore #4
/*     */         //   22: iconst_0
/*     */         //   23: istore #5
/*     */         //   25: aload_3
/*     */         //   26: invokevirtual isDebugEnabled : ()Z
/*     */         //   29: ifeq -> 53
/*     */         //   32: aload_3
/*     */         //   33: astore #7
/*     */         //   35: iconst_0
/*     */         //   36: istore #6
/*     */         //   38: aload_1
/*     */         //   39: aload_2
/*     */         //   40: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   45: aload #7
/*     */         //   47: swap
/*     */         //   48: aload #4
/*     */         //   50: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */         //   53: nop
/*     */         //   54: aload_1
/*     */         //   55: ifnull -> 62
/*     */         //   58: aload_2
/*     */         //   59: ifnonnull -> 64
/*     */         //   62: aconst_null
/*     */         //   63: areturn
/*     */         //   64: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround
/*     */         //   67: dup
/*     */         //   68: aload_1
/*     */         //   69: aload_2
/*     */         //   70: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*     */         //   73: areturn
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #106	-> 0
/*     */         //   #107	-> 6
/*     */         //   #109	-> 12
/*     */         //   #172	-> 19
/*     */         //   #173	-> 25
/*     */         //   #174	-> 32
/*     */         //   #110	-> 38
/*     */         //   #174	-> 48
/*     */         //   #176	-> 53
/*     */         //   #113	-> 54
/*     */         //   #115	-> 64
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   38	7	6	$i$a$-debug$default-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion$fromEnvironment$1	I
/*     */         //   25	29	5	$i$f$debug	I
/*     */         //   19	35	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   22	32	4	e$iv	Ljava/lang/Exception;
/*     */         //   6	68	1	condaBinaries	Ljava/lang/String;
/*     */         //   12	62	2	condaEnvName	Ljava/lang/String;
/*     */         //   0	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;
/*     */       }
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object setupSdkForCondaEnvironment(@NotNull Project project, @NotNull Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_2
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_2
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */       //   11: astore #13
/*     */       //   13: aload #13
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #13
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_2
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #13
/*     */       //   50: aload #13
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #12
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #14
/*     */       //   62: aload #13
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 452, 0 -> 96, 1 -> 134, 2 -> 354, 3 -> 431
/*     */       //   96: aload #12
/*     */       //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   101: aload_0
/*     */       //   102: aload #13
/*     */       //   104: aload #13
/*     */       //   106: aload_0
/*     */       //   107: putfield L$0 : Ljava/lang/Object;
/*     */       //   110: aload #13
/*     */       //   112: aload_1
/*     */       //   113: putfield L$1 : Ljava/lang/Object;
/*     */       //   116: aload #13
/*     */       //   118: iconst_1
/*     */       //   119: putfield label : I
/*     */       //   122: invokespecial detectCondaEnvironments : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   125: dup
/*     */       //   126: aload #14
/*     */       //   128: if_acmpne -> 159
/*     */       //   131: aload #14
/*     */       //   133: areturn
/*     */       //   134: aload #13
/*     */       //   136: getfield L$1 : Ljava/lang/Object;
/*     */       //   139: checkcast com/intellij/openapi/project/Project
/*     */       //   142: astore_1
/*     */       //   143: aload #13
/*     */       //   145: getfield L$0 : Ljava/lang/Object;
/*     */       //   148: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround
/*     */       //   151: astore_0
/*     */       //   152: aload #12
/*     */       //   154: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   157: aload #12
/*     */       //   159: checkcast java/util/List
/*     */       //   162: dup
/*     */       //   163: ifnonnull -> 169
/*     */       //   166: pop
/*     */       //   167: aconst_null
/*     */       //   168: areturn
/*     */       //   169: astore_3
/*     */       //   170: aload_3
/*     */       //   171: checkcast java/lang/Iterable
/*     */       //   174: astore #6
/*     */       //   176: iconst_0
/*     */       //   177: istore #7
/*     */       //   179: aload #6
/*     */       //   181: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   186: astore #8
/*     */       //   188: aload #8
/*     */       //   190: invokeinterface hasNext : ()Z
/*     */       //   195: ifeq -> 256
/*     */       //   198: aload #8
/*     */       //   200: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   205: astore #9
/*     */       //   207: aload #9
/*     */       //   209: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity
/*     */       //   212: astore #10
/*     */       //   214: iconst_0
/*     */       //   215: istore #11
/*     */       //   217: aload #10
/*     */       //   219: instanceof com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity$NamedEnv
/*     */       //   222: ifeq -> 247
/*     */       //   225: aload #10
/*     */       //   227: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity$NamedEnv
/*     */       //   230: invokevirtual getEnvName : ()Ljava/lang/String;
/*     */       //   233: aload_0
/*     */       //   234: getfield condaEnvName : Ljava/lang/String;
/*     */       //   237: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */       //   240: ifeq -> 247
/*     */       //   243: iconst_1
/*     */       //   244: goto -> 248
/*     */       //   247: iconst_0
/*     */       //   248: ifeq -> 188
/*     */       //   251: aload #9
/*     */       //   253: goto -> 257
/*     */       //   256: aconst_null
/*     */       //   257: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity
/*     */       //   260: dup
/*     */       //   261: ifnonnull -> 267
/*     */       //   264: pop
/*     */       //   265: aconst_null
/*     */       //   266: areturn
/*     */       //   267: astore #4
/*     */       //   269: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */       //   272: aload #4
/*     */       //   274: invokevirtual getUserReadableName : ()Ljava/lang/String;
/*     */       //   277: invokevirtual findJdk : (Ljava/lang/String;)Lcom/intellij/openapi/projectRoots/Sdk;
/*     */       //   280: astore #5
/*     */       //   282: aload #5
/*     */       //   284: ifnull -> 299
/*     */       //   287: aload_0
/*     */       //   288: aload #5
/*     */       //   290: invokespecial isCondaSdk : (Lcom/intellij/openapi/projectRoots/Sdk;)Z
/*     */       //   293: ifeq -> 299
/*     */       //   296: aload #5
/*     */       //   298: areturn
/*     */       //   299: new com/jetbrains/python/sdk/flavors/conda/PyCondaCommand
/*     */       //   302: dup
/*     */       //   303: aload_0
/*     */       //   304: getfield condaBinaries : Ljava/lang/String;
/*     */       //   307: aconst_null
/*     */       //   308: aload_1
/*     */       //   309: aconst_null
/*     */       //   310: bipush #8
/*     */       //   312: aconst_null
/*     */       //   313: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/execution/target/TargetEnvironmentConfiguration;Lcom/intellij/openapi/project/Project;Lcom/intellij/execution/target/TargetProgressIndicator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */       //   316: aload #4
/*     */       //   318: invokestatic emptyList : ()Ljava/util/List;
/*     */       //   321: aload_1
/*     */       //   322: aload #13
/*     */       //   324: aload #13
/*     */       //   326: aload_1
/*     */       //   327: putfield L$0 : Ljava/lang/Object;
/*     */       //   330: aload #13
/*     */       //   332: aconst_null
/*     */       //   333: putfield L$1 : Ljava/lang/Object;
/*     */       //   336: aload #13
/*     */       //   338: iconst_2
/*     */       //   339: putfield label : I
/*     */       //   342: invokestatic createCondaSdkFromExistingEnv : (Lcom/jetbrains/python/sdk/flavors/conda/PyCondaCommand;Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;Ljava/util/List;Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   345: dup
/*     */       //   346: aload #14
/*     */       //   348: if_acmpne -> 370
/*     */       //   351: aload #14
/*     */       //   353: areturn
/*     */       //   354: aload #13
/*     */       //   356: getfield L$0 : Ljava/lang/Object;
/*     */       //   359: checkcast com/intellij/openapi/project/Project
/*     */       //   362: astore_1
/*     */       //   363: aload #12
/*     */       //   365: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   368: aload #12
/*     */       //   370: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */       //   373: astore #6
/*     */       //   375: aload #6
/*     */       //   377: invokeinterface getSdkType : ()Lcom/intellij/openapi/projectRoots/SdkTypeId;
/*     */       //   382: dup
/*     */       //   383: ldc 'null cannot be cast to non-null type com.jetbrains.python.sdk.PythonSdkType'
/*     */       //   385: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   388: checkcast com/jetbrains/python/sdk/PythonSdkType
/*     */       //   391: aload #6
/*     */       //   393: invokevirtual setupSdkPaths : (Lcom/intellij/openapi/projectRoots/Sdk;)V
/*     */       //   396: aload #6
/*     */       //   398: aload_1
/*     */       //   399: <illegal opcode> invoke : (Lcom/intellij/openapi/projectRoots/Sdk;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*     */       //   404: aload #13
/*     */       //   406: aload #13
/*     */       //   408: aload #6
/*     */       //   410: putfield L$0 : Ljava/lang/Object;
/*     */       //   413: aload #13
/*     */       //   415: iconst_3
/*     */       //   416: putfield label : I
/*     */       //   419: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   422: dup
/*     */       //   423: aload #14
/*     */       //   425: if_acmpne -> 448
/*     */       //   428: aload #14
/*     */       //   430: areturn
/*     */       //   431: aload #13
/*     */       //   433: getfield L$0 : Ljava/lang/Object;
/*     */       //   436: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */       //   439: astore #6
/*     */       //   441: aload #12
/*     */       //   443: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   446: aload #12
/*     */       //   448: pop
/*     */       //   449: aload #6
/*     */       //   451: areturn
/*     */       //   452: new java/lang/IllegalStateException
/*     */       //   455: dup
/*     */       //   456: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   458: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   461: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #119	-> 60
/*     */       //   #121	-> 101
/*     */       //   #119	-> 131
/*     */       //   #121	-> 159
/*     */       //   #122	-> 170
/*     */       //   #172	-> 179
/*     */       //   #123	-> 217
/*     */       //   #172	-> 248
/*     */       //   #173	-> 256
/*     */       //   #122	-> 257
/*     */       //   #124	-> 265
/*     */       //   #122	-> 267
/*     */       //   #126	-> 269
/*     */       //   #127	-> 282
/*     */       //   #128	-> 296
/*     */       //   #131	-> 299
/*     */       //   #132	-> 316
/*     */       //   #119	-> 351
/*     */       //   #131	-> 373
/*     */       //   #134	-> 375
/*     */       //   #138	-> 396
/*     */       //   #119	-> 428
/*     */       //   #149	-> 448
/*     */       //   #119	-> 452
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   101	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   152	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   169	79	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   248	8	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   256	1	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   257	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   267	29	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   299	17	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   101	33	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   143	23	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   169	79	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   248	8	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   256	1	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   257	7	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   267	29	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   299	55	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   363	59	1	project	Lcom/intellij/openapi/project/Project;
/*     */       //   170	6	3	all	Ljava/util/List;
/*     */       //   269	27	4	matchingEnv	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */       //   299	46	4	matchingEnv	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */       //   282	17	5	existingSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */       //   176	12	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */       //   375	56	6	result	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */       //   441	11	6	result	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */       //   207	49	9	element$iv	Ljava/lang/Object;
/*     */       //   214	33	10	it	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */       //   217	31	11	$i$a$-firstOrNull-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$matchingEnv$1	I
/*     */       //   179	78	7	$i$f$firstOrNull	I
/*     */       //   0	462	2	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	402	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	395	12	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private static final Unit setupSdkForCondaEnvironment$lambda$2(Sdk $result, Project $project) {
/*     */       ProjectJdkTable.getInstance().addJdk($result);
/*     */       ProjectRootManager.getInstance($project).setProjectSdk($result);
/*     */       PyTransferredSdkRootsKt.transferRootsToModulesWithInheritedSdk($project, $result);
/*     */       Module[] arrayOfModule = ModuleManager.Companion.getInstance($project).getModules();
/*     */       int $i$f$forEach = 0;
/*     */       byte b = 0;
/*     */       int i = arrayOfModule.length;
/*     */       if (b < i) {
/*     */         Object element$iv = arrayOfModule[b], object1 = element$iv;
/*     */         int $i$a$-forEach-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$2$1 = 0;
/*     */         ModuleRootModificationUtil.setModuleSdk((Module)object1, $result);
/*     */         PyTransferredSdkRootsKt.transferRoots((Module)object1, $result);
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return super.toString() + "(" + super.toString() + ", " + this.condaBinaries + ")";
/*     */     }
/*     */     
/*     */     private final Object detectCondaEnvironments(Continuation $completion) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: instanceof com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */       //   4: ifeq -> 39
/*     */       //   7: aload_1
/*     */       //   8: checkcast com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */       //   11: astore #15
/*     */       //   13: aload #15
/*     */       //   15: getfield label : I
/*     */       //   18: ldc -2147483648
/*     */       //   20: iand
/*     */       //   21: ifeq -> 39
/*     */       //   24: aload #15
/*     */       //   26: dup
/*     */       //   27: getfield label : I
/*     */       //   30: ldc -2147483648
/*     */       //   32: isub
/*     */       //   33: putfield label : I
/*     */       //   36: goto -> 50
/*     */       //   39: new com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1
/*     */       //   42: dup
/*     */       //   43: aload_0
/*     */       //   44: aload_1
/*     */       //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;Lkotlin/coroutines/Continuation;)V
/*     */       //   48: astore #15
/*     */       //   50: aload #15
/*     */       //   52: getfield result : Ljava/lang/Object;
/*     */       //   55: astore #14
/*     */       //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   60: astore #16
/*     */       //   62: aload #15
/*     */       //   64: getfield label : I
/*     */       //   67: tableswitch default -> 298, 0 -> 88, 1 -> 142
/*     */       //   88: aload #14
/*     */       //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   93: new com/jetbrains/python/sdk/conda/TargetEnvironmentRequestCommandExecutor
/*     */       //   96: dup
/*     */       //   97: new com/intellij/execution/target/local/LocalTargetEnvironmentRequest
/*     */       //   100: dup
/*     */       //   101: invokespecial <init> : ()V
/*     */       //   104: checkcast com/intellij/execution/target/TargetEnvironmentRequest
/*     */       //   107: invokespecial <init> : (Lcom/intellij/execution/target/TargetEnvironmentRequest;)V
/*     */       //   110: astore_2
/*     */       //   111: getstatic com/jetbrains/python/sdk/flavors/conda/PyCondaEnv.Companion : Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnv$Companion;
/*     */       //   114: aload_2
/*     */       //   115: checkcast com/jetbrains/python/sdk/conda/TargetCommandExecutor
/*     */       //   118: aload_0
/*     */       //   119: getfield condaBinaries : Ljava/lang/String;
/*     */       //   122: aload #15
/*     */       //   124: aload #15
/*     */       //   126: iconst_1
/*     */       //   127: putfield label : I
/*     */       //   130: invokevirtual getEnvs-0E7RQCE : (Lcom/jetbrains/python/sdk/conda/TargetCommandExecutor;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   133: dup
/*     */       //   134: aload #16
/*     */       //   136: if_acmpne -> 155
/*     */       //   139: aload #16
/*     */       //   141: areturn
/*     */       //   142: aload #14
/*     */       //   144: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   147: aload #14
/*     */       //   149: checkcast kotlin/Result
/*     */       //   152: invokevirtual unbox-impl : ()Ljava/lang/Object;
/*     */       //   155: astore #4
/*     */       //   157: aload #4
/*     */       //   159: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */       //   162: dup
/*     */       //   163: ifnonnull -> 172
/*     */       //   166: pop
/*     */       //   167: aload #4
/*     */       //   169: goto -> 193
/*     */       //   172: astore #5
/*     */       //   174: iconst_0
/*     */       //   175: istore #6
/*     */       //   177: getstatic com/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;
/*     */       //   180: invokestatic access$getLOG : (Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   183: ldc_w 'Failed to detect conda environments'
/*     */       //   186: aload #5
/*     */       //   188: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   191: aconst_null
/*     */       //   192: areturn
/*     */       //   193: checkcast java/util/List
/*     */       //   196: astore_3
/*     */       //   197: aload_3
/*     */       //   198: checkcast java/lang/Iterable
/*     */       //   201: astore #4
/*     */       //   203: iconst_0
/*     */       //   204: istore #5
/*     */       //   206: aload #4
/*     */       //   208: astore #6
/*     */       //   210: new java/util/ArrayList
/*     */       //   213: dup
/*     */       //   214: aload #4
/*     */       //   216: bipush #10
/*     */       //   218: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */       //   221: invokespecial <init> : (I)V
/*     */       //   224: checkcast java/util/Collection
/*     */       //   227: astore #7
/*     */       //   229: iconst_0
/*     */       //   230: istore #8
/*     */       //   232: aload #6
/*     */       //   234: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   239: astore #9
/*     */       //   241: aload #9
/*     */       //   243: invokeinterface hasNext : ()Z
/*     */       //   248: ifeq -> 291
/*     */       //   251: aload #9
/*     */       //   253: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   258: astore #10
/*     */       //   260: aload #7
/*     */       //   262: aload #10
/*     */       //   264: checkcast com/jetbrains/python/sdk/flavors/conda/PyCondaEnv
/*     */       //   267: astore #11
/*     */       //   269: astore #13
/*     */       //   271: iconst_0
/*     */       //   272: istore #12
/*     */       //   274: aload #11
/*     */       //   276: invokevirtual getEnvIdentity : ()Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnvIdentity;
/*     */       //   279: aload #13
/*     */       //   281: swap
/*     */       //   282: invokeinterface add : (Ljava/lang/Object;)Z
/*     */       //   287: pop
/*     */       //   288: goto -> 241
/*     */       //   291: aload #7
/*     */       //   293: checkcast java/util/List
/*     */       //   296: nop
/*     */       //   297: areturn
/*     */       //   298: new java/lang/IllegalStateException
/*     */       //   301: dup
/*     */       //   302: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   304: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   307: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #156	-> 60
/*     */       //   #158	-> 93
/*     */       //   #159	-> 111
/*     */       //   #156	-> 139
/*     */       //   #159	-> 155
/*     */       //   #160	-> 177
/*     */       //   #161	-> 191
/*     */       //   #159	-> 193
/*     */       //   #163	-> 197
/*     */       //   #174	-> 206
/*     */       //   #175	-> 232
/*     */       //   #176	-> 260
/*     */       //   #163	-> 274
/*     */       //   #176	-> 282
/*     */       //   #177	-> 291
/*     */       //   #174	-> 296
/*     */       //   #163	-> 297
/*     */       //   #156	-> 298
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   93	40	0	this	Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;
/*     */       //   111	22	2	commandExecutor	Lcom/jetbrains/python/sdk/conda/TargetEnvironmentRequestCommandExecutor;
/*     */       //   197	6	3	environments	Ljava/util/List;
/*     */       //   203	26	4	$this$map$iv	Ljava/lang/Iterable;
/*     */       //   174	19	5	it	Ljava/lang/Throwable;
/*     */       //   229	12	6	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */       //   229	64	7	destination$iv$iv	Ljava/util/Collection;
/*     */       //   260	28	10	item$iv$iv	Ljava/lang/Object;
/*     */       //   271	8	11	it	Lcom/jetbrains/python/sdk/flavors/conda/PyCondaEnv;
/*     */       //   177	16	6	$i$a$-getOrElse-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$environments$1	I
/*     */       //   274	5	12	$i$a$-map-CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$2	I
/*     */       //   232	61	8	$i$f$mapTo	I
/*     */       //   206	91	5	$i$f$map	I
/*     */       //   0	308	1	$completion	Lkotlin/coroutines/Continuation;
/*     */       //   50	248	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */       //   57	241	14	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     private final boolean isCondaSdk(Sdk sdk) {
/*     */       SdkAdditionalData sdkAdditionalData = sdk.getSdkAdditionalData();
/*     */       ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData();
/*     */       return (((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null) != null && ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData() != null) ? ((sdkAdditionalData instanceof com.jetbrains.python.sdk.PythonSdkAdditionalData) ? sdkAdditionalData : null).getFlavorAndData().getData() : null instanceof com.jetbrains.python.sdk.flavors.conda.PyCondaFlavorData;
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "CommandExecutorUtils.kt", l = {159}, i = {}, s = {}, n = {}, m = "detectCondaEnvironments", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1 extends ContinuationImpl {
/*     */       int label;
/*     */       
/*     */       CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$detectCondaEnvironments$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround.this.detectCondaEnvironments((Continuation)this);
/*     */       }
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "CommandExecutorUtils.kt", l = {121, 132, 138}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"this", "project", "project", "result"}, m = "setupSdkForCondaEnvironment", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */     static final class CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1 extends ContinuationImpl {
/*     */       Object L$0;
/*     */       Object L$1;
/*     */       int label;
/*     */       
/*     */       CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$setupSdkForCondaEnvironment$1(Continuation $completion) {
/*     */         super($completion);
/*     */       }
/*     */       
/*     */       @Nullable
/*     */       public final Object invokeSuspend(@NotNull Object $result) {
/*     */         this.result = $result;
/*     */         this.label |= Integer.MIN_VALUE;
/*     */         return CommandExecutorUtils.SetupExistingCondaInterpreterWorkaround.this.setupSdkForCondaEnvironment(null, (Continuation<? super Sdk>)this);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\007\032\004\030\0010\bR\016\020\004\032\0020\005XT¢\006\002\n\000R\016\020\006\032\0020\005XT¢\006\002\n\000¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion;", "", "<init>", "()V", "CONDA_BINARIES_ENV_VAR", "", "CONDA_ENV_NAME_ENV_VAR", "fromEnvironment", "Lcom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround;", "ej-pycharm"})
/*     */   @SourceDebugExtension({"SMAP\nCommandExecutorUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,171:1\n61#2,5:172\n*S KotlinDebug\n*F\n+ 1 CommandExecutorUtils.kt\ncom/intellij/ml/llm/matterhorn/ej/pycharm/CommandExecutorUtils$SetupExistingCondaInterpreterWorkaround$Companion\n*L\n109#1:172,5\n*E\n"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
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
/*     */   @DebugMetadata(f = "CommandExecutorUtils.kt", l = {41, 49, 52, 71}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "executor", "executionDir", "context", "this", "executor", "executionDir", "context", "this", "executor", "executionDir", "context"}, m = "setupPythonCommandExecutor", c = "com.intellij.ml.llm.matterhorn.ej.pycharm.CommandExecutorUtils")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class CommandExecutorUtils$setupPythonCommandExecutor$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     CommandExecutorUtils$setupPythonCommandExecutor$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return CommandExecutorUtils.this.setupPythonCommandExecutor(null, null, null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\pycharm\CommandExecutorUtils.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */