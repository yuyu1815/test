/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ide.util.PropertiesComponent;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.JunieTerminalRunner;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.utils.ShellUtilsKt;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.project.ProjectUtil;
/*     */ import com.intellij.openapi.util.SystemInfo;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.plugins.terminal.TerminalOptionsProvider;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\002\b\013\b\026\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J\026\020\t\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\bH\026J \020\n\032\0020\013*\0020\b2\022\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0130\rH\004J\n\020\017\032\004\030\0010\006H\004J\n\020\020\032\004\030\0010\006H\004R\033\020\021\032\0020\0138FX\002¢\006\f\n\004\b\023\020\024\032\004\b\021\020\022R$\020\026\032\0020\0132\006\020\025\032\0020\0138B@BX\016¢\006\f\032\004\b\026\020\022\"\004\b\027\020\030¨\006\031"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker;", "<init>", "()V", "checkJunieAvailable", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/JuniePreconditionChecker$JunieProblem;", "project", "Lcom/intellij/openapi/project/Project;", "canRunJunie", "hasSdk", "", "condition", "Lkotlin/Function1;", "Lcom/intellij/openapi/projectRoots/Sdk;", "checkShellIntegration", "checkUnsupportedShellCombinations", "isInternal", "()Z", "isInternal$delegate", "Lkotlin/Lazy;", "value", "isUntestedIdeAccepted", "setUntestedIdeAccepted", "(Z)V", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nJuniePreconditions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePreconditions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n11483#2,9:146\n13409#2:155\n13410#2:157\n11492#2:158\n1#3:156\n1755#4,3:159\n*S KotlinDebug\n*F\n+ 1 JuniePreconditions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker\n*L\n75#1:146,9\n75#1:155\n75#1:157\n75#1:158\n75#1:156\n77#1:159,3\n*E\n"})
/*     */ public class DefaultJuniePreconditionChecker
/*     */   implements JuniePreconditionChecker
/*     */ {
/*     */   @NotNull
/*     */   public List<JuniePreconditionChecker.JunieProblem> checkJunieAvailable(@NotNull Project project) {
/*  45 */     Intrinsics.checkNotNullParameter(project, "project"); List<JuniePreconditionChecker.JunieProblem> problems = new ArrayList();
/*     */     
/*  47 */     VirtualFile projectDir = ProjectUtil.guessProjectDir(project);
/*  48 */     if (projectDir == null) {
/*  49 */       problems.add(
/*  50 */           new JuniePreconditionChecker.JunieProblem(
/*  51 */             "Our current support is limited to projects with a simple structure: all modules must reside under a single project root, and the configuration file must be defined at that root level", null, null, 6, null));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  58 */     return problems;
/*     */   }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public List<JuniePreconditionChecker.JunieProblem> canRunJunie(@NotNull Project project) {
/*  64 */     Intrinsics.checkNotNullParameter(project, "project"); JuniePreconditionChecker.JunieProblem[] arrayOfJunieProblem = new JuniePreconditionChecker.JunieProblem[2]; arrayOfJunieProblem[0] = checkShellIntegration(); arrayOfJunieProblem[1] = 
/*  65 */       checkUnsupportedShellCombinations();
/*     */     return CollectionsKt.listOfNotNull((Object[])arrayOfJunieProblem);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected final boolean hasSdk(@NotNull Project $this$hasSdk, @NotNull Function1 condition) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc '<this>'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc 'condition'
/*     */     //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   12: aload_1
/*     */     //   13: invokestatic getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/roots/ProjectRootManager;
/*     */     //   16: invokevirtual getProjectSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   19: dup
/*     */     //   20: ifnull -> 48
/*     */     //   23: aload_2
/*     */     //   24: swap
/*     */     //   25: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   30: checkcast java/lang/Boolean
/*     */     //   33: invokevirtual booleanValue : ()Z
/*     */     //   36: iconst_1
/*     */     //   37: if_icmpne -> 44
/*     */     //   40: iconst_1
/*     */     //   41: goto -> 50
/*     */     //   44: iconst_0
/*     */     //   45: goto -> 50
/*     */     //   48: pop
/*     */     //   49: iconst_0
/*     */     //   50: ifeq -> 55
/*     */     //   53: iconst_1
/*     */     //   54: ireturn
/*     */     //   55: getstatic com/intellij/openapi/module/ModuleManager.Companion : Lcom/intellij/openapi/module/ModuleManager$Companion;
/*     */     //   58: aload_1
/*     */     //   59: invokevirtual getInstance : (Lcom/intellij/openapi/project/Project;)Lcom/intellij/openapi/module/ModuleManager;
/*     */     //   62: invokevirtual getModules : ()[Lcom/intellij/openapi/module/Module;
/*     */     //   65: astore_3
/*     */     //   66: iconst_0
/*     */     //   67: istore #4
/*     */     //   69: aload_3
/*     */     //   70: astore #5
/*     */     //   72: new java/util/ArrayList
/*     */     //   75: dup
/*     */     //   76: invokespecial <init> : ()V
/*     */     //   79: checkcast java/util/Collection
/*     */     //   82: astore #6
/*     */     //   84: iconst_0
/*     */     //   85: istore #7
/*     */     //   87: aload #5
/*     */     //   89: astore #8
/*     */     //   91: iconst_0
/*     */     //   92: istore #9
/*     */     //   94: iconst_0
/*     */     //   95: istore #10
/*     */     //   97: aload #8
/*     */     //   99: arraylength
/*     */     //   100: istore #11
/*     */     //   102: iload #10
/*     */     //   104: iload #11
/*     */     //   106: if_icmpge -> 168
/*     */     //   109: aload #8
/*     */     //   111: iload #10
/*     */     //   113: aaload
/*     */     //   114: astore #12
/*     */     //   116: aload #12
/*     */     //   118: astore #13
/*     */     //   120: iconst_0
/*     */     //   121: istore #14
/*     */     //   123: aload #13
/*     */     //   125: astore #15
/*     */     //   127: iconst_0
/*     */     //   128: istore #16
/*     */     //   130: aload #15
/*     */     //   132: invokestatic getInstance : (Lcom/intellij/openapi/module/Module;)Lcom/intellij/openapi/roots/ModuleRootManager;
/*     */     //   135: invokevirtual getSdk : ()Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   138: dup
/*     */     //   139: ifnull -> 160
/*     */     //   142: astore #17
/*     */     //   144: iconst_0
/*     */     //   145: istore #18
/*     */     //   147: aload #6
/*     */     //   149: aload #17
/*     */     //   151: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   156: pop
/*     */     //   157: goto -> 161
/*     */     //   160: pop
/*     */     //   161: nop
/*     */     //   162: iinc #10, 1
/*     */     //   165: goto -> 102
/*     */     //   168: nop
/*     */     //   169: aload #6
/*     */     //   171: checkcast java/util/List
/*     */     //   174: nop
/*     */     //   175: checkcast java/lang/Iterable
/*     */     //   178: astore_3
/*     */     //   179: nop
/*     */     //   180: iconst_0
/*     */     //   181: istore #4
/*     */     //   183: aload_3
/*     */     //   184: instanceof java/util/Collection
/*     */     //   187: ifeq -> 206
/*     */     //   190: aload_3
/*     */     //   191: checkcast java/util/Collection
/*     */     //   194: invokeinterface isEmpty : ()Z
/*     */     //   199: ifeq -> 206
/*     */     //   202: iconst_0
/*     */     //   203: goto -> 265
/*     */     //   206: aload_3
/*     */     //   207: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   212: astore #5
/*     */     //   214: aload #5
/*     */     //   216: invokeinterface hasNext : ()Z
/*     */     //   221: ifeq -> 264
/*     */     //   224: aload #5
/*     */     //   226: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   231: astore #6
/*     */     //   233: aload #6
/*     */     //   235: checkcast com/intellij/openapi/projectRoots/Sdk
/*     */     //   238: astore #7
/*     */     //   240: iconst_0
/*     */     //   241: istore #8
/*     */     //   243: aload_2
/*     */     //   244: aload #7
/*     */     //   246: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   251: checkcast java/lang/Boolean
/*     */     //   254: invokevirtual booleanValue : ()Z
/*     */     //   257: ifeq -> 214
/*     */     //   260: iconst_1
/*     */     //   261: goto -> 265
/*     */     //   264: iconst_0
/*     */     //   265: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #71	-> 12
/*     */     //   #71	-> 30
/*     */     //   #72	-> 53
/*     */     //   #75	-> 55
/*     */     //   #146	-> 69
/*     */     //   #154	-> 87
/*     */     //   #155	-> 94
/*     */     //   #154	-> 123
/*     */     //   #76	-> 130
/*     */     //   #154	-> 138
/*     */     //   #156	-> 144
/*     */     //   #154	-> 147
/*     */     //   #154	-> 157
/*     */     //   #154	-> 160
/*     */     //   #155	-> 161
/*     */     //   #157	-> 168
/*     */     //   #158	-> 169
/*     */     //   #146	-> 174
/*     */     //   #77	-> 179
/*     */     //   #159	-> 183
/*     */     //   #160	-> 206
/*     */     //   #77	-> 243
/*     */     //   #160	-> 257
/*     */     //   #161	-> 264
/*     */     //   #75	-> 265
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   130	8	16	$i$a$-mapNotNull-DefaultJuniePreconditionChecker$hasSdk$1	I
/*     */     //   127	11	15	it	Lcom/intellij/openapi/module/Module;
/*     */     //   147	10	18	$i$a$-let-ArraysKt___ArraysKt$mapNotNullTo$1$1$iv$iv	I
/*     */     //   144	13	17	it$iv$iv	Ljava/lang/Object;
/*     */     //   123	38	14	$i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv	I
/*     */     //   120	41	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   116	46	12	element$iv$iv$iv	Ljava/lang/Object;
/*     */     //   94	75	9	$i$f$forEach	I
/*     */     //   91	78	8	$this$forEach$iv$iv$iv	[Ljava/lang/Object;
/*     */     //   87	84	7	$i$f$mapNotNullTo	I
/*     */     //   84	87	5	$this$mapNotNullTo$iv$iv	[Ljava/lang/Object;
/*     */     //   84	87	6	destination$iv$iv	Ljava/util/Collection;
/*     */     //   69	106	4	$i$f$mapNotNull	I
/*     */     //   66	109	3	$this$mapNotNull$iv	[Ljava/lang/Object;
/*     */     //   243	14	8	$i$a$-any-DefaultJuniePreconditionChecker$hasSdk$2	I
/*     */     //   240	17	7	it	Lcom/intellij/openapi/projectRoots/Sdk;
/*     */     //   233	31	6	element$iv	Ljava/lang/Object;
/*     */     //   183	82	4	$i$f$any	I
/*     */     //   180	85	3	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	266	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/DefaultJuniePreconditionChecker;
/*     */     //   0	266	1	$this$hasSdk	Lcom/intellij/openapi/project/Project;
/*     */     //   0	266	2	condition	Lkotlin/jvm/functions/Function1;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   protected final JuniePreconditionChecker.JunieProblem checkShellIntegration()
/*     */   {
/*  81 */     if (TerminalOptionsProvider.Companion.getInstance().getShellIntegration()) {
/*  82 */       return null;
/*     */     }
/*     */     
/*  85 */     return new JuniePreconditionChecker.JunieProblem(
/*  86 */         "Junie can not work without shell integration", 
/*  87 */         "Enable", 
/*  88 */         new DefaultJuniePreconditionChecker$checkShellIntegration$1(null)); } @DebugMetadata(f = "JuniePreconditions.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.DefaultJuniePreconditionChecker$checkShellIntegration$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class DefaultJuniePreconditionChecker$checkShellIntegration$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; DefaultJuniePreconditionChecker$checkShellIntegration$1(Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  89 */           TerminalOptionsProvider.Companion.getInstance().setShellIntegration(true);
/*  90 */           return Boxing.boxBoolean(true); }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super DefaultJuniePreconditionChecker$checkShellIntegration$1> $completion) { return (Continuation<Unit>)new DefaultJuniePreconditionChecker$checkShellIntegration$1($completion); }
/*     */     public final Object invoke(Continuation<?> p1) { return ((DefaultJuniePreconditionChecker$checkShellIntegration$1)create(p1)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @Nullable
/*     */   protected final JuniePreconditionChecker.JunieProblem checkUnsupportedShellCombinations() { String shellPathAndParams, shellName;
/*  96 */     if (TerminalOptionsProvider.Companion.getInstance().getShellPath() == null) { TerminalOptionsProvider.Companion.getInstance().getShellPath();
/*  97 */       return null; }
/*     */     
/*  99 */     if (ShellUtilsKt.extractShellName(shellPathAndParams) == null) { ShellUtilsKt.extractShellName(shellPathAndParams);
/* 100 */       return null; }
/*     */     
/* 102 */     Function1<? super Continuation<? super Boolean>, ? extends Object> switchToDefault = new DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1(null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 115 */     boolean isWindows = SystemInfo.isWindows;
/* 116 */     if (isWindows && !JunieTerminalRunner.Companion.isPowerShell(shellName)) {
/* 117 */       return new JuniePreconditionChecker.JunieProblem(
/* 118 */           "Junie can not work without PowerShell", 
/* 119 */           "Use PowerShell", 
/* 120 */           switchToDefault);
/*     */     }
/*     */     
/* 123 */     if (!isWindows && !JunieTerminalRunner.Companion.isBashZshFish(shellName)) {
/* 124 */       return new JuniePreconditionChecker.JunieProblem("Junie can not work with `" + 
/* 125 */           shellName + "`", 
/* 126 */           "Use default", 
/* 127 */           switchToDefault);
/*     */     }
/*     */ 
/*     */     
/* 131 */     return null; }
/*     */   
/*     */   @NotNull
/* 134 */   private final Lazy isInternal$delegate = LazyKt.lazy(DefaultJuniePreconditionChecker::isInternal_delegate$lambda$2); @DebugMetadata(f = "JuniePreconditions.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\013\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""}) static final class DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1 extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> { int label; DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1(Continuation $completion) { super(1, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); TerminalOptionsProvider.Companion.getInstance().setShellPath(null); return Boxing.boxBoolean(true); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1> $completion) { return (Continuation<Unit>)new DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1($completion); } public final Object invoke(Continuation<?> p1) { return ((DefaultJuniePreconditionChecker$checkUnsupportedShellCombinations$switchToDefault$1)create(p1)).invokeSuspend(Unit.INSTANCE); } } public final boolean isInternal() { Lazy lazy = this.isInternal$delegate; return ((Boolean)lazy.getValue()).booleanValue(); } private static final boolean isInternal_delegate$lambda$2() { return ApplicationManager.getApplication().isInternal(); }
/*     */   
/*     */   private final boolean isUntestedIdeAccepted() {
/* 137 */     return PropertiesComponent.getInstance().getBoolean("matterhorn.junie.untestedIdeAccepted", false);
/*     */   } private final void setUntestedIdeAccepted(boolean value) {
/* 139 */     PropertiesComponent.getInstance().setValue("matterhorn.junie.untestedIdeAccepted", value);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\DefaultJuniePreconditionChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */