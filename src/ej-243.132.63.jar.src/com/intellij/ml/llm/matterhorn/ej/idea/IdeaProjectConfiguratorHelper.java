/*     */ package com.intellij.ml.llm.matterhorn.ej.idea;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ProjectProblem;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.MatterhornActivityKey;
/*     */ import com.intellij.openapi.application.CoroutinesKt;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.externalSystem.autoimport.ExternalSystemProjectTracker;
/*     */ import com.intellij.openapi.progress.ProgressIndicator;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.projectRoots.ProjectJdkTable;
/*     */ import com.intellij.openapi.projectRoots.Sdk;
/*     */ import com.intellij.openapi.roots.LanguageLevelProjectExtension;
/*     */ import com.intellij.openapi.roots.ProjectRootManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.openapi.vfs.VirtualFileUtil;
/*     */ import com.intellij.platform.backend.observation.ActivityKey;
/*     */ import com.intellij.platform.backend.observation.TrackingUtil;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collections;
/*     */ import java.util.Iterator;
/*     */ import java.util.List;
/*     */ import java.util.Locale;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.ArrayIteratorKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\013\n\002\b\002\030\000 \0312\0020\001:\001\031B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\036\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tH@¢\006\002\020\013J\026\020\f\032\0020\0072\006\020\r\032\0020\016H@¢\006\002\020\017J\024\020\020\032\b\022\004\022\0020\0210\tH@¢\006\002\020\022J*\020\023\032\b\022\004\022\0020\0240\t2\006\020\025\032\0020\0242\022\020\026\032\016\022\004\022\0020\024\022\004\022\0020\0300\027H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;", "", "project", "Lcom/intellij/openapi/project/Project;", "<init>", "(Lcom/intellij/openapi/project/Project;)V", "configureAndValidateProjectModel", "", "args", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupJdkIfNeeded", "rootManager", "Lcom/intellij/openapi/roots/ProjectRootManager;", "(Lcom/intellij/openapi/roots/ProjectRootManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "validateProject", "Lcom/intellij/ml/llm/matterhorn/ProjectProblem;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listFiles", "Lcom/intellij/openapi/vfs/VirtualFile;", "file", "filter", "Lkotlin/Function1;", "", "Companion", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nIdeaProjectConfigurator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdeaProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,206:1\n13409#2,2:207\n11165#2:210\n11500#2,3:211\n1#3:209\n14#4:214\n*S KotlinDebug\n*F\n+ 1 IdeaProjectConfigurator.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper\n*L\n77#1:207,2\n161#1:210\n161#1:211,3\n62#1:214\n*E\n"})
/*     */ public final class IdeaProjectConfiguratorHelper
/*     */ {
/*     */   public IdeaProjectConfiguratorHelper(@NotNull Project project) {
/*  60 */     this.project = project; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "getLogger", "()Lcom/intellij/openapi/diagnostic/Logger;", "ej-idea"})
/*     */   public static final class Companion { @NotNull
/*  62 */     public final Logger getLogger() { return IdeaProjectConfiguratorHelper.logger; } private Companion() {} } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final Project project; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 214 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(IdeaProjectConfiguratorHelper.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(IdeaProjectConfiguratorHelper.class);
/*     */   
/*     */   @Nullable
/*     */   public final Object configureAndValidateProjectModel(@NotNull List args, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #13
/*     */     //   50: aload #13
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #12
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #14
/*     */     //   62: aload #13
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 560, 0 -> 100, 1 -> 214, 2 -> 379, 3 -> 457, 4 -> 534
/*     */     //   100: aload #12
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_0
/*     */     //   106: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   109: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vcs/ProjectLevelVcsManager;
/*     */     //   112: astore_3
/*     */     //   113: aload_3
/*     */     //   114: getstatic com/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation.ADD : Lcom/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation;
/*     */     //   117: aconst_null
/*     */     //   118: invokevirtual getStandardConfirmation : (Lcom/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation;Lcom/intellij/openapi/vcs/AbstractVcs;)Lcom/intellij/openapi/vcs/VcsShowConfirmationOption;
/*     */     //   121: getstatic com/intellij/openapi/vcs/VcsShowConfirmationOption$Value.DO_NOTHING_SILENTLY : Lcom/intellij/openapi/vcs/VcsShowConfirmationOption$Value;
/*     */     //   124: invokeinterface setValue : (Lcom/intellij/openapi/vcs/VcsShowConfirmationOption$Value;)V
/*     */     //   129: aload_3
/*     */     //   130: getstatic com/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation.REMOVE : Lcom/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation;
/*     */     //   133: aconst_null
/*     */     //   134: invokevirtual getStandardConfirmation : (Lcom/intellij/openapi/vcs/VcsConfiguration$StandardConfirmation;Lcom/intellij/openapi/vcs/AbstractVcs;)Lcom/intellij/openapi/vcs/VcsShowConfirmationOption;
/*     */     //   137: getstatic com/intellij/openapi/vcs/VcsShowConfirmationOption$Value.DO_NOTHING_SILENTLY : Lcom/intellij/openapi/vcs/VcsShowConfirmationOption$Value;
/*     */     //   140: invokeinterface setValue : (Lcom/intellij/openapi/vcs/VcsShowConfirmationOption$Value;)V
/*     */     //   145: aload_0
/*     */     //   146: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   149: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   152: dup
/*     */     //   153: ifnonnull -> 177
/*     */     //   156: pop
/*     */     //   157: new java/lang/IllegalStateException
/*     */     //   160: dup
/*     */     //   161: aload_0
/*     */     //   162: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   165: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/project/Project;)Ljava/lang/String;
/*     */     //   170: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   173: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   176: athrow
/*     */     //   177: astore #4
/*     */     //   179: aload_0
/*     */     //   180: aload #4
/*     */     //   182: aload #13
/*     */     //   184: aload #13
/*     */     //   186: aload_0
/*     */     //   187: putfield L$0 : Ljava/lang/Object;
/*     */     //   190: aload #13
/*     */     //   192: aload_1
/*     */     //   193: putfield L$1 : Ljava/lang/Object;
/*     */     //   196: aload #13
/*     */     //   198: iconst_1
/*     */     //   199: putfield label : I
/*     */     //   202: invokespecial setupJdkIfNeeded : (Lcom/intellij/openapi/roots/ProjectRootManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   205: dup
/*     */     //   206: aload #14
/*     */     //   208: if_acmpne -> 239
/*     */     //   211: aload #14
/*     */     //   213: areturn
/*     */     //   214: aload #13
/*     */     //   216: getfield L$1 : Ljava/lang/Object;
/*     */     //   219: checkcast java/util/List
/*     */     //   222: astore_1
/*     */     //   223: aload #13
/*     */     //   225: getfield L$0 : Ljava/lang/Object;
/*     */     //   228: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper
/*     */     //   231: astore_0
/*     */     //   232: aload #12
/*     */     //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   237: aload #12
/*     */     //   239: pop
/*     */     //   240: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   243: invokevirtual getAllJdks : ()[Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   246: dup
/*     */     //   247: ldc 'getAllJdks(...)'
/*     */     //   249: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   252: checkcast [Ljava/lang/Object;
/*     */     //   255: astore #5
/*     */     //   257: iconst_0
/*     */     //   258: istore #6
/*     */     //   260: iconst_0
/*     */     //   261: istore #7
/*     */     //   263: aload #5
/*     */     //   265: arraylength
/*     */     //   266: istore #8
/*     */     //   268: iload #7
/*     */     //   270: iload #8
/*     */     //   272: if_icmpge -> 312
/*     */     //   275: aload #5
/*     */     //   277: iload #7
/*     */     //   279: aaload
/*     */     //   280: astore #9
/*     */     //   282: aload #9
/*     */     //   284: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   287: astore #10
/*     */     //   289: iconst_0
/*     */     //   290: istore #11
/*     */     //   292: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   295: aload #10
/*     */     //   297: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   302: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   305: nop
/*     */     //   306: iinc #7, 1
/*     */     //   309: goto -> 268
/*     */     //   312: nop
/*     */     //   313: aload_0
/*     */     //   314: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   317: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*     */     //   320: astore #5
/*     */     //   322: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   325: aload #5
/*     */     //   327: invokevirtual getLanguageLevel : ()Lcom/intellij/pom/java/LanguageLevel;
/*     */     //   330: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/pom/java/LanguageLevel;)Ljava/lang/String;
/*     */     //   335: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   338: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion;
/*     */     //   341: aload_0
/*     */     //   342: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   345: aload_1
/*     */     //   346: aload #13
/*     */     //   348: aload #13
/*     */     //   350: aload_0
/*     */     //   351: putfield L$0 : Ljava/lang/Object;
/*     */     //   354: aload #13
/*     */     //   356: aload #5
/*     */     //   358: putfield L$1 : Ljava/lang/Object;
/*     */     //   361: aload #13
/*     */     //   363: iconst_2
/*     */     //   364: putfield label : I
/*     */     //   367: invokevirtual configureProject : (Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   370: dup
/*     */     //   371: aload #14
/*     */     //   373: if_acmpne -> 405
/*     */     //   376: aload #14
/*     */     //   378: areturn
/*     */     //   379: aload #13
/*     */     //   381: getfield L$1 : Ljava/lang/Object;
/*     */     //   384: checkcast com/intellij/openapi/roots/LanguageLevelProjectExtension
/*     */     //   387: astore #5
/*     */     //   389: aload #13
/*     */     //   391: getfield L$0 : Ljava/lang/Object;
/*     */     //   394: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper
/*     */     //   397: astore_0
/*     */     //   398: aload #12
/*     */     //   400: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   403: aload #12
/*     */     //   405: pop
/*     */     //   406: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   409: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   412: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3
/*     */     //   415: dup
/*     */     //   416: aload_0
/*     */     //   417: aconst_null
/*     */     //   418: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;Lkotlin/coroutines/Continuation;)V
/*     */     //   421: checkcast kotlin/jvm/functions/Function2
/*     */     //   424: aload #13
/*     */     //   426: aload #13
/*     */     //   428: aload_0
/*     */     //   429: putfield L$0 : Ljava/lang/Object;
/*     */     //   432: aload #13
/*     */     //   434: aload #5
/*     */     //   436: putfield L$1 : Ljava/lang/Object;
/*     */     //   439: aload #13
/*     */     //   441: iconst_3
/*     */     //   442: putfield label : I
/*     */     //   445: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   448: dup
/*     */     //   449: aload #14
/*     */     //   451: if_acmpne -> 483
/*     */     //   454: aload #14
/*     */     //   456: areturn
/*     */     //   457: aload #13
/*     */     //   459: getfield L$1 : Ljava/lang/Object;
/*     */     //   462: checkcast com/intellij/openapi/roots/LanguageLevelProjectExtension
/*     */     //   465: astore #5
/*     */     //   467: aload #13
/*     */     //   469: getfield L$0 : Ljava/lang/Object;
/*     */     //   472: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper
/*     */     //   475: astore_0
/*     */     //   476: aload #12
/*     */     //   478: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   481: aload #12
/*     */     //   483: pop
/*     */     //   484: nop
/*     */     //   485: ldc2_w 1800000
/*     */     //   488: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4
/*     */     //   491: dup
/*     */     //   492: aload_0
/*     */     //   493: aload #5
/*     */     //   495: aconst_null
/*     */     //   496: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;Lkotlin/coroutines/Continuation;)V
/*     */     //   499: checkcast kotlin/jvm/functions/Function2
/*     */     //   502: aload #13
/*     */     //   504: aload #13
/*     */     //   506: aconst_null
/*     */     //   507: putfield L$0 : Ljava/lang/Object;
/*     */     //   510: aload #13
/*     */     //   512: aconst_null
/*     */     //   513: putfield L$1 : Ljava/lang/Object;
/*     */     //   516: aload #13
/*     */     //   518: iconst_4
/*     */     //   519: putfield label : I
/*     */     //   522: invokestatic withTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   525: dup
/*     */     //   526: aload #14
/*     */     //   528: if_acmpne -> 542
/*     */     //   531: aload #14
/*     */     //   533: areturn
/*     */     //   534: nop
/*     */     //   535: aload #12
/*     */     //   537: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   540: aload #12
/*     */     //   542: pop
/*     */     //   543: goto -> 556
/*     */     //   546: astore #6
/*     */     //   548: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   551: ldc 'Timeout waiting for project configuration'
/*     */     //   553: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   556: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   559: areturn
/*     */     //   560: new java/lang/IllegalStateException
/*     */     //   563: dup
/*     */     //   564: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   566: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   569: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 60
/*     */     //   #67	-> 105
/*     */     //   #68	-> 113
/*     */     //   #69	-> 121
/*     */     //   #68	-> 124
/*     */     //   #70	-> 129
/*     */     //   #71	-> 137
/*     */     //   #70	-> 140
/*     */     //   #73	-> 145
/*     */     //   #74	-> 161
/*     */     //   #73	-> 177
/*     */     //   #76	-> 179
/*     */     //   #65	-> 211
/*     */     //   #77	-> 239
/*     */     //   #207	-> 260
/*     */     //   #78	-> 292
/*     */     //   #79	-> 305
/*     */     //   #207	-> 306
/*     */     //   #208	-> 312
/*     */     //   #80	-> 313
/*     */     //   #81	-> 322
/*     */     //   #82	-> 338
/*     */     //   #65	-> 376
/*     */     //   #84	-> 405
/*     */     //   #65	-> 454
/*     */     //   #89	-> 483
/*     */     //   #90	-> 488
/*     */     //   #65	-> 531
/*     */     //   #90	-> 542
/*     */     //   #109	-> 546
/*     */     //   #110	-> 548
/*     */     //   #112	-> 556
/*     */     //   #65	-> 560
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	109	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   232	147	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   398	59	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   476	49	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   105	109	1	args	Ljava/util/List;
/*     */     //   223	83	1	args	Ljava/util/List;
/*     */     //   306	7	1	args	Ljava/util/List;
/*     */     //   313	57	1	args	Ljava/util/List;
/*     */     //   113	24	3	vcsManager	Lcom/intellij/openapi/vcs/ProjectLevelVcsManager;
/*     */     //   179	26	4	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   257	56	5	$this$forEach$iv	[Ljava/lang/Object;
/*     */     //   322	57	5	levelProjectExtension	Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*     */     //   389	68	5	levelProjectExtension	Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*     */     //   467	58	5	levelProjectExtension	Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*     */     //   282	24	9	element$iv	Ljava/lang/Object;
/*     */     //   289	17	10	it	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   292	14	11	$i$a$-forEach-IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$2	I
/*     */     //   260	53	6	$i$f$forEach	I
/*     */     //   0	570	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	510	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	503	12	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   484	525	546	kotlinx/coroutines/TimeoutCancellationException
/*     */     //   534	543	546	kotlinx/coroutines/TimeoutCancellationException
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {76, 82, 84, 90}, i = {0, 0, 1, 1, 2, 2}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1"}, n = {"this", "args", "this", "levelProjectExtension", "this", "levelProjectExtension"}, m = "configureAndValidateProjectModel", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IdeaProjectConfiguratorHelper.this.configureAndValidateProjectModel(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           TrackingUtil.trackActivityBlocking(IdeaProjectConfiguratorHelper.this.project, (ActivityKey)MatterhornActivityKey.INSTANCE, IdeaProjectConfiguratorHelper.this::invokeSuspend$lambda$0);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3> $completion) {
/*     */       return (Continuation<Unit>)new IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(IdeaProjectConfiguratorHelper this$0) {
/*     */       ExternalSystemProjectTracker.Companion.getInstance(IdeaProjectConfiguratorHelper.this.project).scheduleProjectRefresh();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {91, 96}, i = {1, 1}, s = {"J$0", "I$0"}, n = {"waitStartTime", "waitStep"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     long J$0;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4(LanguageLevelProjectExtension $levelProjectExtension, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 281, 0 -> 36, 1 -> 76, 2 -> 162
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: getstatic com/intellij/platform/backend/observation/Observation.INSTANCE : Lcom/intellij/platform/backend/observation/Observation;
/*     */       //   43: aload_0
/*     */       //   44: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */       //   47: invokestatic access$getProject$p : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;)Lcom/intellij/openapi/project/Project;
/*     */       //   50: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */       //   55: aload_0
/*     */       //   56: checkcast kotlin/coroutines/Continuation
/*     */       //   59: aload_0
/*     */       //   60: iconst_1
/*     */       //   61: putfield label : I
/*     */       //   64: invokevirtual awaitConfiguration : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   67: dup
/*     */       //   68: aload #7
/*     */       //   70: if_acmpne -> 81
/*     */       //   73: aload #7
/*     */       //   75: areturn
/*     */       //   76: aload_1
/*     */       //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   80: aload_1
/*     */       //   81: checkcast java/lang/Boolean
/*     */       //   84: invokevirtual booleanValue : ()Z
/*     */       //   87: istore_2
/*     */       //   88: iload_2
/*     */       //   89: ifeq -> 256
/*     */       //   92: invokestatic currentTimeMillis : ()J
/*     */       //   95: lstore_3
/*     */       //   96: iconst_1
/*     */       //   97: istore #5
/*     */       //   99: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*     */       //   102: dup
/*     */       //   103: ldc 'getCurrentIndicators(...)'
/*     */       //   105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   108: checkcast java/util/Collection
/*     */       //   111: invokeinterface isEmpty : ()Z
/*     */       //   116: ifne -> 123
/*     */       //   119: iconst_1
/*     */       //   120: goto -> 124
/*     */       //   123: iconst_0
/*     */       //   124: ifeq -> 256
/*     */       //   127: ldc2_w 1000
/*     */       //   130: aload_0
/*     */       //   131: checkcast kotlin/coroutines/Continuation
/*     */       //   134: aload_0
/*     */       //   135: lload_3
/*     */       //   136: putfield J$0 : J
/*     */       //   139: aload_0
/*     */       //   140: iload #5
/*     */       //   142: putfield I$0 : I
/*     */       //   145: aload_0
/*     */       //   146: iconst_2
/*     */       //   147: putfield label : I
/*     */       //   150: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   153: dup
/*     */       //   154: aload #7
/*     */       //   156: if_acmpne -> 178
/*     */       //   159: aload #7
/*     */       //   161: areturn
/*     */       //   162: aload_0
/*     */       //   163: getfield I$0 : I
/*     */       //   166: istore #5
/*     */       //   168: aload_0
/*     */       //   169: getfield J$0 : J
/*     */       //   172: lstore_3
/*     */       //   173: aload_1
/*     */       //   174: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   177: aload_1
/*     */       //   178: pop
/*     */       //   179: invokestatic currentTimeMillis : ()J
/*     */       //   182: lload_3
/*     */       //   183: lsub
/*     */       //   184: iload #5
/*     */       //   186: bipush #60
/*     */       //   188: imul
/*     */       //   189: sipush #1000
/*     */       //   192: imul
/*     */       //   193: i2l
/*     */       //   194: lcmp
/*     */       //   195: ifle -> 99
/*     */       //   198: nop
/*     */       //   199: invokestatic getCurrentIndicators : ()Ljava/util/List;
/*     */       //   202: dup
/*     */       //   203: ldc 'getCurrentIndicators(...)'
/*     */       //   205: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   208: checkcast java/lang/Iterable
/*     */       //   211: aconst_null
/*     */       //   212: aconst_null
/*     */       //   213: aconst_null
/*     */       //   214: iconst_0
/*     */       //   215: aconst_null
/*     */       //   216: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */       //   221: bipush #31
/*     */       //   223: aconst_null
/*     */       //   224: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */       //   227: astore #6
/*     */       //   229: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$Companion;
/*     */       //   232: invokevirtual getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   235: aload #6
/*     */       //   237: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   242: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   245: goto -> 250
/*     */       //   248: astore #6
/*     */       //   250: iinc #5, 1
/*     */       //   253: goto -> 99
/*     */       //   256: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$Companion;
/*     */       //   259: invokevirtual getLogger : ()Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   262: aload_0
/*     */       //   263: getfield $levelProjectExtension : Lcom/intellij/openapi/roots/LanguageLevelProjectExtension;
/*     */       //   266: invokevirtual getLanguageLevel : ()Lcom/intellij/pom/java/LanguageLevel;
/*     */       //   269: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/pom/java/LanguageLevel;)Ljava/lang/String;
/*     */       //   274: invokevirtual info : (Ljava/lang/String;)V
/*     */       //   277: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */       //   280: areturn
/*     */       //   281: new java/lang/IllegalStateException
/*     */       //   284: dup
/*     */       //   285: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   287: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   290: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #90	-> 3
/*     */       //   #91	-> 40
/*     */       //   #90	-> 73
/*     */       //   #91	-> 81
/*     */       //   #92	-> 88
/*     */       //   #93	-> 92
/*     */       //   #94	-> 96
/*     */       //   #95	-> 99
/*     */       //   #96	-> 127
/*     */       //   #90	-> 159
/*     */       //   #97	-> 178
/*     */       //   #98	-> 198
/*     */       //   #99	-> 199
/*     */       //   #100	-> 229
/*     */       //   #101	-> 248
/*     */       //   #103	-> 250
/*     */       //   #107	-> 256
/*     */       //   #108	-> 277
/*     */       //   #90	-> 281
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   88	4	2	awaitConfiguration	Z
/*     */       //   96	66	3	waitStartTime	J
/*     */       //   173	83	3	waitStartTime	J
/*     */       //   99	63	5	waitStep	I
/*     */       //   168	88	5	waitStep	I
/*     */       //   229	16	6	indicatorTexts	Ljava/lang/String;
/*     */       //   0	291	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4;
/*     */       //   40	241	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   198	245	248	java/lang/Throwable
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4> $completion) {
/*     */       return (Continuation<Unit>)new IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4(this.$levelProjectExtension, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((IdeaProjectConfiguratorHelper$configureAndValidateProjectModel$4)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(String it) {
/*     */       IdeaProjectConfiguratorHelper.Companion.getLogger().warn(it);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private static final CharSequence invokeSuspend$lambda$1(ProgressIndicator it) {
/*     */       Intrinsics.checkNotNullExpressionValue(it.getText(), "getText(...)");
/*     */       return it.getText();
/*     */     }
/*     */   }
/*     */   
/*     */   private final Object setupJdkIfNeeded(ProjectRootManager rootManager, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$setupJdkIfNeeded$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$setupJdkIfNeeded$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$setupJdkIfNeeded$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #10
/*     */     //   50: aload #10
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #9
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #11
/*     */     //   62: aload #10
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 484, 0 -> 92, 1 -> 201, 2 -> 426
/*     */     //   92: aload #9
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   101: ifnull -> 141
/*     */     //   104: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   107: aload_1
/*     */     //   108: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   111: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   116: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   119: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator.Companion : Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfigurator$Companion;
/*     */     //   122: aload_0
/*     */     //   123: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   126: aload_1
/*     */     //   127: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   130: dup
/*     */     //   131: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   134: invokevirtual configureProjectSdk : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/projectRoots/Sdk;)V
/*     */     //   137: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   140: areturn
/*     */     //   141: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   144: astore_3
/*     */     //   145: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   148: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   151: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2
/*     */     //   154: dup
/*     */     //   155: aload_3
/*     */     //   156: aconst_null
/*     */     //   157: invokespecial <init> : (Lcom/intellij/openapi/projectRoots/ProjectJdkTable;Lkotlin/coroutines/Continuation;)V
/*     */     //   160: checkcast kotlin/jvm/functions/Function2
/*     */     //   163: aload #10
/*     */     //   165: aload #10
/*     */     //   167: aload_0
/*     */     //   168: putfield L$0 : Ljava/lang/Object;
/*     */     //   171: aload #10
/*     */     //   173: aload_1
/*     */     //   174: putfield L$1 : Ljava/lang/Object;
/*     */     //   177: aload #10
/*     */     //   179: aload_3
/*     */     //   180: putfield L$2 : Ljava/lang/Object;
/*     */     //   183: aload #10
/*     */     //   185: iconst_1
/*     */     //   186: putfield label : I
/*     */     //   189: invokestatic withContext : (Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   192: dup
/*     */     //   193: aload #11
/*     */     //   195: if_acmpne -> 235
/*     */     //   198: aload #11
/*     */     //   200: areturn
/*     */     //   201: aload #10
/*     */     //   203: getfield L$2 : Ljava/lang/Object;
/*     */     //   206: checkcast com/intellij/openapi/projectRoots/ProjectJdkTable
/*     */     //   209: astore_3
/*     */     //   210: aload #10
/*     */     //   212: getfield L$1 : Ljava/lang/Object;
/*     */     //   215: checkcast com/intellij/openapi/roots/ProjectRootManager
/*     */     //   218: astore_1
/*     */     //   219: aload #10
/*     */     //   221: getfield L$0 : Ljava/lang/Object;
/*     */     //   224: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper
/*     */     //   227: astore_0
/*     */     //   228: aload #9
/*     */     //   230: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   233: aload #9
/*     */     //   235: pop
/*     */     //   236: aload_1
/*     */     //   237: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   240: ifnull -> 262
/*     */     //   243: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   246: aload_1
/*     */     //   247: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   250: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   255: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   258: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   261: areturn
/*     */     //   262: ldc_w 'JAVA_HOME'
/*     */     //   265: invokestatic getenv : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   268: dup
/*     */     //   269: ifnull -> 310
/*     */     //   272: astore #6
/*     */     //   274: aload #6
/*     */     //   276: astore #7
/*     */     //   278: iconst_0
/*     */     //   279: istore #8
/*     */     //   281: aload #7
/*     */     //   283: checkcast java/lang/CharSequence
/*     */     //   286: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   289: ifne -> 296
/*     */     //   292: iconst_1
/*     */     //   293: goto -> 297
/*     */     //   296: iconst_0
/*     */     //   297: nop
/*     */     //   298: ifeq -> 306
/*     */     //   301: aload #6
/*     */     //   303: goto -> 312
/*     */     //   306: aconst_null
/*     */     //   307: goto -> 312
/*     */     //   310: pop
/*     */     //   311: aconst_null
/*     */     //   312: astore #4
/*     */     //   314: aload #4
/*     */     //   316: ifnonnull -> 332
/*     */     //   319: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   322: ldc_w 'JAVA_HOME is not set, cannot configure as project SDK'
/*     */     //   325: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   328: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   331: areturn
/*     */     //   332: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   335: aload #4
/*     */     //   337: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   342: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   345: aconst_null
/*     */     //   346: ldc_w '#JAVA_HOME'
/*     */     //   349: invokestatic resolveJdkName : (Lcom/intellij/openapi/projectRoots/Sdk;Ljava/lang/String;)Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   352: astore #5
/*     */     //   354: aload #5
/*     */     //   356: ifnull -> 480
/*     */     //   359: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   362: aload #5
/*     */     //   364: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   369: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   374: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   377: aload_3
/*     */     //   378: aload #5
/*     */     //   380: aload_1
/*     */     //   381: aload_0
/*     */     //   382: <illegal opcode> invoke : (Lcom/intellij/openapi/projectRoots/ProjectJdkTable;Lcom/intellij/openapi/projectRoots/Sdk;Lcom/intellij/openapi/roots/ProjectRootManager;Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;)Lkotlin/jvm/functions/Function0;
/*     */     //   387: aload #10
/*     */     //   389: aload #10
/*     */     //   391: aload #5
/*     */     //   393: putfield L$0 : Ljava/lang/Object;
/*     */     //   396: aload #10
/*     */     //   398: aconst_null
/*     */     //   399: putfield L$1 : Ljava/lang/Object;
/*     */     //   402: aload #10
/*     */     //   404: aconst_null
/*     */     //   405: putfield L$2 : Ljava/lang/Object;
/*     */     //   408: aload #10
/*     */     //   410: iconst_2
/*     */     //   411: putfield label : I
/*     */     //   414: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   417: dup
/*     */     //   418: aload #11
/*     */     //   420: if_acmpne -> 443
/*     */     //   423: aload #11
/*     */     //   425: areturn
/*     */     //   426: aload #10
/*     */     //   428: getfield L$0 : Ljava/lang/Object;
/*     */     //   431: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   434: astore #5
/*     */     //   436: aload #9
/*     */     //   438: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   441: aload #9
/*     */     //   443: pop
/*     */     //   444: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   447: aload #5
/*     */     //   449: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/openapi/projectRoots/Sdk;)Ljava/lang/String;
/*     */     //   454: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   457: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   460: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   463: invokestatic getInstance : ()Lcom/intellij/openapi/projectRoots/JavaSdk;
/*     */     //   466: checkcast com/intellij/openapi/projectRoots/SdkTypeId
/*     */     //   469: invokevirtual getSdksOfType : (Lcom/intellij/openapi/projectRoots/SdkTypeId;)Ljava/util/List;
/*     */     //   472: <illegal opcode> makeConcatWithConstants : (Ljava/util/List;)Ljava/lang/String;
/*     */     //   477: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   480: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   483: areturn
/*     */     //   484: new java/lang/IllegalStateException
/*     */     //   487: dup
/*     */     //   488: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   490: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   493: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #115	-> 60
/*     */     //   #116	-> 97
/*     */     //   #117	-> 104
/*     */     //   #118	-> 119
/*     */     //   #119	-> 137
/*     */     //   #121	-> 141
/*     */     //   #123	-> 145
/*     */     //   #115	-> 198
/*     */     //   #128	-> 235
/*     */     //   #129	-> 243
/*     */     //   #130	-> 258
/*     */     //   #132	-> 262
/*     */     //   #209	-> 278
/*     */     //   #132	-> 281
/*     */     //   #132	-> 297
/*     */     //   #132	-> 298
/*     */     //   #132	-> 310
/*     */     //   #133	-> 314
/*     */     //   #134	-> 319
/*     */     //   #135	-> 328
/*     */     //   #138	-> 332
/*     */     //   #139	-> 345
/*     */     //   #140	-> 354
/*     */     //   #141	-> 359
/*     */     //   #142	-> 377
/*     */     //   #115	-> 423
/*     */     //   #147	-> 443
/*     */     //   #148	-> 457
/*     */     //   #150	-> 480
/*     */     //   #115	-> 484
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	104	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   228	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   262	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   298	9	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   307	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   332	85	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   97	104	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   219	39	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   262	36	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   298	9	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   307	12	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   332	85	1	rootManager	Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   145	56	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   210	33	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   262	36	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   298	9	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   307	12	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   332	85	3	projectJdkTable	Lcom/intellij/openapi/projectRoots/ProjectJdkTable;
/*     */     //   314	5	4	JAVA_HOME	Ljava/lang/String;
/*     */     //   332	13	4	JAVA_HOME	Ljava/lang/String;
/*     */     //   354	72	5	javaHomeSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   436	21	5	javaHomeSdk	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   278	18	7	it	Ljava/lang/String;
/*     */     //   281	17	8	$i$a$-takeIf-IdeaProjectConfiguratorHelper$setupJdkIfNeeded$JAVA_HOME$1	I
/*     */     //   0	494	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	434	10	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	427	9	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {123, 142}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"this", "rootManager", "projectJdkTable", "javaHomeSdk"}, m = "setupJdkIfNeeded", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IdeaProjectConfiguratorHelper$setupJdkIfNeeded$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$setupJdkIfNeeded$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IdeaProjectConfiguratorHelper.this.setupJdkIfNeeded(null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {124}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2(ProjectJdkTable $projectJdkTable, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (CoroutinesKt.writeIntentReadAction(this.$projectJdkTable::invokeSuspend$lambda$0, (Continuation)this) == object)
/*     */             return object; 
/*     */           CoroutinesKt.writeIntentReadAction(this.$projectJdkTable::invokeSuspend$lambda$0, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2> $completion) {
/*     */       return (Continuation<Unit>)new IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2(this.$projectJdkTable, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((IdeaProjectConfiguratorHelper$setupJdkIfNeeded$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(ProjectJdkTable $projectJdkTable) {
/*     */       $projectJdkTable.preconfigure();
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit setupJdkIfNeeded$lambda$2(ProjectJdkTable $projectJdkTable, Sdk $javaHomeSdk, ProjectRootManager $rootManager, IdeaProjectConfiguratorHelper this$0) {
/*     */     $projectJdkTable.addJdk($javaHomeSdk);
/*     */     $rootManager.setProjectSdk($javaHomeSdk);
/*     */     IdeaProjectConfigurator.Companion.configureProjectSdk(this$0.project, $javaHomeSdk);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object validateProject(@NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$validateProject$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$validateProject$1
/*     */     //   11: astore #20
/*     */     //   13: aload #20
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #20
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper$validateProject$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #20
/*     */     //   50: aload #20
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #19
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #21
/*     */     //   62: aload #20
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 548, 0 -> 88, 1 -> 419
/*     */     //   88: aload #19
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   97: invokestatic guessProjectDir : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   100: dup
/*     */     //   101: ifnonnull -> 119
/*     */     //   104: pop
/*     */     //   105: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*     */     //   108: dup
/*     */     //   109: ldc_w 'Project dir is null'
/*     */     //   112: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   115: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   118: areturn
/*     */     //   119: astore_2
/*     */     //   120: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   125: astore_3
/*     */     //   126: aload_0
/*     */     //   127: aload_2
/*     */     //   128: aload_3
/*     */     //   129: invokespecial listFiles : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   132: astore #4
/*     */     //   134: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   137: aload #4
/*     */     //   139: invokeinterface size : ()I
/*     */     //   144: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */     //   149: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   152: new java/util/LinkedHashSet
/*     */     //   155: dup
/*     */     //   156: invokespecial <init> : ()V
/*     */     //   159: checkcast java/util/Set
/*     */     //   162: astore #5
/*     */     //   164: aload_0
/*     */     //   165: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   168: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   171: invokevirtual getContentRoots : ()[Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   174: dup
/*     */     //   175: ldc_w 'getContentRoots(...)'
/*     */     //   178: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   181: checkcast [Ljava/lang/Object;
/*     */     //   184: astore #7
/*     */     //   186: iconst_0
/*     */     //   187: istore #8
/*     */     //   189: aload #7
/*     */     //   191: astore #9
/*     */     //   193: new java/util/ArrayList
/*     */     //   196: dup
/*     */     //   197: aload #7
/*     */     //   199: arraylength
/*     */     //   200: invokespecial <init> : (I)V
/*     */     //   203: checkcast java/util/Collection
/*     */     //   206: astore #10
/*     */     //   208: iconst_0
/*     */     //   209: istore #11
/*     */     //   211: iconst_0
/*     */     //   212: istore #12
/*     */     //   214: aload #9
/*     */     //   216: arraylength
/*     */     //   217: istore #13
/*     */     //   219: iload #12
/*     */     //   221: iload #13
/*     */     //   223: if_icmpge -> 291
/*     */     //   226: aload #9
/*     */     //   228: iload #12
/*     */     //   230: aaload
/*     */     //   231: astore #14
/*     */     //   233: aload #10
/*     */     //   235: aload #14
/*     */     //   237: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   240: astore #15
/*     */     //   242: astore #18
/*     */     //   244: iconst_0
/*     */     //   245: istore #16
/*     */     //   247: aload_0
/*     */     //   248: aload #15
/*     */     //   250: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   253: aload #15
/*     */     //   255: aload_3
/*     */     //   256: invokespecial listFiles : (Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/jvm/functions/Function1;)Ljava/util/List;
/*     */     //   259: astore #17
/*     */     //   261: aload #5
/*     */     //   263: aload #17
/*     */     //   265: checkcast java/util/Collection
/*     */     //   268: invokeinterface addAll : (Ljava/util/Collection;)Z
/*     */     //   273: pop
/*     */     //   274: aload #17
/*     */     //   276: aload #18
/*     */     //   278: swap
/*     */     //   279: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   284: pop
/*     */     //   285: iinc #12, 1
/*     */     //   288: goto -> 219
/*     */     //   291: aload #10
/*     */     //   293: checkcast java/util/List
/*     */     //   296: nop
/*     */     //   297: astore #6
/*     */     //   299: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   302: aload #6
/*     */     //   304: invokeinterface size : ()I
/*     */     //   309: aload #5
/*     */     //   311: invokeinterface size : ()I
/*     */     //   316: <illegal opcode> makeConcatWithConstants : (II)Ljava/lang/String;
/*     */     //   321: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   324: aload #4
/*     */     //   326: invokeinterface size : ()I
/*     */     //   331: aload #5
/*     */     //   333: invokeinterface size : ()I
/*     */     //   338: idiv
/*     */     //   339: iconst_1
/*     */     //   340: if_icmpne -> 507
/*     */     //   343: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   346: ldc_w 'Project sources attached successfully. Starting compilation'
/*     */     //   349: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   352: ldc_w 'junie.compile.before.run'
/*     */     //   355: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   358: dup
/*     */     //   359: ifnull -> 377
/*     */     //   362: invokestatic parseBoolean : (Ljava/lang/String;)Z
/*     */     //   365: iconst_1
/*     */     //   366: if_icmpne -> 373
/*     */     //   369: iconst_1
/*     */     //   370: goto -> 379
/*     */     //   373: iconst_0
/*     */     //   374: goto -> 379
/*     */     //   377: pop
/*     */     //   378: iconst_0
/*     */     //   379: ifeq -> 494
/*     */     //   382: aload_0
/*     */     //   383: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   386: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/task/ProjectTaskManager;
/*     */     //   389: invokevirtual buildAllModules : ()Lorg/jetbrains/concurrency/Promise;
/*     */     //   392: dup
/*     */     //   393: ldc_w 'buildAllModules(...)'
/*     */     //   396: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   399: aload #20
/*     */     //   401: aload #20
/*     */     //   403: iconst_1
/*     */     //   404: putfield label : I
/*     */     //   407: invokestatic await : (Lorg/jetbrains/concurrency/Promise;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   410: dup
/*     */     //   411: aload #21
/*     */     //   413: if_acmpne -> 426
/*     */     //   416: aload #21
/*     */     //   418: areturn
/*     */     //   419: aload #19
/*     */     //   421: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   424: aload #19
/*     */     //   426: checkcast com/intellij/task/ProjectTaskManager$Result
/*     */     //   429: astore #7
/*     */     //   431: aload #7
/*     */     //   433: invokeinterface hasErrors : ()Z
/*     */     //   438: ifeq -> 494
/*     */     //   441: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   444: ldc_w 'Compilation completed with errors. See idea.log for details'
/*     */     //   447: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   450: ldc_w 'junie.fail.on.compile.error'
/*     */     //   453: invokestatic getProperty : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   456: dup
/*     */     //   457: ifnull -> 475
/*     */     //   460: invokestatic parseBoolean : (Ljava/lang/String;)Z
/*     */     //   463: iconst_1
/*     */     //   464: if_icmpne -> 471
/*     */     //   467: iconst_1
/*     */     //   468: goto -> 477
/*     */     //   471: iconst_0
/*     */     //   472: goto -> 477
/*     */     //   475: pop
/*     */     //   476: iconst_0
/*     */     //   477: ifeq -> 494
/*     */     //   480: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*     */     //   483: dup
/*     */     //   484: ldc_w 'There were compilation errors. Check the logs'
/*     */     //   487: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   490: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   493: areturn
/*     */     //   494: getstatic com/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   497: ldc_w 'Compilation completed successfully'
/*     */     //   500: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   503: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   506: areturn
/*     */     //   507: aload #4
/*     */     //   509: invokeinterface size : ()I
/*     */     //   514: aload #6
/*     */     //   516: invokeinterface size : ()I
/*     */     //   521: aload #5
/*     */     //   523: invokeinterface size : ()I
/*     */     //   528: <illegal opcode> makeConcatWithConstants : (III)Ljava/lang/String;
/*     */     //   533: astore #7
/*     */     //   535: new com/intellij/ml/llm/matterhorn/ProjectProblem
/*     */     //   538: dup
/*     */     //   539: aload #7
/*     */     //   541: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   544: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   547: areturn
/*     */     //   548: new java/lang/IllegalStateException
/*     */     //   551: dup
/*     */     //   552: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   554: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   557: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #152	-> 60
/*     */     //   #153	-> 93
/*     */     //   #154	-> 125
/*     */     //   #157	-> 126
/*     */     //   #158	-> 134
/*     */     //   #160	-> 152
/*     */     //   #160	-> 162
/*     */     //   #161	-> 164
/*     */     //   #210	-> 189
/*     */     //   #211	-> 211
/*     */     //   #212	-> 233
/*     */     //   #162	-> 247
/*     */     //   #163	-> 261
/*     */     //   #164	-> 274
/*     */     //   #212	-> 279
/*     */     //   #211	-> 285
/*     */     //   #213	-> 291
/*     */     //   #210	-> 296
/*     */     //   #161	-> 297
/*     */     //   #166	-> 299
/*     */     //   #168	-> 324
/*     */     //   #169	-> 343
/*     */     //   #170	-> 352
/*     */     //   #170	-> 365
/*     */     //   #171	-> 382
/*     */     //   #172	-> 389
/*     */     //   #173	-> 401
/*     */     //   #152	-> 416
/*     */     //   #171	-> 429
/*     */     //   #174	-> 431
/*     */     //   #175	-> 441
/*     */     //   #176	-> 450
/*     */     //   #176	-> 463
/*     */     //   #177	-> 480
/*     */     //   #181	-> 494
/*     */     //   #182	-> 503
/*     */     //   #185	-> 507
/*     */     //   #184	-> 533
/*     */     //   #186	-> 535
/*     */     //   #152	-> 548
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	11	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   119	43	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   162	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   276	21	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   297	68	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   365	24	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/IdeaProjectConfiguratorHelper;
/*     */     //   120	14	2	projectDir	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   126	36	3	filter	Lkotlin/jvm/functions/Function1;
/*     */     //   162	114	3	filter	Lkotlin/jvm/functions/Function1;
/*     */     //   276	15	3	filter	Lkotlin/jvm/functions/Function1;
/*     */     //   134	28	4	allSourceFiles	Ljava/util/List;
/*     */     //   162	114	4	allSourceFiles	Ljava/util/List;
/*     */     //   276	21	4	allSourceFiles	Ljava/util/List;
/*     */     //   297	46	4	allSourceFiles	Ljava/util/List;
/*     */     //   507	41	4	allSourceFiles	Ljava/util/List;
/*     */     //   164	112	5	sett	Ljava/util/Set;
/*     */     //   276	21	5	sett	Ljava/util/Set;
/*     */     //   297	46	5	sett	Ljava/util/Set;
/*     */     //   507	41	5	sett	Ljava/util/Set;
/*     */     //   299	44	6	contentRoots	Ljava/util/List;
/*     */     //   507	41	6	contentRoots	Ljava/util/List;
/*     */     //   186	22	7	$this$map$iv	[Ljava/lang/Object;
/*     */     //   431	10	7	rebuildResult	Lcom/intellij/task/ProjectTaskManager$Result;
/*     */     //   535	13	7	message	Ljava/lang/String;
/*     */     //   208	85	9	$this$mapTo$iv$iv	[Ljava/lang/Object;
/*     */     //   208	85	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   233	52	14	item$iv$iv	Ljava/lang/Object;
/*     */     //   244	32	15	it	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   261	15	17	listFiles	Ljava/util/List;
/*     */     //   247	29	16	$i$a$-map-IdeaProjectConfiguratorHelper$validateProject$contentRoots$1	I
/*     */     //   211	82	11	$i$f$mapTo	I
/*     */     //   189	108	8	$i$f$map	I
/*     */     //   0	558	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	498	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	491	19	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final boolean validateProject$lambda$3(VirtualFile it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     if (it.getExtension() != null) {
/*     */       Intrinsics.checkNotNullExpressionValue(it.getExtension().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */     } else {
/*     */       it.getExtension().toLowerCase(Locale.ROOT);
/*     */     } 
/*     */     if (!Intrinsics.areEqual(null, "java")) {
/*     */       if (it.getExtension() != null) {
/*     */         Intrinsics.checkNotNullExpressionValue(it.getExtension().toLowerCase(Locale.ROOT), "toLowerCase(...)");
/*     */       } else {
/*     */         it.getExtension().toLowerCase(Locale.ROOT);
/*     */       } 
/*     */       if (Intrinsics.areEqual(null, "kt"));
/*     */       return false;
/*     */     } 
/*     */   }
/*     */   
/*     */   private final List<VirtualFile> listFiles(VirtualFile file, Function1<? super VirtualFile, Boolean> filter) {
/*     */     if (VirtualFileUtil.isFile(file)) {
/*     */       Intrinsics.checkNotNullExpressionValue(Collections.singletonList(file), "singletonList(...)");
/*     */       return Collections.singletonList(file);
/*     */     } 
/*     */     if (!file.isDirectory())
/*     */       return CollectionsKt.emptyList(); 
/*     */     ArrayList<VirtualFile> retval = new ArrayList();
/*     */     VirtualFile[] children = file.getChildren();
/*     */     for (Iterator<VirtualFile> iterator = ArrayIteratorKt.iterator((Object[])children); iterator.hasNext(); ) {
/*     */       VirtualFile vf = iterator.next();
/*     */       Intrinsics.checkNotNull(vf);
/*     */       retval.addAll(listFiles(vf, filter));
/*     */     } 
/*     */     return retval;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "IdeaProjectConfigurator.kt", l = {173}, i = {}, s = {}, n = {}, m = "validateProject", c = "com.intellij.ml.llm.matterhorn.ej.idea.IdeaProjectConfiguratorHelper")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class IdeaProjectConfiguratorHelper$validateProject$1 extends ContinuationImpl {
/*     */     int label;
/*     */     
/*     */     IdeaProjectConfiguratorHelper$validateProject$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return IdeaProjectConfiguratorHelper.this.validateProject((Continuation<? super List<ProjectProblem>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\IdeaProjectConfiguratorHelper.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */