/*     */ package com.intellij.ml.llm.matterhorn.ej.idea.actions.tests;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.psi.PsiClass;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.nio.file.Path;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000p\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\005\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\013\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\036\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\b&\030\000 22\0020\001:\00212B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005JN\020\016\032\024\022\n\022\b\022\004\022\0020\0210\020\022\004\022\0020\0220\0172\006\020\023\032\0020\0242$\b\002\020\025\032\036\b\001\022\004\022\0020\027\022\n\022\b\022\004\022\0020\0310\030\022\006\022\004\030\0010\0010\026H¦@¢\006\002\020\032J\034\020\033\032\b\022\004\022\0020\t0\0202\006\020\023\032\0020\024H¦@¢\006\002\020\034J\026\020\035\032\0020\0312\006\020\023\032\0020\024H¦@¢\006\002\020\034J.\020\036\032\b\022\004\022\0020\0370\0202\006\020 \032\0020!2\006\020\"\032\0020#2\b\b\002\020$\032\0020\031H@¢\006\002\020%J*\020&\032\b\022\004\022\0020\0210\0202\006\020 \032\0020!2\f\020'\032\b\022\004\022\0020\0370\020H@¢\006\002\020(J\030\020)\032\b\022\004\022\0020\0370*2\b\020\"\032\004\030\0010#H\005J(\020+\032\004\030\0010,2\006\020-\032\0020\t2\006\020\002\032\0020\0032\006\020.\032\0020/H@¢\006\002\0200R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\tX¦\004¢\006\006\032\004\b\r\020\013¨\0063"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V", "getContext", "()Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "description", "", "getDescription", "()Ljava/lang/String;", "source", "getSource", "extract", "Lcom/intellij/ml/llm/matterhorn/ej/core/Result;", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocation;", "", "query", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "mustIgnore", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executedClasses", "(Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "matches", "findTestClasses", "Lcom/intellij/psi/PsiClass;", "project", "Lcom/intellij/openapi/project/Project;", "psiFile", "Lcom/intellij/psi/PsiFile;", "includeAbstract", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findActionsForTestClasses", "testClasses", "(Lcom/intellij/openapi/project/Project;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClassesForFile", "", "findVirtualFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "path", "target", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Query", "Companion", "ej-idea"})
/*     */ @SourceDebugExtension({"SMAP\nActionLocationsExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionLocationsExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1557#2:105\n1628#2,3:106\n774#2:110\n865#2,2:111\n774#2:114\n865#2,2:115\n1557#2:117\n1628#2,3:118\n24#3:109\n1#4:113\n*S KotlinDebug\n*F\n+ 1 ActionLocationsExtractor.kt\ncom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor\n*L\n82#1:105\n82#1:106,3\n64#1:110\n64#1:111,2\n66#1:114\n66#1:115,2\n72#1:117\n72#1:118,3\n91#1:109\n*E\n"})
/*     */ public abstract class ActionLocationsExtractor {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final ExecutionAgentContext context;
/*     */   public static final int MAX_TEST_LOCATIONS = 20;
/*     */   
/*  25 */   public ActionLocationsExtractor(@NotNull ExecutionAgentContext context) { this.context = context; } @NotNull public final ExecutionAgentContext getContext() { return this.context; } @DebugMetadata(f = "ActionLocationsExtractor.kt", l = {97}, i = {}, s = {}, n = {}, m = "findVirtualFile", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocationsExtractor") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ActionLocationsExtractor$findVirtualFile$1 extends ContinuationImpl {
/*     */     int label; ActionLocationsExtractor$findVirtualFile$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return ActionLocationsExtractor.this.findVirtualFile(null, null, null, (Continuation<? super VirtualFile>)this); } } @DebugMetadata(f = "ActionLocationsExtractor.kt", l = {71}, i = {}, s = {}, n = {}, m = "findActionsForTestClasses", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocationsExtractor") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ActionLocationsExtractor$findActionsForTestClasses$1 extends ContinuationImpl {
/*     */     int label; ActionLocationsExtractor$findActionsForTestClasses$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return ActionLocationsExtractor.this.findActionsForTestClasses(null, null, (Continuation<? super List<? extends ActionLocation>>)this); } } @DebugMetadata(f = "ActionLocationsExtractor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.idea.actions.tests.ActionLocationsExtractor$extract$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"}) static final class ActionLocationsExtractor$extract$1 extends SuspendLambda implements Function2<Path, Continuation<? super Boolean>, Object> { int label; ActionLocationsExtractor$extract$1(Continuation $completion) { super(2, $completion); }
/*  28 */     public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Boxing.boxBoolean(false); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super ActionLocationsExtractor$extract$1> $completion) { return (Continuation<Unit>)new ActionLocationsExtractor$extract$1($completion); } public final Object invoke(Path p1, Continuation<?> p2) { return ((ActionLocationsExtractor$extract$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\004\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\004\005B\t\b\004¢\006\004\b\002\020\003\001\002\006\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "", "<init>", "()V", "RawPath", "SingleTest", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$RawPath;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest;", "ej-idea"})
/*     */   public static abstract class Query { private Query() {}
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\t\020\b\032\0020\003HÆ\003J\023\020\t\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$RawPath;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "path", "", "<init>", "(Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"})
/*     */     public static final class RawPath extends Query { @NotNull
/*     */       private final String path;
/*  34 */       public RawPath(@NotNull String path) { super(null); this.path = path; } @NotNull public final String getPath() { return this.path; } @NotNull public final String component1() { return this.path; } @NotNull public final RawPath copy(@NotNull String path) { Intrinsics.checkNotNullParameter(path, "path"); return new RawPath(path); } @NotNull public String toString() { return "RawPath(path=" + this.path + ")"; } public int hashCode() { return this.path.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof RawPath)) return false;  RawPath rawPath = (RawPath)other; return !!Intrinsics.areEqual(this.path, rawPath.path); } } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003¢\006\004\b\005\020\006J\t\020\n\032\0020\003HÆ\003J\t\020\013\032\0020\003HÆ\003J\035\020\f\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\003HÆ\001J\023\020\r\032\0020\0162\b\020\017\032\004\030\0010\020HÖ\003J\t\020\021\032\0020\022HÖ\001J\t\020\023\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\007\020\bR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\t\020\b¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query$SingleTest;", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "path", "", "testMethod", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPath", "()Ljava/lang/String;", "getTestMethod", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-idea"}) public static final class SingleTest extends Query { @NotNull private final String path; @NotNull private final String testMethod;
/*  35 */       public SingleTest(@NotNull String path, @NotNull String testMethod) { super(null); this.path = path; this.testMethod = testMethod; } @NotNull public final String getPath() { return this.path; } @NotNull public final String getTestMethod() { return this.testMethod; }
/*     */       @NotNull public final String component1() { return this.path; } @NotNull public final String component2() { return this.testMethod; } @NotNull public final SingleTest copy(@NotNull String path, @NotNull String testMethod) { Intrinsics.checkNotNullParameter(path, "path"); Intrinsics.checkNotNullParameter(testMethod, "testMethod"); return new SingleTest(path, testMethod); } @NotNull public String toString() { return "SingleTest(path=" + this.path + ", testMethod=" + this.testMethod + ")"; } public int hashCode() { result = this.path.hashCode(); return result * 31 + this.testMethod.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof SingleTest)) return false;  SingleTest singleTest = (SingleTest)other; return !Intrinsics.areEqual(this.path, singleTest.path) ? false : (!!Intrinsics.areEqual(this.testMethod, singleTest.testMethod)); } }
/*     */      }
/*     */    @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007J\024\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fJ\030\020\r\032\0020\0162\006\020\006\032\0020\0052\b\020\017\032\004\030\0010\005R\016\020\020\032\0020\021XT¢\006\002\n\000¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Companion;", "", "<init>", "()V", "buildAiIgnoreMessage", "", "path", "Ljava/nio/file/Path;", "getExtractors", "", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "createQuery", "Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$Query;", "testName", "MAX_TEST_LOCATIONS", "", "ej-idea"}) public static final class Companion
/*     */   {
/*  40 */     @NotNull public final String buildAiIgnoreMessage(@NotNull Path path) { Intrinsics.checkNotNullParameter(path, "path"); return "ERROR: " + path + " must not be run according to .aiignore settings"; }
/*     */      private Companion() {}
/*     */     @NotNull
/*     */     public final List<ActionLocationsExtractor> getExtractors(@NotNull ExecutionAgentContext context) {
/*  44 */       Intrinsics.checkNotNullParameter(context, "context"); ActionLocationsExtractor[] arrayOfActionLocationsExtractor = new ActionLocationsExtractor[4]; arrayOfActionLocationsExtractor[0] = new SingleTestExtractor(context); arrayOfActionLocationsExtractor[1] = 
/*  45 */         new FilePathActionLocationExtractor(context);
/*  46 */       arrayOfActionLocationsExtractor[2] = new FileFQNActionLocationExtractor(context);
/*  47 */       arrayOfActionLocationsExtractor[3] = new FolderPathActionLocationExtractor(context);
/*     */       return CollectionsKt.listOf((Object[])arrayOfActionLocationsExtractor);
/*     */     } @NotNull
/*     */     public final ActionLocationsExtractor.Query createQuery(@NotNull String path, @Nullable String testName) {
/*  51 */       Intrinsics.checkNotNullParameter(path, "path"); return (testName != null) ? 
/*  52 */         new ActionLocationsExtractor.Query.SingleTest(path, testName) : 
/*     */         
/*  54 */         new ActionLocationsExtractor.Query.RawPath(path);
/*     */     } }
/*     */   
/*     */   @Nullable
/*     */   public final Object findTestClasses(@NotNull Project project, @NotNull PsiFile psiFile, boolean includeAbstract, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: aload_0
/*     */     //   2: aload_2
/*     */     //   3: iload_3
/*     */     //   4: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;Lcom/intellij/psi/PsiFile;Z)Lkotlin/jvm/functions/Function0;
/*     */     //   9: aload #4
/*     */     //   11: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   14: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #62	-> 0
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;
/*     */     //   0	15	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	15	2	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   0	15	3	includeAbstract	Z
/*     */     //   0	15	4	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*     */   private static final List findTestClasses$lambda$5(ActionLocationsExtractor this$0, PsiFile $psiFile, boolean $includeAbstract) { Object object;
/*  63 */     Collection<PsiClass> allClasses = this$0.getClassesForFile($psiFile);
/*  64 */     Iterable<PsiClass> $this$filter$iv = allClasses; int $i$f$filter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 110 */     Iterable<PsiClass> iterable2 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 111 */     for (PsiClass element$iv$iv : iterable2) { PsiClass it = element$iv$iv; int $i$a$-filter-ActionLocationsExtractor$findTestClasses$2$classes$1 = 0; if (!it.hasModifierProperty("abstract")) destination$iv$iv.add(element$iv$iv);  }
/* 112 */      $this$filter$iv = destination$iv$iv;
/* 113 */     int $i$a$-ifEmpty-ActionLocationsExtractor$findTestClasses$2$classes$2 = 0; Iterable<PsiClass> $this$filterTo$iv$iv = allClasses, iterable3 = $this$filterTo$iv$iv; int $i$a$-takeIf-ActionLocationsExtractor$findTestClasses$2$classes$2$1 = 0; if (($this$filter$iv.isEmpty() ? ($includeAbstract ? $this$filterTo$iv$iv : null) : $this$filter$iv) == null) { $this$filter$iv.isEmpty() ? ($includeAbstract ? $this$filterTo$iv$iv : null) : $this$filter$iv; return CollectionsKt.emptyList(); }  TestFrameworks $this$findTestClasses_u24lambda_u245_u24lambda_u244 = TestFrameworks.getInstance(); int $i$a$-run-ActionLocationsExtractor$findTestClasses$2$1 = 0; Iterable iterable1 = (Iterable)object; int i = 0;
/* 114 */     Iterable iterable4 = iterable1; Collection<Object> collection1 = new ArrayList(); int j = 0;
/* 115 */     for (Object element$iv$iv : iterable4) { PsiClass it = (PsiClass)element$iv$iv; int $i$a$-filter-ActionLocationsExtractor$findTestClasses$2$1$1 = 0; if ($this$findTestClasses_u24lambda_u245_u24lambda_u244.isTestClass(it)) collection1.add(element$iv$iv);  }
/* 116 */      return (List)collection1; } @Nullable public final Object findActionsForTestClasses(@NotNull Project project, @NotNull List testClasses, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findActionsForTestClasses$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findActionsForTestClasses$1
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
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findActionsForTestClasses$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_3
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #6
/*     */     //   50: aload #6
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #5
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #6
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 141, 0 -> 88, 1 -> 120
/*     */     //   88: aload #5
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_1
/*     */     //   94: aload_2
/*     */     //   95: <illegal opcode> invoke : (Ljava/util/List;)Lkotlin/jvm/functions/Function0;
/*     */     //   100: aload #6
/*     */     //   102: aload #6
/*     */     //   104: iconst_1
/*     */     //   105: putfield label : I
/*     */     //   108: invokestatic smartReadAction : (Lcom/intellij/openapi/project/Project;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   111: dup
/*     */     //   112: aload #7
/*     */     //   114: if_acmpne -> 127
/*     */     //   117: aload #7
/*     */     //   119: areturn
/*     */     //   120: aload #5
/*     */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   125: aload #5
/*     */     //   127: checkcast java/util/List
/*     */     //   130: astore #4
/*     */     //   132: aload #4
/*     */     //   134: checkcast java/lang/Iterable
/*     */     //   137: invokestatic filterNotNull : (Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   140: areturn
/*     */     //   141: new java/lang/IllegalStateException
/*     */     //   144: dup
/*     */     //   145: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   147: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   150: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #70	-> 60
/*     */     //   #71	-> 93
/*     */     //   #70	-> 117
/*     */     //   #74	-> 132
/*     */     //   #70	-> 141
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	18	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   93	18	2	testClasses	Ljava/util/List;
/*     */     //   132	9	4	actionLocations	Ljava/util/List;
/*     */     //   0	151	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	91	6	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	84	5	$result	Ljava/lang/Object; }
/* 117 */   private static final List findActionsForTestClasses$lambda$7(List $testClasses) { Iterable $this$map$iv = $testClasses; int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 118 */     for (Object item$iv$iv : iterable1)
/* 119 */     { PsiClass psiClass = (PsiClass)item$iv$iv; Collection collection = destination$iv$iv; int $i$a$-map-ActionLocationsExtractor$findActionsForTestClasses$actionLocations$1$1 = 0; if (psiClass.getQualifiedName() == null)
/* 120 */         psiClass.getQualifiedName();  }  return (List)destination$iv$iv; }
/*     */ 
/*     */   
/*     */   @RequiresReadLock
/*     */   @NotNull
/*     */   protected final Collection<PsiClass> getClassesForFile(@Nullable PsiFile psiFile) {
/*     */     if (psiFile == null)
/*     */       return CollectionsKt.emptyList(); 
/*     */     UFile uFile = (UFile)UastContextKt.toUElement((PsiElement)psiFile, UFile.class);
/*     */     Iterable $this$map$iv = uFile.getClasses();
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection<PsiClass> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       UClass uClass = (UClass)item$iv$iv;
/*     */       Collection<PsiClass> collection = destination$iv$iv;
/*     */       int $i$a$-map-ActionLocationsExtractor$getClassesForFile$1 = 0;
/*     */       collection.add(uClass.getJavaPsi());
/*     */     } 
/*     */     Intrinsics.checkNotNullExpressionValue(((PsiClassOwner)psiFile).getClasses(), "getClasses(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(PsiTreeUtil.findChildrenOfType((PsiElement)psiFile, PsiClass.class), "findChildrenOfType(...)");
/*     */     return (uFile != null) ? destination$iv$iv : ((psiFile instanceof PsiClassOwner) ? ArraysKt.asList((Object[])((PsiClassOwner)psiFile).getClasses()) : PsiTreeUtil.findChildrenOfType((PsiElement)psiFile, PsiClass.class));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object findVirtualFile(@NotNull String path, @NotNull ExecutionAgentContext context, @NotNull LocateTarget target, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findVirtualFile$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findVirtualFile$1
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #8
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor$findVirtualFile$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #8
/*     */     //   53: aload #8
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #7
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #9
/*     */     //   65: aload #8
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 231, 0 -> 92, 1 -> 179
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_1
/*     */     //   98: checkcast java/lang/CharSequence
/*     */     //   101: iconst_0
/*     */     //   102: iconst_0
/*     */     //   103: iconst_2
/*     */     //   104: aconst_null
/*     */     //   105: invokestatic contains$default : (Ljava/lang/CharSequence;CZILjava/lang/Object;)Z
/*     */     //   108: ifeq -> 152
/*     */     //   111: nop
/*     */     //   112: iconst_0
/*     */     //   113: istore #6
/*     */     //   115: ldc com/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor
/*     */     //   117: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   120: dup
/*     */     //   121: ldc_w 'getInstance(...)'
/*     */     //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   127: ldc_w 'Invalid path requested'
/*     */     //   130: new java/lang/IllegalArgumentException
/*     */     //   133: dup
/*     */     //   134: aload_1
/*     */     //   135: aload_3
/*     */     //   136: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;)Ljava/lang/String;
/*     */     //   141: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   144: checkcast java/lang/Throwable
/*     */     //   147: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   150: aconst_null
/*     */     //   151: areturn
/*     */     //   152: aload_1
/*     */     //   153: aload_2
/*     */     //   154: aload_3
/*     */     //   155: iconst_0
/*     */     //   156: aload #8
/*     */     //   158: bipush #8
/*     */     //   160: aconst_null
/*     */     //   161: aload #8
/*     */     //   163: iconst_1
/*     */     //   164: putfield label : I
/*     */     //   167: invokestatic smartLocate$default : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;ZLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   170: dup
/*     */     //   171: aload #9
/*     */     //   173: if_acmpne -> 186
/*     */     //   176: aload #9
/*     */     //   178: areturn
/*     */     //   179: aload #7
/*     */     //   181: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   184: aload #7
/*     */     //   186: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   189: astore #5
/*     */     //   191: aload #5
/*     */     //   193: instanceof com/intellij/ml/llm/matterhorn/ej/core/Result$Err
/*     */     //   196: ifeq -> 201
/*     */     //   199: aconst_null
/*     */     //   200: areturn
/*     */     //   201: aload #5
/*     */     //   203: ldc_w 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.Result.Ok<com.intellij.openapi.vfs.VirtualFile>'
/*     */     //   206: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   209: aload #5
/*     */     //   211: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   214: pop
/*     */     //   215: aload #5
/*     */     //   217: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result$Ok
/*     */     //   220: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   223: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   226: astore #6
/*     */     //   228: aload #6
/*     */     //   230: areturn
/*     */     //   231: new java/lang/IllegalStateException
/*     */     //   234: dup
/*     */     //   235: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   237: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   240: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #88	-> 63
/*     */     //   #89	-> 97
/*     */     //   #91	-> 111
/*     */     //   #109	-> 115
/*     */     //   #92	-> 127
/*     */     //   #91	-> 147
/*     */     //   #94	-> 150
/*     */     //   #97	-> 152
/*     */     //   #88	-> 176
/*     */     //   #98	-> 191
/*     */     //   #99	-> 201
/*     */     //   #100	-> 215
/*     */     //   #101	-> 228
/*     */     //   #88	-> 231
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	15	0	this	Lcom/intellij/ml/llm/matterhorn/ej/idea/actions/tests/ActionLocationsExtractor;
/*     */     //   97	30	1	path	Ljava/lang/String;
/*     */     //   127	20	1	path	Ljava/lang/String;
/*     */     //   152	18	1	path	Ljava/lang/String;
/*     */     //   97	14	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   152	18	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   97	30	3	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   127	20	3	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   152	18	3	target	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/LocateTarget;
/*     */     //   191	40	5	res	Lcom/intellij/ml/llm/matterhorn/ej/core/Result;
/*     */     //   228	3	6	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   115	12	6	$i$f$thisLogger	I
/*     */     //   0	241	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	178	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	171	7	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public abstract String getDescription();
/*     */   
/*     */   @NotNull
/*     */   public abstract String getSource();
/*     */   
/*     */   @Nullable
/*     */   public abstract Object extract(@NotNull Query paramQuery, @NotNull Function2<? super Path, ? super Continuation<? super Boolean>, ? extends Object> paramFunction2, @NotNull Continuation<? super Result<? extends List<? extends ActionLocation>, Unit>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public abstract Object executedClasses(@NotNull Query paramQuery, @NotNull Continuation<? super List<String>> paramContinuation);
/*     */   
/*     */   @Nullable
/*     */   public abstract Object matches(@NotNull Query paramQuery, @NotNull Continuation<? super Boolean> paramContinuation);
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\actions\tests\ActionLocationsExtractor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */