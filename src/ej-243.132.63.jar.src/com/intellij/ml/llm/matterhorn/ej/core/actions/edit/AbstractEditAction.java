/*     */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.AgentAction;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.ExecutionAgentContext;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.Error;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.SemanticChecker;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks.SyntaxChecker;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.TextRange;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.psi.PsiDocumentManager;
/*     */ import com.intellij.psi.PsiFile;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.enums.EnumEntriesKt;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000r\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b&\030\000 -2\0020\001:\002-.B\025\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\004\b\005\020\006Jb\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\n\020\024\032\0060\025j\002`\0262\n\020\027\032\0060\025j\002`\0262\006\020\030\032\0020\0172\006\020\031\032\0020\0322\006\020\033\032\0020\0252\b\b\002\020\034\032\0020\0252\b\b\002\020\035\032\0020\036H@¢\006\002\020\037J@\020 \032\b\022\004\022\0020!0\0032\006\020\020\032\0020\0212\006\020\"\032\0020#2\006\020\031\032\0020\0322\006\020\022\032\0020\0232\n\b\002\020$\032\004\030\0010\025H@¢\006\002\020%JD\020&\032\b\022\004\022\0020!0\0032\006\020\"\032\0020#2\006\020\031\032\0020\0322\006\020\022\032\0020\0232\n\b\002\020$\032\004\030\0010\0252\n\b\002\020'\032\004\030\0010(H@¢\006\002\020)J\034\020*\032\0020\0172\006\020\022\032\0020\0232\n\020+\032\0060\025j\002`,H\002R\032\020\007\032\b\022\004\022\0020\b0\003X\004¢\006\b\n\000\032\004\b\t\020\nR\032\020\013\032\b\022\004\022\0020\f0\003X\004¢\006\b\n\000\032\004\b\r\020\n¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "errorCheckers", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;", "<init>", "(Ljava/util/List;)V", "syntaxCheckers", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SyntaxChecker;", "getSyntaxCheckers", "()Ljava/util/List;", "semanticCheckers", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/SemanticChecker;", "getSemanticCheckers", "changeText", "", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "document", "Lcom/intellij/openapi/editor/Document;", "startLineIncl", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/OneBasedIndex;", "endLineIncl", "replacementText", "project", "Lcom/intellij/openapi/project/Project;", "margin", "window", "dryRun", "", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/openapi/editor/Document;IILjava/lang/String;Lcom/intellij/openapi/project/Project;IIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findErrorsWithTracking", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "checkType", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;", "maxErrors", "(Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findErrors", "executionContextForLogging", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLine", "i", "Lcom/intellij/ml/llm/matterhorn/ej/core/ZeroBasedIndex;", "Companion", "CheckType", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAbstractEditAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEditAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 4 ErrorCheckerEvents.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerEvents\n*L\n1#1,481:1\n808#2,11:482\n808#2,11:493\n1567#2:504\n1598#2,4:505\n1557#2:509\n1628#2,3:510\n1368#2:514\n1454#2,2:515\n1456#2,3:525\n1557#2:528\n1628#2,3:529\n1053#2:532\n24#3:513\n34#4,8:517\n*S KotlinDebug\n*F\n+ 1 AbstractEditAction.kt\ncom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction\n*L\n58#1:482,11\n59#1:493,11\n140#1:504\n140#1:505,4\n148#1:509\n148#1:510,3\n311#1:514\n311#1:515,2\n311#1:525,3\n320#1:528\n320#1:529,3\n331#1:532\n290#1:513\n313#1:517,8\n*E\n"})
/*     */ public abstract class AbstractEditAction
/*     */   implements AgentAction
/*     */ {
/*     */   public AbstractEditAction(@NotNull List errorCheckers) {
/*  58 */     List list1 = errorCheckers; AbstractEditAction abstractEditAction = this; int $i$f$filterIsInstance = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 482 */     List list2 = list1; Collection<Object> collection1 = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 491 */     for (Object element$iv$iv : list2) { if (element$iv$iv instanceof SyntaxChecker) collection1.add(element$iv$iv);  }
/* 492 */      abstractEditAction.syntaxCheckers = (List)collection1; Iterable $this$filterIsInstance$iv = errorCheckers; abstractEditAction = this; $i$f$filterIsInstance = 0;
/* 493 */     Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 502 */     for (Object element$iv$iv : $this$filterIsInstanceTo$iv$iv) { if (element$iv$iv instanceof SemanticChecker) destination$iv$iv.add(element$iv$iv);  }
/* 503 */      abstractEditAction.semanticCheckers = (List)destination$iv$iv;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getCustomSignature() {
/*     */     return AgentAction.DefaultImpls.getCustomSignature(this);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.execute(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object getInputParams(@NotNull ActionRequest $this$getInputParams, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.getInputParams(this, $this$getInputParams, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull Continuation $completion) {
/*     */     return AgentAction.DefaultImpls.reviewActionRequest(this, request, context, $completion);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\006\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\023\020\004\032\0020\005¢\006\n\n\002\020\b\032\004\b\006\020\007R\023\020\t\032\0020\005¢\006\n\n\002\020\b\032\004\b\n\020\007¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$Companion;", "", "<init>", "()V", "SEMANTIC_CHECKING_TIMEOUT", "Lkotlin/time/Duration;", "getSEMANTIC_CHECKING_TIMEOUT-UwyO8pc", "()J", "J", "SYNTAX_CHECKING_TIMEOUT", "getSYNTAX_CHECKING_TIMEOUT-UwyO8pc", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     public final long getSEMANTIC_CHECKING_TIMEOUT-UwyO8pc() {
/*     */       return AbstractEditAction.SEMANTIC_CHECKING_TIMEOUT;
/*     */     }
/*     */     
/*     */     public final long getSYNTAX_CHECKING_TIMEOUT-UwyO8pc() {
/*     */       return AbstractEditAction.SYNTAX_CHECKING_TIMEOUT;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final List<SyntaxChecker> syntaxCheckers;
/*     */   @NotNull
/*     */   private final List<SemanticChecker> semanticCheckers;
/*     */   private static final long SEMANTIC_CHECKING_TIMEOUT = DurationKt.toDuration(60, DurationUnit.SECONDS);
/*     */   private static final long SYNTAX_CHECKING_TIMEOUT = DurationKt.toDuration(10, DurationUnit.SECONDS);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;", "", "<init>", "(Ljava/lang/String;I)V", "SYNTAX", "SEMANTIC", "ej-core"})
/*     */   public enum CheckType {
/*     */     SYNTAX, SEMANTIC;
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<CheckType> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final List<SyntaxChecker> getSyntaxCheckers() {
/*     */     return this.syntaxCheckers;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected final List<SemanticChecker> getSemanticCheckers() {
/*     */     return this.semanticCheckers;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object changeText(@NotNull ExecutionAgentContext context, @NotNull Document document, int startLineIncl, int endLineIncl, @NotNull String replacementText, @NotNull Project project, int margin, int window, boolean dryRun, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #10
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$changeText$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #10
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$changeText$1
/*     */     //   13: astore #38
/*     */     //   15: aload #38
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #38
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$changeText$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #10
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #38
/*     */     //   53: aload #38
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #37
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #39
/*     */     //   65: aload #38
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 3543, 0 -> 128, 1 -> 842, 2 -> 1068, 3 -> 1301, 4 -> 1527, 5 -> 1898, 6 -> 2154, 7 -> 2435, 8 -> 2692, 9 -> 2981, 10 -> 3367
/*     */     //   128: aload #37
/*     */     //   130: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   133: new java/util/ArrayList
/*     */     //   136: dup
/*     */     //   137: invokespecial <init> : ()V
/*     */     //   140: checkcast java/util/List
/*     */     //   143: astore #11
/*     */     //   145: iload_3
/*     */     //   146: iconst_1
/*     */     //   147: isub
/*     */     //   148: istore #12
/*     */     //   150: iload #12
/*     */     //   152: aload_2
/*     */     //   153: invokeinterface getLineCount : ()I
/*     */     //   158: invokestatic min : (II)I
/*     */     //   161: istore #13
/*     */     //   163: iload #4
/*     */     //   165: iconst_1
/*     */     //   166: isub
/*     */     //   167: istore #14
/*     */     //   169: iload #14
/*     */     //   171: aload_2
/*     */     //   172: invokeinterface getLineCount : ()I
/*     */     //   177: invokestatic min : (II)I
/*     */     //   180: istore #15
/*     */     //   182: iconst_0
/*     */     //   183: istore #16
/*     */     //   185: iload #16
/*     */     //   187: iload #13
/*     */     //   189: if_icmpge -> 229
/*     */     //   192: aload_0
/*     */     //   193: aload_2
/*     */     //   194: iload #16
/*     */     //   196: invokespecial getLine : (Lcom/intellij/openapi/editor/Document;I)Ljava/lang/String;
/*     */     //   199: astore #17
/*     */     //   201: aload #11
/*     */     //   203: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   206: dup
/*     */     //   207: aload #17
/*     */     //   209: iload #16
/*     */     //   211: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType.BeforeOrAfter : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;
/*     */     //   214: invokespecial <init> : (Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;)V
/*     */     //   217: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   222: pop
/*     */     //   223: iinc #16, 1
/*     */     //   226: goto -> 185
/*     */     //   229: new java/util/ArrayList
/*     */     //   232: dup
/*     */     //   233: invokespecial <init> : ()V
/*     */     //   236: checkcast java/util/List
/*     */     //   239: astore #16
/*     */     //   241: iload #13
/*     */     //   243: istore #17
/*     */     //   245: iload #17
/*     */     //   247: iload #15
/*     */     //   249: if_icmpgt -> 328
/*     */     //   252: iconst_0
/*     */     //   253: iload #17
/*     */     //   255: if_icmpgt -> 277
/*     */     //   258: iload #17
/*     */     //   260: aload_2
/*     */     //   261: invokeinterface getLineCount : ()I
/*     */     //   266: if_icmpge -> 273
/*     */     //   269: iconst_1
/*     */     //   270: goto -> 278
/*     */     //   273: iconst_0
/*     */     //   274: goto -> 278
/*     */     //   277: iconst_0
/*     */     //   278: ifne -> 284
/*     */     //   281: goto -> 315
/*     */     //   284: aload_0
/*     */     //   285: aload_2
/*     */     //   286: iload #17
/*     */     //   288: invokespecial getLine : (Lcom/intellij/openapi/editor/Document;I)Ljava/lang/String;
/*     */     //   291: astore #18
/*     */     //   293: aload #16
/*     */     //   295: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   298: dup
/*     */     //   299: aload #18
/*     */     //   301: iload #17
/*     */     //   303: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType.ToReplace : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;
/*     */     //   306: invokespecial <init> : (Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;)V
/*     */     //   309: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   314: pop
/*     */     //   315: iload #17
/*     */     //   317: iload #15
/*     */     //   319: if_icmpeq -> 328
/*     */     //   322: iinc #17, 1
/*     */     //   325: goto -> 252
/*     */     //   328: new java/util/ArrayList
/*     */     //   331: dup
/*     */     //   332: invokespecial <init> : ()V
/*     */     //   335: checkcast java/util/List
/*     */     //   338: astore #17
/*     */     //   340: iload #15
/*     */     //   342: iconst_1
/*     */     //   343: iadd
/*     */     //   344: istore #18
/*     */     //   346: aload_2
/*     */     //   347: invokeinterface getLineCount : ()I
/*     */     //   352: istore #19
/*     */     //   354: iload #18
/*     */     //   356: iload #19
/*     */     //   358: if_icmpge -> 398
/*     */     //   361: aload_0
/*     */     //   362: aload_2
/*     */     //   363: iload #18
/*     */     //   365: invokespecial getLine : (Lcom/intellij/openapi/editor/Document;I)Ljava/lang/String;
/*     */     //   368: astore #20
/*     */     //   370: aload #17
/*     */     //   372: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   375: dup
/*     */     //   376: aload #20
/*     */     //   378: iload #18
/*     */     //   380: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType.BeforeOrAfter : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;
/*     */     //   383: invokespecial <init> : (Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;)V
/*     */     //   386: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   391: pop
/*     */     //   392: iinc #18, 1
/*     */     //   395: goto -> 354
/*     */     //   398: aload #11
/*     */     //   400: invokeinterface size : ()I
/*     */     //   405: istore #18
/*     */     //   407: aload #5
/*     */     //   409: checkcast java/lang/CharSequence
/*     */     //   412: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   415: checkcast java/lang/Iterable
/*     */     //   418: astore #20
/*     */     //   420: iconst_0
/*     */     //   421: istore #21
/*     */     //   423: aload #20
/*     */     //   425: astore #22
/*     */     //   427: new java/util/ArrayList
/*     */     //   430: dup
/*     */     //   431: aload #20
/*     */     //   433: bipush #10
/*     */     //   435: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   438: invokespecial <init> : (I)V
/*     */     //   441: checkcast java/util/Collection
/*     */     //   444: astore #23
/*     */     //   446: iconst_0
/*     */     //   447: istore #24
/*     */     //   449: iconst_0
/*     */     //   450: istore #25
/*     */     //   452: aload #22
/*     */     //   454: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   459: astore #26
/*     */     //   461: aload #26
/*     */     //   463: invokeinterface hasNext : ()Z
/*     */     //   468: ifeq -> 543
/*     */     //   471: aload #26
/*     */     //   473: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   478: astore #27
/*     */     //   480: aload #23
/*     */     //   482: iload #25
/*     */     //   484: iinc #25, 1
/*     */     //   487: istore #28
/*     */     //   489: iload #28
/*     */     //   491: ifge -> 497
/*     */     //   494: invokestatic throwIndexOverflow : ()V
/*     */     //   497: iload #28
/*     */     //   499: aload #27
/*     */     //   501: checkcast java/lang/String
/*     */     //   504: astore #29
/*     */     //   506: istore #30
/*     */     //   508: astore #36
/*     */     //   510: iconst_0
/*     */     //   511: istore #31
/*     */     //   513: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   516: dup
/*     */     //   517: aload #29
/*     */     //   519: iload #30
/*     */     //   521: iload #18
/*     */     //   523: iadd
/*     */     //   524: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType.Replacement : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;
/*     */     //   527: invokespecial <init> : (Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;)V
/*     */     //   530: nop
/*     */     //   531: aload #36
/*     */     //   533: swap
/*     */     //   534: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   539: pop
/*     */     //   540: goto -> 461
/*     */     //   543: aload #23
/*     */     //   545: checkcast java/util/List
/*     */     //   548: nop
/*     */     //   549: astore #19
/*     */     //   551: aload #17
/*     */     //   553: checkcast java/lang/Iterable
/*     */     //   556: astore #21
/*     */     //   558: iconst_0
/*     */     //   559: istore #22
/*     */     //   561: aload #21
/*     */     //   563: astore #23
/*     */     //   565: new java/util/ArrayList
/*     */     //   568: dup
/*     */     //   569: aload #21
/*     */     //   571: bipush #10
/*     */     //   573: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   576: invokespecial <init> : (I)V
/*     */     //   579: checkcast java/util/Collection
/*     */     //   582: astore #24
/*     */     //   584: iconst_0
/*     */     //   585: istore #25
/*     */     //   587: aload #23
/*     */     //   589: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   594: astore #26
/*     */     //   596: aload #26
/*     */     //   598: invokeinterface hasNext : ()Z
/*     */     //   603: ifeq -> 680
/*     */     //   606: aload #26
/*     */     //   608: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   613: astore #27
/*     */     //   615: aload #24
/*     */     //   617: aload #27
/*     */     //   619: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   622: astore #28
/*     */     //   624: astore #36
/*     */     //   626: iconst_0
/*     */     //   627: istore #29
/*     */     //   629: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta
/*     */     //   632: dup
/*     */     //   633: aload #28
/*     */     //   635: invokevirtual getLine : ()Ljava/lang/String;
/*     */     //   638: aload #28
/*     */     //   640: invokevirtual getLineIndex : ()I
/*     */     //   643: aload #16
/*     */     //   645: invokeinterface size : ()I
/*     */     //   650: isub
/*     */     //   651: aload #19
/*     */     //   653: invokeinterface size : ()I
/*     */     //   658: iadd
/*     */     //   659: aload #28
/*     */     //   661: invokevirtual getType : ()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;
/*     */     //   664: invokespecial <init> : (Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineType;)V
/*     */     //   667: nop
/*     */     //   668: aload #36
/*     */     //   670: swap
/*     */     //   671: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   676: pop
/*     */     //   677: goto -> 596
/*     */     //   680: aload #24
/*     */     //   682: checkcast java/util/List
/*     */     //   685: nop
/*     */     //   686: astore #20
/*     */     //   688: aload #11
/*     */     //   690: checkcast java/util/Collection
/*     */     //   693: aload #19
/*     */     //   695: checkcast java/lang/Iterable
/*     */     //   698: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   701: checkcast java/util/Collection
/*     */     //   704: aload #20
/*     */     //   706: checkcast java/lang/Iterable
/*     */     //   709: invokestatic plus : (Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;
/*     */     //   712: astore #21
/*     */     //   714: aload #21
/*     */     //   716: checkcast java/lang/Iterable
/*     */     //   719: ldc '\\n'
/*     */     //   721: checkcast java/lang/CharSequence
/*     */     //   724: aconst_null
/*     */     //   725: aconst_null
/*     */     //   726: iconst_0
/*     */     //   727: aconst_null
/*     */     //   728: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function1;
/*     */     //   733: bipush #30
/*     */     //   735: aconst_null
/*     */     //   736: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   739: astore #22
/*     */     //   741: aload #6
/*     */     //   743: aload_2
/*     */     //   744: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   749: aload #38
/*     */     //   751: aload #38
/*     */     //   753: aload_0
/*     */     //   754: putfield L$0 : Ljava/lang/Object;
/*     */     //   757: aload #38
/*     */     //   759: aload_1
/*     */     //   760: putfield L$1 : Ljava/lang/Object;
/*     */     //   763: aload #38
/*     */     //   765: aload_2
/*     */     //   766: putfield L$2 : Ljava/lang/Object;
/*     */     //   769: aload #38
/*     */     //   771: aload #5
/*     */     //   773: putfield L$3 : Ljava/lang/Object;
/*     */     //   776: aload #38
/*     */     //   778: aload #6
/*     */     //   780: putfield L$4 : Ljava/lang/Object;
/*     */     //   783: aload #38
/*     */     //   785: aload #22
/*     */     //   787: putfield L$5 : Ljava/lang/Object;
/*     */     //   790: aload #38
/*     */     //   792: iload_3
/*     */     //   793: putfield I$0 : I
/*     */     //   796: aload #38
/*     */     //   798: iload #4
/*     */     //   800: putfield I$1 : I
/*     */     //   803: aload #38
/*     */     //   805: iload #7
/*     */     //   807: putfield I$2 : I
/*     */     //   810: aload #38
/*     */     //   812: iload #8
/*     */     //   814: putfield I$3 : I
/*     */     //   817: aload #38
/*     */     //   819: iload #9
/*     */     //   821: putfield Z$0 : Z
/*     */     //   824: aload #38
/*     */     //   826: iconst_1
/*     */     //   827: putfield label : I
/*     */     //   830: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   833: dup
/*     */     //   834: aload #39
/*     */     //   836: if_acmpne -> 940
/*     */     //   839: aload #39
/*     */     //   841: areturn
/*     */     //   842: aload #38
/*     */     //   844: getfield Z$0 : Z
/*     */     //   847: istore #9
/*     */     //   849: aload #38
/*     */     //   851: getfield I$3 : I
/*     */     //   854: istore #8
/*     */     //   856: aload #38
/*     */     //   858: getfield I$2 : I
/*     */     //   861: istore #7
/*     */     //   863: aload #38
/*     */     //   865: getfield I$1 : I
/*     */     //   868: istore #4
/*     */     //   870: aload #38
/*     */     //   872: getfield I$0 : I
/*     */     //   875: istore_3
/*     */     //   876: aload #38
/*     */     //   878: getfield L$5 : Ljava/lang/Object;
/*     */     //   881: checkcast java/lang/String
/*     */     //   884: astore #22
/*     */     //   886: aload #38
/*     */     //   888: getfield L$4 : Ljava/lang/Object;
/*     */     //   891: checkcast com/intellij/openapi/project/Project
/*     */     //   894: astore #6
/*     */     //   896: aload #38
/*     */     //   898: getfield L$3 : Ljava/lang/Object;
/*     */     //   901: checkcast java/lang/String
/*     */     //   904: astore #5
/*     */     //   906: aload #38
/*     */     //   908: getfield L$2 : Ljava/lang/Object;
/*     */     //   911: checkcast com/intellij/openapi/editor/Document
/*     */     //   914: astore_2
/*     */     //   915: aload #38
/*     */     //   917: getfield L$1 : Ljava/lang/Object;
/*     */     //   920: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   923: astore_1
/*     */     //   924: aload #38
/*     */     //   926: getfield L$0 : Ljava/lang/Object;
/*     */     //   929: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   932: astore_0
/*     */     //   933: aload #37
/*     */     //   935: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   938: aload #37
/*     */     //   940: checkcast com/intellij/psi/PsiFile
/*     */     //   943: dup
/*     */     //   944: ifnonnull -> 962
/*     */     //   947: pop
/*     */     //   948: new java/lang/IllegalStateException
/*     */     //   951: dup
/*     */     //   952: ldc_w 'PSI file is expected to present if document is already obtained'
/*     */     //   955: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   958: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   961: athrow
/*     */     //   962: astore #23
/*     */     //   964: aload #23
/*     */     //   966: aload #22
/*     */     //   968: aload #6
/*     */     //   970: <illegal opcode> invoke : (Lcom/intellij/psi/PsiFile;Ljava/lang/String;Lcom/intellij/openapi/project/Project;)Lkotlin/jvm/functions/Function0;
/*     */     //   975: aload #38
/*     */     //   977: aload #38
/*     */     //   979: aload_0
/*     */     //   980: putfield L$0 : Ljava/lang/Object;
/*     */     //   983: aload #38
/*     */     //   985: aload_1
/*     */     //   986: putfield L$1 : Ljava/lang/Object;
/*     */     //   989: aload #38
/*     */     //   991: aload_2
/*     */     //   992: putfield L$2 : Ljava/lang/Object;
/*     */     //   995: aload #38
/*     */     //   997: aload #5
/*     */     //   999: putfield L$3 : Ljava/lang/Object;
/*     */     //   1002: aload #38
/*     */     //   1004: aload #6
/*     */     //   1006: putfield L$4 : Ljava/lang/Object;
/*     */     //   1009: aload #38
/*     */     //   1011: aload #22
/*     */     //   1013: putfield L$5 : Ljava/lang/Object;
/*     */     //   1016: aload #38
/*     */     //   1018: iload_3
/*     */     //   1019: putfield I$0 : I
/*     */     //   1022: aload #38
/*     */     //   1024: iload #4
/*     */     //   1026: putfield I$1 : I
/*     */     //   1029: aload #38
/*     */     //   1031: iload #7
/*     */     //   1033: putfield I$2 : I
/*     */     //   1036: aload #38
/*     */     //   1038: iload #8
/*     */     //   1040: putfield I$3 : I
/*     */     //   1043: aload #38
/*     */     //   1045: iload #9
/*     */     //   1047: putfield Z$0 : Z
/*     */     //   1050: aload #38
/*     */     //   1052: iconst_2
/*     */     //   1053: putfield label : I
/*     */     //   1056: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1059: dup
/*     */     //   1060: aload #39
/*     */     //   1062: if_acmpne -> 1166
/*     */     //   1065: aload #39
/*     */     //   1067: areturn
/*     */     //   1068: aload #38
/*     */     //   1070: getfield Z$0 : Z
/*     */     //   1073: istore #9
/*     */     //   1075: aload #38
/*     */     //   1077: getfield I$3 : I
/*     */     //   1080: istore #8
/*     */     //   1082: aload #38
/*     */     //   1084: getfield I$2 : I
/*     */     //   1087: istore #7
/*     */     //   1089: aload #38
/*     */     //   1091: getfield I$1 : I
/*     */     //   1094: istore #4
/*     */     //   1096: aload #38
/*     */     //   1098: getfield I$0 : I
/*     */     //   1101: istore_3
/*     */     //   1102: aload #38
/*     */     //   1104: getfield L$5 : Ljava/lang/Object;
/*     */     //   1107: checkcast java/lang/String
/*     */     //   1110: astore #22
/*     */     //   1112: aload #38
/*     */     //   1114: getfield L$4 : Ljava/lang/Object;
/*     */     //   1117: checkcast com/intellij/openapi/project/Project
/*     */     //   1120: astore #6
/*     */     //   1122: aload #38
/*     */     //   1124: getfield L$3 : Ljava/lang/Object;
/*     */     //   1127: checkcast java/lang/String
/*     */     //   1130: astore #5
/*     */     //   1132: aload #38
/*     */     //   1134: getfield L$2 : Ljava/lang/Object;
/*     */     //   1137: checkcast com/intellij/openapi/editor/Document
/*     */     //   1140: astore_2
/*     */     //   1141: aload #38
/*     */     //   1143: getfield L$1 : Ljava/lang/Object;
/*     */     //   1146: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1149: astore_1
/*     */     //   1150: aload #38
/*     */     //   1152: getfield L$0 : Ljava/lang/Object;
/*     */     //   1155: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   1158: astore_0
/*     */     //   1159: aload #37
/*     */     //   1161: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1164: aload #37
/*     */     //   1166: checkcast com/intellij/psi/PsiFile
/*     */     //   1169: astore #24
/*     */     //   1171: aload_0
/*     */     //   1172: aload_1
/*     */     //   1173: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType.SYNTAX : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   1176: aload #6
/*     */     //   1178: aload #24
/*     */     //   1180: invokeinterface getViewProvider : ()Lcom/intellij/psi/FileViewProvider;
/*     */     //   1185: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   1190: dup
/*     */     //   1191: ldc_w 'getDocument(...)'
/*     */     //   1194: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1197: aconst_null
/*     */     //   1198: aload #38
/*     */     //   1200: bipush #16
/*     */     //   1202: aconst_null
/*     */     //   1203: aload #38
/*     */     //   1205: aload_0
/*     */     //   1206: putfield L$0 : Ljava/lang/Object;
/*     */     //   1209: aload #38
/*     */     //   1211: aload_1
/*     */     //   1212: putfield L$1 : Ljava/lang/Object;
/*     */     //   1215: aload #38
/*     */     //   1217: aload_2
/*     */     //   1218: putfield L$2 : Ljava/lang/Object;
/*     */     //   1221: aload #38
/*     */     //   1223: aload #5
/*     */     //   1225: putfield L$3 : Ljava/lang/Object;
/*     */     //   1228: aload #38
/*     */     //   1230: aload #6
/*     */     //   1232: putfield L$4 : Ljava/lang/Object;
/*     */     //   1235: aload #38
/*     */     //   1237: aload #22
/*     */     //   1239: putfield L$5 : Ljava/lang/Object;
/*     */     //   1242: aload #38
/*     */     //   1244: aload #24
/*     */     //   1246: putfield L$6 : Ljava/lang/Object;
/*     */     //   1249: aload #38
/*     */     //   1251: iload_3
/*     */     //   1252: putfield I$0 : I
/*     */     //   1255: aload #38
/*     */     //   1257: iload #4
/*     */     //   1259: putfield I$1 : I
/*     */     //   1262: aload #38
/*     */     //   1264: iload #7
/*     */     //   1266: putfield I$2 : I
/*     */     //   1269: aload #38
/*     */     //   1271: iload #8
/*     */     //   1273: putfield I$3 : I
/*     */     //   1276: aload #38
/*     */     //   1278: iload #9
/*     */     //   1280: putfield Z$0 : Z
/*     */     //   1283: aload #38
/*     */     //   1285: iconst_3
/*     */     //   1286: putfield label : I
/*     */     //   1289: invokestatic findErrorsWithTracking$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   1292: dup
/*     */     //   1293: aload #39
/*     */     //   1295: if_acmpne -> 1409
/*     */     //   1298: aload #39
/*     */     //   1300: areturn
/*     */     //   1301: aload #38
/*     */     //   1303: getfield Z$0 : Z
/*     */     //   1306: istore #9
/*     */     //   1308: aload #38
/*     */     //   1310: getfield I$3 : I
/*     */     //   1313: istore #8
/*     */     //   1315: aload #38
/*     */     //   1317: getfield I$2 : I
/*     */     //   1320: istore #7
/*     */     //   1322: aload #38
/*     */     //   1324: getfield I$1 : I
/*     */     //   1327: istore #4
/*     */     //   1329: aload #38
/*     */     //   1331: getfield I$0 : I
/*     */     //   1334: istore_3
/*     */     //   1335: aload #38
/*     */     //   1337: getfield L$6 : Ljava/lang/Object;
/*     */     //   1340: checkcast com/intellij/psi/PsiFile
/*     */     //   1343: astore #24
/*     */     //   1345: aload #38
/*     */     //   1347: getfield L$5 : Ljava/lang/Object;
/*     */     //   1350: checkcast java/lang/String
/*     */     //   1353: astore #22
/*     */     //   1355: aload #38
/*     */     //   1357: getfield L$4 : Ljava/lang/Object;
/*     */     //   1360: checkcast com/intellij/openapi/project/Project
/*     */     //   1363: astore #6
/*     */     //   1365: aload #38
/*     */     //   1367: getfield L$3 : Ljava/lang/Object;
/*     */     //   1370: checkcast java/lang/String
/*     */     //   1373: astore #5
/*     */     //   1375: aload #38
/*     */     //   1377: getfield L$2 : Ljava/lang/Object;
/*     */     //   1380: checkcast com/intellij/openapi/editor/Document
/*     */     //   1383: astore_2
/*     */     //   1384: aload #38
/*     */     //   1386: getfield L$1 : Ljava/lang/Object;
/*     */     //   1389: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1392: astore_1
/*     */     //   1393: aload #38
/*     */     //   1395: getfield L$0 : Ljava/lang/Object;
/*     */     //   1398: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   1401: astore_0
/*     */     //   1402: aload #37
/*     */     //   1404: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1407: aload #37
/*     */     //   1409: checkcast java/util/List
/*     */     //   1412: astore #25
/*     */     //   1414: aload_2
/*     */     //   1415: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   1420: aload #38
/*     */     //   1422: aload #38
/*     */     //   1424: aload_0
/*     */     //   1425: putfield L$0 : Ljava/lang/Object;
/*     */     //   1428: aload #38
/*     */     //   1430: aload_1
/*     */     //   1431: putfield L$1 : Ljava/lang/Object;
/*     */     //   1434: aload #38
/*     */     //   1436: aload_2
/*     */     //   1437: putfield L$2 : Ljava/lang/Object;
/*     */     //   1440: aload #38
/*     */     //   1442: aload #5
/*     */     //   1444: putfield L$3 : Ljava/lang/Object;
/*     */     //   1447: aload #38
/*     */     //   1449: aload #6
/*     */     //   1451: putfield L$4 : Ljava/lang/Object;
/*     */     //   1454: aload #38
/*     */     //   1456: aload #22
/*     */     //   1458: putfield L$5 : Ljava/lang/Object;
/*     */     //   1461: aload #38
/*     */     //   1463: aload #24
/*     */     //   1465: putfield L$6 : Ljava/lang/Object;
/*     */     //   1468: aload #38
/*     */     //   1470: aload #25
/*     */     //   1472: putfield L$7 : Ljava/lang/Object;
/*     */     //   1475: aload #38
/*     */     //   1477: iload_3
/*     */     //   1478: putfield I$0 : I
/*     */     //   1481: aload #38
/*     */     //   1483: iload #4
/*     */     //   1485: putfield I$1 : I
/*     */     //   1488: aload #38
/*     */     //   1490: iload #7
/*     */     //   1492: putfield I$2 : I
/*     */     //   1495: aload #38
/*     */     //   1497: iload #8
/*     */     //   1499: putfield I$3 : I
/*     */     //   1502: aload #38
/*     */     //   1504: iload #9
/*     */     //   1506: putfield Z$0 : Z
/*     */     //   1509: aload #38
/*     */     //   1511: iconst_4
/*     */     //   1512: putfield label : I
/*     */     //   1515: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1518: dup
/*     */     //   1519: aload #39
/*     */     //   1521: if_acmpne -> 1645
/*     */     //   1524: aload #39
/*     */     //   1526: areturn
/*     */     //   1527: aload #38
/*     */     //   1529: getfield Z$0 : Z
/*     */     //   1532: istore #9
/*     */     //   1534: aload #38
/*     */     //   1536: getfield I$3 : I
/*     */     //   1539: istore #8
/*     */     //   1541: aload #38
/*     */     //   1543: getfield I$2 : I
/*     */     //   1546: istore #7
/*     */     //   1548: aload #38
/*     */     //   1550: getfield I$1 : I
/*     */     //   1553: istore #4
/*     */     //   1555: aload #38
/*     */     //   1557: getfield I$0 : I
/*     */     //   1560: istore_3
/*     */     //   1561: aload #38
/*     */     //   1563: getfield L$7 : Ljava/lang/Object;
/*     */     //   1566: checkcast java/util/List
/*     */     //   1569: astore #25
/*     */     //   1571: aload #38
/*     */     //   1573: getfield L$6 : Ljava/lang/Object;
/*     */     //   1576: checkcast com/intellij/psi/PsiFile
/*     */     //   1579: astore #24
/*     */     //   1581: aload #38
/*     */     //   1583: getfield L$5 : Ljava/lang/Object;
/*     */     //   1586: checkcast java/lang/String
/*     */     //   1589: astore #22
/*     */     //   1591: aload #38
/*     */     //   1593: getfield L$4 : Ljava/lang/Object;
/*     */     //   1596: checkcast com/intellij/openapi/project/Project
/*     */     //   1599: astore #6
/*     */     //   1601: aload #38
/*     */     //   1603: getfield L$3 : Ljava/lang/Object;
/*     */     //   1606: checkcast java/lang/String
/*     */     //   1609: astore #5
/*     */     //   1611: aload #38
/*     */     //   1613: getfield L$2 : Ljava/lang/Object;
/*     */     //   1616: checkcast com/intellij/openapi/editor/Document
/*     */     //   1619: astore_2
/*     */     //   1620: aload #38
/*     */     //   1622: getfield L$1 : Ljava/lang/Object;
/*     */     //   1625: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1628: astore_1
/*     */     //   1629: aload #38
/*     */     //   1631: getfield L$0 : Ljava/lang/Object;
/*     */     //   1634: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   1637: astore_0
/*     */     //   1638: aload #37
/*     */     //   1640: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1643: aload #37
/*     */     //   1645: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   1648: dup
/*     */     //   1649: ifnonnull -> 1657
/*     */     //   1652: pop
/*     */     //   1653: ldc_w 'ERROR: Can't find file (but the document exists)'
/*     */     //   1656: areturn
/*     */     //   1657: astore #26
/*     */     //   1659: aconst_null
/*     */     //   1660: astore #27
/*     */     //   1662: aload #26
/*     */     //   1664: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   1667: dup
/*     */     //   1668: ldc_w 'toNioPath(...)'
/*     */     //   1671: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1674: astore #28
/*     */     //   1676: aload #24
/*     */     //   1678: invokeinterface getViewProvider : ()Lcom/intellij/psi/FileViewProvider;
/*     */     //   1683: invokeinterface getDocument : ()Lcom/intellij/openapi/editor/Document;
/*     */     //   1688: astore #29
/*     */     //   1690: aload #25
/*     */     //   1692: checkcast java/util/Collection
/*     */     //   1695: invokeinterface isEmpty : ()Z
/*     */     //   1700: ifne -> 1707
/*     */     //   1703: iconst_1
/*     */     //   1704: goto -> 1708
/*     */     //   1707: iconst_0
/*     */     //   1708: ifeq -> 1771
/*     */     //   1711: aload #28
/*     */     //   1713: aload #29
/*     */     //   1715: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   1718: aload #29
/*     */     //   1720: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   1723: dup
/*     */     //   1724: iload_3
/*     */     //   1725: aload #5
/*     */     //   1727: checkcast java/lang/CharSequence
/*     */     //   1730: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   1733: invokeinterface size : ()I
/*     */     //   1738: iload #7
/*     */     //   1740: iload #7
/*     */     //   1742: iconst_0
/*     */     //   1743: bipush #16
/*     */     //   1745: aconst_null
/*     */     //   1746: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   1749: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   1752: aconst_null
/*     */     //   1753: iconst_0
/*     */     //   1754: aload_1
/*     */     //   1755: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   1760: bipush #24
/*     */     //   1762: aconst_null
/*     */     //   1763: invokestatic printScreen$default : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/util/List;Ljava/lang/String;ILcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   1766: astore #27
/*     */     //   1768: goto -> 2567
/*     */     //   1771: iload #9
/*     */     //   1773: ifne -> 2544
/*     */     //   1776: aload_1
/*     */     //   1777: invokeinterface getEditService : ()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditService;
/*     */     //   1782: aload #38
/*     */     //   1784: aload #38
/*     */     //   1786: aload_0
/*     */     //   1787: putfield L$0 : Ljava/lang/Object;
/*     */     //   1790: aload #38
/*     */     //   1792: aload_1
/*     */     //   1793: putfield L$1 : Ljava/lang/Object;
/*     */     //   1796: aload #38
/*     */     //   1798: aload_2
/*     */     //   1799: putfield L$2 : Ljava/lang/Object;
/*     */     //   1802: aload #38
/*     */     //   1804: aload #6
/*     */     //   1806: putfield L$3 : Ljava/lang/Object;
/*     */     //   1809: aload #38
/*     */     //   1811: aload #22
/*     */     //   1813: putfield L$4 : Ljava/lang/Object;
/*     */     //   1816: aload #38
/*     */     //   1818: aload #25
/*     */     //   1820: putfield L$5 : Ljava/lang/Object;
/*     */     //   1823: aload #38
/*     */     //   1825: aload #26
/*     */     //   1827: putfield L$6 : Ljava/lang/Object;
/*     */     //   1830: aload #38
/*     */     //   1832: aload #28
/*     */     //   1834: putfield L$7 : Ljava/lang/Object;
/*     */     //   1837: aload #38
/*     */     //   1839: aload #29
/*     */     //   1841: putfield L$8 : Ljava/lang/Object;
/*     */     //   1844: aload #38
/*     */     //   1846: iload_3
/*     */     //   1847: putfield I$0 : I
/*     */     //   1850: aload #38
/*     */     //   1852: iload #4
/*     */     //   1854: putfield I$1 : I
/*     */     //   1857: aload #38
/*     */     //   1859: iload #7
/*     */     //   1861: putfield I$2 : I
/*     */     //   1864: aload #38
/*     */     //   1866: iload #8
/*     */     //   1868: putfield I$3 : I
/*     */     //   1871: aload #38
/*     */     //   1873: iload #9
/*     */     //   1875: putfield Z$0 : Z
/*     */     //   1878: aload #38
/*     */     //   1880: iconst_5
/*     */     //   1881: putfield label : I
/*     */     //   1884: invokeinterface startEditingSession : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1889: dup
/*     */     //   1890: aload #39
/*     */     //   1892: if_acmpne -> 2026
/*     */     //   1895: aload #39
/*     */     //   1897: areturn
/*     */     //   1898: aload #38
/*     */     //   1900: getfield Z$0 : Z
/*     */     //   1903: istore #9
/*     */     //   1905: aload #38
/*     */     //   1907: getfield I$3 : I
/*     */     //   1910: istore #8
/*     */     //   1912: aload #38
/*     */     //   1914: getfield I$2 : I
/*     */     //   1917: istore #7
/*     */     //   1919: aload #38
/*     */     //   1921: getfield I$1 : I
/*     */     //   1924: istore #4
/*     */     //   1926: aload #38
/*     */     //   1928: getfield I$0 : I
/*     */     //   1931: istore_3
/*     */     //   1932: aload #38
/*     */     //   1934: getfield L$8 : Ljava/lang/Object;
/*     */     //   1937: checkcast com/intellij/openapi/editor/Document
/*     */     //   1940: astore #29
/*     */     //   1942: aload #38
/*     */     //   1944: getfield L$7 : Ljava/lang/Object;
/*     */     //   1947: checkcast java/nio/file/Path
/*     */     //   1950: astore #28
/*     */     //   1952: aload #38
/*     */     //   1954: getfield L$6 : Ljava/lang/Object;
/*     */     //   1957: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   1960: astore #26
/*     */     //   1962: aload #38
/*     */     //   1964: getfield L$5 : Ljava/lang/Object;
/*     */     //   1967: checkcast java/util/List
/*     */     //   1970: astore #25
/*     */     //   1972: aload #38
/*     */     //   1974: getfield L$4 : Ljava/lang/Object;
/*     */     //   1977: checkcast java/lang/String
/*     */     //   1980: astore #22
/*     */     //   1982: aload #38
/*     */     //   1984: getfield L$3 : Ljava/lang/Object;
/*     */     //   1987: checkcast com/intellij/openapi/project/Project
/*     */     //   1990: astore #6
/*     */     //   1992: aload #38
/*     */     //   1994: getfield L$2 : Ljava/lang/Object;
/*     */     //   1997: checkcast com/intellij/openapi/editor/Document
/*     */     //   2000: astore_2
/*     */     //   2001: aload #38
/*     */     //   2003: getfield L$1 : Ljava/lang/Object;
/*     */     //   2006: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2009: astore_1
/*     */     //   2010: aload #38
/*     */     //   2012: getfield L$0 : Ljava/lang/Object;
/*     */     //   2015: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   2018: astore_0
/*     */     //   2019: aload #37
/*     */     //   2021: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2024: aload #37
/*     */     //   2026: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession
/*     */     //   2029: astore #30
/*     */     //   2031: aload #30
/*     */     //   2033: aload #28
/*     */     //   2035: aload_2
/*     */     //   2036: aload #22
/*     */     //   2038: aload #38
/*     */     //   2040: aload #38
/*     */     //   2042: aload_0
/*     */     //   2043: putfield L$0 : Ljava/lang/Object;
/*     */     //   2046: aload #38
/*     */     //   2048: aload_1
/*     */     //   2049: putfield L$1 : Ljava/lang/Object;
/*     */     //   2052: aload #38
/*     */     //   2054: aload_2
/*     */     //   2055: putfield L$2 : Ljava/lang/Object;
/*     */     //   2058: aload #38
/*     */     //   2060: aload #6
/*     */     //   2062: putfield L$3 : Ljava/lang/Object;
/*     */     //   2065: aload #38
/*     */     //   2067: aload #25
/*     */     //   2069: putfield L$4 : Ljava/lang/Object;
/*     */     //   2072: aload #38
/*     */     //   2074: aload #26
/*     */     //   2076: putfield L$5 : Ljava/lang/Object;
/*     */     //   2079: aload #38
/*     */     //   2081: aload #29
/*     */     //   2083: putfield L$6 : Ljava/lang/Object;
/*     */     //   2086: aload #38
/*     */     //   2088: aload #30
/*     */     //   2090: putfield L$7 : Ljava/lang/Object;
/*     */     //   2093: aload #38
/*     */     //   2095: aconst_null
/*     */     //   2096: putfield L$8 : Ljava/lang/Object;
/*     */     //   2099: aload #38
/*     */     //   2101: iload_3
/*     */     //   2102: putfield I$0 : I
/*     */     //   2105: aload #38
/*     */     //   2107: iload #4
/*     */     //   2109: putfield I$1 : I
/*     */     //   2112: aload #38
/*     */     //   2114: iload #7
/*     */     //   2116: putfield I$2 : I
/*     */     //   2119: aload #38
/*     */     //   2121: iload #8
/*     */     //   2123: putfield I$3 : I
/*     */     //   2126: aload #38
/*     */     //   2128: iload #9
/*     */     //   2130: putfield Z$0 : Z
/*     */     //   2133: aload #38
/*     */     //   2135: bipush #6
/*     */     //   2137: putfield label : I
/*     */     //   2140: invokeinterface requestDocumentUpdate : (Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2145: dup
/*     */     //   2146: aload #39
/*     */     //   2148: if_acmpne -> 2272
/*     */     //   2151: aload #39
/*     */     //   2153: areturn
/*     */     //   2154: aload #38
/*     */     //   2156: getfield Z$0 : Z
/*     */     //   2159: istore #9
/*     */     //   2161: aload #38
/*     */     //   2163: getfield I$3 : I
/*     */     //   2166: istore #8
/*     */     //   2168: aload #38
/*     */     //   2170: getfield I$2 : I
/*     */     //   2173: istore #7
/*     */     //   2175: aload #38
/*     */     //   2177: getfield I$1 : I
/*     */     //   2180: istore #4
/*     */     //   2182: aload #38
/*     */     //   2184: getfield I$0 : I
/*     */     //   2187: istore_3
/*     */     //   2188: aload #38
/*     */     //   2190: getfield L$7 : Ljava/lang/Object;
/*     */     //   2193: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession
/*     */     //   2196: astore #30
/*     */     //   2198: aload #38
/*     */     //   2200: getfield L$6 : Ljava/lang/Object;
/*     */     //   2203: checkcast com/intellij/openapi/editor/Document
/*     */     //   2206: astore #29
/*     */     //   2208: aload #38
/*     */     //   2210: getfield L$5 : Ljava/lang/Object;
/*     */     //   2213: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   2216: astore #26
/*     */     //   2218: aload #38
/*     */     //   2220: getfield L$4 : Ljava/lang/Object;
/*     */     //   2223: checkcast java/util/List
/*     */     //   2226: astore #25
/*     */     //   2228: aload #38
/*     */     //   2230: getfield L$3 : Ljava/lang/Object;
/*     */     //   2233: checkcast com/intellij/openapi/project/Project
/*     */     //   2236: astore #6
/*     */     //   2238: aload #38
/*     */     //   2240: getfield L$2 : Ljava/lang/Object;
/*     */     //   2243: checkcast com/intellij/openapi/editor/Document
/*     */     //   2246: astore_2
/*     */     //   2247: aload #38
/*     */     //   2249: getfield L$1 : Ljava/lang/Object;
/*     */     //   2252: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2255: astore_1
/*     */     //   2256: aload #38
/*     */     //   2258: getfield L$0 : Ljava/lang/Object;
/*     */     //   2261: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   2264: astore_0
/*     */     //   2265: aload #37
/*     */     //   2267: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2270: aload #37
/*     */     //   2272: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditError
/*     */     //   2275: astore #31
/*     */     //   2277: aload #31
/*     */     //   2279: astore #32
/*     */     //   2281: aload #32
/*     */     //   2283: ifnull -> 2324
/*     */     //   2286: aload #32
/*     */     //   2288: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/UserDeclinedEditError;
/*     */     //   2291: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2294: ifeq -> 2301
/*     */     //   2297: ldc_w 'ERROR: User has declined the edit'
/*     */     //   2300: areturn
/*     */     //   2301: aload #32
/*     */     //   2303: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/DocumentIsReadonlyError.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/DocumentIsReadonlyError;
/*     */     //   2306: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   2309: ifeq -> 2316
/*     */     //   2312: ldc_w 'ERROR: Document is read-only'
/*     */     //   2315: areturn
/*     */     //   2316: new kotlin/NoWhenBranchMatchedException
/*     */     //   2319: dup
/*     */     //   2320: invokespecial <init> : ()V
/*     */     //   2323: athrow
/*     */     //   2324: aload #30
/*     */     //   2326: aload #38
/*     */     //   2328: aload #38
/*     */     //   2330: aload_0
/*     */     //   2331: putfield L$0 : Ljava/lang/Object;
/*     */     //   2334: aload #38
/*     */     //   2336: aload_1
/*     */     //   2337: putfield L$1 : Ljava/lang/Object;
/*     */     //   2340: aload #38
/*     */     //   2342: aload_2
/*     */     //   2343: putfield L$2 : Ljava/lang/Object;
/*     */     //   2346: aload #38
/*     */     //   2348: aload #6
/*     */     //   2350: putfield L$3 : Ljava/lang/Object;
/*     */     //   2353: aload #38
/*     */     //   2355: aload #25
/*     */     //   2357: putfield L$4 : Ljava/lang/Object;
/*     */     //   2360: aload #38
/*     */     //   2362: aload #26
/*     */     //   2364: putfield L$5 : Ljava/lang/Object;
/*     */     //   2367: aload #38
/*     */     //   2369: aload #29
/*     */     //   2371: putfield L$6 : Ljava/lang/Object;
/*     */     //   2374: aload #38
/*     */     //   2376: aconst_null
/*     */     //   2377: putfield L$7 : Ljava/lang/Object;
/*     */     //   2380: aload #38
/*     */     //   2382: iload_3
/*     */     //   2383: putfield I$0 : I
/*     */     //   2386: aload #38
/*     */     //   2388: iload #4
/*     */     //   2390: putfield I$1 : I
/*     */     //   2393: aload #38
/*     */     //   2395: iload #7
/*     */     //   2397: putfield I$2 : I
/*     */     //   2400: aload #38
/*     */     //   2402: iload #8
/*     */     //   2404: putfield I$3 : I
/*     */     //   2407: aload #38
/*     */     //   2409: iload #9
/*     */     //   2411: putfield Z$0 : Z
/*     */     //   2414: aload #38
/*     */     //   2416: bipush #7
/*     */     //   2418: putfield label : I
/*     */     //   2421: invokeinterface commit : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2426: dup
/*     */     //   2427: aload #39
/*     */     //   2429: if_acmpne -> 2543
/*     */     //   2432: aload #39
/*     */     //   2434: areturn
/*     */     //   2435: aload #38
/*     */     //   2437: getfield Z$0 : Z
/*     */     //   2440: istore #9
/*     */     //   2442: aload #38
/*     */     //   2444: getfield I$3 : I
/*     */     //   2447: istore #8
/*     */     //   2449: aload #38
/*     */     //   2451: getfield I$2 : I
/*     */     //   2454: istore #7
/*     */     //   2456: aload #38
/*     */     //   2458: getfield I$1 : I
/*     */     //   2461: istore #4
/*     */     //   2463: aload #38
/*     */     //   2465: getfield I$0 : I
/*     */     //   2468: istore_3
/*     */     //   2469: aload #38
/*     */     //   2471: getfield L$6 : Ljava/lang/Object;
/*     */     //   2474: checkcast com/intellij/openapi/editor/Document
/*     */     //   2477: astore #29
/*     */     //   2479: aload #38
/*     */     //   2481: getfield L$5 : Ljava/lang/Object;
/*     */     //   2484: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   2487: astore #26
/*     */     //   2489: aload #38
/*     */     //   2491: getfield L$4 : Ljava/lang/Object;
/*     */     //   2494: checkcast java/util/List
/*     */     //   2497: astore #25
/*     */     //   2499: aload #38
/*     */     //   2501: getfield L$3 : Ljava/lang/Object;
/*     */     //   2504: checkcast com/intellij/openapi/project/Project
/*     */     //   2507: astore #6
/*     */     //   2509: aload #38
/*     */     //   2511: getfield L$2 : Ljava/lang/Object;
/*     */     //   2514: checkcast com/intellij/openapi/editor/Document
/*     */     //   2517: astore_2
/*     */     //   2518: aload #38
/*     */     //   2520: getfield L$1 : Ljava/lang/Object;
/*     */     //   2523: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   2526: astore_1
/*     */     //   2527: aload #38
/*     */     //   2529: getfield L$0 : Ljava/lang/Object;
/*     */     //   2532: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   2535: astore_0
/*     */     //   2536: aload #37
/*     */     //   2538: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2541: aload #37
/*     */     //   2543: pop
/*     */     //   2544: aload #26
/*     */     //   2546: iload_3
/*     */     //   2547: iload #8
/*     */     //   2549: aload #29
/*     */     //   2551: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   2554: aload #29
/*     */     //   2556: aload_1
/*     */     //   2557: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   2562: invokestatic access$getEditedScreen : (Lcom/intellij/openapi/vfs/VirtualFile;IILcom/intellij/openapi/editor/Document;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;)Ljava/lang/String;
/*     */     //   2565: astore #27
/*     */     //   2567: new java/lang/StringBuilder
/*     */     //   2570: dup
/*     */     //   2571: invokespecial <init> : ()V
/*     */     //   2574: astore #30
/*     */     //   2576: aload #30
/*     */     //   2578: astore #31
/*     */     //   2580: iconst_0
/*     */     //   2581: istore #32
/*     */     //   2583: aload #25
/*     */     //   2585: invokeinterface isEmpty : ()Z
/*     */     //   2590: ifeq -> 2823
/*     */     //   2593: aload #31
/*     */     //   2595: aload #27
/*     */     //   2597: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2600: pop
/*     */     //   2601: aconst_null
/*     */     //   2602: astore #33
/*     */     //   2604: iload #9
/*     */     //   2606: ifne -> 2757
/*     */     //   2609: aload_0
/*     */     //   2610: aload_1
/*     */     //   2611: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType.SEMANTIC : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   2614: aload #6
/*     */     //   2616: aload_2
/*     */     //   2617: aconst_null
/*     */     //   2618: aload #38
/*     */     //   2620: bipush #16
/*     */     //   2622: aconst_null
/*     */     //   2623: aload #38
/*     */     //   2625: aload_2
/*     */     //   2626: putfield L$0 : Ljava/lang/Object;
/*     */     //   2629: aload #38
/*     */     //   2631: aload #30
/*     */     //   2633: putfield L$1 : Ljava/lang/Object;
/*     */     //   2636: aload #38
/*     */     //   2638: aload #31
/*     */     //   2640: putfield L$2 : Ljava/lang/Object;
/*     */     //   2643: aload #38
/*     */     //   2645: aconst_null
/*     */     //   2646: putfield L$3 : Ljava/lang/Object;
/*     */     //   2649: aload #38
/*     */     //   2651: aconst_null
/*     */     //   2652: putfield L$4 : Ljava/lang/Object;
/*     */     //   2655: aload #38
/*     */     //   2657: aconst_null
/*     */     //   2658: putfield L$5 : Ljava/lang/Object;
/*     */     //   2661: aload #38
/*     */     //   2663: aconst_null
/*     */     //   2664: putfield L$6 : Ljava/lang/Object;
/*     */     //   2667: aload #38
/*     */     //   2669: aconst_null
/*     */     //   2670: putfield L$7 : Ljava/lang/Object;
/*     */     //   2673: aload #38
/*     */     //   2675: bipush #8
/*     */     //   2677: putfield label : I
/*     */     //   2680: invokestatic findErrorsWithTracking$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   2683: dup
/*     */     //   2684: aload #39
/*     */     //   2686: if_acmpne -> 2731
/*     */     //   2689: aload #39
/*     */     //   2691: areturn
/*     */     //   2692: iconst_0
/*     */     //   2693: istore #32
/*     */     //   2695: aload #38
/*     */     //   2697: getfield L$2 : Ljava/lang/Object;
/*     */     //   2700: checkcast java/lang/StringBuilder
/*     */     //   2703: astore #31
/*     */     //   2705: aload #38
/*     */     //   2707: getfield L$1 : Ljava/lang/Object;
/*     */     //   2710: checkcast java/lang/StringBuilder
/*     */     //   2713: astore #30
/*     */     //   2715: aload #38
/*     */     //   2717: getfield L$0 : Ljava/lang/Object;
/*     */     //   2720: checkcast com/intellij/openapi/editor/Document
/*     */     //   2723: astore_2
/*     */     //   2724: aload #37
/*     */     //   2726: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   2729: aload #37
/*     */     //   2731: checkcast java/lang/Iterable
/*     */     //   2734: ldc '\\n'
/*     */     //   2736: checkcast java/lang/CharSequence
/*     */     //   2739: aconst_null
/*     */     //   2740: aconst_null
/*     */     //   2741: iconst_0
/*     */     //   2742: aconst_null
/*     */     //   2743: aload_2
/*     */     //   2744: <illegal opcode> invoke : (Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function1;
/*     */     //   2749: bipush #30
/*     */     //   2751: aconst_null
/*     */     //   2752: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   2755: astore #33
/*     */     //   2757: aload #31
/*     */     //   2759: aload #33
/*     */     //   2761: checkcast java/lang/CharSequence
/*     */     //   2764: astore #34
/*     */     //   2766: aload #34
/*     */     //   2768: ifnull -> 2779
/*     */     //   2771: aload #34
/*     */     //   2773: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*     */     //   2776: ifeq -> 2783
/*     */     //   2779: iconst_1
/*     */     //   2780: goto -> 2784
/*     */     //   2783: iconst_0
/*     */     //   2784: nop
/*     */     //   2785: iconst_1
/*     */     //   2786: if_icmpne -> 2801
/*     */     //   2789: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;
/*     */     //   2792: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType.UPDATE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   2795: invokevirtual getSuccessEditMessage : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;)Ljava/lang/String;
/*     */     //   2798: goto -> 2817
/*     */     //   2801: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSearchReplace$Companion;
/*     */     //   2804: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType.UPDATE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;
/*     */     //   2807: invokevirtual getEditWithIssuesMessage : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditType;)Ljava/lang/String;
/*     */     //   2810: aload #33
/*     */     //   2812: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   2817: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2820: goto -> 3528
/*     */     //   2823: aload #31
/*     */     //   2825: ldc_w 'Your proposed edit has introduced new syntax error(s). Please read this error message carefully and then retry editing the file.\\n'
/*     */     //   2828: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2831: dup
/*     */     //   2832: ldc_w 'append(...)'
/*     */     //   2835: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   2838: bipush #10
/*     */     //   2840: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   2843: dup
/*     */     //   2844: ldc_w 'append(...)'
/*     */     //   2847: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   2850: pop
/*     */     //   2851: aload #31
/*     */     //   2853: ldc_w 'ERRORS:'
/*     */     //   2856: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   2859: dup
/*     */     //   2860: ldc_w 'append(...)'
/*     */     //   2863: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   2866: bipush #10
/*     */     //   2868: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   2871: dup
/*     */     //   2872: ldc_w 'append(...)'
/*     */     //   2875: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   2878: pop
/*     */     //   2879: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/CodeEditUtils;
/*     */     //   2882: aload #25
/*     */     //   2884: aload #6
/*     */     //   2886: aload_2
/*     */     //   2887: aload #38
/*     */     //   2889: aload #38
/*     */     //   2891: aload_1
/*     */     //   2892: putfield L$0 : Ljava/lang/Object;
/*     */     //   2895: aload #38
/*     */     //   2897: aload #6
/*     */     //   2899: putfield L$1 : Ljava/lang/Object;
/*     */     //   2902: aload #38
/*     */     //   2904: aload #26
/*     */     //   2906: putfield L$2 : Ljava/lang/Object;
/*     */     //   2909: aload #38
/*     */     //   2911: aload #27
/*     */     //   2913: putfield L$3 : Ljava/lang/Object;
/*     */     //   2916: aload #38
/*     */     //   2918: aload #30
/*     */     //   2920: putfield L$4 : Ljava/lang/Object;
/*     */     //   2923: aload #38
/*     */     //   2925: aload #31
/*     */     //   2927: putfield L$5 : Ljava/lang/Object;
/*     */     //   2930: aload #38
/*     */     //   2932: aconst_null
/*     */     //   2933: putfield L$6 : Ljava/lang/Object;
/*     */     //   2936: aload #38
/*     */     //   2938: aconst_null
/*     */     //   2939: putfield L$7 : Ljava/lang/Object;
/*     */     //   2942: aload #38
/*     */     //   2944: iload_3
/*     */     //   2945: putfield I$0 : I
/*     */     //   2948: aload #38
/*     */     //   2950: iload #4
/*     */     //   2952: putfield I$1 : I
/*     */     //   2955: aload #38
/*     */     //   2957: iload #7
/*     */     //   2959: putfield I$2 : I
/*     */     //   2962: aload #38
/*     */     //   2964: bipush #9
/*     */     //   2966: putfield label : I
/*     */     //   2969: invokevirtual toErrorMessages$ej_core : (Ljava/util/List;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   2972: dup
/*     */     //   2973: aload #39
/*     */     //   2975: if_acmpne -> 3070
/*     */     //   2978: aload #39
/*     */     //   2980: areturn
/*     */     //   2981: iconst_0
/*     */     //   2982: istore #32
/*     */     //   2984: aload #38
/*     */     //   2986: getfield I$2 : I
/*     */     //   2989: istore #7
/*     */     //   2991: aload #38
/*     */     //   2993: getfield I$1 : I
/*     */     //   2996: istore #4
/*     */     //   2998: aload #38
/*     */     //   3000: getfield I$0 : I
/*     */     //   3003: istore_3
/*     */     //   3004: aload #38
/*     */     //   3006: getfield L$5 : Ljava/lang/Object;
/*     */     //   3009: checkcast java/lang/StringBuilder
/*     */     //   3012: astore #31
/*     */     //   3014: aload #38
/*     */     //   3016: getfield L$4 : Ljava/lang/Object;
/*     */     //   3019: checkcast java/lang/StringBuilder
/*     */     //   3022: astore #30
/*     */     //   3024: aload #38
/*     */     //   3026: getfield L$3 : Ljava/lang/Object;
/*     */     //   3029: checkcast java/lang/String
/*     */     //   3032: astore #27
/*     */     //   3034: aload #38
/*     */     //   3036: getfield L$2 : Ljava/lang/Object;
/*     */     //   3039: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   3042: astore #26
/*     */     //   3044: aload #38
/*     */     //   3046: getfield L$1 : Ljava/lang/Object;
/*     */     //   3049: checkcast com/intellij/openapi/project/Project
/*     */     //   3052: astore #6
/*     */     //   3054: aload #38
/*     */     //   3056: getfield L$0 : Ljava/lang/Object;
/*     */     //   3059: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   3062: astore_1
/*     */     //   3063: aload #37
/*     */     //   3065: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   3068: aload #37
/*     */     //   3070: checkcast java/util/List
/*     */     //   3073: astore #33
/*     */     //   3075: aload #31
/*     */     //   3077: aload #33
/*     */     //   3079: checkcast java/lang/Iterable
/*     */     //   3082: ldc '\\n'
/*     */     //   3084: checkcast java/lang/CharSequence
/*     */     //   3087: aconst_null
/*     */     //   3088: aconst_null
/*     */     //   3089: iconst_0
/*     */     //   3090: aconst_null
/*     */     //   3091: aconst_null
/*     */     //   3092: bipush #62
/*     */     //   3094: aconst_null
/*     */     //   3095: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   3098: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3101: dup
/*     */     //   3102: ldc_w 'append(...)'
/*     */     //   3105: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3108: bipush #10
/*     */     //   3110: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3113: dup
/*     */     //   3114: ldc_w 'append(...)'
/*     */     //   3117: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3120: pop
/*     */     //   3121: aload #31
/*     */     //   3123: ldc_w 'This is how your edit would have looked if applied'
/*     */     //   3126: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3129: dup
/*     */     //   3130: ldc_w 'append(...)'
/*     */     //   3133: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3136: bipush #10
/*     */     //   3138: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3141: dup
/*     */     //   3142: ldc_w 'append(...)'
/*     */     //   3145: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3148: pop
/*     */     //   3149: aload #31
/*     */     //   3151: ldc_w '-------------------------------------------------'
/*     */     //   3154: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3157: dup
/*     */     //   3158: ldc_w 'append(...)'
/*     */     //   3161: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3164: bipush #10
/*     */     //   3166: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3169: dup
/*     */     //   3170: ldc_w 'append(...)'
/*     */     //   3173: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3176: pop
/*     */     //   3177: aload #31
/*     */     //   3179: aload #27
/*     */     //   3181: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3184: pop
/*     */     //   3185: aload #31
/*     */     //   3187: ldc_w '-------------------------------------------------'
/*     */     //   3190: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3193: dup
/*     */     //   3194: ldc_w 'append(...)'
/*     */     //   3197: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3200: bipush #10
/*     */     //   3202: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3205: dup
/*     */     //   3206: ldc_w 'append(...)'
/*     */     //   3209: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3212: pop
/*     */     //   3213: aload #31
/*     */     //   3215: ldc_w '\\nThis is the original code before your edit'
/*     */     //   3218: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3221: dup
/*     */     //   3222: ldc_w 'append(...)'
/*     */     //   3225: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3228: bipush #10
/*     */     //   3230: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3233: dup
/*     */     //   3234: ldc_w 'append(...)'
/*     */     //   3237: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3240: pop
/*     */     //   3241: aload #31
/*     */     //   3243: ldc_w '-------------------------------------------------'
/*     */     //   3246: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3249: dup
/*     */     //   3250: ldc_w 'append(...)'
/*     */     //   3253: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3256: bipush #10
/*     */     //   3258: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3261: dup
/*     */     //   3262: ldc_w 'append(...)'
/*     */     //   3265: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3268: pop
/*     */     //   3269: aload #31
/*     */     //   3271: astore #35
/*     */     //   3273: aload #6
/*     */     //   3275: aload #26
/*     */     //   3277: new com/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock
/*     */     //   3280: dup
/*     */     //   3281: iload_3
/*     */     //   3282: iload #4
/*     */     //   3284: iload_3
/*     */     //   3285: isub
/*     */     //   3286: iload #7
/*     */     //   3288: iload #7
/*     */     //   3290: iconst_0
/*     */     //   3291: bipush #16
/*     */     //   3293: aconst_null
/*     */     //   3294: invokespecial <init> : (IIIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   3297: aconst_null
/*     */     //   3298: aload_1
/*     */     //   3299: invokeinterface getSessionHistory : ()Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;
/*     */     //   3304: aload #38
/*     */     //   3306: bipush #8
/*     */     //   3308: aconst_null
/*     */     //   3309: aload #38
/*     */     //   3311: aload #30
/*     */     //   3313: putfield L$0 : Ljava/lang/Object;
/*     */     //   3316: aload #38
/*     */     //   3318: aload #31
/*     */     //   3320: putfield L$1 : Ljava/lang/Object;
/*     */     //   3323: aload #38
/*     */     //   3325: aload #35
/*     */     //   3327: putfield L$2 : Ljava/lang/Object;
/*     */     //   3330: aload #38
/*     */     //   3332: aconst_null
/*     */     //   3333: putfield L$3 : Ljava/lang/Object;
/*     */     //   3336: aload #38
/*     */     //   3338: aconst_null
/*     */     //   3339: putfield L$4 : Ljava/lang/Object;
/*     */     //   3342: aload #38
/*     */     //   3344: aconst_null
/*     */     //   3345: putfield L$5 : Ljava/lang/Object;
/*     */     //   3348: aload #38
/*     */     //   3350: bipush #10
/*     */     //   3352: putfield label : I
/*     */     //   3355: invokestatic printScreen$default : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/vfs/VirtualFile;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/PrintBlock;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/AgentSessionHistory;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   3358: dup
/*     */     //   3359: aload #39
/*     */     //   3361: if_acmpne -> 3407
/*     */     //   3364: aload #39
/*     */     //   3366: areturn
/*     */     //   3367: iconst_0
/*     */     //   3368: istore #32
/*     */     //   3370: aload #38
/*     */     //   3372: getfield L$2 : Ljava/lang/Object;
/*     */     //   3375: checkcast java/lang/StringBuilder
/*     */     //   3378: astore #35
/*     */     //   3380: aload #38
/*     */     //   3382: getfield L$1 : Ljava/lang/Object;
/*     */     //   3385: checkcast java/lang/StringBuilder
/*     */     //   3388: astore #31
/*     */     //   3390: aload #38
/*     */     //   3392: getfield L$0 : Ljava/lang/Object;
/*     */     //   3395: checkcast java/lang/StringBuilder
/*     */     //   3398: astore #30
/*     */     //   3400: aload #37
/*     */     //   3402: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   3405: aload #37
/*     */     //   3407: aload #35
/*     */     //   3409: swap
/*     */     //   3410: checkcast java/lang/String
/*     */     //   3413: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3416: pop
/*     */     //   3417: aload #31
/*     */     //   3419: ldc_w '-------------------------------------------------'
/*     */     //   3422: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3425: dup
/*     */     //   3426: ldc_w 'append(...)'
/*     */     //   3429: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3432: bipush #10
/*     */     //   3434: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3437: dup
/*     */     //   3438: ldc_w 'append(...)'
/*     */     //   3441: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3444: pop
/*     */     //   3445: aload #31
/*     */     //   3447: ldc_w 'Your changes have NOT been applied. Please fix your edit command and try again.'
/*     */     //   3450: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3453: dup
/*     */     //   3454: ldc_w 'append(...)'
/*     */     //   3457: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3460: bipush #10
/*     */     //   3462: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3465: dup
/*     */     //   3466: ldc_w 'append(...)'
/*     */     //   3469: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3472: pop
/*     */     //   3473: aload #31
/*     */     //   3475: ldc_w 'You either need to 1) Specify the correct start/end line arguments or 2) Correct your edit code.'
/*     */     //   3478: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3481: dup
/*     */     //   3482: ldc_w 'append(...)'
/*     */     //   3485: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3488: bipush #10
/*     */     //   3490: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3493: dup
/*     */     //   3494: ldc_w 'append(...)'
/*     */     //   3497: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3500: pop
/*     */     //   3501: aload #31
/*     */     //   3503: ldc_w 'DO NOT re-run the same failed edit command. Running it again will lead to the same error.'
/*     */     //   3506: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   3509: dup
/*     */     //   3510: ldc_w 'append(...)'
/*     */     //   3513: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3516: bipush #10
/*     */     //   3518: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   3521: dup
/*     */     //   3522: ldc_w 'append(...)'
/*     */     //   3525: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3528: pop
/*     */     //   3529: nop
/*     */     //   3530: aload #30
/*     */     //   3532: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   3535: dup
/*     */     //   3536: ldc_w 'toString(...)'
/*     */     //   3539: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   3542: areturn
/*     */     //   3543: new java/lang/IllegalStateException
/*     */     //   3546: dup
/*     */     //   3547: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   3550: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   3553: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #78	-> 63
/*     */     //   #89	-> 133
/*     */     //   #89	-> 143
/*     */     //   #91	-> 145
/*     */     //   #92	-> 152
/*     */     //   #92	-> 161
/*     */     //   #93	-> 163
/*     */     //   #94	-> 171
/*     */     //   #94	-> 180
/*     */     //   #97	-> 182
/*     */     //   #98	-> 192
/*     */     //   #99	-> 201
/*     */     //   #100	-> 203
/*     */     //   #101	-> 207
/*     */     //   #102	-> 209
/*     */     //   #103	-> 211
/*     */     //   #100	-> 214
/*     */     //   #99	-> 217
/*     */     //   #97	-> 223
/*     */     //   #109	-> 229
/*     */     //   #109	-> 239
/*     */     //   #110	-> 241
/*     */     //   #111	-> 252
/*     */     //   #112	-> 281
/*     */     //   #114	-> 284
/*     */     //   #115	-> 293
/*     */     //   #116	-> 295
/*     */     //   #117	-> 299
/*     */     //   #118	-> 301
/*     */     //   #119	-> 303
/*     */     //   #116	-> 306
/*     */     //   #115	-> 309
/*     */     //   #110	-> 315
/*     */     //   #125	-> 328
/*     */     //   #125	-> 338
/*     */     //   #126	-> 340
/*     */     //   #127	-> 361
/*     */     //   #128	-> 370
/*     */     //   #129	-> 372
/*     */     //   #130	-> 376
/*     */     //   #131	-> 378
/*     */     //   #132	-> 380
/*     */     //   #129	-> 383
/*     */     //   #128	-> 386
/*     */     //   #126	-> 392
/*     */     //   #136	-> 398
/*     */     //   #138	-> 407
/*     */     //   #139	-> 412
/*     */     //   #140	-> 420
/*     */     //   #504	-> 423
/*     */     //   #505	-> 449
/*     */     //   #506	-> 452
/*     */     //   #507	-> 480
/*     */     //   #507	-> 499
/*     */     //   #141	-> 513
/*     */     //   #142	-> 517
/*     */     //   #143	-> 519
/*     */     //   #144	-> 524
/*     */     //   #141	-> 527
/*     */     //   #145	-> 530
/*     */     //   #507	-> 534
/*     */     //   #508	-> 543
/*     */     //   #504	-> 548
/*     */     //   #140	-> 549
/*     */     //   #138	-> 549
/*     */     //   #148	-> 551
/*     */     //   #509	-> 561
/*     */     //   #510	-> 587
/*     */     //   #511	-> 615
/*     */     //   #149	-> 629
/*     */     //   #150	-> 633
/*     */     //   #151	-> 638
/*     */     //   #152	-> 659
/*     */     //   #149	-> 664
/*     */     //   #153	-> 667
/*     */     //   #511	-> 671
/*     */     //   #512	-> 680
/*     */     //   #509	-> 685
/*     */     //   #148	-> 686
/*     */     //   #155	-> 688
/*     */     //   #157	-> 714
/*     */     //   #159	-> 741
/*     */     //   #78	-> 839
/*     */     //   #159	-> 940
/*     */     //   #160	-> 952
/*     */     //   #159	-> 962
/*     */     //   #162	-> 964
/*     */     //   #78	-> 1065
/*     */     //   #171	-> 1171
/*     */     //   #172	-> 1172
/*     */     //   #173	-> 1173
/*     */     //   #174	-> 1176
/*     */     //   #175	-> 1178
/*     */     //   #171	-> 1197
/*     */     //   #78	-> 1298
/*     */     //   #178	-> 1414
/*     */     //   #78	-> 1524
/*     */     //   #178	-> 1645
/*     */     //   #180	-> 1653
/*     */     //   #178	-> 1657
/*     */     //   #181	-> 1659
/*     */     //   #183	-> 1662
/*     */     //   #184	-> 1676
/*     */     //   #185	-> 1690
/*     */     //   #185	-> 1708
/*     */     //   #186	-> 1711
/*     */     //   #187	-> 1711
/*     */     //   #188	-> 1713
/*     */     //   #190	-> 1720
/*     */     //   #191	-> 1724
/*     */     //   #192	-> 1725
/*     */     //   #193	-> 1738
/*     */     //   #194	-> 1740
/*     */     //   #190	-> 1742
/*     */     //   #189	-> 1749
/*     */     //   #186	-> 1752
/*     */     //   #197	-> 1754
/*     */     //   #186	-> 1760
/*     */     //   #201	-> 1771
/*     */     //   #202	-> 1776
/*     */     //   #78	-> 1895
/*     */     //   #203	-> 2031
/*     */     //   #78	-> 2151
/*     */     //   #204	-> 2277
/*     */     //   #205	-> 2281
/*     */     //   #206	-> 2286
/*     */     //   #207	-> 2301
/*     */     //   #204	-> 2316
/*     */     //   #209	-> 2324
/*     */     //   #78	-> 2432
/*     */     //   #211	-> 2543
/*     */     //   #214	-> 2567
/*     */     //   #215	-> 2583
/*     */     //   #216	-> 2593
/*     */     //   #218	-> 2601
/*     */     //   #219	-> 2604
/*     */     //   #225	-> 2609
/*     */     //   #220	-> 2609
/*     */     //   #221	-> 2610
/*     */     //   #222	-> 2611
/*     */     //   #223	-> 2614
/*     */     //   #224	-> 2616
/*     */     //   #220	-> 2617
/*     */     //   #78	-> 2689
/*     */     //   #225	-> 2734
/*     */     //   #220	-> 2755
/*     */     //   #230	-> 2757
/*     */     //   #231	-> 2759
/*     */     //   #231	-> 2784
/*     */     //   #232	-> 2785
/*     */     //   #235	-> 2801
/*     */     //   #236	-> 2810
/*     */     //   #230	-> 2817
/*     */     //   #242	-> 2823
/*     */     //   #243	-> 2851
/*     */     //   #244	-> 2879
/*     */     //   #78	-> 2978
/*     */     //   #245	-> 3075
/*     */     //   #247	-> 3121
/*     */     //   #248	-> 3149
/*     */     //   #249	-> 3177
/*     */     //   #250	-> 3185
/*     */     //   #252	-> 3213
/*     */     //   #253	-> 3241
/*     */     //   #254	-> 3269
/*     */     //   #256	-> 3273
/*     */     //   #257	-> 3275
/*     */     //   #258	-> 3277
/*     */     //   #259	-> 3281
/*     */     //   #260	-> 3282
/*     */     //   #261	-> 3286
/*     */     //   #262	-> 3288
/*     */     //   #258	-> 3290
/*     */     //   #255	-> 3297
/*     */     //   #264	-> 3298
/*     */     //   #255	-> 3306
/*     */     //   #78	-> 3364
/*     */     //   #254	-> 3413
/*     */     //   #267	-> 3417
/*     */     //   #269	-> 3445
/*     */     //   #270	-> 3473
/*     */     //   #271	-> 3501
/*     */     //   #273	-> 3529
/*     */     //   #214	-> 3530
/*     */     //   #214	-> 3542
/*     */     //   #78	-> 3543
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   133	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   143	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   161	19	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   180	12	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   192	47	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   239	45	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   284	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   322	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   338	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   361	136	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   497	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   531	18	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   549	293	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   933	135	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   1159	142	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   1402	125	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   1638	14	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   1657	241	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   2019	135	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   2265	170	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   2536	74	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   133	10	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   143	18	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   161	19	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   180	12	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   192	47	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   239	45	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   284	38	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   322	16	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   338	23	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   361	136	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   497	34	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   531	18	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   549	293	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   924	144	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1150	151	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1393	134	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1629	23	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1657	241	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2010	144	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2256	179	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2527	84	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   2823	158	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   3063	243	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   133	10	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   143	18	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   161	19	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   180	12	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   192	47	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   239	45	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   284	38	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   322	16	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   338	23	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   361	136	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   497	34	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   531	18	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   549	293	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   915	153	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1141	160	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1384	143	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1620	32	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1657	241	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   2001	153	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   2247	188	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   2518	174	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   2724	31	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   2823	149	2	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   133	10	3	startLineIncl	I
/*     */     //   143	18	3	startLineIncl	I
/*     */     //   161	19	3	startLineIncl	I
/*     */     //   180	12	3	startLineIncl	I
/*     */     //   192	47	3	startLineIncl	I
/*     */     //   239	45	3	startLineIncl	I
/*     */     //   284	38	3	startLineIncl	I
/*     */     //   322	16	3	startLineIncl	I
/*     */     //   338	23	3	startLineIncl	I
/*     */     //   361	136	3	startLineIncl	I
/*     */     //   497	34	3	startLineIncl	I
/*     */     //   531	18	3	startLineIncl	I
/*     */     //   549	293	3	startLineIncl	I
/*     */     //   876	192	3	startLineIncl	I
/*     */     //   1102	199	3	startLineIncl	I
/*     */     //   1335	192	3	startLineIncl	I
/*     */     //   1561	91	3	startLineIncl	I
/*     */     //   1657	241	3	startLineIncl	I
/*     */     //   1932	222	3	startLineIncl	I
/*     */     //   2188	247	3	startLineIncl	I
/*     */     //   2469	124	3	startLineIncl	I
/*     */     //   2823	158	3	startLineIncl	I
/*     */     //   3004	282	3	startLineIncl	I
/*     */     //   133	10	4	endLineIncl	I
/*     */     //   143	18	4	endLineIncl	I
/*     */     //   161	19	4	endLineIncl	I
/*     */     //   180	12	4	endLineIncl	I
/*     */     //   192	47	4	endLineIncl	I
/*     */     //   239	45	4	endLineIncl	I
/*     */     //   284	38	4	endLineIncl	I
/*     */     //   322	16	4	endLineIncl	I
/*     */     //   338	23	4	endLineIncl	I
/*     */     //   361	136	4	endLineIncl	I
/*     */     //   497	34	4	endLineIncl	I
/*     */     //   531	18	4	endLineIncl	I
/*     */     //   549	293	4	endLineIncl	I
/*     */     //   870	198	4	endLineIncl	I
/*     */     //   1096	205	4	endLineIncl	I
/*     */     //   1329	198	4	endLineIncl	I
/*     */     //   1555	97	4	endLineIncl	I
/*     */     //   1657	241	4	endLineIncl	I
/*     */     //   1926	228	4	endLineIncl	I
/*     */     //   2182	253	4	endLineIncl	I
/*     */     //   2463	130	4	endLineIncl	I
/*     */     //   2823	158	4	endLineIncl	I
/*     */     //   2998	288	4	endLineIncl	I
/*     */     //   133	10	5	replacementText	Ljava/lang/String;
/*     */     //   143	18	5	replacementText	Ljava/lang/String;
/*     */     //   161	19	5	replacementText	Ljava/lang/String;
/*     */     //   180	12	5	replacementText	Ljava/lang/String;
/*     */     //   192	47	5	replacementText	Ljava/lang/String;
/*     */     //   239	45	5	replacementText	Ljava/lang/String;
/*     */     //   284	38	5	replacementText	Ljava/lang/String;
/*     */     //   322	16	5	replacementText	Ljava/lang/String;
/*     */     //   338	23	5	replacementText	Ljava/lang/String;
/*     */     //   361	136	5	replacementText	Ljava/lang/String;
/*     */     //   497	34	5	replacementText	Ljava/lang/String;
/*     */     //   531	18	5	replacementText	Ljava/lang/String;
/*     */     //   549	293	5	replacementText	Ljava/lang/String;
/*     */     //   906	162	5	replacementText	Ljava/lang/String;
/*     */     //   1132	169	5	replacementText	Ljava/lang/String;
/*     */     //   1375	152	5	replacementText	Ljava/lang/String;
/*     */     //   1611	41	5	replacementText	Ljava/lang/String;
/*     */     //   1657	51	5	replacementText	Ljava/lang/String;
/*     */     //   1708	30	5	replacementText	Ljava/lang/String;
/*     */     //   133	10	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   143	18	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   161	19	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   180	12	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   192	47	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   239	45	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   284	38	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   322	16	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   338	23	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   361	136	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   497	34	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   531	18	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   549	293	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   896	172	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1122	179	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1365	162	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1601	51	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1657	241	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   1992	162	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   2238	197	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   2509	107	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   2823	158	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   3054	221	6	project	Lcom/intellij/openapi/project/Project;
/*     */     //   133	10	7	margin	I
/*     */     //   143	18	7	margin	I
/*     */     //   161	19	7	margin	I
/*     */     //   180	12	7	margin	I
/*     */     //   192	47	7	margin	I
/*     */     //   239	45	7	margin	I
/*     */     //   284	38	7	margin	I
/*     */     //   322	16	7	margin	I
/*     */     //   338	23	7	margin	I
/*     */     //   361	136	7	margin	I
/*     */     //   497	34	7	margin	I
/*     */     //   531	18	7	margin	I
/*     */     //   549	293	7	margin	I
/*     */     //   863	205	7	margin	I
/*     */     //   1089	212	7	margin	I
/*     */     //   1322	205	7	margin	I
/*     */     //   1548	104	7	margin	I
/*     */     //   1657	241	7	margin	I
/*     */     //   1919	235	7	margin	I
/*     */     //   2175	260	7	margin	I
/*     */     //   2456	137	7	margin	I
/*     */     //   2823	158	7	margin	I
/*     */     //   2991	299	7	margin	I
/*     */     //   133	10	8	window	I
/*     */     //   143	18	8	window	I
/*     */     //   161	19	8	window	I
/*     */     //   180	12	8	window	I
/*     */     //   192	47	8	window	I
/*     */     //   239	45	8	window	I
/*     */     //   284	38	8	window	I
/*     */     //   322	16	8	window	I
/*     */     //   338	23	8	window	I
/*     */     //   361	136	8	window	I
/*     */     //   497	34	8	window	I
/*     */     //   531	18	8	window	I
/*     */     //   549	293	8	window	I
/*     */     //   856	212	8	window	I
/*     */     //   1082	219	8	window	I
/*     */     //   1315	212	8	window	I
/*     */     //   1541	111	8	window	I
/*     */     //   1657	241	8	window	I
/*     */     //   1912	242	8	window	I
/*     */     //   2168	267	8	window	I
/*     */     //   2449	118	8	window	I
/*     */     //   133	10	9	dryRun	Z
/*     */     //   143	18	9	dryRun	Z
/*     */     //   161	19	9	dryRun	Z
/*     */     //   180	12	9	dryRun	Z
/*     */     //   192	47	9	dryRun	Z
/*     */     //   239	45	9	dryRun	Z
/*     */     //   284	38	9	dryRun	Z
/*     */     //   322	16	9	dryRun	Z
/*     */     //   338	23	9	dryRun	Z
/*     */     //   361	136	9	dryRun	Z
/*     */     //   497	34	9	dryRun	Z
/*     */     //   531	18	9	dryRun	Z
/*     */     //   549	293	9	dryRun	Z
/*     */     //   849	219	9	dryRun	Z
/*     */     //   1075	226	9	dryRun	Z
/*     */     //   1308	219	9	dryRun	Z
/*     */     //   1534	118	9	dryRun	Z
/*     */     //   1657	241	9	dryRun	Z
/*     */     //   1905	249	9	dryRun	Z
/*     */     //   2161	274	9	dryRun	Z
/*     */     //   2442	167	9	dryRun	Z
/*     */     //   145	16	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   161	19	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   180	12	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   192	47	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   239	45	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   284	38	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   322	16	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   338	23	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   361	136	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   497	34	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   531	18	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   549	119	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   668	18	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   686	28	11	linesBeforeChangedPart	Ljava/util/List;
/*     */     //   150	2	12	zeroBasedStartLine	I
/*     */     //   163	17	13	correctedStartLine	I
/*     */     //   180	12	13	correctedStartLine	I
/*     */     //   192	47	13	correctedStartLine	I
/*     */     //   239	6	13	correctedStartLine	I
/*     */     //   169	2	14	zeroBasedEndLine	I
/*     */     //   182	10	15	correctedEndLine	I
/*     */     //   192	47	15	correctedEndLine	I
/*     */     //   239	45	15	correctedEndLine	I
/*     */     //   284	38	15	correctedEndLine	I
/*     */     //   322	16	15	correctedEndLine	I
/*     */     //   338	8	15	correctedEndLine	I
/*     */     //   185	44	16	i	I
/*     */     //   241	43	16	linesToReplace	Ljava/util/List;
/*     */     //   284	38	16	linesToReplace	Ljava/util/List;
/*     */     //   322	16	16	linesToReplace	Ljava/util/List;
/*     */     //   338	23	16	linesToReplace	Ljava/util/List;
/*     */     //   361	136	16	linesToReplace	Ljava/util/List;
/*     */     //   497	34	16	linesToReplace	Ljava/util/List;
/*     */     //   531	18	16	linesToReplace	Ljava/util/List;
/*     */     //   549	119	16	linesToReplace	Ljava/util/List;
/*     */     //   668	12	16	linesToReplace	Ljava/util/List;
/*     */     //   201	21	17	line	Ljava/lang/String;
/*     */     //   245	39	17	i	I
/*     */     //   284	38	17	i	I
/*     */     //   322	6	17	i	I
/*     */     //   340	21	17	linesAfterChangedPartBeforeChange	Ljava/util/List;
/*     */     //   361	136	17	linesAfterChangedPartBeforeChange	Ljava/util/List;
/*     */     //   497	34	17	linesAfterChangedPartBeforeChange	Ljava/util/List;
/*     */     //   531	18	17	linesAfterChangedPartBeforeChange	Ljava/util/List;
/*     */     //   549	9	17	linesAfterChangedPartBeforeChange	Ljava/util/List;
/*     */     //   293	21	18	line	Ljava/lang/String;
/*     */     //   346	52	18	i	I
/*     */     //   407	90	18	beforeChangeLinesCount	I
/*     */     //   497	34	18	beforeChangeLinesCount	I
/*     */     //   531	12	18	beforeChangeLinesCount	I
/*     */     //   551	117	19	replacementLines	Ljava/util/List;
/*     */     //   668	18	19	replacementLines	Ljava/util/List;
/*     */     //   686	28	19	replacementLines	Ljava/util/List;
/*     */     //   370	21	20	line	Ljava/lang/String;
/*     */     //   420	26	20	$this$mapIndexed$iv	Ljava/lang/Iterable;
/*     */     //   688	26	20	linesAfterChangedPartAfterChange	Ljava/util/List;
/*     */     //   558	26	21	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   714	27	21	finalDocument	Ljava/util/List;
/*     */     //   446	15	22	$this$mapIndexedTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   741	101	22	replacedText	Ljava/lang/String;
/*     */     //   886	182	22	replacedText	Ljava/lang/String;
/*     */     //   1112	189	22	replacedText	Ljava/lang/String;
/*     */     //   1355	172	22	replacedText	Ljava/lang/String;
/*     */     //   1591	61	22	replacedText	Ljava/lang/String;
/*     */     //   1657	241	22	replacedText	Ljava/lang/String;
/*     */     //   1982	163	22	replacedText	Ljava/lang/String;
/*     */     //   446	51	23	destination$iv$iv	Ljava/util/Collection;
/*     */     //   497	48	23	destination$iv$iv	Ljava/util/Collection;
/*     */     //   584	12	23	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   964	95	23	file	Lcom/intellij/psi/PsiFile;
/*     */     //   584	98	24	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1171	130	24	fileCopy	Lcom/intellij/psi/PsiFile;
/*     */     //   1345	182	24	fileCopy	Lcom/intellij/psi/PsiFile;
/*     */     //   1581	71	24	fileCopy	Lcom/intellij/psi/PsiFile;
/*     */     //   1657	33	24	fileCopy	Lcom/intellij/psi/PsiFile;
/*     */     //   452	45	25	index$iv$iv	I
/*     */     //   497	48	25	index$iv$iv	I
/*     */     //   1414	113	25	errors	Ljava/util/List;
/*     */     //   1571	81	25	errors	Ljava/util/List;
/*     */     //   1657	241	25	errors	Ljava/util/List;
/*     */     //   1972	182	25	errors	Ljava/util/List;
/*     */     //   2228	207	25	errors	Ljava/util/List;
/*     */     //   2499	94	25	errors	Ljava/util/List;
/*     */     //   2823	149	25	errors	Ljava/util/List;
/*     */     //   1659	239	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1962	192	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   2218	217	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   2489	104	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   2823	158	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   3044	233	26	virtualFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   480	17	27	item$iv$iv	Ljava/lang/Object;
/*     */     //   497	43	27	item$iv$iv	Ljava/lang/Object;
/*     */     //   615	62	27	item$iv$iv	Ljava/lang/Object;
/*     */     //   2567	34	27	editedScreen	Ljava/lang/String;
/*     */     //   2823	158	27	editedScreen	Ljava/lang/String;
/*     */     //   3034	151	27	editedScreen	Ljava/lang/String;
/*     */     //   626	42	28	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/LineWithMeta;
/*     */     //   1676	222	28	nioPath	Ljava/nio/file/Path;
/*     */     //   1952	193	28	nioPath	Ljava/nio/file/Path;
/*     */     //   510	21	29	line	Ljava/lang/String;
/*     */     //   1690	208	29	editedDoc	Lcom/intellij/openapi/editor/Document;
/*     */     //   1942	212	29	editedDoc	Lcom/intellij/openapi/editor/Document;
/*     */     //   2208	227	29	editedDoc	Lcom/intellij/openapi/editor/Document;
/*     */     //   2479	88	29	editedDoc	Lcom/intellij/openapi/editor/Document;
/*     */     //   510	21	30	index	I
/*     */     //   2031	123	30	session	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;
/*     */     //   2198	88	30	session	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;
/*     */     //   2324	102	30	session	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;
/*     */     //   2277	4	31	error	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditError;
/*     */     //   2580	112	31	$this$changeText_u24lambda_u247	Ljava/lang/StringBuilder;
/*     */     //   2705	54	31	$this$changeText_u24lambda_u247	Ljava/lang/StringBuilder;
/*     */     //   2823	158	31	$this$changeText_u24lambda_u247	Ljava/lang/StringBuilder;
/*     */     //   3014	353	31	$this$changeText_u24lambda_u247	Ljava/lang/StringBuilder;
/*     */     //   3390	138	31	$this$changeText_u24lambda_u247	Ljava/lang/StringBuilder;
/*     */     //   2604	5	33	semanticErrors	Ljava/lang/String;
/*     */     //   2757	44	33	semanticErrors	Ljava/lang/String;
/*     */     //   2801	16	33	semanticErrors	Ljava/lang/String;
/*     */     //   3075	45	33	errorMessages	Ljava/util/List;
/*     */     //   513	18	31	$i$a$-mapIndexed-AbstractEditAction$changeText$replacementLines$1	I
/*     */     //   449	96	24	$i$f$mapIndexedTo	I
/*     */     //   423	126	21	$i$f$mapIndexed	I
/*     */     //   629	39	29	$i$a$-map-AbstractEditAction$changeText$linesAfterChangedPartAfterChange$1	I
/*     */     //   587	95	25	$i$f$mapTo	I
/*     */     //   561	125	22	$i$f$map	I
/*     */     //   2583	109	32	$i$a$-buildString-AbstractEditAction$changeText$2	I
/*     */     //   0	3554	10	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	3490	38	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	3483	37	$result	Ljava/lang/Object;
/*     */     //   2695	286	32	$i$a$-buildString-AbstractEditAction$changeText$2	I
/*     */     //   2984	383	32	$i$a$-buildString-AbstractEditAction$changeText$2	I
/*     */     //   3370	160	32	$i$a$-buildString-AbstractEditAction$changeText$2	I
/*     */   }
/*     */   
/*     */   private static final CharSequence changeText$lambda$2(LineWithMeta it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getLine();
/*     */   }
/*     */   
/*     */   private static final PsiFile changeText$lambda$3(Project $project, Document $document) {
/*     */     return PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */   }
/*     */   
/*     */   private static final PsiFile changeText$lambda$4(PsiFile $file, String $replacedText, Project $project) {
/*     */     Intrinsics.checkNotNull($file.copy(), "null cannot be cast to non-null type com.intellij.psi.PsiFile");
/*     */     PsiFile copy = (PsiFile)$file.copy();
/*     */     Document documentCopy = copy.getViewProvider().getDocument();
/*     */     documentCopy.setText($replacedText);
/*     */     PsiDocumentManager.getInstance($project).commitDocument(documentCopy);
/*     */     return copy;
/*     */   }
/*     */   
/*     */   private static final VirtualFile changeText$lambda$5(Document $document) {
/*     */     return FileDocumentManager.getInstance().getFile($document);
/*     */   }
/*     */   
/*     */   private static final CharSequence changeText$lambda$7$lambda$6(Document $document, Error error) {
/*     */     Intrinsics.checkNotNullParameter(error, "error");
/*     */     return "" + $document + ":" + $document + " " + error.getStartLineOneBasedIndex($document);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object findErrorsWithTracking(@NotNull ExecutionAgentContext context, @NotNull CheckType checkType, @NotNull Project project, @NotNull Document document, @Nullable Integer maxErrors, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrorsWithTracking$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrorsWithTracking$1
/*     */     //   13: astore #13
/*     */     //   15: aload #13
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #13
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrorsWithTracking$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #13
/*     */     //   53: aload #13
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #12
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #14
/*     */     //   65: aload #13
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 372, 0 -> 96, 1 -> 143, 2 -> 252
/*     */     //   96: aload #12
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   104: invokeinterface isUnitTestMode : ()Z
/*     */     //   109: ifeq -> 151
/*     */     //   112: aload_0
/*     */     //   113: aload_2
/*     */     //   114: aload_3
/*     */     //   115: aload #4
/*     */     //   117: aload #5
/*     */     //   119: aconst_null
/*     */     //   120: aload #13
/*     */     //   122: bipush #16
/*     */     //   124: aconst_null
/*     */     //   125: aload #13
/*     */     //   127: iconst_1
/*     */     //   128: putfield label : I
/*     */     //   131: invokestatic findErrors$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   134: dup
/*     */     //   135: aload #14
/*     */     //   137: if_acmpne -> 150
/*     */     //   140: aload #14
/*     */     //   142: areturn
/*     */     //   143: aload #12
/*     */     //   145: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   148: aload #12
/*     */     //   150: areturn
/*     */     //   151: aload_1
/*     */     //   152: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   157: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckStarted.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckStarted;
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   163: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   166: nop
/*     */     //   167: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction.SEMANTIC_CHECKING_TIMEOUT : J
/*     */     //   170: lstore #7
/*     */     //   172: lload #7
/*     */     //   174: invokestatic getInWholeSeconds-impl : (J)J
/*     */     //   177: lload #7
/*     */     //   179: invokestatic getNanosecondsComponent-impl : (J)I
/*     */     //   182: istore #9
/*     */     //   184: lstore #10
/*     */     //   186: lload #10
/*     */     //   188: iload #9
/*     */     //   190: i2l
/*     */     //   191: invokestatic ofSeconds : (JJ)Ljava/time/Duration;
/*     */     //   194: dup
/*     */     //   195: ldc_w 'toComponents-impl(...)'
/*     */     //   198: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   201: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrorsWithTracking$2
/*     */     //   204: dup
/*     */     //   205: aload_0
/*     */     //   206: aload_2
/*     */     //   207: aload_3
/*     */     //   208: aload #4
/*     */     //   210: aload #5
/*     */     //   212: aload_1
/*     */     //   213: aconst_null
/*     */     //   214: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;Ljava/lang/Integer;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)V
/*     */     //   217: checkcast kotlin/jvm/functions/Function2
/*     */     //   220: aload #13
/*     */     //   222: aload #13
/*     */     //   224: aload_0
/*     */     //   225: putfield L$0 : Ljava/lang/Object;
/*     */     //   228: aload #13
/*     */     //   230: aload_1
/*     */     //   231: putfield L$1 : Ljava/lang/Object;
/*     */     //   234: aload #13
/*     */     //   236: iconst_2
/*     */     //   237: putfield label : I
/*     */     //   240: invokestatic withTimeout : (Ljava/time/Duration;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   243: dup
/*     */     //   244: aload #14
/*     */     //   246: if_acmpne -> 278
/*     */     //   249: aload #14
/*     */     //   251: areturn
/*     */     //   252: aload #13
/*     */     //   254: getfield L$1 : Ljava/lang/Object;
/*     */     //   257: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   260: astore_1
/*     */     //   261: aload #13
/*     */     //   263: getfield L$0 : Ljava/lang/Object;
/*     */     //   266: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   269: astore_0
/*     */     //   270: nop
/*     */     //   271: aload #12
/*     */     //   273: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   276: aload #12
/*     */     //   278: astore #7
/*     */     //   280: aload_1
/*     */     //   281: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   286: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished;
/*     */     //   289: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   292: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   295: aload #7
/*     */     //   297: areturn
/*     */     //   298: astore #8
/*     */     //   300: nop
/*     */     //   301: iconst_0
/*     */     //   302: istore #10
/*     */     //   304: ldc com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   306: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   309: dup
/*     */     //   310: ldc_w 'getInstance(...)'
/*     */     //   313: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   316: aload #8
/*     */     //   318: invokevirtual getMessage : ()Ljava/lang/String;
/*     */     //   321: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   326: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   329: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   332: astore #9
/*     */     //   334: aload_1
/*     */     //   335: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   340: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished;
/*     */     //   343: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   346: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   349: aload #9
/*     */     //   351: areturn
/*     */     //   352: astore #8
/*     */     //   354: aload_1
/*     */     //   355: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   360: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/SemanticCheckFinished;
/*     */     //   363: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   366: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   369: aload #8
/*     */     //   371: athrow
/*     */     //   372: new java/lang/IllegalStateException
/*     */     //   375: dup
/*     */     //   376: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   379: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   382: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #276	-> 63
/*     */     //   #283	-> 101
/*     */     //   #276	-> 140
/*     */     //   #284	-> 150
/*     */     //   #285	-> 166
/*     */     //   #286	-> 167
/*     */     //   #286	-> 201
/*     */     //   #276	-> 249
/*     */     //   #293	-> 280
/*     */     //   #286	-> 297
/*     */     //   #289	-> 298
/*     */     //   #290	-> 300
/*     */     //   #513	-> 304
/*     */     //   #290	-> 316
/*     */     //   #291	-> 329
/*     */     //   #293	-> 334
/*     */     //   #291	-> 351
/*     */     //   #293	-> 352
/*     */     //   #276	-> 372
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	33	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   151	101	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   270	10	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   298	3	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   101	33	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   151	101	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   261	34	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   298	18	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   316	33	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   352	20	1	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   101	33	2	checkType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   151	50	2	checkType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   201	42	2	checkType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   101	33	3	project	Lcom/intellij/openapi/project/Project;
/*     */     //   151	50	3	project	Lcom/intellij/openapi/project/Project;
/*     */     //   201	42	3	project	Lcom/intellij/openapi/project/Project;
/*     */     //   101	33	4	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   151	50	4	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   201	42	4	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   101	33	5	maxErrors	Ljava/lang/Integer;
/*     */     //   151	50	5	maxErrors	Ljava/lang/Integer;
/*     */     //   201	42	5	maxErrors	Ljava/lang/Integer;
/*     */     //   300	34	8	ex	Lkotlinx/coroutines/TimeoutCancellationException;
/*     */     //   304	12	10	$i$f$thisLogger	I
/*     */     //   0	383	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	319	13	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	312	12	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   166	243	298	kotlinx/coroutines/TimeoutCancellationException
/*     */     //   166	243	352	finally
/*     */     //   270	280	298	kotlinx/coroutines/TimeoutCancellationException
/*     */     //   270	280	352	finally
/*     */     //   298	334	352	finally
/*     */     //   352	354	352	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditAction.kt", l = {287}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction$findErrorsWithTracking$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020 \n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001*\0020\003H\n"}, d2 = {"<anonymous>", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AbstractEditAction$findErrorsWithTracking$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Error>>, Object> {
/*     */     int label;
/*     */     
/*     */     AbstractEditAction$findErrorsWithTracking$2(AbstractEditAction.CheckType $checkType, Project $project, Document $document, Integer $maxErrors, ExecutionAgentContext $context, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (AbstractEditAction.this.findErrors(this.$checkType, this.$project, this.$document, this.$maxErrors, this.$context.getExecutionContext(), (Continuation<? super List<? extends Error>>)this) == object)
/*     */             return object; 
/*     */           return AbstractEditAction.this.findErrors(this.$checkType, this.$project, this.$document, this.$maxErrors, this.$context.getExecutionContext(), (Continuation<? super List<? extends Error>>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AbstractEditAction$findErrorsWithTracking$2> $completion) {
/*     */       return (Continuation<Unit>)new AbstractEditAction$findErrorsWithTracking$2(this.$checkType, this.$project, this.$document, this.$maxErrors, this.$context, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AbstractEditAction$findErrorsWithTracking$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object findErrors(@NotNull CheckType checkType, @NotNull Project project, @NotNull Document document, @Nullable Integer maxErrors, @Nullable ExecutionContext executionContextForLogging, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrors$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrors$1
/*     */     //   13: astore #28
/*     */     //   15: aload #28
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #28
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrors$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #28
/*     */     //   53: aload #28
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #27
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #29
/*     */     //   65: aload #28
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1097, 0 -> 100, 1 -> 170, 2 -> 486, 3 -> 732
/*     */     //   100: aload #27
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: aload_2
/*     */     //   106: aload_3
/*     */     //   107: <illegal opcode> invoke : (Lcom/intellij/openapi/project/Project;Lcom/intellij/openapi/editor/Document;)Lkotlin/jvm/functions/Function0;
/*     */     //   112: aload #28
/*     */     //   114: aload #28
/*     */     //   116: aload_0
/*     */     //   117: putfield L$0 : Ljava/lang/Object;
/*     */     //   120: aload #28
/*     */     //   122: aload_1
/*     */     //   123: putfield L$1 : Ljava/lang/Object;
/*     */     //   126: aload #28
/*     */     //   128: aload_2
/*     */     //   129: putfield L$2 : Ljava/lang/Object;
/*     */     //   132: aload #28
/*     */     //   134: aload_3
/*     */     //   135: putfield L$3 : Ljava/lang/Object;
/*     */     //   138: aload #28
/*     */     //   140: aload #4
/*     */     //   142: putfield L$4 : Ljava/lang/Object;
/*     */     //   145: aload #28
/*     */     //   147: aload #5
/*     */     //   149: putfield L$5 : Ljava/lang/Object;
/*     */     //   152: aload #28
/*     */     //   154: iconst_1
/*     */     //   155: putfield label : I
/*     */     //   158: invokestatic readAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   161: dup
/*     */     //   162: aload #29
/*     */     //   164: if_acmpne -> 233
/*     */     //   167: aload #29
/*     */     //   169: areturn
/*     */     //   170: aload #28
/*     */     //   172: getfield L$5 : Ljava/lang/Object;
/*     */     //   175: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   178: astore #5
/*     */     //   180: aload #28
/*     */     //   182: getfield L$4 : Ljava/lang/Object;
/*     */     //   185: checkcast java/lang/Integer
/*     */     //   188: astore #4
/*     */     //   190: aload #28
/*     */     //   192: getfield L$3 : Ljava/lang/Object;
/*     */     //   195: checkcast com/intellij/openapi/editor/Document
/*     */     //   198: astore_3
/*     */     //   199: aload #28
/*     */     //   201: getfield L$2 : Ljava/lang/Object;
/*     */     //   204: checkcast com/intellij/openapi/project/Project
/*     */     //   207: astore_2
/*     */     //   208: aload #28
/*     */     //   210: getfield L$1 : Ljava/lang/Object;
/*     */     //   213: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType
/*     */     //   216: astore_1
/*     */     //   217: aload #28
/*     */     //   219: getfield L$0 : Ljava/lang/Object;
/*     */     //   222: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction
/*     */     //   225: astore_0
/*     */     //   226: aload #27
/*     */     //   228: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   231: aload #27
/*     */     //   233: checkcast com/intellij/psi/PsiFile
/*     */     //   236: astore #7
/*     */     //   238: aload_1
/*     */     //   239: astore #9
/*     */     //   241: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   244: aload #9
/*     */     //   246: invokevirtual ordinal : ()I
/*     */     //   249: iaload
/*     */     //   250: tableswitch default -> 286, 1 -> 272, 2 -> 279
/*     */     //   272: aload_0
/*     */     //   273: getfield syntaxCheckers : Ljava/util/List;
/*     */     //   276: goto -> 294
/*     */     //   279: aload_0
/*     */     //   280: getfield semanticCheckers : Ljava/util/List;
/*     */     //   283: goto -> 294
/*     */     //   286: new kotlin/NoWhenBranchMatchedException
/*     */     //   289: dup
/*     */     //   290: invokespecial <init> : ()V
/*     */     //   293: athrow
/*     */     //   294: astore #8
/*     */     //   296: aload #8
/*     */     //   298: checkcast java/lang/Iterable
/*     */     //   301: astore #10
/*     */     //   303: iconst_0
/*     */     //   304: istore #11
/*     */     //   306: aload #10
/*     */     //   308: astore #12
/*     */     //   310: new java/util/ArrayList
/*     */     //   313: dup
/*     */     //   314: invokespecial <init> : ()V
/*     */     //   317: checkcast java/util/Collection
/*     */     //   320: astore #13
/*     */     //   322: iconst_0
/*     */     //   323: istore #14
/*     */     //   325: aload #12
/*     */     //   327: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   332: astore #15
/*     */     //   334: aload #15
/*     */     //   336: invokeinterface hasNext : ()Z
/*     */     //   341: ifeq -> 835
/*     */     //   344: aload #15
/*     */     //   346: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   351: astore #16
/*     */     //   353: aload #16
/*     */     //   355: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker
/*     */     //   358: astore #17
/*     */     //   360: iconst_0
/*     */     //   361: istore #18
/*     */     //   363: aload #5
/*     */     //   365: ifnull -> 652
/*     */     //   368: getstatic com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerEvents.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerEvents;
/*     */     //   371: pop
/*     */     //   372: aload #17
/*     */     //   374: invokeinterface getNameForLogging : ()Ljava/lang/String;
/*     */     //   379: astore #20
/*     */     //   381: iconst_0
/*     */     //   382: istore #21
/*     */     //   384: aload #5
/*     */     //   386: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerStarted
/*     */     //   389: dup
/*     */     //   390: aload #20
/*     */     //   392: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   395: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   398: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   401: nop
/*     */     //   402: iconst_0
/*     */     //   403: istore #22
/*     */     //   405: aload #17
/*     */     //   407: aload_2
/*     */     //   408: aload #7
/*     */     //   410: aload #28
/*     */     //   412: aload #28
/*     */     //   414: aload_2
/*     */     //   415: putfield L$0 : Ljava/lang/Object;
/*     */     //   418: aload #28
/*     */     //   420: aload_3
/*     */     //   421: putfield L$1 : Ljava/lang/Object;
/*     */     //   424: aload #28
/*     */     //   426: aload #4
/*     */     //   428: putfield L$2 : Ljava/lang/Object;
/*     */     //   431: aload #28
/*     */     //   433: aload #5
/*     */     //   435: putfield L$3 : Ljava/lang/Object;
/*     */     //   438: aload #28
/*     */     //   440: aload #7
/*     */     //   442: putfield L$4 : Ljava/lang/Object;
/*     */     //   445: aload #28
/*     */     //   447: aload #13
/*     */     //   449: putfield L$5 : Ljava/lang/Object;
/*     */     //   452: aload #28
/*     */     //   454: aload #15
/*     */     //   456: putfield L$6 : Ljava/lang/Object;
/*     */     //   459: aload #28
/*     */     //   461: aload #20
/*     */     //   463: putfield L$7 : Ljava/lang/Object;
/*     */     //   466: aload #28
/*     */     //   468: iconst_2
/*     */     //   469: putfield label : I
/*     */     //   472: invokeinterface findErrors : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   477: dup
/*     */     //   478: aload #29
/*     */     //   480: if_acmpne -> 587
/*     */     //   483: aload #29
/*     */     //   485: areturn
/*     */     //   486: iconst_0
/*     */     //   487: istore #11
/*     */     //   489: iconst_0
/*     */     //   490: istore #14
/*     */     //   492: iconst_0
/*     */     //   493: istore #18
/*     */     //   495: iconst_0
/*     */     //   496: istore #21
/*     */     //   498: iconst_0
/*     */     //   499: istore #22
/*     */     //   501: aload #28
/*     */     //   503: getfield L$7 : Ljava/lang/Object;
/*     */     //   506: checkcast java/lang/String
/*     */     //   509: astore #20
/*     */     //   511: aload #28
/*     */     //   513: getfield L$6 : Ljava/lang/Object;
/*     */     //   516: checkcast java/util/Iterator
/*     */     //   519: astore #15
/*     */     //   521: aload #28
/*     */     //   523: getfield L$5 : Ljava/lang/Object;
/*     */     //   526: checkcast java/util/Collection
/*     */     //   529: astore #13
/*     */     //   531: aload #28
/*     */     //   533: getfield L$4 : Ljava/lang/Object;
/*     */     //   536: checkcast com/intellij/psi/PsiFile
/*     */     //   539: astore #7
/*     */     //   541: aload #28
/*     */     //   543: getfield L$3 : Ljava/lang/Object;
/*     */     //   546: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   549: astore #5
/*     */     //   551: aload #28
/*     */     //   553: getfield L$2 : Ljava/lang/Object;
/*     */     //   556: checkcast java/lang/Integer
/*     */     //   559: astore #4
/*     */     //   561: aload #28
/*     */     //   563: getfield L$1 : Ljava/lang/Object;
/*     */     //   566: checkcast com/intellij/openapi/editor/Document
/*     */     //   569: astore_3
/*     */     //   570: aload #28
/*     */     //   572: getfield L$0 : Ljava/lang/Object;
/*     */     //   575: checkcast com/intellij/openapi/project/Project
/*     */     //   578: astore_2
/*     */     //   579: nop
/*     */     //   580: aload #27
/*     */     //   582: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   585: aload #27
/*     */     //   587: checkcast java/util/List
/*     */     //   590: astore #23
/*     */     //   592: aload #5
/*     */     //   594: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerFinished
/*     */     //   597: dup
/*     */     //   598: aload #20
/*     */     //   600: aconst_null
/*     */     //   601: iconst_2
/*     */     //   602: aconst_null
/*     */     //   603: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   606: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   609: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   612: aload #23
/*     */     //   614: goto -> 819
/*     */     //   617: astore #24
/*     */     //   619: aload #5
/*     */     //   621: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerFinished
/*     */     //   624: dup
/*     */     //   625: aload #20
/*     */     //   627: new com/intellij/ml/llm/matterhorn/events/SerializableThrowable
/*     */     //   630: dup
/*     */     //   631: aload #24
/*     */     //   633: checkcast java/lang/Throwable
/*     */     //   636: iconst_1
/*     */     //   637: invokespecial <init> : (Ljava/lang/Throwable;Z)V
/*     */     //   640: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/events/SerializableThrowable;)V
/*     */     //   643: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   646: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   649: aload #24
/*     */     //   651: athrow
/*     */     //   652: aload #17
/*     */     //   654: aload_2
/*     */     //   655: aload #7
/*     */     //   657: aload #28
/*     */     //   659: aload #28
/*     */     //   661: aload_2
/*     */     //   662: putfield L$0 : Ljava/lang/Object;
/*     */     //   665: aload #28
/*     */     //   667: aload_3
/*     */     //   668: putfield L$1 : Ljava/lang/Object;
/*     */     //   671: aload #28
/*     */     //   673: aload #4
/*     */     //   675: putfield L$2 : Ljava/lang/Object;
/*     */     //   678: aload #28
/*     */     //   680: aload #5
/*     */     //   682: putfield L$3 : Ljava/lang/Object;
/*     */     //   685: aload #28
/*     */     //   687: aload #7
/*     */     //   689: putfield L$4 : Ljava/lang/Object;
/*     */     //   692: aload #28
/*     */     //   694: aload #13
/*     */     //   696: putfield L$5 : Ljava/lang/Object;
/*     */     //   699: aload #28
/*     */     //   701: aload #15
/*     */     //   703: putfield L$6 : Ljava/lang/Object;
/*     */     //   706: aload #28
/*     */     //   708: aconst_null
/*     */     //   709: putfield L$7 : Ljava/lang/Object;
/*     */     //   712: aload #28
/*     */     //   714: iconst_3
/*     */     //   715: putfield label : I
/*     */     //   718: invokeinterface findErrors : (Lcom/intellij/openapi/project/Project;Lcom/intellij/psi/PsiFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   723: dup
/*     */     //   724: aload #29
/*     */     //   726: if_acmpne -> 816
/*     */     //   729: aload #29
/*     */     //   731: areturn
/*     */     //   732: iconst_0
/*     */     //   733: istore #11
/*     */     //   735: iconst_0
/*     */     //   736: istore #14
/*     */     //   738: iconst_0
/*     */     //   739: istore #18
/*     */     //   741: aload #28
/*     */     //   743: getfield L$6 : Ljava/lang/Object;
/*     */     //   746: checkcast java/util/Iterator
/*     */     //   749: astore #15
/*     */     //   751: aload #28
/*     */     //   753: getfield L$5 : Ljava/lang/Object;
/*     */     //   756: checkcast java/util/Collection
/*     */     //   759: astore #13
/*     */     //   761: aload #28
/*     */     //   763: getfield L$4 : Ljava/lang/Object;
/*     */     //   766: checkcast com/intellij/psi/PsiFile
/*     */     //   769: astore #7
/*     */     //   771: aload #28
/*     */     //   773: getfield L$3 : Ljava/lang/Object;
/*     */     //   776: checkcast com/intellij/ml/llm/matterhorn/ExecutionContext
/*     */     //   779: astore #5
/*     */     //   781: aload #28
/*     */     //   783: getfield L$2 : Ljava/lang/Object;
/*     */     //   786: checkcast java/lang/Integer
/*     */     //   789: astore #4
/*     */     //   791: aload #28
/*     */     //   793: getfield L$1 : Ljava/lang/Object;
/*     */     //   796: checkcast com/intellij/openapi/editor/Document
/*     */     //   799: astore_3
/*     */     //   800: aload #28
/*     */     //   802: getfield L$0 : Ljava/lang/Object;
/*     */     //   805: checkcast com/intellij/openapi/project/Project
/*     */     //   808: astore_2
/*     */     //   809: aload #27
/*     */     //   811: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   814: aload #27
/*     */     //   816: checkcast java/util/List
/*     */     //   819: checkcast java/lang/Iterable
/*     */     //   822: astore #25
/*     */     //   824: aload #13
/*     */     //   826: aload #25
/*     */     //   828: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   831: pop
/*     */     //   832: goto -> 334
/*     */     //   835: aload #13
/*     */     //   837: checkcast java/util/List
/*     */     //   840: nop
/*     */     //   841: astore #9
/*     */     //   843: aload #9
/*     */     //   845: invokeinterface isEmpty : ()Z
/*     */     //   850: ifeq -> 857
/*     */     //   853: invokestatic emptyList : ()Ljava/util/List;
/*     */     //   856: areturn
/*     */     //   857: aload #9
/*     */     //   859: checkcast java/lang/Iterable
/*     */     //   862: astore #11
/*     */     //   864: iconst_0
/*     */     //   865: istore #12
/*     */     //   867: aload #11
/*     */     //   869: astore #13
/*     */     //   871: new java/util/ArrayList
/*     */     //   874: dup
/*     */     //   875: aload #11
/*     */     //   877: bipush #10
/*     */     //   879: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   882: invokespecial <init> : (I)V
/*     */     //   885: checkcast java/util/Collection
/*     */     //   888: astore #14
/*     */     //   890: iconst_0
/*     */     //   891: istore #15
/*     */     //   893: aload #13
/*     */     //   895: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   900: astore #16
/*     */     //   902: aload #16
/*     */     //   904: invokeinterface hasNext : ()Z
/*     */     //   909: ifeq -> 1042
/*     */     //   912: aload #16
/*     */     //   914: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   919: astore #17
/*     */     //   921: aload #14
/*     */     //   923: aload #17
/*     */     //   925: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error
/*     */     //   928: astore #18
/*     */     //   930: astore #26
/*     */     //   932: iconst_0
/*     */     //   933: istore #19
/*     */     //   935: aload #18
/*     */     //   937: astore #20
/*     */     //   939: aload #20
/*     */     //   941: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   944: ifeq -> 955
/*     */     //   947: aload #18
/*     */     //   949: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   952: goto -> 1029
/*     */     //   955: aload #20
/*     */     //   957: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError
/*     */     //   960: ifeq -> 1021
/*     */     //   963: aload #18
/*     */     //   965: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/OffsetError
/*     */     //   968: invokevirtual getOffset : ()I
/*     */     //   971: istore #21
/*     */     //   973: aload_3
/*     */     //   974: iload #21
/*     */     //   976: invokeinterface getLineNumber : (I)I
/*     */     //   981: iconst_1
/*     */     //   982: iadd
/*     */     //   983: istore #22
/*     */     //   985: iload #21
/*     */     //   987: aload_3
/*     */     //   988: iload #22
/*     */     //   990: iconst_1
/*     */     //   991: isub
/*     */     //   992: invokeinterface getLineStartOffset : (I)I
/*     */     //   997: isub
/*     */     //   998: iconst_1
/*     */     //   999: iadd
/*     */     //   1000: istore #23
/*     */     //   1002: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/LineColumnError
/*     */     //   1005: dup
/*     */     //   1006: iload #22
/*     */     //   1008: iload #23
/*     */     //   1010: aload #18
/*     */     //   1012: invokevirtual getText : ()Ljava/lang/String;
/*     */     //   1015: invokespecial <init> : (IILjava/lang/String;)V
/*     */     //   1018: goto -> 1029
/*     */     //   1021: new kotlin/NoWhenBranchMatchedException
/*     */     //   1024: dup
/*     */     //   1025: invokespecial <init> : ()V
/*     */     //   1028: athrow
/*     */     //   1029: nop
/*     */     //   1030: aload #26
/*     */     //   1032: swap
/*     */     //   1033: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   1038: pop
/*     */     //   1039: goto -> 902
/*     */     //   1042: aload #14
/*     */     //   1044: checkcast java/util/List
/*     */     //   1047: nop
/*     */     //   1048: checkcast java/lang/Iterable
/*     */     //   1051: astore #11
/*     */     //   1053: iconst_0
/*     */     //   1054: istore #12
/*     */     //   1056: aload #11
/*     */     //   1058: new com/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$findErrors$$inlined$sortedBy$1
/*     */     //   1061: dup
/*     */     //   1062: invokespecial <init> : ()V
/*     */     //   1065: checkcast java/util/Comparator
/*     */     //   1068: invokestatic sortedWith : (Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
/*     */     //   1071: astore #10
/*     */     //   1073: aload #4
/*     */     //   1075: ifnull -> 1094
/*     */     //   1078: aload #10
/*     */     //   1080: checkcast java/lang/Iterable
/*     */     //   1083: aload #4
/*     */     //   1085: invokevirtual intValue : ()I
/*     */     //   1088: invokestatic take : (Ljava/lang/Iterable;I)Ljava/util/List;
/*     */     //   1091: goto -> 1096
/*     */     //   1094: aload #10
/*     */     //   1096: areturn
/*     */     //   1097: new java/lang/IllegalStateException
/*     */     //   1100: dup
/*     */     //   1101: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1104: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1107: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #298	-> 63
/*     */     //   #305	-> 105
/*     */     //   #298	-> 167
/*     */     //   #307	-> 238
/*     */     //   #308	-> 272
/*     */     //   #309	-> 279
/*     */     //   #307	-> 286
/*     */     //   #311	-> 296
/*     */     //   #514	-> 306
/*     */     //   #515	-> 325
/*     */     //   #516	-> 353
/*     */     //   #312	-> 363
/*     */     //   #313	-> 368
/*     */     //   #517	-> 384
/*     */     //   #518	-> 401
/*     */     //   #519	-> 402
/*     */     //   #314	-> 405
/*     */     //   #298	-> 483
/*     */     //   #314	-> 587
/*     */     //   #519	-> 590
/*     */     //   #520	-> 592
/*     */     //   #521	-> 612
/*     */     //   #522	-> 617
/*     */     //   #523	-> 619
/*     */     //   #524	-> 649
/*     */     //   #316	-> 652
/*     */     //   #298	-> 729
/*     */     //   #316	-> 816
/*     */     //   #516	-> 822
/*     */     //   #525	-> 824
/*     */     //   #527	-> 835
/*     */     //   #514	-> 840
/*     */     //   #311	-> 841
/*     */     //   #318	-> 843
/*     */     //   #319	-> 857
/*     */     //   #320	-> 864
/*     */     //   #528	-> 867
/*     */     //   #529	-> 893
/*     */     //   #530	-> 921
/*     */     //   #321	-> 935
/*     */     //   #322	-> 939
/*     */     //   #323	-> 955
/*     */     //   #324	-> 963
/*     */     //   #325	-> 973
/*     */     //   #326	-> 985
/*     */     //   #327	-> 1002
/*     */     //   #321	-> 1021
/*     */     //   #329	-> 1029
/*     */     //   #530	-> 1033
/*     */     //   #531	-> 1042
/*     */     //   #528	-> 1047
/*     */     //   #331	-> 1053
/*     */     //   #532	-> 1056
/*     */     //   #532	-> 1068
/*     */     //   #331	-> 1071
/*     */     //   #319	-> 1071
/*     */     //   #332	-> 1073
/*     */     //   #298	-> 1097
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	65	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   226	53	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   279	7	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction;
/*     */     //   105	65	1	checkType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   217	24	1	checkType	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/AbstractEditAction$CheckType;
/*     */     //   105	65	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   208	78	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   294	192	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   579	38	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   652	80	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   809	13	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   822	13	2	project	Lcom/intellij/openapi/project/Project;
/*     */     //   105	65	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   199	87	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   294	192	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   570	47	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   652	80	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   800	22	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   822	19	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   841	16	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   857	164	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1029	1	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   1030	12	3	document	Lcom/intellij/openapi/editor/Document;
/*     */     //   105	65	4	maxErrors	Ljava/lang/Integer;
/*     */     //   190	96	4	maxErrors	Ljava/lang/Integer;
/*     */     //   294	192	4	maxErrors	Ljava/lang/Integer;
/*     */     //   561	56	4	maxErrors	Ljava/lang/Integer;
/*     */     //   652	80	4	maxErrors	Ljava/lang/Integer;
/*     */     //   791	31	4	maxErrors	Ljava/lang/Integer;
/*     */     //   822	19	4	maxErrors	Ljava/lang/Integer;
/*     */     //   841	16	4	maxErrors	Ljava/lang/Integer;
/*     */     //   857	164	4	maxErrors	Ljava/lang/Integer;
/*     */     //   1029	1	4	maxErrors	Ljava/lang/Integer;
/*     */     //   1030	18	4	maxErrors	Ljava/lang/Integer;
/*     */     //   1048	23	4	maxErrors	Ljava/lang/Integer;
/*     */     //   1071	23	4	maxErrors	Ljava/lang/Integer;
/*     */     //   105	65	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   180	106	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   294	192	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   551	181	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   781	41	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   822	13	5	executionContextForLogging	Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   238	48	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   294	192	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   541	76	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   652	80	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   771	51	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   822	13	7	psiFile	Lcom/intellij/psi/PsiFile;
/*     */     //   296	7	8	errorCheckers	Ljava/util/List;
/*     */     //   843	14	9	errors	Ljava/util/List;
/*     */     //   857	7	9	errors	Ljava/util/List;
/*     */     //   303	19	10	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   1073	21	10	res	Ljava/util/List;
/*     */     //   1094	2	10	res	Ljava/util/List;
/*     */     //   864	26	11	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   1053	18	11	$this$sortedBy$iv	Ljava/lang/Iterable;
/*     */     //   322	12	12	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   322	164	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   531	86	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   652	80	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   761	76	13	destination$iv$iv	Ljava/util/Collection;
/*     */     //   890	12	13	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   890	131	14	destination$iv$iv	Ljava/util/Collection;
/*     */     //   1029	15	14	destination$iv$iv	Ljava/util/Collection;
/*     */     //   353	7	16	element$iv$iv	Ljava/lang/Object;
/*     */     //   360	117	17	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;
/*     */     //   652	71	17	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorChecker;
/*     */     //   921	11	17	item$iv$iv	Ljava/lang/Object;
/*     */     //   932	23	18	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;
/*     */     //   955	63	18	it	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/Error;
/*     */     //   381	105	20	nameForLogging$iv	Ljava/lang/String;
/*     */     //   511	141	20	nameForLogging$iv	Ljava/lang/String;
/*     */     //   973	45	21	offset	I
/*     */     //   985	33	22	line	I
/*     */     //   592	25	23	result$iv	Ljava/lang/Object;
/*     */     //   1002	16	23	column	I
/*     */     //   619	33	24	e$iv	Ljava/lang/Exception;
/*     */     //   824	8	25	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   405	81	22	$i$a$-withTracking-AbstractEditAction$findErrors$errors$1$1	I
/*     */     //   384	102	21	$i$f$withTracking	I
/*     */     //   363	123	18	$i$a$-flatMap-AbstractEditAction$findErrors$errors$1	I
/*     */     //   325	161	14	$i$f$flatMapTo	I
/*     */     //   306	180	11	$i$f$flatMap	I
/*     */     //   935	95	19	$i$a$-map-AbstractEditAction$findErrors$res$1	I
/*     */     //   893	151	15	$i$f$mapTo	I
/*     */     //   867	181	12	$i$f$map	I
/*     */     //   1056	15	12	$i$f$sortedBy	I
/*     */     //   0	1108	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	1044	28	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1037	27	$result	Ljava/lang/Object;
/*     */     //   501	89	22	$i$a$-withTracking-AbstractEditAction$findErrors$errors$1$1	I
/*     */     //   498	154	21	$i$f$withTracking	I
/*     */     //   495	237	18	$i$a$-flatMap-AbstractEditAction$findErrors$errors$1	I
/*     */     //   492	240	14	$i$f$flatMapTo	I
/*     */     //   489	243	11	$i$f$flatMap	I
/*     */     //   741	81	18	$i$a$-flatMap-AbstractEditAction$findErrors$errors$1	I
/*     */     //   738	99	14	$i$f$flatMapTo	I
/*     */     //   735	106	11	$i$f$flatMap	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   401	477	617	java/lang/Exception
/*     */     //   579	617	617	java/lang/Exception
/*     */   }
/*     */   
/*     */   private static final PsiFile findErrors$lambda$8(Project $project, Document $document) {
/*     */     if (PsiDocumentManager.getInstance($project).getPsiFile($document) == null) {
/*     */       PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */       throw new IllegalStateException("PSI file is expected to present if document is already obtained".toString());
/*     */     } 
/*     */     return PsiDocumentManager.getInstance($project).getPsiFile($document);
/*     */   }
/*     */   
/*     */   private final String getLine(Document document, int i) {
/*     */     int startOffset = document.getLineStartOffset(i);
/*     */     int endOffset = document.getLineEndOffset(i);
/*     */     Intrinsics.checkNotNullExpressionValue(document.getText(new TextRange(startOffset, endOffset)), "getText(...)");
/*     */     String line = document.getText(new TextRange(startOffset, endOffset));
/*     */     return line;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditAction.kt", l = {159, 162, 171, 178, 202, 203, 209, 220, 244, 255}, i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "I$2", "I$3", "Z$0", "L$0", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0", "I$1", "I$2", "L$1"}, n = {"this", "context", "document", "replacementText", "project", "replacedText", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "fileCopy", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "replacementText", "project", "replacedText", "fileCopy", "errors", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "replacedText", "errors", "virtualFile", "nioPath", "editedDoc", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "errors", "virtualFile", "editedDoc", "session", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "this", "context", "document", "project", "errors", "virtualFile", "editedDoc", "startLineIncl", "endLineIncl", "margin", "window", "dryRun", "document", "$this$changeText_u24lambda_u247", "context", "project", "virtualFile", "editedScreen", "$this$changeText_u24lambda_u247", "startLineIncl", "endLineIncl", "margin", "$this$changeText_u24lambda_u247"}, m = "changeText", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditAction$changeText$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     Object L$8;
/*     */     int I$0;
/*     */     int I$1;
/*     */     int I$2;
/*     */     int I$3;
/*     */     boolean Z$0;
/*     */     int label;
/*     */     
/*     */     AbstractEditAction$changeText$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditAction.this.changeText(null, null, 0, 0, null, null, 0, 0, false, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditAction.kt", l = {305, 314, 316}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, n = {"this", "checkType", "project", "document", "maxErrors", "executionContextForLogging", "project", "document", "maxErrors", "executionContextForLogging", "psiFile", "destination$iv$iv", "nameForLogging$iv", "project", "document", "maxErrors", "executionContextForLogging", "psiFile", "destination$iv$iv"}, m = "findErrors", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditAction$findErrors$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     Object L$5;
/*     */     Object L$6;
/*     */     Object L$7;
/*     */     int label;
/*     */     
/*     */     AbstractEditAction$findErrors$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditAction.this.findErrors(null, null, null, null, null, (Continuation<? super List<? extends Error>>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AbstractEditAction.kt", l = {283, 286}, i = {1, 1}, s = {"L$0", "L$1"}, n = {"this", "context"}, m = "findErrorsWithTracking", c = "com.intellij.ml.llm.matterhorn.ej.core.actions.edit.AbstractEditAction")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AbstractEditAction$findErrorsWithTracking$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AbstractEditAction$findErrorsWithTracking$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AbstractEditAction.this.findErrorsWithTracking(null, null, null, null, null, (Continuation<? super List<? extends Error>>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\AbstractEditAction.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */