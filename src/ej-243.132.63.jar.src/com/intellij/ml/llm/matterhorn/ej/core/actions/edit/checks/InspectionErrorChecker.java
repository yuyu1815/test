/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*     */ 
/*     */ import com.intellij.codeInsight.daemon.impl.HighlightInfo;
/*     */ import com.intellij.lang.annotation.HighlightSeverity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.StringUtilKt;
/*     */ import com.intellij.openapi.progress.util.ProgressIndicatorBase;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.openapi.wm.ex.ProgressIndicatorEx;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\002\b\002\b\026\030\0002\0020\001:\001\034B\t\b\007¢\006\004\b\002\020\003J$\020\004\032\b\022\004\022\0020\0060\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013J$\020\f\032\b\022\004\022\0020\r0\0052\006\020\007\032\0020\b2\006\020\t\032\0020\nH@¢\006\002\020\013J\016\020\016\032\0020\017H@¢\006\002\020\020J\020\020\021\032\0020\0222\006\020\023\032\0020\024H\025J&\020\025\032\b\022\004\022\0020\r0\0052\006\020\007\032\0020\b2\006\020\t\032\0020\n2\006\020\026\032\0020\024H\002J\022\020\027\032\004\030\0010\r2\006\020\030\032\0020\031H\002J\030\020\032\032\b\022\004\022\0020\0330\005*\b\022\004\022\0020\r0\005H\002¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "<init>", "()V", "findErrors", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/psi/PsiFile;", "(Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findErrorElementsCancellable", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "createIndicator", "Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onExecutedUnderProgress", "", "indicator", "Lcom/intellij/openapi/wm/ex/ProgressIndicatorEx;", "findErrorElements", "progressIndicator", "createProblem", "info", "Lcom/intellij/codeInsight/daemon/impl/HighlightInfo;", "toErrors", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError;", "SemanticError", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nInspectionErrorChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectionErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,130:1\n1663#2,8:131\n1053#2:139\n1557#2:142\n1628#2,3:143\n774#2:152\n865#2,2:153\n1611#2,9:155\n1863#2:164\n1864#2:166\n1620#2:167\n14#3:140\n1#4:141\n1#4:165\n77#5:146\n97#5,5:147\n*S KotlinDebug\n*F\n+ 1 InspectionErrorChecker.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker\n*L\n54#1:131,8\n55#1:139\n129#1:142\n129#1:143,3\n107#1:152\n107#1:153,2\n108#1:155,9\n108#1:164\n108#1:166\n108#1:167\n111#1:140\n108#1:165\n106#1:146\n106#1:147,5\n*E\n"})
/*     */ public class InspectionErrorChecker implements SemanticChecker {
/*     */   @NotNull
/*  29 */   public String getNameForLogging() { return SemanticChecker.DefaultImpls.getNameForLogging(this); } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\005HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "", "location", "Lcom/intellij/openapi/util/TextRange;", "description", "", "<init>", "(Lcom/intellij/openapi/util/TextRange;Ljava/lang/String;)V", "getLocation", "()Lcom/intellij/openapi/util/TextRange;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"}) private static final class SemanticError { @NotNull
/*     */     private final TextRange location; @NotNull
/*  31 */     private final String description; public SemanticError(@NotNull TextRange location, @NotNull String description) { this.location = location; this.description = description; } @NotNull public final TextRange getLocation() { return this.location; } @NotNull public final String getDescription() { return this.description; } @NotNull public final TextRange component1() { return this.location; }
/*     */     @NotNull public final String component2() { return this.description; }
/*     */     @NotNull public final SemanticError copy(@NotNull TextRange location, @NotNull String description) { Intrinsics.checkNotNullParameter(location, "location"); Intrinsics.checkNotNullParameter(description, "description"); return new SemanticError(location, description); }
/*     */     @NotNull public String toString() { return "SemanticError(location=" + this.location + ", description=" + this.description + ")"; }
/*     */     public int hashCode() { result = this.location.hashCode();
/*     */       return result * 31 + this.description.hashCode(); }
/*     */     public boolean equals(@Nullable Object other) { if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof SemanticError))
/*     */         return false; 
/*     */       SemanticError semanticError = (SemanticError)other;
/*     */       return !Intrinsics.areEqual(this.location, semanticError.location) ? false : (!!Intrinsics.areEqual(this.description, semanticError.description)); } }
/*  43 */   private static final Unit findErrors$lambda$0(Project $project) { PsiDocumentManager.getInstance($project).commitAllDocuments();
/*  44 */     return Unit.INSTANCE; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object findErrorElementsCancellable(Project project, PsiFile file, Continuation $completion) {
/*  66 */     return CoroutineScopeKt.coroutineScope(new InspectionErrorChecker$findErrorElementsCancellable$2(project, file, null), $completion);
/*     */   } @DebugMetadata(f = "InspectionErrorChecker.kt", l = {67, 76}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"$this$coroutineScope", "progressIndicator"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker$findErrorElementsCancellable$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class InspectionErrorChecker$findErrorElementsCancellable$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SemanticError>>, Object>
/*     */   {
/*     */     int label; InspectionErrorChecker$findErrorElementsCancellable$2(Project $project, PsiFile $file, Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #7
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 197, 0 -> 36, 1 -> 78, 2 -> 165
/*     */       //   36: aload_1
/*     */       //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   40: aload_0
/*     */       //   41: getfield L$0 : Ljava/lang/Object;
/*     */       //   44: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   47: astore_2
/*     */       //   48: aload_0
/*     */       //   49: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*     */       //   52: aload_0
/*     */       //   53: checkcast kotlin/coroutines/Continuation
/*     */       //   56: aload_0
/*     */       //   57: aload_2
/*     */       //   58: putfield L$0 : Ljava/lang/Object;
/*     */       //   61: aload_0
/*     */       //   62: iconst_1
/*     */       //   63: putfield label : I
/*     */       //   66: invokevirtual createIndicator : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   69: dup
/*     */       //   70: aload #7
/*     */       //   72: if_acmpne -> 91
/*     */       //   75: aload #7
/*     */       //   77: areturn
/*     */       //   78: aload_0
/*     */       //   79: getfield L$0 : Ljava/lang/Object;
/*     */       //   82: checkcast kotlinx/coroutines/CoroutineScope
/*     */       //   85: astore_2
/*     */       //   86: aload_1
/*     */       //   87: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   90: aload_1
/*     */       //   91: checkcast com/intellij/openapi/progress/util/ProgressIndicatorBase
/*     */       //   94: astore_3
/*     */       //   95: aload_2
/*     */       //   96: invokestatic getDefault : ()Lkotlinx/coroutines/CoroutineDispatcher;
/*     */       //   99: checkcast kotlin/coroutines/CoroutineContext
/*     */       //   102: aconst_null
/*     */       //   103: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2$errors$1
/*     */       //   106: dup
/*     */       //   107: aload_0
/*     */       //   108: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*     */       //   111: aload_0
/*     */       //   112: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */       //   115: aload_0
/*     */       //   116: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */       //   119: aload_3
/*     */       //   120: aconst_null
/*     */       //   121: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;Lkotlin/coroutines/Continuation;)V
/*     */       //   124: checkcast kotlin/jvm/functions/Function2
/*     */       //   127: iconst_2
/*     */       //   128: aconst_null
/*     */       //   129: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */       //   132: astore #4
/*     */       //   134: nop
/*     */       //   135: aload #4
/*     */       //   137: aload_0
/*     */       //   138: checkcast kotlin/coroutines/Continuation
/*     */       //   141: aload_0
/*     */       //   142: aload_3
/*     */       //   143: putfield L$0 : Ljava/lang/Object;
/*     */       //   146: aload_0
/*     */       //   147: iconst_2
/*     */       //   148: putfield label : I
/*     */       //   151: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   156: dup
/*     */       //   157: aload #7
/*     */       //   159: if_acmpne -> 179
/*     */       //   162: aload #7
/*     */       //   164: areturn
/*     */       //   165: aload_0
/*     */       //   166: getfield L$0 : Ljava/lang/Object;
/*     */       //   169: checkcast com/intellij/openapi/progress/util/ProgressIndicatorBase
/*     */       //   172: astore_3
/*     */       //   173: nop
/*     */       //   174: aload_1
/*     */       //   175: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   178: aload_1
/*     */       //   179: astore #5
/*     */       //   181: aload_3
/*     */       //   182: invokevirtual cancel : ()V
/*     */       //   185: aload #5
/*     */       //   187: areturn
/*     */       //   188: astore #6
/*     */       //   190: aload_3
/*     */       //   191: invokevirtual cancel : ()V
/*     */       //   194: aload #6
/*     */       //   196: athrow
/*     */       //   197: new java/lang/IllegalStateException
/*     */       //   200: dup
/*     */       //   201: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   203: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   206: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #66	-> 3
/*     */       //   #67	-> 48
/*     */       //   #66	-> 75
/*     */       //   #69	-> 95
/*     */       //   #75	-> 134
/*     */       //   #76	-> 135
/*     */       //   #66	-> 162
/*     */       //   #78	-> 181
/*     */       //   #76	-> 187
/*     */       //   #78	-> 188
/*     */       //   #66	-> 197
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   48	30	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   86	48	2	$this$coroutineScope	Lkotlinx/coroutines/CoroutineScope;
/*     */       //   95	70	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*     */       //   173	12	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*     */       //   188	9	3	progressIndicator	Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*     */       //   134	22	4	errors	Lkotlinx/coroutines/Deferred;
/*     */       //   0	207	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2;
/*     */       //   40	157	1	$result	Ljava/lang/Object;
/*     */       // Exception table:
/*     */       //   from	to	target	type
/*     */       //   134	156	188	finally
/*     */       //   173	181	188	finally
/*     */       //   188	190	188	finally } public final Continuation<Unit> create(Object value, Continuation<? super InspectionErrorChecker$findErrorElementsCancellable$2> $completion) { InspectionErrorChecker$findErrorElementsCancellable$2 inspectionErrorChecker$findErrorElementsCancellable$2 = new InspectionErrorChecker$findErrorElementsCancellable$2(this.$project, this.$file, $completion); inspectionErrorChecker$findErrorElementsCancellable$2.L$0 = value;
/*     */       return (Continuation<Unit>)inspectionErrorChecker$findErrorElementsCancellable$2; } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((InspectionErrorChecker$findErrorElementsCancellable$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @DebugMetadata(f = "InspectionErrorChecker.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker$findErrorElementsCancellable$2$errors$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$SemanticError;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class InspectionErrorChecker$findErrorElementsCancellable$2$errors$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends InspectionErrorChecker.SemanticError>>, Object> {
/*  71 */       int label; private static final List invokeSuspend$lambda$0(InspectionErrorChecker this$0, Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator) { return InspectionErrorChecker.this.findErrorElements($project, $file, (ProgressIndicatorEx)$progressIndicator); }
/*     */       
/*     */       InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(Project $project, PsiFile $file, ProgressIndicatorBase $progressIndicator, Continuation $completion) {
/*     */         super(2, $completion);
/*     */       }
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore_2
/*     */         //   4: aload_0
/*     */         //   5: getfield label : I
/*     */         //   8: tableswitch default -> 82, 0 -> 32, 1 -> 76
/*     */         //   32: aload_1
/*     */         //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   36: aload_0
/*     */         //   37: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*     */         //   40: aload_0
/*     */         //   41: getfield $project : Lcom/intellij/openapi/project/Project;
/*     */         //   44: aload_0
/*     */         //   45: getfield $file : Lcom/intellij/psi/PsiFile;
/*     */         //   48: aload_0
/*     */         //   49: getfield $progressIndicator : Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;
/*     */         //   52: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lcom/intellij/openapi/progress/util/ProgressIndicatorBase;)Lkotlin/jvm/functions/Function0;
/*     */         //   57: aload_0
/*     */         //   58: checkcast kotlin/coroutines/Continuation
/*     */         //   61: aload_0
/*     */         //   62: iconst_1
/*     */         //   63: putfield label : I
/*     */         //   66: invokestatic blockingContext : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   69: dup
/*     */         //   70: aload_2
/*     */         //   71: if_acmpne -> 81
/*     */         //   74: aload_2
/*     */         //   75: areturn
/*     */         //   76: aload_1
/*     */         //   77: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   80: aload_1
/*     */         //   81: areturn
/*     */         //   82: new java/lang/IllegalStateException
/*     */         //   85: dup
/*     */         //   86: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   88: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   91: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #69	-> 3
/*     */         //   #70	-> 36
/*     */         //   #69	-> 74
/*     */         //   #72	-> 81
/*     */         //   #69	-> 82
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   0	92	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker$findErrorElementsCancellable$2$errors$1;
/*     */         //   36	46	1	$result	Ljava/lang/Object;
/*     */       }
/*     */       public final Continuation<Unit> create(Object value, Continuation<? super InspectionErrorChecker$findErrorElementsCancellable$2$errors$1> $completion) {
/*     */         return (Continuation<Unit>)new InspectionErrorChecker$findErrorElementsCancellable$2$errors$1(this.$project, this.$file, this.$progressIndicator, $completion);
/*     */       }
/*     */       public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */         return ((InspectionErrorChecker$findErrorElementsCancellable$2$errors$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */       } } }
/*     */   
/*     */   @VisibleForTesting
/*     */   protected void onExecutedUnderProgress(@NotNull ProgressIndicatorEx indicator) {
/*  88 */     Intrinsics.checkNotNullParameter(indicator, "indicator");
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   private final List<SemanticError> findErrorElements(Project project, PsiFile file, ProgressIndicatorEx progressIndicator) {
/*     */     // Byte code:
/*     */     //   0: new kotlin/jvm/internal/Ref$ObjectRef
/*     */     //   3: dup
/*     */     //   4: invokespecial <init> : ()V
/*     */     //   7: astore #4
/*     */     //   9: nop
/*     */     //   10: invokestatic getInstance : ()Lcom/intellij/openapi/progress/ProgressManager;
/*     */     //   13: aload_0
/*     */     //   14: aload_3
/*     */     //   15: aload_1
/*     */     //   16: aload_2
/*     */     //   17: aload #4
/*     */     //   19: <illegal opcode> run : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;Lcom/intellij/openapi/wm/ex/ProgressIndicatorEx;Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/jvm/internal/Ref$ObjectRef;)Ljava/lang/Runnable;
/*     */     //   24: aload_3
/*     */     //   25: checkcast com/intellij/openapi/progress/ProgressIndicator
/*     */     //   28: invokevirtual executeProcessUnderProgress : (Ljava/lang/Runnable;Lcom/intellij/openapi/progress/ProgressIndicator;)V
/*     */     //   31: goto -> 64
/*     */     //   34: astore #5
/*     */     //   36: iconst_0
/*     */     //   37: istore #6
/*     */     //   39: ldc com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker
/*     */     //   41: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   44: dup
/*     */     //   45: ldc_w 'getInstance(...)'
/*     */     //   48: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   51: aload #5
/*     */     //   53: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   56: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   61: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   64: aload #4
/*     */     //   66: getfield element : Ljava/lang/Object;
/*     */     //   69: checkcast java/util/List
/*     */     //   72: dup
/*     */     //   73: ifnonnull -> 80
/*     */     //   76: pop
/*     */     //   77: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   80: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #95	-> 0
/*     */     //   #97	-> 9
/*     */     //   #98	-> 10
/*     */     //   #109	-> 24
/*     */     //   #98	-> 28
/*     */     //   #110	-> 34
/*     */     //   #111	-> 36
/*     */     //   #140	-> 39
/*     */     //   #111	-> 51
/*     */     //   #116	-> 64
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   39	12	6	$i$f$logger	I
/*     */     //   36	28	5	ex	Ljava/util/concurrent/CancellationException;
/*     */     //   9	72	4	errors	Lkotlin/jvm/internal/Ref$ObjectRef;
/*     */     //   0	81	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/InspectionErrorChecker;
/*     */     //   0	81	1	project	Lcom/intellij/openapi/project/Project;
/*     */     //   0	81	2	file	Lcom/intellij/psi/PsiFile;
/*     */     //   0	81	3	progressIndicator	Lcom/intellij/openapi/wm/ex/ProgressIndicatorEx;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   9	31	34	java/util/concurrent/CancellationException
/*     */   }
/*     */ 
/*     */   
/*     */   private static final void findErrorElements$lambda$6(InspectionErrorChecker this$0, ProgressIndicatorEx $progressIndicator, Project $project, PsiFile $file, Ref.ObjectRef $errors) {
/*  99 */     this$0.onExecutedUnderProgress($progressIndicator);
/*     */     
/* 101 */     Intrinsics.checkNotNullExpressionValue(InspectionProjectProfileManager.getInstance($project).getCurrentProfile(), "getCurrentProfile(...)"); InspectionProfileImpl inspectionProfile = InspectionProjectProfileManager.getInstance($project).getCurrentProfile();
/* 102 */     Intrinsics.checkNotNullExpressionValue((new MainPassesRunner($project, "", (InspectionProfile)inspectionProfile)).runMainPasses(
/* 103 */           CollectionsKt.listOf($file.getVirtualFile()), 
/* 104 */           HighlightSeverity.ERROR), "runMainPasses(...)"); Map highlights = (new MainPassesRunner($project, "", (InspectionProfile)inspectionProfile)).runMainPasses(CollectionsKt.listOf($file.getVirtualFile()), HighlightSeverity.ERROR);
/*     */     
/* 106 */     Map map1 = highlights; Ref.ObjectRef objectRef = $errors; int $i$f$flatMap = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     Map map2 = map1; Collection<Object> collection = new ArrayList(); int $i$f$flatMapTo = 0;
/* 147 */     for (Map.Entry element$iv$iv : map2.entrySet()) {
/* 148 */       Map.Entry it = element$iv$iv; int $i$a$-flatMap-InspectionErrorChecker$findErrorElements$1$1 = 0; Intrinsics.checkNotNullExpressionValue(it.getValue(), "<get-value>(...)"); Iterable list$iv$iv = (Iterable)it.getValue();
/* 149 */       CollectionsKt.addAll(collection, list$iv$iv);
/*     */     } 
/* 151 */     List list1 = (List)collection; objectRef = objectRef; int $i$f$filter = 0;
/* 152 */     List list2 = list1; collection = new ArrayList(); int $i$f$filterTo = 0;
/* 153 */     for (Object element$iv$iv : list2) { HighlightInfo it = (HighlightInfo)element$iv$iv; int $i$a$-filter-InspectionErrorChecker$findErrorElements$1$2 = 0; if (Intrinsics.areEqual(it.getSeverity(), HighlightSeverity.ERROR)) collection.add(element$iv$iv);  }
/* 154 */      Iterable $this$filter$iv = collection; objectRef = objectRef; int $i$f$mapNotNull = 0;
/* 155 */     Iterable $this$filterTo$iv$iv = $this$filter$iv; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 163 */     Iterable $this$forEach$iv$iv$iv = $this$filterTo$iv$iv; int $i$f$forEach = 0;
/* 164 */     Iterator iterator = $this$forEach$iv$iv$iv.iterator(); if (iterator.hasNext()) { Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0; HighlightInfo it = (HighlightInfo)element$iv$iv;
/*     */       int $i$a$-mapNotNull-InspectionErrorChecker$findErrorElements$1$3 = 0; }
/*     */     
/* 167 */     objectRef.element = destination$iv$iv;
/*     */   }
/*     */   
/*     */   private final SemanticError createProblem(HighlightInfo info) {
/*     */     String description;
/*     */     TextRange range = new TextRange(info.startOffset, info.endOffset);
/*     */     if (StringUtilKt.nullIfEmpty(info.getDescription()) == null) {
/*     */       StringUtilKt.nullIfEmpty(info.getDescription());
/*     */       String it = StringUtilKt.nullIfEmpty(info.getToolTip());
/*     */       int $i$a$-let-InspectionErrorChecker$createProblem$description$1 = 0;
/*     */       StringUtilKt.nullIfEmpty(info.getToolTip());
/*     */       if (((StringUtilKt.nullIfEmpty(info.getToolTip()) != null) ? XmlStringUtil.stripHtml(it) : null) == null) {
/*     */         (StringUtilKt.nullIfEmpty(info.getToolTip()) != null) ? XmlStringUtil.stripHtml(it) : null;
/*     */         return null;
/*     */       } 
/*     */     } 
/*     */     return new SemanticError(range, description);
/*     */   }
/*     */   
/*     */   private final List<OffsetError> toErrors(List $this$toErrors) {
/*     */     Iterable $this$map$iv = $this$toErrors;
/*     */     int $i$f$map = 0;
/*     */     Iterable iterable1 = $this$map$iv;
/*     */     Collection<OffsetError> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : iterable1) {
/*     */       SemanticError semanticError = (SemanticError)item$iv$iv;
/*     */       Collection<OffsetError> collection = destination$iv$iv;
/*     */       int $i$a$-map-InspectionErrorChecker$toErrors$1 = 0;
/*     */       collection.add(new OffsetError(semanticError.getLocation().getStartOffset(), semanticError.getDescription()));
/*     */     } 
/*     */     return (List<OffsetError>)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object findErrors(@NotNull Project project, @NotNull PsiFile file, @NotNull Continuation<? super List<? extends Error>> $completion) {
/*     */     return findErrors$suspendImpl(this, project, file, $completion);
/*     */   }
/*     */   
/*     */   @VisibleForTesting
/*     */   @Nullable
/*     */   protected Object createIndicator(@NotNull Continuation<? super ProgressIndicatorBase> $completion) {
/*     */     return createIndicator$suspendImpl(this, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "InspectionErrorChecker.kt", l = {42, 52}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"$this", "project", "file", "$this"}, m = "findErrors$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.InspectionErrorChecker")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class InspectionErrorChecker$findErrors$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     InspectionErrorChecker$findErrors$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return InspectionErrorChecker.findErrors$suspendImpl(InspectionErrorChecker.this, null, null, (Continuation<? super List<? extends Error>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\InspectionErrorChecker.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */