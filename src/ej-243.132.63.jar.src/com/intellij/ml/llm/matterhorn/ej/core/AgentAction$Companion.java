/*     */ package com.intellij.ml.llm.matterhorn.ej.core;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ActionRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.FileUtil;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.ProductSpecificAllowedCommands;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.run.ExecutionSession;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.editor.Document;
/*     */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import java.nio.file.Path;
/*     */ import java.nio.file.Paths;
/*     */ import java.util.List;
/*     */ import java.util.Set;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.SetsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.Regex;
/*     */ import kotlin.text.StringsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000b\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\"\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\b\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\020\b\n\002\b\n\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\024\032\0020\0252\006\020\026\032\0020\bJ\020\020\027\032\004\030\0010\0302\006\020\031\032\0020\032JD\020\033\032\0020\b2\006\020\034\032\0020\0352\006\020\036\032\0020\0372\f\020 \032\b\022\004\022\0020\"0!2\n\b\002\020#\032\004\030\0010$2\n\b\002\020%\032\004\030\0010$H@¢\006\002\020&J8\020'\032\004\030\0010\b2\006\020\034\032\0020\0352\006\020\036\032\0020\0372\f\020 \032\b\022\004\022\0020\"0!2\b\b\002\020(\032\0020\025H@¢\006\002\020)J4\020*\032\0020\b2\006\020+\032\0020\b2\b\020,\032\004\030\0010$2\b\020-\032\004\030\0010$2\006\020.\032\0020/H@¢\006\004\b0\0201R\016\020\004\032\0020\005X\004¢\006\002\n\000R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\t\020\nR\033\020\013\032\0020\f8BX\002¢\006\f\n\004\b\017\020\020\032\004\b\r\020\016R\016\020\021\032\0020\bXT¢\006\002\n\000R\016\020\022\032\0020\bXT¢\006\002\n\000R\016\020\023\032\0020\bXT¢\006\002\n\000¨\0062"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "readonlyBashActions", "", "", "getReadonlyBashActions", "()Ljava/util/Set;", "readonlyBashRegex", "Lkotlin/text/Regex;", "getReadonlyBashRegex", "()Lkotlin/text/Regex;", "readonlyBashRegex$delegate", "Lkotlin/Lazy;", "ERROR_MESSAGE_PREFIX", "REJECTED_EXECUTION", "CANCELED_EXECUTION", "isReadonlyBashCommand", "", "command", "getShell", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "root", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "executeActionRequest", "request", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;", "context", "Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;", "availableActions", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;", "maxOutputLineLength", "", "maxOutputLines", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reviewActionRequest", "strict", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "truncateLongOutput", "commandOutput", "maxLineLength", "maxLines", "projectRoot", "Lcom/intellij/openapi/vfs/VirtualFile;", "truncateLongOutput$ej_core", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nAgentActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,414:1\n1#2:415\n14#3:416\n*S KotlinDebug\n*F\n+ 1 AgentActions.kt\ncom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion\n*L\n78#1:416\n*E\n"})
/*     */ public final class Companion
/*     */ {
/*     */   static {
/*  78 */     int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 416 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(AgentAction.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(AgentAction.class);
/*     */   
/*     */   @NotNull
/*     */   public final Set<String> getReadonlyBashActions() {
/*     */     return readonlyBashActions;
/*     */   }
/*     */   
/*     */   static {
/*     */     String[] arrayOfString = new String[3];
/*     */     arrayOfString[0] = "cd";
/*     */     arrayOfString[1] = "pwd";
/*     */     arrayOfString[2] = "ls";
/*     */     readonlyBashActions = SetsKt.setOf((Object[])arrayOfString);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Lazy<Regex> readonlyBashRegex$delegate = LazyKt.lazy(Companion::readonlyBashRegex_delegate$lambda$0);
/*     */   
/*     */   private final Regex getReadonlyBashRegex() {
/*     */     Lazy<Regex> lazy = readonlyBashRegex$delegate;
/*     */     return (Regex)lazy.getValue();
/*     */   }
/*     */   
/*     */   private static final Regex readonlyBashRegex_delegate$lambda$0() {
/*     */     return new Regex("^(" + CollectionsKt.joinToString$default(readonlyBashActions, "|", null, null, 0, null, null, 62, null) + ")(?:\\s+[^|;&<>()`$]+)*$");
/*     */   }
/*     */   
/*     */   public final boolean isReadonlyBashCommand(@NotNull String command) {
/*     */     Intrinsics.checkNotNullParameter(command, "command");
/*     */     return StringsKt.isBlank(command) ? true : (ProductSpecificAllowedCommands.Companion.isProductSpecificAllowedCommand(command) ? true : getReadonlyBashRegex().matches(StringsKt.trim(command).toString()));
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ShellExecutor getShell(@NotNull RootExecutionContext root) {
/*     */     Intrinsics.checkNotNullParameter(root, "root");
/*     */     return root.getShellExecutor();
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object executeActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull List availableActions, @Nullable Integer maxOutputLineLength, @Nullable Integer maxOutputLines, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #6
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #6
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$1
/*     */     //   13: astore #23
/*     */     //   15: aload #23
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #23
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #6
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #23
/*     */     //   53: aload #23
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #22
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #24
/*     */     //   65: aload #23
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 1902, 0 -> 120, 1 -> 297, 2 -> 446, 3 -> 729, 4 -> 1035, 5 -> 1184, 6 -> 1377, 7 -> 1519, 8 -> 1656
/*     */     //   120: aload #22
/*     */     //   122: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   125: aload_2
/*     */     //   126: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   131: new com/intellij/ml/llm/matterhorn/ej/core/BeforeStepStartedEvent
/*     */     //   134: dup
/*     */     //   135: aload_1
/*     */     //   136: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   139: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   142: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   145: aload_3
/*     */     //   146: checkcast java/lang/Iterable
/*     */     //   149: astore #9
/*     */     //   151: aload #9
/*     */     //   153: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   158: astore #10
/*     */     //   160: aload #10
/*     */     //   162: invokeinterface hasNext : ()Z
/*     */     //   167: ifeq -> 213
/*     */     //   170: aload #10
/*     */     //   172: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   177: astore #11
/*     */     //   179: aload #11
/*     */     //   181: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   184: astore #12
/*     */     //   186: iconst_0
/*     */     //   187: istore #13
/*     */     //   189: aload #12
/*     */     //   191: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   196: aload_1
/*     */     //   197: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   202: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   205: ifeq -> 160
/*     */     //   208: aload #11
/*     */     //   210: goto -> 214
/*     */     //   213: aconst_null
/*     */     //   214: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   217: astore #7
/*     */     //   219: nop
/*     */     //   220: new java/lang/StringBuilder
/*     */     //   223: dup
/*     */     //   224: invokespecial <init> : ()V
/*     */     //   227: astore #8
/*     */     //   229: aload #7
/*     */     //   231: ifnull -> 365
/*     */     //   234: aload #8
/*     */     //   236: astore #21
/*     */     //   238: aload #7
/*     */     //   240: aload_1
/*     */     //   241: aload_2
/*     */     //   242: aload #23
/*     */     //   244: aload #23
/*     */     //   246: aload_1
/*     */     //   247: putfield L$0 : Ljava/lang/Object;
/*     */     //   250: aload #23
/*     */     //   252: aload_2
/*     */     //   253: putfield L$1 : Ljava/lang/Object;
/*     */     //   256: aload #23
/*     */     //   258: aload #7
/*     */     //   260: putfield L$2 : Ljava/lang/Object;
/*     */     //   263: aload #23
/*     */     //   265: aload #8
/*     */     //   267: putfield L$3 : Ljava/lang/Object;
/*     */     //   270: aload #23
/*     */     //   272: aload #21
/*     */     //   274: putfield L$4 : Ljava/lang/Object;
/*     */     //   277: aload #23
/*     */     //   279: iconst_1
/*     */     //   280: putfield label : I
/*     */     //   283: invokeinterface execute : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   288: dup
/*     */     //   289: aload #24
/*     */     //   291: if_acmpne -> 353
/*     */     //   294: aload #24
/*     */     //   296: areturn
/*     */     //   297: aload #23
/*     */     //   299: getfield L$4 : Ljava/lang/Object;
/*     */     //   302: checkcast java/lang/StringBuilder
/*     */     //   305: astore #21
/*     */     //   307: aload #23
/*     */     //   309: getfield L$3 : Ljava/lang/Object;
/*     */     //   312: checkcast java/lang/StringBuilder
/*     */     //   315: astore #8
/*     */     //   317: aload #23
/*     */     //   319: getfield L$2 : Ljava/lang/Object;
/*     */     //   322: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   325: astore #7
/*     */     //   327: aload #23
/*     */     //   329: getfield L$1 : Ljava/lang/Object;
/*     */     //   332: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   335: astore_2
/*     */     //   336: aload #23
/*     */     //   338: getfield L$0 : Ljava/lang/Object;
/*     */     //   341: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   344: astore_1
/*     */     //   345: nop
/*     */     //   346: aload #22
/*     */     //   348: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   351: aload #22
/*     */     //   353: aload #21
/*     */     //   355: swap
/*     */     //   356: checkcast java/lang/String
/*     */     //   359: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   362: goto -> 1712
/*     */     //   365: aload_1
/*     */     //   366: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   369: ifeq -> 1701
/*     */     //   372: aload_2
/*     */     //   373: invokeinterface getExecutionEnvironment : ()Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionEnvironment;
/*     */     //   378: aload #23
/*     */     //   380: aload #23
/*     */     //   382: aload_1
/*     */     //   383: putfield L$0 : Ljava/lang/Object;
/*     */     //   386: aload #23
/*     */     //   388: aload_2
/*     */     //   389: putfield L$1 : Ljava/lang/Object;
/*     */     //   392: aload #23
/*     */     //   394: aload_3
/*     */     //   395: putfield L$2 : Ljava/lang/Object;
/*     */     //   398: aload #23
/*     */     //   400: aload #4
/*     */     //   402: putfield L$3 : Ljava/lang/Object;
/*     */     //   405: aload #23
/*     */     //   407: aload #5
/*     */     //   409: putfield L$4 : Ljava/lang/Object;
/*     */     //   412: aload #23
/*     */     //   414: aload #7
/*     */     //   416: putfield L$5 : Ljava/lang/Object;
/*     */     //   419: aload #23
/*     */     //   421: aload #8
/*     */     //   423: putfield L$6 : Ljava/lang/Object;
/*     */     //   426: aload #23
/*     */     //   428: iconst_2
/*     */     //   429: putfield label : I
/*     */     //   432: invokeinterface getOrCreateSession : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   437: dup
/*     */     //   438: aload #24
/*     */     //   440: if_acmpne -> 521
/*     */     //   443: aload #24
/*     */     //   445: areturn
/*     */     //   446: aload #23
/*     */     //   448: getfield L$6 : Ljava/lang/Object;
/*     */     //   451: checkcast java/lang/StringBuilder
/*     */     //   454: astore #8
/*     */     //   456: aload #23
/*     */     //   458: getfield L$5 : Ljava/lang/Object;
/*     */     //   461: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   464: astore #7
/*     */     //   466: aload #23
/*     */     //   468: getfield L$4 : Ljava/lang/Object;
/*     */     //   471: checkcast java/lang/Integer
/*     */     //   474: astore #5
/*     */     //   476: aload #23
/*     */     //   478: getfield L$3 : Ljava/lang/Object;
/*     */     //   481: checkcast java/lang/Integer
/*     */     //   484: astore #4
/*     */     //   486: aload #23
/*     */     //   488: getfield L$2 : Ljava/lang/Object;
/*     */     //   491: checkcast java/util/List
/*     */     //   494: astore_3
/*     */     //   495: aload #23
/*     */     //   497: getfield L$1 : Ljava/lang/Object;
/*     */     //   500: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   503: astore_2
/*     */     //   504: aload #23
/*     */     //   506: getfield L$0 : Ljava/lang/Object;
/*     */     //   509: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   512: astore_1
/*     */     //   513: nop
/*     */     //   514: aload #22
/*     */     //   516: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   519: aload #22
/*     */     //   521: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */     //   524: aconst_null
/*     */     //   525: iconst_1
/*     */     //   526: aconst_null
/*     */     //   527: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   530: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   533: astore #9
/*     */     //   535: aload_2
/*     */     //   536: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   541: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   544: dup
/*     */     //   545: ldc 'toNioPath(...)'
/*     */     //   547: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   550: astore #10
/*     */     //   552: aload_1
/*     */     //   553: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest
/*     */     //   556: aload_3
/*     */     //   557: invokestatic toTerminalRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/SimpleActionRequest;Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;
/*     */     //   560: astore #11
/*     */     //   562: aload #11
/*     */     //   564: invokevirtual getWarningForJunie : ()Ljava/lang/String;
/*     */     //   567: dup
/*     */     //   568: ifnull -> 593
/*     */     //   571: astore #14
/*     */     //   573: iconst_0
/*     */     //   574: istore #15
/*     */     //   576: aload #8
/*     */     //   578: aload #14
/*     */     //   580: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   585: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   588: pop
/*     */     //   589: nop
/*     */     //   590: goto -> 595
/*     */     //   593: pop
/*     */     //   594: nop
/*     */     //   595: aload #11
/*     */     //   597: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   600: astore #12
/*     */     //   602: aload #12
/*     */     //   604: getstatic com/intellij/ml/llm/matterhorn/ej/core/StepType.Terminal : Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;
/*     */     //   607: aload_2
/*     */     //   608: invokestatic emitMetadata : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/StepType;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)V
/*     */     //   611: aload_2
/*     */     //   612: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   617: invokevirtual getRoot : ()Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;
/*     */     //   620: invokevirtual getHumanInLoop : ()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   623: astore #13
/*     */     //   625: aload #13
/*     */     //   627: new com/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction
/*     */     //   630: dup
/*     */     //   631: aload #12
/*     */     //   633: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   636: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   639: aload #23
/*     */     //   641: aload #23
/*     */     //   643: aload_1
/*     */     //   644: putfield L$0 : Ljava/lang/Object;
/*     */     //   647: aload #23
/*     */     //   649: aload_2
/*     */     //   650: putfield L$1 : Ljava/lang/Object;
/*     */     //   653: aload #23
/*     */     //   655: aload #4
/*     */     //   657: putfield L$2 : Ljava/lang/Object;
/*     */     //   660: aload #23
/*     */     //   662: aload #5
/*     */     //   664: putfield L$3 : Ljava/lang/Object;
/*     */     //   667: aload #23
/*     */     //   669: aload #7
/*     */     //   671: putfield L$4 : Ljava/lang/Object;
/*     */     //   674: aload #23
/*     */     //   676: aload #8
/*     */     //   678: putfield L$5 : Ljava/lang/Object;
/*     */     //   681: aload #23
/*     */     //   683: aload #9
/*     */     //   685: putfield L$6 : Ljava/lang/Object;
/*     */     //   688: aload #23
/*     */     //   690: aload #10
/*     */     //   692: putfield L$7 : Ljava/lang/Object;
/*     */     //   695: aload #23
/*     */     //   697: aload #12
/*     */     //   699: putfield L$8 : Ljava/lang/Object;
/*     */     //   702: aload #23
/*     */     //   704: aload #13
/*     */     //   706: putfield L$9 : Ljava/lang/Object;
/*     */     //   709: aload #23
/*     */     //   711: iconst_3
/*     */     //   712: putfield label : I
/*     */     //   715: invokeinterface shouldAllowAction : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   720: dup
/*     */     //   721: aload #24
/*     */     //   723: if_acmpne -> 835
/*     */     //   726: aload #24
/*     */     //   728: areturn
/*     */     //   729: aload #23
/*     */     //   731: getfield L$9 : Ljava/lang/Object;
/*     */     //   734: checkcast com/intellij/ml/llm/matterhorn/HumanInLoop
/*     */     //   737: astore #13
/*     */     //   739: aload #23
/*     */     //   741: getfield L$8 : Ljava/lang/Object;
/*     */     //   744: checkcast java/lang/String
/*     */     //   747: astore #12
/*     */     //   749: aload #23
/*     */     //   751: getfield L$7 : Ljava/lang/Object;
/*     */     //   754: checkcast java/nio/file/Path
/*     */     //   757: astore #10
/*     */     //   759: aload #23
/*     */     //   761: getfield L$6 : Ljava/lang/Object;
/*     */     //   764: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession
/*     */     //   767: astore #9
/*     */     //   769: aload #23
/*     */     //   771: getfield L$5 : Ljava/lang/Object;
/*     */     //   774: checkcast java/lang/StringBuilder
/*     */     //   777: astore #8
/*     */     //   779: aload #23
/*     */     //   781: getfield L$4 : Ljava/lang/Object;
/*     */     //   784: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   787: astore #7
/*     */     //   789: aload #23
/*     */     //   791: getfield L$3 : Ljava/lang/Object;
/*     */     //   794: checkcast java/lang/Integer
/*     */     //   797: astore #5
/*     */     //   799: aload #23
/*     */     //   801: getfield L$2 : Ljava/lang/Object;
/*     */     //   804: checkcast java/lang/Integer
/*     */     //   807: astore #4
/*     */     //   809: aload #23
/*     */     //   811: getfield L$1 : Ljava/lang/Object;
/*     */     //   814: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   817: astore_2
/*     */     //   818: aload #23
/*     */     //   820: getfield L$0 : Ljava/lang/Object;
/*     */     //   823: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   826: astore_1
/*     */     //   827: nop
/*     */     //   828: aload #22
/*     */     //   830: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   833: aload #22
/*     */     //   835: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   838: astore #14
/*     */     //   840: aload #14
/*     */     //   842: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Disagree
/*     */     //   845: ifeq -> 876
/*     */     //   848: ldc_w 'Human rejected execution of the given action. Try doing something else.'
/*     */     //   851: astore #15
/*     */     //   853: aload_2
/*     */     //   854: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   859: new com/intellij/ml/llm/matterhorn/ej/core/AfterStepFinishedEvent
/*     */     //   862: dup
/*     */     //   863: aload_1
/*     */     //   864: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   867: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   870: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   873: aload #15
/*     */     //   875: areturn
/*     */     //   876: new com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$action$2
/*     */     //   879: dup
/*     */     //   880: aload #9
/*     */     //   882: aload #12
/*     */     //   884: aload #10
/*     */     //   886: aload_2
/*     */     //   887: aload #4
/*     */     //   889: aload #5
/*     */     //   891: aconst_null
/*     */     //   892: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/nio/file/Path;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)V
/*     */     //   895: checkcast kotlin/jvm/functions/Function1
/*     */     //   898: astore #15
/*     */     //   900: getstatic com/intellij/ml/llm/matterhorn/MatterhornServiceScope.Companion : Lcom/intellij/ml/llm/matterhorn/MatterhornServiceScope$Companion;
/*     */     //   903: aload_2
/*     */     //   904: invokeinterface getProject : ()Lcom/intellij/openapi/project/Project;
/*     */     //   909: invokevirtual getScope : (Lcom/intellij/openapi/project/Project;)Lkotlinx/coroutines/CoroutineScope;
/*     */     //   912: astore #16
/*     */     //   914: aload #16
/*     */     //   916: aconst_null
/*     */     //   917: aconst_null
/*     */     //   918: new com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$job$1
/*     */     //   921: dup
/*     */     //   922: aload_2
/*     */     //   923: aload #15
/*     */     //   925: aconst_null
/*     */     //   926: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V
/*     */     //   929: checkcast kotlin/jvm/functions/Function2
/*     */     //   932: iconst_3
/*     */     //   933: aconst_null
/*     */     //   934: invokestatic async$default : (Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/Deferred;
/*     */     //   937: astore #17
/*     */     //   939: aload #13
/*     */     //   941: aload #17
/*     */     //   943: checkcast kotlinx/coroutines/Job
/*     */     //   946: aload #12
/*     */     //   948: aload #23
/*     */     //   950: aload #23
/*     */     //   952: aload_1
/*     */     //   953: putfield L$0 : Ljava/lang/Object;
/*     */     //   956: aload #23
/*     */     //   958: aload_2
/*     */     //   959: putfield L$1 : Ljava/lang/Object;
/*     */     //   962: aload #23
/*     */     //   964: aload #7
/*     */     //   966: putfield L$2 : Ljava/lang/Object;
/*     */     //   969: aload #23
/*     */     //   971: aload #8
/*     */     //   973: putfield L$3 : Ljava/lang/Object;
/*     */     //   976: aload #23
/*     */     //   978: aload #12
/*     */     //   980: putfield L$4 : Ljava/lang/Object;
/*     */     //   983: aload #23
/*     */     //   985: aload #13
/*     */     //   987: putfield L$5 : Ljava/lang/Object;
/*     */     //   990: aload #23
/*     */     //   992: aload #17
/*     */     //   994: putfield L$6 : Ljava/lang/Object;
/*     */     //   997: aload #23
/*     */     //   999: aconst_null
/*     */     //   1000: putfield L$7 : Ljava/lang/Object;
/*     */     //   1003: aload #23
/*     */     //   1005: aconst_null
/*     */     //   1006: putfield L$8 : Ljava/lang/Object;
/*     */     //   1009: aload #23
/*     */     //   1011: aconst_null
/*     */     //   1012: putfield L$9 : Ljava/lang/Object;
/*     */     //   1015: aload #23
/*     */     //   1017: iconst_4
/*     */     //   1018: putfield label : I
/*     */     //   1021: invokeinterface addCurrentAction : (Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1026: dup
/*     */     //   1027: aload #24
/*     */     //   1029: if_acmpne -> 1111
/*     */     //   1032: aload #24
/*     */     //   1034: areturn
/*     */     //   1035: aload #23
/*     */     //   1037: getfield L$6 : Ljava/lang/Object;
/*     */     //   1040: checkcast kotlinx/coroutines/Deferred
/*     */     //   1043: astore #17
/*     */     //   1045: aload #23
/*     */     //   1047: getfield L$5 : Ljava/lang/Object;
/*     */     //   1050: checkcast com/intellij/ml/llm/matterhorn/HumanInLoop
/*     */     //   1053: astore #13
/*     */     //   1055: aload #23
/*     */     //   1057: getfield L$4 : Ljava/lang/Object;
/*     */     //   1060: checkcast java/lang/String
/*     */     //   1063: astore #12
/*     */     //   1065: aload #23
/*     */     //   1067: getfield L$3 : Ljava/lang/Object;
/*     */     //   1070: checkcast java/lang/StringBuilder
/*     */     //   1073: astore #8
/*     */     //   1075: aload #23
/*     */     //   1077: getfield L$2 : Ljava/lang/Object;
/*     */     //   1080: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   1083: astore #7
/*     */     //   1085: aload #23
/*     */     //   1087: getfield L$1 : Ljava/lang/Object;
/*     */     //   1090: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1093: astore_2
/*     */     //   1094: aload #23
/*     */     //   1096: getfield L$0 : Ljava/lang/Object;
/*     */     //   1099: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1102: astore_1
/*     */     //   1103: nop
/*     */     //   1104: aload #22
/*     */     //   1106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1109: aload #22
/*     */     //   1111: pop
/*     */     //   1112: nop
/*     */     //   1113: aload #17
/*     */     //   1115: aload #23
/*     */     //   1117: aload #23
/*     */     //   1119: aload_1
/*     */     //   1120: putfield L$0 : Ljava/lang/Object;
/*     */     //   1123: aload #23
/*     */     //   1125: aload_2
/*     */     //   1126: putfield L$1 : Ljava/lang/Object;
/*     */     //   1129: aload #23
/*     */     //   1131: aload #7
/*     */     //   1133: putfield L$2 : Ljava/lang/Object;
/*     */     //   1136: aload #23
/*     */     //   1138: aload #8
/*     */     //   1140: putfield L$3 : Ljava/lang/Object;
/*     */     //   1143: aload #23
/*     */     //   1145: aload #12
/*     */     //   1147: putfield L$4 : Ljava/lang/Object;
/*     */     //   1150: aload #23
/*     */     //   1152: aload #13
/*     */     //   1154: putfield L$5 : Ljava/lang/Object;
/*     */     //   1157: aload #23
/*     */     //   1159: aload #17
/*     */     //   1161: putfield L$6 : Ljava/lang/Object;
/*     */     //   1164: aload #23
/*     */     //   1166: iconst_5
/*     */     //   1167: putfield label : I
/*     */     //   1170: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1175: dup
/*     */     //   1176: aload #24
/*     */     //   1178: if_acmpne -> 1260
/*     */     //   1181: aload #24
/*     */     //   1183: areturn
/*     */     //   1184: aload #23
/*     */     //   1186: getfield L$6 : Ljava/lang/Object;
/*     */     //   1189: checkcast kotlinx/coroutines/Deferred
/*     */     //   1192: astore #17
/*     */     //   1194: aload #23
/*     */     //   1196: getfield L$5 : Ljava/lang/Object;
/*     */     //   1199: checkcast com/intellij/ml/llm/matterhorn/HumanInLoop
/*     */     //   1202: astore #13
/*     */     //   1204: aload #23
/*     */     //   1206: getfield L$4 : Ljava/lang/Object;
/*     */     //   1209: checkcast java/lang/String
/*     */     //   1212: astore #12
/*     */     //   1214: aload #23
/*     */     //   1216: getfield L$3 : Ljava/lang/Object;
/*     */     //   1219: checkcast java/lang/StringBuilder
/*     */     //   1222: astore #8
/*     */     //   1224: aload #23
/*     */     //   1226: getfield L$2 : Ljava/lang/Object;
/*     */     //   1229: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   1232: astore #7
/*     */     //   1234: aload #23
/*     */     //   1236: getfield L$1 : Ljava/lang/Object;
/*     */     //   1239: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1242: astore_2
/*     */     //   1243: aload #23
/*     */     //   1245: getfield L$0 : Ljava/lang/Object;
/*     */     //   1248: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1251: astore_1
/*     */     //   1252: nop
/*     */     //   1253: aload #22
/*     */     //   1255: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1258: aload #22
/*     */     //   1260: checkcast kotlin/Pair
/*     */     //   1263: astore #18
/*     */     //   1265: aload #18
/*     */     //   1267: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   1270: checkcast java/util/List
/*     */     //   1273: astore #19
/*     */     //   1275: aload #18
/*     */     //   1277: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   1280: checkcast java/lang/String
/*     */     //   1283: astore #20
/*     */     //   1285: aload_2
/*     */     //   1286: aload #19
/*     */     //   1288: invokestatic createEditPathMarker : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Ljava/util/List;)V
/*     */     //   1291: aload #8
/*     */     //   1293: aload #20
/*     */     //   1295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1298: astore #18
/*     */     //   1300: aload #13
/*     */     //   1302: aload #17
/*     */     //   1304: checkcast kotlinx/coroutines/Job
/*     */     //   1307: aload #12
/*     */     //   1309: aload #23
/*     */     //   1311: aload #23
/*     */     //   1313: aload_1
/*     */     //   1314: putfield L$0 : Ljava/lang/Object;
/*     */     //   1317: aload #23
/*     */     //   1319: aload_2
/*     */     //   1320: putfield L$1 : Ljava/lang/Object;
/*     */     //   1323: aload #23
/*     */     //   1325: aload #7
/*     */     //   1327: putfield L$2 : Ljava/lang/Object;
/*     */     //   1330: aload #23
/*     */     //   1332: aload #8
/*     */     //   1334: putfield L$3 : Ljava/lang/Object;
/*     */     //   1337: aload #23
/*     */     //   1339: aload #18
/*     */     //   1341: putfield L$4 : Ljava/lang/Object;
/*     */     //   1344: aload #23
/*     */     //   1346: aconst_null
/*     */     //   1347: putfield L$5 : Ljava/lang/Object;
/*     */     //   1350: aload #23
/*     */     //   1352: aconst_null
/*     */     //   1353: putfield L$6 : Ljava/lang/Object;
/*     */     //   1356: aload #23
/*     */     //   1358: bipush #6
/*     */     //   1360: putfield label : I
/*     */     //   1363: invokeinterface removeCurrentAction : (Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1368: dup
/*     */     //   1369: aload #24
/*     */     //   1371: if_acmpne -> 1433
/*     */     //   1374: aload #24
/*     */     //   1376: areturn
/*     */     //   1377: aload #23
/*     */     //   1379: getfield L$4 : Ljava/lang/Object;
/*     */     //   1382: checkcast java/lang/StringBuilder
/*     */     //   1385: astore #18
/*     */     //   1387: aload #23
/*     */     //   1389: getfield L$3 : Ljava/lang/Object;
/*     */     //   1392: checkcast java/lang/StringBuilder
/*     */     //   1395: astore #8
/*     */     //   1397: aload #23
/*     */     //   1399: getfield L$2 : Ljava/lang/Object;
/*     */     //   1402: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   1405: astore #7
/*     */     //   1407: aload #23
/*     */     //   1409: getfield L$1 : Ljava/lang/Object;
/*     */     //   1412: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1415: astore_2
/*     */     //   1416: aload #23
/*     */     //   1418: getfield L$0 : Ljava/lang/Object;
/*     */     //   1421: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1424: astore_1
/*     */     //   1425: nop
/*     */     //   1426: aload #22
/*     */     //   1428: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1431: aload #22
/*     */     //   1433: pop
/*     */     //   1434: goto -> 1696
/*     */     //   1437: astore #19
/*     */     //   1439: ldc_w 'ERROR: User cancelled the action, try something else or run in background'
/*     */     //   1442: astore #20
/*     */     //   1444: aload #13
/*     */     //   1446: aload #17
/*     */     //   1448: checkcast kotlinx/coroutines/Job
/*     */     //   1451: aload #12
/*     */     //   1453: aload #23
/*     */     //   1455: aload #23
/*     */     //   1457: aload_1
/*     */     //   1458: putfield L$0 : Ljava/lang/Object;
/*     */     //   1461: aload #23
/*     */     //   1463: aload_2
/*     */     //   1464: putfield L$1 : Ljava/lang/Object;
/*     */     //   1467: aload #23
/*     */     //   1469: aload #20
/*     */     //   1471: putfield L$2 : Ljava/lang/Object;
/*     */     //   1474: aload #23
/*     */     //   1476: aconst_null
/*     */     //   1477: putfield L$3 : Ljava/lang/Object;
/*     */     //   1480: aload #23
/*     */     //   1482: aconst_null
/*     */     //   1483: putfield L$4 : Ljava/lang/Object;
/*     */     //   1486: aload #23
/*     */     //   1488: aconst_null
/*     */     //   1489: putfield L$5 : Ljava/lang/Object;
/*     */     //   1492: aload #23
/*     */     //   1494: aconst_null
/*     */     //   1495: putfield L$6 : Ljava/lang/Object;
/*     */     //   1498: aload #23
/*     */     //   1500: bipush #7
/*     */     //   1502: putfield label : I
/*     */     //   1505: invokeinterface removeCurrentAction : (Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1510: dup
/*     */     //   1511: aload #24
/*     */     //   1513: if_acmpne -> 1555
/*     */     //   1516: aload #24
/*     */     //   1518: areturn
/*     */     //   1519: aload #23
/*     */     //   1521: getfield L$2 : Ljava/lang/Object;
/*     */     //   1524: checkcast java/lang/String
/*     */     //   1527: astore #20
/*     */     //   1529: aload #23
/*     */     //   1531: getfield L$1 : Ljava/lang/Object;
/*     */     //   1534: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1537: astore_2
/*     */     //   1538: aload #23
/*     */     //   1540: getfield L$0 : Ljava/lang/Object;
/*     */     //   1543: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1546: astore_1
/*     */     //   1547: nop
/*     */     //   1548: aload #22
/*     */     //   1550: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1553: aload #22
/*     */     //   1555: pop
/*     */     //   1556: aload_2
/*     */     //   1557: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1562: new com/intellij/ml/llm/matterhorn/ej/core/AfterStepFinishedEvent
/*     */     //   1565: dup
/*     */     //   1566: aload_1
/*     */     //   1567: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   1570: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   1573: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   1576: aload #20
/*     */     //   1578: areturn
/*     */     //   1579: astore #19
/*     */     //   1581: aload #13
/*     */     //   1583: aload #17
/*     */     //   1585: checkcast kotlinx/coroutines/Job
/*     */     //   1588: aload #12
/*     */     //   1590: aload #23
/*     */     //   1592: aload #23
/*     */     //   1594: aload_1
/*     */     //   1595: putfield L$0 : Ljava/lang/Object;
/*     */     //   1598: aload #23
/*     */     //   1600: aload_2
/*     */     //   1601: putfield L$1 : Ljava/lang/Object;
/*     */     //   1604: aload #23
/*     */     //   1606: aload #19
/*     */     //   1608: putfield L$2 : Ljava/lang/Object;
/*     */     //   1611: aload #23
/*     */     //   1613: aconst_null
/*     */     //   1614: putfield L$3 : Ljava/lang/Object;
/*     */     //   1617: aload #23
/*     */     //   1619: aconst_null
/*     */     //   1620: putfield L$4 : Ljava/lang/Object;
/*     */     //   1623: aload #23
/*     */     //   1625: aconst_null
/*     */     //   1626: putfield L$5 : Ljava/lang/Object;
/*     */     //   1629: aload #23
/*     */     //   1631: aconst_null
/*     */     //   1632: putfield L$6 : Ljava/lang/Object;
/*     */     //   1635: aload #23
/*     */     //   1637: bipush #8
/*     */     //   1639: putfield label : I
/*     */     //   1642: invokeinterface removeCurrentAction : (Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   1647: dup
/*     */     //   1648: aload #24
/*     */     //   1650: if_acmpne -> 1692
/*     */     //   1653: aload #24
/*     */     //   1655: areturn
/*     */     //   1656: aload #23
/*     */     //   1658: getfield L$2 : Ljava/lang/Object;
/*     */     //   1661: checkcast java/lang/Throwable
/*     */     //   1664: astore #19
/*     */     //   1666: aload #23
/*     */     //   1668: getfield L$1 : Ljava/lang/Object;
/*     */     //   1671: checkcast com/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext
/*     */     //   1674: astore_2
/*     */     //   1675: aload #23
/*     */     //   1677: getfield L$0 : Ljava/lang/Object;
/*     */     //   1680: checkcast com/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest
/*     */     //   1683: astore_1
/*     */     //   1684: nop
/*     */     //   1685: aload #22
/*     */     //   1687: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   1690: aload #22
/*     */     //   1692: pop
/*     */     //   1693: aload #19
/*     */     //   1695: athrow
/*     */     //   1696: aload #18
/*     */     //   1698: goto -> 1712
/*     */     //   1701: aload_1
/*     */     //   1702: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   1707: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1712: pop
/*     */     //   1713: aload_2
/*     */     //   1714: invokeinterface getCurrentScreenPosition : ()Lcom/intellij/ml/llm/matterhorn/ej/core/FileWithLine;
/*     */     //   1719: dup
/*     */     //   1720: ifnull -> 1729
/*     */     //   1723: invokevirtual getFile : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1726: goto -> 1731
/*     */     //   1729: pop
/*     */     //   1730: aconst_null
/*     */     //   1731: astore #9
/*     */     //   1733: aload_2
/*     */     //   1734: invokeinterface getCurrentDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1739: invokevirtual toNioPath : ()Ljava/nio/file/Path;
/*     */     //   1742: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1745: astore #10
/*     */     //   1747: aload #9
/*     */     //   1749: dup
/*     */     //   1750: ifnull -> 1767
/*     */     //   1753: invokestatic toNioPathOrNull : (Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/nio/file/Path;
/*     */     //   1756: dup
/*     */     //   1757: ifnull -> 1767
/*     */     //   1760: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1763: dup
/*     */     //   1764: ifnonnull -> 1771
/*     */     //   1767: pop
/*     */     //   1768: ldc_w 'n/a'
/*     */     //   1771: astore #11
/*     */     //   1773: aload #7
/*     */     //   1775: instanceof com/intellij/ml/llm/matterhorn/ej/core/actions/AnswerAgentAction
/*     */     //   1778: ifne -> 1816
/*     */     //   1781: aload #8
/*     */     //   1783: ldc_w '\\n\\n'
/*     */     //   1786: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1789: pop
/*     */     //   1790: aload #8
/*     */     //   1792: aload #11
/*     */     //   1794: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1799: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1802: pop
/*     */     //   1803: aload #8
/*     */     //   1805: aload #10
/*     */     //   1807: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   1812: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   1815: pop
/*     */     //   1816: aload #8
/*     */     //   1818: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   1821: dup
/*     */     //   1822: ldc_w 'toString(...)'
/*     */     //   1825: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   1828: astore #12
/*     */     //   1830: aload_2
/*     */     //   1831: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1836: new com/intellij/ml/llm/matterhorn/ej/core/AfterStepFinishedEvent
/*     */     //   1839: dup
/*     */     //   1840: aload_1
/*     */     //   1841: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   1844: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   1847: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   1850: aload #12
/*     */     //   1852: areturn
/*     */     //   1853: astore #9
/*     */     //   1855: aload #9
/*     */     //   1857: athrow
/*     */     //   1858: astore #9
/*     */     //   1860: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   1863: ldc_w 'Failed to execute action'
/*     */     //   1866: aload #9
/*     */     //   1868: checkcast java/lang/Throwable
/*     */     //   1871: invokevirtual error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */     //   1874: aload #9
/*     */     //   1876: athrow
/*     */     //   1877: astore #9
/*     */     //   1879: aload_2
/*     */     //   1880: invokeinterface getExecutionContext : ()Lcom/intellij/ml/llm/matterhorn/ExecutionContext;
/*     */     //   1885: new com/intellij/ml/llm/matterhorn/ej/core/AfterStepFinishedEvent
/*     */     //   1888: dup
/*     */     //   1889: aload_1
/*     */     //   1890: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;)V
/*     */     //   1893: checkcast com/intellij/ml/llm/matterhorn/CustomArtifactEvent
/*     */     //   1896: invokevirtual sendEvent : (Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;)V
/*     */     //   1899: aload #9
/*     */     //   1901: athrow
/*     */     //   1902: new java/lang/IllegalStateException
/*     */     //   1905: dup
/*     */     //   1906: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   1909: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   1912: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #97	-> 63
/*     */     //   #103	-> 125
/*     */     //   #104	-> 145
/*     */     //   #415	-> 186
/*     */     //   #104	-> 189
/*     */     //   #104	-> 205
/*     */     //   #104	-> 214
/*     */     //   #105	-> 219
/*     */     //   #106	-> 220
/*     */     //   #107	-> 229
/*     */     //   #108	-> 234
/*     */     //   #97	-> 294
/*     */     //   #108	-> 353
/*     */     //   #109	-> 365
/*     */     //   #110	-> 372
/*     */     //   #97	-> 443
/*     */     //   #111	-> 524
/*     */     //   #110	-> 533
/*     */     //   #113	-> 535
/*     */     //   #115	-> 552
/*     */     //   #116	-> 562
/*     */     //   #117	-> 576
/*     */     //   #116	-> 589
/*     */     //   #116	-> 593
/*     */     //   #119	-> 595
/*     */     //   #120	-> 602
/*     */     //   #121	-> 611
/*     */     //   #122	-> 625
/*     */     //   #123	-> 631
/*     */     //   #122	-> 633
/*     */     //   #97	-> 726
/*     */     //   #125	-> 840
/*     */     //   #126	-> 848
/*     */     //   #190	-> 853
/*     */     //   #126	-> 875
/*     */     //   #129	-> 876
/*     */     //   #150	-> 900
/*     */     //   #152	-> 914
/*     */     //   #156	-> 939
/*     */     //   #97	-> 1032
/*     */     //   #158	-> 1111
/*     */     //   #159	-> 1113
/*     */     //   #97	-> 1181
/*     */     //   #159	-> 1260
/*     */     //   #160	-> 1285
/*     */     //   #161	-> 1291
/*     */     //   #165	-> 1300
/*     */     //   #97	-> 1374
/*     */     //   #166	-> 1433
/*     */     //   #162	-> 1437
/*     */     //   #163	-> 1439
/*     */     //   #165	-> 1444
/*     */     //   #97	-> 1516
/*     */     //   #190	-> 1555
/*     */     //   #163	-> 1578
/*     */     //   #165	-> 1579
/*     */     //   #97	-> 1653
/*     */     //   #165	-> 1692
/*     */     //   #169	-> 1701
/*     */     //   #172	-> 1713
/*     */     //   #174	-> 1733
/*     */     //   #176	-> 1747
/*     */     //   #178	-> 1773
/*     */     //   #179	-> 1781
/*     */     //   #180	-> 1790
/*     */     //   #181	-> 1803
/*     */     //   #183	-> 1816
/*     */     //   #190	-> 1830
/*     */     //   #183	-> 1852
/*     */     //   #184	-> 1853
/*     */     //   #185	-> 1855
/*     */     //   #186	-> 1858
/*     */     //   #187	-> 1860
/*     */     //   #188	-> 1874
/*     */     //   #190	-> 1877
/*     */     //   #97	-> 1902
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   125	80	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   205	92	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   345	101	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   513	76	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   589	1	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   590	139	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   827	208	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1103	81	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1252	125	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1425	12	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1437	82	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1547	29	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1579	77	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1684	166	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1853	5	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1858	19	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   1877	25	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   125	80	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   205	92	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   336	110	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   504	85	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   589	1	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   590	139	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   818	217	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1094	90	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1243	134	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1416	21	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1437	82	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1538	38	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1579	77	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1675	175	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1853	5	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1858	19	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   1877	25	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   125	80	3	availableActions	Ljava/util/List;
/*     */     //   205	9	3	availableActions	Ljava/util/List;
/*     */     //   214	20	3	availableActions	Ljava/util/List;
/*     */     //   365	81	3	availableActions	Ljava/util/List;
/*     */     //   495	67	3	availableActions	Ljava/util/List;
/*     */     //   125	80	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   205	9	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   214	20	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   365	81	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   486	103	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   589	1	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   590	139	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   809	39	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   876	24	4	maxOutputLineLength	Ljava/lang/Integer;
/*     */     //   125	80	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   205	9	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   214	20	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   365	81	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   476	113	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   589	1	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   590	139	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   799	49	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   876	24	5	maxOutputLines	Ljava/lang/Integer;
/*     */     //   219	78	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   327	119	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   466	123	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   589	1	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   590	139	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   789	246	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   1085	99	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   1234	143	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   1407	30	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   1696	85	7	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   229	68	8	output	Ljava/lang/StringBuilder;
/*     */     //   317	129	8	output	Ljava/lang/StringBuilder;
/*     */     //   456	133	8	output	Ljava/lang/StringBuilder;
/*     */     //   589	1	8	output	Ljava/lang/StringBuilder;
/*     */     //   590	139	8	output	Ljava/lang/StringBuilder;
/*     */     //   779	74	8	output	Ljava/lang/StringBuilder;
/*     */     //   876	159	8	output	Ljava/lang/StringBuilder;
/*     */     //   1075	109	8	output	Ljava/lang/StringBuilder;
/*     */     //   1224	153	8	output	Ljava/lang/StringBuilder;
/*     */     //   1397	40	8	output	Ljava/lang/StringBuilder;
/*     */     //   1696	134	8	output	Ljava/lang/StringBuilder;
/*     */     //   535	54	9	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   589	1	9	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   590	139	9	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   769	84	9	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   876	24	9	executor	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */     //   1733	23	9	file	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   1855	3	9	e	Ljava/util/concurrent/CancellationException;
/*     */     //   1860	17	9	e	Ljava/lang/Exception;
/*     */     //   552	37	10	workDir	Ljava/nio/file/Path;
/*     */     //   589	1	10	workDir	Ljava/nio/file/Path;
/*     */     //   590	139	10	workDir	Ljava/nio/file/Path;
/*     */     //   759	94	10	workDir	Ljava/nio/file/Path;
/*     */     //   876	24	10	workDir	Ljava/nio/file/Path;
/*     */     //   1747	69	10	currentDir	Ljava/lang/String;
/*     */     //   562	27	11	terminalRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;
/*     */     //   589	1	11	terminalRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;
/*     */     //   590	12	11	terminalRequest	Lcom/intellij/ml/llm/matterhorn/ej/core/TerminalCommandRequest;
/*     */     //   1773	30	11	fileName	Ljava/lang/String;
/*     */     //   186	19	12	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   602	127	12	command	Ljava/lang/String;
/*     */     //   749	104	12	command	Ljava/lang/String;
/*     */     //   876	159	12	command	Ljava/lang/String;
/*     */     //   1065	119	12	command	Ljava/lang/String;
/*     */     //   1214	154	12	command	Ljava/lang/String;
/*     */     //   1437	73	12	command	Ljava/lang/String;
/*     */     //   1579	68	12	command	Ljava/lang/String;
/*     */     //   625	104	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   739	114	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   876	159	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   1055	129	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   1204	164	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   1437	73	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   1579	68	13	humanInLoop	Lcom/intellij/ml/llm/matterhorn/HumanInLoop;
/*     */     //   573	16	14	warning	Ljava/lang/String;
/*     */     //   840	13	14	humanInLoopResponse	Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;
/*     */     //   900	39	15	action	Lkotlin/jvm/functions/Function1;
/*     */     //   914	25	16	scope	Lkotlinx/coroutines/CoroutineScope;
/*     */     //   939	96	17	job	Lkotlinx/coroutines/Deferred;
/*     */     //   1045	139	17	job	Lkotlinx/coroutines/Deferred;
/*     */     //   1194	174	17	job	Lkotlinx/coroutines/Deferred;
/*     */     //   1437	73	17	job	Lkotlinx/coroutines/Deferred;
/*     */     //   1579	68	17	job	Lkotlinx/coroutines/Deferred;
/*     */     //   1275	23	19	changes	Ljava/util/List;
/*     */     //   1285	13	20	res	Ljava/lang/String;
/*     */     //   189	16	13	$i$a$-find-AgentAction$Companion$executeActionRequest$action$1	I
/*     */     //   576	13	15	$i$a$-let-AgentAction$Companion$executeActionRequest$2	I
/*     */     //   0	1913	6	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	1849	23	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	1842	22	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   219	288	1853	java/util/concurrent/CancellationException
/*     */     //   219	288	1858	java/lang/Exception
/*     */     //   219	288	1877	finally
/*     */     //   345	437	1853	java/util/concurrent/CancellationException
/*     */     //   345	437	1858	java/lang/Exception
/*     */     //   345	437	1877	finally
/*     */     //   513	720	1853	java/util/concurrent/CancellationException
/*     */     //   513	720	1858	java/lang/Exception
/*     */     //   513	720	1877	finally
/*     */     //   827	853	1853	java/util/concurrent/CancellationException
/*     */     //   827	853	1858	java/lang/Exception
/*     */     //   827	853	1877	finally
/*     */     //   876	1026	1853	java/util/concurrent/CancellationException
/*     */     //   876	1026	1858	java/lang/Exception
/*     */     //   876	1026	1877	finally
/*     */     //   1103	1175	1853	java/util/concurrent/CancellationException
/*     */     //   1103	1175	1858	java/lang/Exception
/*     */     //   1103	1175	1877	finally
/*     */     //   1112	1175	1437	java/util/concurrent/CancellationException
/*     */     //   1112	1175	1579	finally
/*     */     //   1252	1300	1437	java/util/concurrent/CancellationException
/*     */     //   1252	1300	1579	finally
/*     */     //   1252	1368	1853	java/util/concurrent/CancellationException
/*     */     //   1252	1368	1858	java/lang/Exception
/*     */     //   1252	1368	1877	finally
/*     */     //   1425	1510	1853	java/util/concurrent/CancellationException
/*     */     //   1425	1510	1858	java/lang/Exception
/*     */     //   1425	1510	1877	finally
/*     */     //   1437	1444	1579	finally
/*     */     //   1547	1556	1853	java/util/concurrent/CancellationException
/*     */     //   1547	1556	1858	java/lang/Exception
/*     */     //   1547	1556	1877	finally
/*     */     //   1579	1581	1579	finally
/*     */     //   1579	1647	1853	java/util/concurrent/CancellationException
/*     */     //   1579	1647	1858	java/lang/Exception
/*     */     //   1579	1647	1877	finally
/*     */     //   1684	1830	1853	java/util/concurrent/CancellationException
/*     */     //   1684	1830	1858	java/lang/Exception
/*     */     //   1684	1830	1877	finally
/*     */     //   1853	1858	1877	finally
/*     */     //   1858	1877	1877	finally
/*     */     //   1877	1879	1877	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentActions.kt", l = {108, 110, 122, 156, 159, 165, 165, 165}, i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 7}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$0", "L$1"}, n = {"request", "context", "action", "output", "request", "context", "availableActions", "maxOutputLineLength", "maxOutputLines", "action", "output", "request", "context", "maxOutputLineLength", "maxOutputLines", "action", "output", "executor", "workDir", "command", "humanInLoop", "request", "context", "action", "output", "command", "humanInLoop", "job", "request", "context", "action", "output", "command", "humanInLoop", "job", "request", "context", "action", "output", "request", "context", "request", "context"}, m = "executeActionRequest", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentAction$Companion$executeActionRequest$1 extends ContinuationImpl {
/*     */     Object L$0;
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
/*     */     AgentAction$Companion$executeActionRequest$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentAction.Companion.this.executeActionRequest(null, null, null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentActions.kt", l = {130, 136, 137, 147}, i = {1, 2}, s = {"L$0", "L$0"}, n = {"commandExecutionResult", "commandExecutionResult"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion$executeActionRequest$action$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\020\016\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", ""})
/*     */   static final class AgentAction$Companion$executeActionRequest$action$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     AgentAction$Companion$executeActionRequest$action$2(ExecutionSession $executor, String $command, Path $workDir, ExecutionAgentContext $context, Integer $maxOutputLineLength, Integer $maxOutputLines, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #5
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 312, 0 -> 44, 1 -> 84, 2 -> 153, 3 -> 202, 4 -> 306
/*     */       //   44: aload_1
/*     */       //   45: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   48: aload_0
/*     */       //   49: getfield $executor : Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;
/*     */       //   52: aload_0
/*     */       //   53: getfield $command : Ljava/lang/String;
/*     */       //   56: aconst_null
/*     */       //   57: aload_0
/*     */       //   58: getfield $workDir : Ljava/nio/file/Path;
/*     */       //   61: aload_0
/*     */       //   62: checkcast kotlin/coroutines/Continuation
/*     */       //   65: iconst_2
/*     */       //   66: aconst_null
/*     */       //   67: aload_0
/*     */       //   68: iconst_1
/*     */       //   69: putfield label : I
/*     */       //   72: invokestatic execute$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionSession;Ljava/lang/String;Ljava/lang/Long;Ljava/nio/file/Path;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   75: dup
/*     */       //   76: aload #5
/*     */       //   78: if_acmpne -> 89
/*     */       //   81: aload #5
/*     */       //   83: areturn
/*     */       //   84: aload_1
/*     */       //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   88: aload_1
/*     */       //   89: checkcast com/intellij/ml/llm/matterhorn/ej/core/Result
/*     */       //   92: aconst_null
/*     */       //   93: iconst_1
/*     */       //   94: aconst_null
/*     */       //   95: invokestatic unwrap$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/Result;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Ljava/lang/Object;
/*     */       //   98: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */       //   101: astore_2
/*     */       //   102: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion.$$INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */       //   105: aload_0
/*     */       //   106: getfield $command : Ljava/lang/String;
/*     */       //   109: invokevirtual isReadonlyBashCommand : (Ljava/lang/String;)Z
/*     */       //   112: ifne -> 216
/*     */       //   115: ldc2_w 1000
/*     */       //   118: invokestatic ofMillis : (J)Ljava/time/Duration;
/*     */       //   121: dup
/*     */       //   122: ldc 'ofMillis(...)'
/*     */       //   124: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   127: aload_0
/*     */       //   128: checkcast kotlin/coroutines/Continuation
/*     */       //   131: aload_0
/*     */       //   132: aload_2
/*     */       //   133: putfield L$0 : Ljava/lang/Object;
/*     */       //   136: aload_0
/*     */       //   137: iconst_2
/*     */       //   138: putfield label : I
/*     */       //   141: invokestatic delay : (Ljava/time/Duration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   144: dup
/*     */       //   145: aload #5
/*     */       //   147: if_acmpne -> 166
/*     */       //   150: aload #5
/*     */       //   152: areturn
/*     */       //   153: aload_0
/*     */       //   154: getfield L$0 : Ljava/lang/Object;
/*     */       //   157: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */       //   160: astore_2
/*     */       //   161: aload_1
/*     */       //   162: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   165: aload_1
/*     */       //   166: pop
/*     */       //   167: aload_0
/*     */       //   168: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   171: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;)Lkotlin/jvm/functions/Function0;
/*     */       //   176: aload_0
/*     */       //   177: checkcast kotlin/coroutines/Continuation
/*     */       //   180: aload_0
/*     */       //   181: aload_2
/*     */       //   182: putfield L$0 : Ljava/lang/Object;
/*     */       //   185: aload_0
/*     */       //   186: iconst_3
/*     */       //   187: putfield label : I
/*     */       //   190: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   193: dup
/*     */       //   194: aload #5
/*     */       //   196: if_acmpne -> 215
/*     */       //   199: aload #5
/*     */       //   201: areturn
/*     */       //   202: aload_0
/*     */       //   203: getfield L$0 : Ljava/lang/Object;
/*     */       //   206: checkcast com/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult
/*     */       //   209: astore_2
/*     */       //   210: aload_1
/*     */       //   211: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   214: aload_1
/*     */       //   215: pop
/*     */       //   216: aload_2
/*     */       //   217: invokevirtual getPathAfterExecution : ()Ljava/nio/file/Path;
/*     */       //   220: astore_3
/*     */       //   221: aload_3
/*     */       //   222: iconst_1
/*     */       //   223: invokestatic findFile : (Ljava/nio/file/Path;Z)Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   226: astore #4
/*     */       //   228: aload #4
/*     */       //   230: ifnull -> 256
/*     */       //   233: aload_0
/*     */       //   234: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   237: invokeinterface getDisableDirChange : ()Z
/*     */       //   242: ifne -> 256
/*     */       //   245: aload_0
/*     */       //   246: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   249: aload #4
/*     */       //   251: invokeinterface setCurrentDir : (Lcom/intellij/openapi/vfs/VirtualFile;)V
/*     */       //   256: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion.$$INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */       //   259: aload_2
/*     */       //   260: invokevirtual getOutput : ()Ljava/lang/String;
/*     */       //   263: aload_0
/*     */       //   264: getfield $maxOutputLineLength : Ljava/lang/Integer;
/*     */       //   267: aload_0
/*     */       //   268: getfield $maxOutputLines : Ljava/lang/Integer;
/*     */       //   271: aload_0
/*     */       //   272: getfield $context : Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */       //   275: invokeinterface getProjectDir : ()Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   280: aload_0
/*     */       //   281: checkcast kotlin/coroutines/Continuation
/*     */       //   284: aload_0
/*     */       //   285: aconst_null
/*     */       //   286: putfield L$0 : Ljava/lang/Object;
/*     */       //   289: aload_0
/*     */       //   290: iconst_4
/*     */       //   291: putfield label : I
/*     */       //   294: invokevirtual truncateLongOutput$ej_core : (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/intellij/openapi/vfs/VirtualFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   297: dup
/*     */       //   298: aload #5
/*     */       //   300: if_acmpne -> 311
/*     */       //   303: aload #5
/*     */       //   305: areturn
/*     */       //   306: aload_1
/*     */       //   307: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   310: aload_1
/*     */       //   311: areturn
/*     */       //   312: new java/lang/IllegalStateException
/*     */       //   315: dup
/*     */       //   316: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   318: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   321: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #129	-> 3
/*     */       //   #130	-> 48
/*     */       //   #129	-> 81
/*     */       //   #131	-> 92
/*     */       //   #130	-> 101
/*     */       //   #135	-> 102
/*     */       //   #136	-> 115
/*     */       //   #129	-> 150
/*     */       //   #137	-> 166
/*     */       //   #129	-> 199
/*     */       //   #142	-> 215
/*     */       //   #143	-> 221
/*     */       //   #144	-> 228
/*     */       //   #145	-> 245
/*     */       //   #147	-> 256
/*     */       //   #129	-> 303
/*     */       //   #147	-> 311
/*     */       //   #129	-> 312
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   102	51	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */       //   161	41	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */       //   210	87	2	commandExecutionResult	Lcom/intellij/ml/llm/matterhorn/ej/core/run/ExecutionResult;
/*     */       //   221	7	3	currentDirPath	Ljava/nio/file/Path;
/*     */       //   228	28	4	currentDirVFile	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */       //   0	322	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$executeActionRequest$action$2;
/*     */       //   48	264	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super AgentAction$Companion$executeActionRequest$action$2> $completion) {
/*     */       return (Continuation<Unit>)new AgentAction$Companion$executeActionRequest$action$2(this.$executor, this.$command, this.$workDir, this.$context, this.$maxOutputLineLength, this.$maxOutputLines, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((AgentAction$Companion$executeActionRequest$action$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     private static final Unit invokeSuspend$lambda$0(ExecutionAgentContext $context) {
/*     */       $context.getProjectDir().refresh(false, true);
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "AgentActions.kt", l = {153}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion$executeActionRequest$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\002\020 \n\002\030\002\n\002\020\016\n\002\030\002\020\000\032\024\022\n\022\b\022\004\022\0020\0030\002\022\004\022\0020\0040\001*\0020\005H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AgentAction$Companion$executeActionRequest$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends List<? extends FileChange>, ? extends String>>, Object> {
/*     */     int label;
/*     */     
/*     */     AgentAction$Companion$executeActionRequest$job$1(ExecutionAgentContext $context, Function1<Continuation<? super String>, Object> $action, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (AgentActionsKt.trackFileChanges(this.$context.getProject(), this.$action, (Continuation<? super Pair<? extends List<FileChange>, ? extends String>>)this) == object)
/*     */             return object; 
/*     */           return AgentActionsKt.trackFileChanges(this.$context.getProject(), this.$action, (Continuation<? super Pair<? extends List<FileChange>, ? extends String>>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AgentAction$Companion$executeActionRequest$job$1> $completion) {
/*     */       return (Continuation<Unit>)new AgentAction$Companion$executeActionRequest$job$1(this.$context, this.$action, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AgentAction$Companion$executeActionRequest$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object reviewActionRequest(@NotNull ActionRequest request, @NotNull ExecutionAgentContext context, @NotNull List availableActions, boolean strict, @NotNull Continuation<? super String> $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #7
/*     */     //   6: aload #7
/*     */     //   8: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: invokeinterface hasNext : ()Z
/*     */     //   22: ifeq -> 68
/*     */     //   25: aload #8
/*     */     //   27: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   32: astore #9
/*     */     //   34: aload #9
/*     */     //   36: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   39: astore #10
/*     */     //   41: iconst_0
/*     */     //   42: istore #11
/*     */     //   44: aload #10
/*     */     //   46: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   51: aload_1
/*     */     //   52: invokeinterface getName : ()Ljava/lang/String;
/*     */     //   57: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   60: ifeq -> 15
/*     */     //   63: aload #9
/*     */     //   65: goto -> 69
/*     */     //   68: aconst_null
/*     */     //   69: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction
/*     */     //   72: astore #6
/*     */     //   74: iload #4
/*     */     //   76: ifeq -> 95
/*     */     //   79: aload #6
/*     */     //   81: dup
/*     */     //   82: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   85: aload_1
/*     */     //   86: aload_2
/*     */     //   87: aload #5
/*     */     //   89: invokeinterface reviewActionRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   94: areturn
/*     */     //   95: aload #6
/*     */     //   97: dup
/*     */     //   98: ifnull -> 111
/*     */     //   101: aload_1
/*     */     //   102: aload_2
/*     */     //   103: aload #5
/*     */     //   105: invokeinterface reviewActionRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   110: areturn
/*     */     //   111: pop
/*     */     //   112: aconst_null
/*     */     //   113: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #200	-> 0
/*     */     //   #415	-> 41
/*     */     //   #200	-> 44
/*     */     //   #200	-> 60
/*     */     //   #200	-> 69
/*     */     //   #201	-> 74
/*     */     //   #202	-> 79
/*     */     //   #204	-> 95
/*     */     //   #205	-> 110
/*     */     //   #204	-> 111
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   44	16	11	$i$a$-find-AgentAction$Companion$reviewActionRequest$action$1	I
/*     */     //   41	19	10	it	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   74	40	6	action	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction;
/*     */     //   0	114	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */     //   0	114	1	request	Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ActionRequest;
/*     */     //   0	114	2	context	Lcom/intellij/ml/llm/matterhorn/ej/core/ExecutionAgentContext;
/*     */     //   0	114	3	availableActions	Ljava/util/List;
/*     */     //   0	114	4	strict	Z
/*     */     //   0	114	5	$completion	Lkotlin/coroutines/Continuation;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object truncateLongOutput$ej_core(@NotNull String commandOutput, @Nullable Integer maxLineLength, @Nullable Integer maxLines, @NotNull VirtualFile projectRoot, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$truncateLongOutput$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$truncateLongOutput$1
/*     */     //   13: astore #9
/*     */     //   15: aload #9
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #9
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion$truncateLongOutput$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #9
/*     */     //   53: aload #9
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #8
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #10
/*     */     //   65: aload #9
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 304, 0 -> 96, 1 -> 196, 2 -> 263
/*     */     //   96: aload #8
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_1
/*     */     //   102: aload_3
/*     */     //   103: aload_2
/*     */     //   104: bipush #10
/*     */     //   106: invokestatic boxInt : (I)Ljava/lang/Integer;
/*     */     //   109: invokestatic truncateLongOutput : (Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Ljava/lang/String;
/*     */     //   112: astore #6
/*     */     //   114: aload_1
/*     */     //   115: checkcast java/lang/CharSequence
/*     */     //   118: invokestatic lines : (Ljava/lang/CharSequence;)Ljava/util/List;
/*     */     //   121: checkcast java/lang/Iterable
/*     */     //   124: ldc_w '\\n'
/*     */     //   127: checkcast java/lang/CharSequence
/*     */     //   130: aconst_null
/*     */     //   131: aconst_null
/*     */     //   132: iconst_0
/*     */     //   133: aconst_null
/*     */     //   134: aconst_null
/*     */     //   135: bipush #62
/*     */     //   137: aconst_null
/*     */     //   138: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   141: astore #7
/*     */     //   143: aload #7
/*     */     //   145: aload #6
/*     */     //   147: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   150: ifne -> 301
/*     */     //   153: aload #4
/*     */     //   155: aload #7
/*     */     //   157: <illegal opcode> invoke : (Lcom/intellij/openapi/vfs/VirtualFile;Ljava/lang/String;)Lkotlin/jvm/functions/Function0;
/*     */     //   162: aload #9
/*     */     //   164: aload #9
/*     */     //   166: aload #4
/*     */     //   168: putfield L$0 : Ljava/lang/Object;
/*     */     //   171: aload #9
/*     */     //   173: aload #6
/*     */     //   175: putfield L$1 : Ljava/lang/Object;
/*     */     //   178: aload #9
/*     */     //   180: iconst_1
/*     */     //   181: putfield label : I
/*     */     //   184: invokestatic writeAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   187: dup
/*     */     //   188: aload #10
/*     */     //   190: if_acmpne -> 223
/*     */     //   193: aload #10
/*     */     //   195: areturn
/*     */     //   196: aload #9
/*     */     //   198: getfield L$1 : Ljava/lang/Object;
/*     */     //   201: checkcast java/lang/String
/*     */     //   204: astore #6
/*     */     //   206: aload #9
/*     */     //   208: getfield L$0 : Ljava/lang/Object;
/*     */     //   211: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   214: astore #4
/*     */     //   216: aload #8
/*     */     //   218: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   221: aload #8
/*     */     //   223: pop
/*     */     //   224: <illegal opcode> invoke : ()Lkotlin/jvm/functions/Function0;
/*     */     //   229: aload #9
/*     */     //   231: aload #9
/*     */     //   233: aload #4
/*     */     //   235: putfield L$0 : Ljava/lang/Object;
/*     */     //   238: aload #9
/*     */     //   240: aload #6
/*     */     //   242: putfield L$1 : Ljava/lang/Object;
/*     */     //   245: aload #9
/*     */     //   247: iconst_2
/*     */     //   248: putfield label : I
/*     */     //   251: invokestatic edtWriteAction : (Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   254: dup
/*     */     //   255: aload #10
/*     */     //   257: if_acmpne -> 290
/*     */     //   260: aload #10
/*     */     //   262: areturn
/*     */     //   263: aload #9
/*     */     //   265: getfield L$1 : Ljava/lang/Object;
/*     */     //   268: checkcast java/lang/String
/*     */     //   271: astore #6
/*     */     //   273: aload #9
/*     */     //   275: getfield L$0 : Ljava/lang/Object;
/*     */     //   278: checkcast com/intellij/openapi/vfs/VirtualFile
/*     */     //   281: astore #4
/*     */     //   283: aload #8
/*     */     //   285: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   288: aload #8
/*     */     //   290: pop
/*     */     //   291: aload #6
/*     */     //   293: aload #4
/*     */     //   295: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/openapi/vfs/VirtualFile;)Ljava/lang/String;
/*     */     //   300: areturn
/*     */     //   301: aload #6
/*     */     //   303: areturn
/*     */     //   304: new java/lang/IllegalStateException
/*     */     //   307: dup
/*     */     //   308: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   311: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   314: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #207	-> 63
/*     */     //   #213	-> 101
/*     */     //   #217	-> 114
/*     */     //   #218	-> 143
/*     */     //   #219	-> 153
/*     */     //   #207	-> 193
/*     */     //   #225	-> 223
/*     */     //   #207	-> 260
/*     */     //   #229	-> 290
/*     */     //   #232	-> 301
/*     */     //   #207	-> 304
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	42	1	commandOutput	Ljava/lang/String;
/*     */     //   101	13	2	maxLineLength	Ljava/lang/Integer;
/*     */     //   101	13	3	maxLines	Ljava/lang/Integer;
/*     */     //   101	95	4	projectRoot	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   216	47	4	projectRoot	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   283	21	4	projectRoot	Lcom/intellij/openapi/vfs/VirtualFile;
/*     */     //   114	82	6	res	Ljava/lang/String;
/*     */     //   206	57	6	res	Ljava/lang/String;
/*     */     //   273	31	6	res	Ljava/lang/String;
/*     */     //   143	44	7	normalizedCommandOutput	Ljava/lang/String;
/*     */     //   0	315	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	251	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	244	8	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit truncateLongOutput$lambda$4(VirtualFile $projectRoot, String $normalizedCommandOutput) {
/*     */     Intrinsics.checkNotNullExpressionValue(Paths.get(".output.txt", new String[0]), "get(...)");
/*     */     Intrinsics.checkNotNull(FileUtil.INSTANCE.createFileCreatingDirsIfMissing($projectRoot, Paths.get(".output.txt", new String[0])));
/*     */     VirtualFile childFile = FileUtil.INSTANCE.createFileCreatingDirsIfMissing($projectRoot, Paths.get(".output.txt", new String[0]));
/*     */     Intrinsics.checkNotNull(FileDocumentManager.getInstance().getDocument(childFile));
/*     */     Document document = FileDocumentManager.getInstance().getDocument(childFile);
/*     */     document.setText($normalizedCommandOutput);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit truncateLongOutput$lambda$5() {
/*     */     FileDocumentManager.getInstance().saveAllDocuments();
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final Set<String> readonlyBashActions;
/*     */   @NotNull
/*     */   public static final String ERROR_MESSAGE_PREFIX = "ERROR:";
/*     */   @NotNull
/*     */   public static final String REJECTED_EXECUTION = "Human rejected execution of the given action. Try doing something else.";
/*     */   @NotNull
/*     */   public static final String CANCELED_EXECUTION = "ERROR: User cancelled the action, try something else or run in background";
/*     */   
/*     */   @DebugMetadata(f = "AgentActions.kt", l = {219, 225}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"projectRoot", "res", "projectRoot", "res"}, m = "truncateLongOutput$ej_core", c = "com.intellij.ml.llm.matterhorn.ej.core.AgentAction$Companion")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class AgentAction$Companion$truncateLongOutput$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     AgentAction$Companion$truncateLongOutput$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return AgentAction.Companion.this.truncateLongOutput$ej_core(null, null, null, null, (Continuation<? super String>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\AgentAction$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */