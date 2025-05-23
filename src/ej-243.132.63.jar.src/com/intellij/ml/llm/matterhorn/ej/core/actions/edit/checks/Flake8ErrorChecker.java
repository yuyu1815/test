/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.Result;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ResultKt;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionResult;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlin.time.Duration;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.annotations.VisibleForTesting;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\002\b\003\030\000 \0212\0020\001:\001\021B\021\b\007\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J$\020\006\032\b\022\004\022\0020\b0\0072\006\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\rJ\020\020\016\032\0020\0172\006\020\020\032\0020\017H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker;", "agentContext", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "stripAnsiCodes", "", "input", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nSyntaxChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyntaxChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,153:1\n14#2:154\n*S KotlinDebug\n*F\n+ 1 SyntaxChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker\n*L\n151#1:154\n*E\n"})
/*     */ public final class Flake8ErrorChecker
/*     */   implements SyntaxChecker
/*     */ {
/*     */   @VisibleForTesting
/*     */   public Flake8ErrorChecker(@NotNull ExecutionAgentContext agentContext) {
/*  84 */     this.agentContext = agentContext; } @NotNull public String getNameForLogging() { return SyntaxChecker.DefaultImpls.getNameForLogging(this); }
/*     */ 
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
/*     */   public Object findErrors(@NotNull Project project, @NotNull PsiFile file, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$findErrors$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$findErrors$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$findErrors$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #11
/*     */     //   50: aload #11
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #10
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #12
/*     */     //   62: aload #11
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 611, 0 -> 100, 1 -> 183, 2 -> 304, 3 -> 502, 4 -> 599
/*     */     //   100: aload #10
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_1
/*     */     //   106: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   109: dup
/*     */     //   110: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   113: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   116: astore #5
/*     */     //   118: aload #5
/*     */     //   120: ldc 'toNioPath(...)'
/*     */     //   122: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   125: aload #5
/*     */     //   127: astore #4
/*     */     //   129: aload_0
/*     */     //   130: getfield agentContext : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   133: invokeinterface getExecutionEnvironment : ()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;
/*     */     //   138: astore #5
/*     */     //   140: aload #5
/*     */     //   142: aload #11
/*     */     //   144: aload #11
/*     */     //   146: aload_0
/*     */     //   147: putfield L$0 : Ljava/lang/Object;
/*     */     //   150: aload #11
/*     */     //   152: aload_2
/*     */     //   153: putfield L$1 : Ljava/lang/Object;
/*     */     //   156: aload #11
/*     */     //   158: aload #4
/*     */     //   160: putfield L$2 : Ljava/lang/Object;
/*     */     //   163: aload #11
/*     */     //   165: iconst_1
/*     */     //   166: putfield label : I
/*     */     //   169: invokeinterface getOrCreateSession : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   174: dup
/*     */     //   175: aload #12
/*     */     //   177: if_acmpne -> 218
/*     */     //   180: aload #12
/*     */     //   182: areturn
/*     */     //   183: aload #11
/*     */     //   185: getfield L$2 : Ljava/lang/Object;
/*     */     //   188: checkcast java/nio/file/Path
/*     */     //   191: astore #4
/*     */     //   193: aload #11
/*     */     //   195: getfield L$1 : Ljava/lang/Object;
/*     */     //   198: checkcast com/intellij/psi/PsiFile
/*     */     //   201: astore_2
/*     */     //   202: aload #11
/*     */     //   204: getfield L$0 : Ljava/lang/Object;
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker
/*     */     //   210: astore_0
/*     */     //   211: aload #10
/*     */     //   213: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   216: aload #10
/*     */     //   218: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   221: aconst_null
/*     */     //   222: iconst_1
/*     */     //   223: aconst_null
/*     */     //   224: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   227: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   230: astore #6
/*     */     //   232: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker.flake8IsAvailable : Ljava/lang/Boolean;
/*     */     //   235: ifnonnull -> 427
/*     */     //   238: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$Companion;
/*     */     //   241: invokevirtual getSYNTAX_CHECKING_TIMEOUT-UwyO8pc : ()J
/*     */     //   244: getstatic kotlin/time/DurationUnit.MILLISECONDS : Lkotlin/time/DurationUnit;
/*     */     //   247: invokestatic toLong-impl : (JLkotlin/time/DurationUnit;)J
/*     */     //   250: lstore #8
/*     */     //   252: aload #6
/*     */     //   254: ldc 'flake8 --version'
/*     */     //   256: lload #8
/*     */     //   258: invokestatic boxLong : (J)Ljava/lang/Long;
/*     */     //   261: aload #4
/*     */     //   263: aload #11
/*     */     //   265: aload #11
/*     */     //   267: aload_0
/*     */     //   268: putfield L$0 : Ljava/lang/Object;
/*     */     //   271: aload #11
/*     */     //   273: aload_2
/*     */     //   274: putfield L$1 : Ljava/lang/Object;
/*     */     //   277: aload #11
/*     */     //   279: aload #6
/*     */     //   281: putfield L$2 : Ljava/lang/Object;
/*     */     //   284: aload #11
/*     */     //   286: iconst_2
/*     */     //   287: putfield label : I
/*     */     //   290: invokeinterface execute : (Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   295: dup
/*     */     //   296: aload #12
/*     */     //   298: if_acmpne -> 339
/*     */     //   301: aload #12
/*     */     //   303: areturn
/*     */     //   304: aload #11
/*     */     //   306: getfield L$2 : Ljava/lang/Object;
/*     */     //   309: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   312: astore #6
/*     */     //   314: aload #11
/*     */     //   316: getfield L$1 : Ljava/lang/Object;
/*     */     //   319: checkcast com/intellij/psi/PsiFile
/*     */     //   322: astore_2
/*     */     //   323: aload #11
/*     */     //   325: getfield L$0 : Ljava/lang/Object;
/*     */     //   328: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker
/*     */     //   331: astore_0
/*     */     //   332: aload #10
/*     */     //   334: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   337: aload #10
/*     */     //   339: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   342: aconst_null
/*     */     //   343: iconst_1
/*     */     //   344: aconst_null
/*     */     //   345: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   348: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */     //   351: astore #7
/*     */     //   353: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$Companion;
/*     */     //   356: pop
/*     */     //   357: aload #7
/*     */     //   359: invokevirtual getExitCode : ()I
/*     */     //   362: ifne -> 369
/*     */     //   365: iconst_1
/*     */     //   366: goto -> 370
/*     */     //   369: iconst_0
/*     */     //   370: invokestatic boxBoolean : (Z)Ljava/lang/Boolean;
/*     */     //   373: putstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker.flake8IsAvailable : Ljava/lang/Boolean;
/*     */     //   376: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker.flake8IsAvailable : Ljava/lang/Boolean;
/*     */     //   379: dup
/*     */     //   380: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   383: invokevirtual booleanValue : ()Z
/*     */     //   386: ifne -> 427
/*     */     //   389: aload #7
/*     */     //   391: invokevirtual getOutput : ()Ljava/lang/String;
/*     */     //   394: aload #7
/*     */     //   396: invokevirtual getExitCode : ()I
/*     */     //   399: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */     //   404: astore #8
/*     */     //   406: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   409: aload #8
/*     */     //   411: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   414: new java/lang/IllegalStateException
/*     */     //   417: dup
/*     */     //   418: aload #8
/*     */     //   420: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   423: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   426: athrow
/*     */     //   427: aload_2
/*     */     //   428: invokeinterface getOriginalFile : ()Lcom/intellij/psi/PsiFile;
/*     */     //   433: invokeinterface getVirtualFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   438: astore #7
/*     */     //   440: aload #7
/*     */     //   442: invokevirtual getExtension : ()Ljava/lang/String;
/*     */     //   445: astore #8
/*     */     //   447: aload #8
/*     */     //   449: ldc 'py'
/*     */     //   451: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   454: ifeq -> 607
/*     */     //   457: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   462: aload #11
/*     */     //   464: aload #11
/*     */     //   466: aload_0
/*     */     //   467: putfield L$0 : Ljava/lang/Object;
/*     */     //   470: aload #11
/*     */     //   472: aload #6
/*     */     //   474: putfield L$1 : Ljava/lang/Object;
/*     */     //   477: aload #11
/*     */     //   479: aload #7
/*     */     //   481: putfield L$2 : Ljava/lang/Object;
/*     */     //   484: aload #11
/*     */     //   486: iconst_3
/*     */     //   487: putfield label : I
/*     */     //   490: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   493: dup
/*     */     //   494: aload #12
/*     */     //   496: if_acmpne -> 538
/*     */     //   499: aload #12
/*     */     //   501: areturn
/*     */     //   502: aload #11
/*     */     //   504: getfield L$2 : Ljava/lang/Object;
/*     */     //   507: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   510: astore #7
/*     */     //   512: aload #11
/*     */     //   514: getfield L$1 : Ljava/lang/Object;
/*     */     //   517: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   520: astore #6
/*     */     //   522: aload #11
/*     */     //   524: getfield L$0 : Ljava/lang/Object;
/*     */     //   527: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker
/*     */     //   530: astore_0
/*     */     //   531: aload #10
/*     */     //   533: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   536: aload #10
/*     */     //   538: pop
/*     */     //   539: invokestatic getIO : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */     //   542: checkcast kotlin/coroutines/CoroutineContext
/*     */     //   545: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$findErrors$3
/*     */     //   548: dup
/*     */     //   549: aload #7
/*     */     //   551: aload #6
/*     */     //   553: aload_0
/*     */     //   554: aconst_null
/*     */     //   555: invokespecial <init> : (Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;Lkotlin/coroutines/Continuation;)V
/*     */     //   558: checkcast kotlin/jvm/functions/Function2
/*     */     //   561: aload #11
/*     */     //   563: aload #11
/*     */     //   565: aconst_null
/*     */     //   566: putfield L$0 : Ljava/lang/Object;
/*     */     //   569: aload #11
/*     */     //   571: aconst_null
/*     */     //   572: putfield L$1 : Ljava/lang/Object;
/*     */     //   575: aload #11
/*     */     //   577: aconst_null
/*     */     //   578: putfield L$2 : Ljava/lang/Object;
/*     */     //   581: aload #11
/*     */     //   583: iconst_4
/*     */     //   584: putfield label : I
/*     */     //   587: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   590: dup
/*     */     //   591: aload #12
/*     */     //   593: if_acmpne -> 606
/*     */     //   596: aload #12
/*     */     //   598: areturn
/*     */     //   599: aload #10
/*     */     //   601: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   604: aload #10
/*     */     //   606: areturn
/*     */     //   607: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   610: areturn
/*     */     //   611: new java/lang/IllegalStateException
/*     */     //   614: dup
/*     */     //   615: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   618: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   621: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #86	-> 60
/*     */     //   #87	-> 105
/*     */     //   #88	-> 129
/*     */     //   #89	-> 140
/*     */     //   #86	-> 180
/*     */     //   #89	-> 218
/*     */     //   #90	-> 232
/*     */     //   #94	-> 238
/*     */     //   #91	-> 252
/*     */     //   #92	-> 254
/*     */     //   #94	-> 256
/*     */     //   #93	-> 261
/*     */     //   #91	-> 265
/*     */     //   #86	-> 301
/*     */     //   #95	-> 339
/*     */     //   #91	-> 351
/*     */     //   #96	-> 353
/*     */     //   #97	-> 376
/*     */     //   #99	-> 389
/*     */     //   #98	-> 404
/*     */     //   #100	-> 406
/*     */     //   #101	-> 414
/*     */     //   #104	-> 427
/*     */     //   #105	-> 440
/*     */     //   #106	-> 447
/*     */     //   #107	-> 464
/*     */     //   #86	-> 499
/*     */     //   #110	-> 538
/*     */     //   #86	-> 596
/*     */     //   #125	-> 606
/*     */     //   #86	-> 611
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	78	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;
/*     */     //   211	93	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;
/*     */     //   332	57	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;
/*     */     //   427	75	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;
/*     */     //   531	59	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker;
/*     */     //   105	13	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   105	78	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   202	102	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   323	66	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   427	13	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   129	54	4	projectPath	Ljava/nio/file/Path;
/*     */     //   193	72	4	projectPath	Ljava/nio/file/Path;
/*     */     //   140	34	5	env	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;
/*     */     //   232	72	6	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   314	75	6	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   427	75	6	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   522	68	6	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   353	74	7	executionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */     //   440	62	7	originalFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   512	78	7	originalFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   406	21	8	message	Ljava/lang/String;
/*     */     //   447	17	8	extension	Ljava/lang/String;
/*     */     //   0	622	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	561	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	554	10	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit findErrors$lambda$0() {
/* 108 */     FileDocumentManager.getInstance().saveAllDocuments();
/* 109 */     return Unit.INSTANCE;
/* 110 */   } @DebugMetadata(f = "SyntaxChecker.kt", l = {114}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Flake8ErrorChecker$findErrors$3") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class Flake8ErrorChecker$findErrors$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends LineColumnError>>, Object> { int label; Flake8ErrorChecker$findErrors$3(ExecutionSession $executor, Flake8ErrorChecker $receiver, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Path workDir; ExecutionResult res; String str1, strippedOutput; long l; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           
/* 112 */           Intrinsics.checkNotNullExpressionValue(this.$originalFile.toNioPath(), "toNioPath(...)"); workDir = this.$originalFile.toNioPath();
/*     */ 
/*     */           
/* 115 */           str1 = "flake8 --isolated --select=F821,F822,F831,E111,E112,E113,E999,E902 " + workDir;
/*     */           
/* 117 */           l = Duration.toLong-impl(AbstractEditAction.Companion.getSYNTAX_CHECKING_TIMEOUT-UwyO8pc(), DurationUnit.MILLISECONDS); this.label = 1; if (this.$executor.execute(str1, Boxing.boxLong(l), workDir, (Continuation)this) == object)
/* 118 */             return object;  res = (ExecutionResult)ResultKt.unwrap$default((Result)this.$executor.execute(str1, Boxing.boxLong(l), workDir, (Continuation)this), null, 1, null);
/*     */           
/* 120 */           strippedOutput = Flake8ErrorChecker.this.stripAnsiCodes(res.getOutput());
/*     */           
/* 122 */           return Flake8ErrorChecker.Companion.parseLintErrors(strippedOutput);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); res = (ExecutionResult)ResultKt.unwrap$default((Result)SYNTHETIC_LOCAL_VARIABLE_1, null, 1, null); strippedOutput = Flake8ErrorChecker.this.stripAnsiCodes(res.getOutput()); return Flake8ErrorChecker.Companion.parseLintErrors(strippedOutput); }
/*     */        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super Flake8ErrorChecker$findErrors$3> $completion) { return (Continuation<Unit>)new Flake8ErrorChecker$findErrors$3(this.$executor, Flake8ErrorChecker.this, $completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((Flake8ErrorChecker$findErrors$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @DebugMetadata(f = "SyntaxChecker.kt", l = {89, 91, 107, 110}, i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"}, n = {"this", "file", "projectPath", "this", "file", "executor", "this", "executor", "originalFile"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Flake8ErrorChecker") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class Flake8ErrorChecker$findErrors$1 extends ContinuationImpl {
/*     */     Object L$0; Object L$1; Object L$2; int label; Flake8ErrorChecker$findErrors$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE;
/*     */       return Flake8ErrorChecker.this.findErrors(null, null, (Continuation<? super List<? extends Error>>)this); }
/* 129 */   } private final String stripAnsiCodes(String input) { Regex ansiPattern = new Regex("\\u001B\\[.*?m");
/* 130 */     return ansiPattern.replace(input, ""); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bR\022\020\t\032\004\030\0010\nX\016¢\006\004\n\002\020\013R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\016\020\017¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Flake8ErrorChecker$Companion;", "", "<init>", "()V", "parseLintErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError;", "output", "", "flake8IsAvailable", "", "Ljava/lang/Boolean;", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-core"})
/*     */   public static final class Companion { @NotNull
/*     */     public final List<LineColumnError> parseLintErrors(@NotNull String output) {
/* 136 */       Intrinsics.checkNotNullParameter(output, "output"); List<LineColumnError> errors = new ArrayList();
/* 137 */       for (String line : StringsKt.lineSequence(output)) {
/* 138 */         String[] arrayOfString = new String[1]; arrayOfString[0] = ":"; List<String> parts = StringsKt.split$default(line, arrayOfString, false, 0, 6, null);
/* 139 */         if (parts.size() >= 4) {
/* 140 */           StringsKt.toIntOrNull(parts.get(1)); int i = (StringsKt.toIntOrNull(parts.get(1)) != null) ? StringsKt.toIntOrNull(parts.get(1)).intValue() : 0;
/* 141 */           StringsKt.toIntOrNull(parts.get(2)); int column = (StringsKt.toIntOrNull(parts.get(2)) != null) ? StringsKt.toIntOrNull(parts.get(2)).intValue() : 0;
/* 142 */           String text = StringsKt.trim(CollectionsKt.joinToString$default(CollectionsKt.drop(parts, 3), ":", null, null, 0, null, null, 62, null)).toString();
/* 143 */           errors.add(new LineColumnError(i, column, text));
/*     */         } 
/*     */       } 
/* 146 */       return errors;
/*     */     }
/*     */     private Companion() {}
/*     */     @NotNull
/*     */     public final Logger getLogger() {
/* 151 */       return Flake8ErrorChecker.logger; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final ExecutionAgentContext agentContext; @Nullable private static Boolean flake8IsAvailable; static { int $i$f$logger = 0;
/*     */ 
/*     */     
/* 154 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(Flake8ErrorChecker.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(Flake8ErrorChecker.class);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\Flake8ErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */