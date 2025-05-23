/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.TaskChainState;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.nio.file.Path;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000Z\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\r\n\002\030\002\n\000\n\002\030\002\n\002\b\004\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\006\b\007\030\000 .2\0020\001:\001.B\001\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\"\020\n\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013\022\"\020\017\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013\022\"\020\020\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013¢\006\004\b\021\020\022J\026\020\033\032\0020\0342\006\020\035\032\0020\036H@¢\006\002\020\037J(\020 \032\0020\0342\006\020!\032\0020\f2\b\020\"\032\004\030\0010#2\006\020$\032\0020#H@¢\006\002\020%J\036\020&\032\0020'2\006\020(\032\0020)2\006\020*\032\0020#H@¢\006\002\020+J\036\020,\032\0020'2\006\020-\032\0020)2\006\020*\032\0020#H@¢\006\002\020+R\016\020\002\032\0020\003X\004¢\006\002\n\000R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\004\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027R/\020\n\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013¢\006\n\n\002\020\031\032\004\b\n\020\030R/\020\017\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013¢\006\n\n\002\020\031\032\004\b\032\020\030R2\020\020\032\036\b\001\022\004\022\0020\f\022\n\022\b\022\004\022\0020\0050\r\022\006\022\004\030\0010\0160\013X\004¢\006\n\n\002\020\031\032\004\b\020\020\030¨\006/"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopExtension;", "updater", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;", "isBraveMode", "", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "taskId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "isMaybeSensitiveFile", "Lkotlin/Function2;", "Ljava/nio/file/Path;", "Lkotlin/coroutines/Continuation;", "", "mustIgnore", "isInProject", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;ZLcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "()Z", "getTaskChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getTaskId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "getMustIgnore", "shouldAllowAction", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowEdit", "path", "before", "", "after", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCurrentAction", "", "currentAction", "Lkotlinx/coroutines/Job;", "command", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentAction", "job", "Companion", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nHumanInLoopImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,129:1\n14#2:130\n*S KotlinDebug\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl\n*L\n35#1:130\n*E\n"})
/*     */ public final class HumanInLoopImpl implements HumanInLoopExtension {
/*  26 */   public HumanInLoopImpl(@NotNull TaskSnapshotUpdater updater, boolean isBraveMode, @NotNull TaskChainId taskChainId, @NotNull TaskId taskId, @NotNull Function2<Path, Continuation<? super Boolean>, Object> isMaybeSensitiveFile, @NotNull Function2<Path, Continuation<? super Boolean>, Object> mustIgnore, @NotNull Function2<Path, Continuation<? super Boolean>, Object> isInProject) { this.updater = updater;
/*  27 */     this.isBraveMode = isBraveMode;
/*  28 */     this.taskChainId = taskChainId;
/*  29 */     this.taskId = taskId;
/*  30 */     this.isMaybeSensitiveFile = isMaybeSensitiveFile;
/*  31 */     this.mustIgnore = mustIgnore;
/*  32 */     this.isInProject = isInProject; } public final boolean isBraveMode() { return this.isBraveMode; } @NotNull public final TaskChainId getTaskChainId() { return this.taskChainId; } @NotNull public Function2<Path, Continuation<? super Boolean>, Object> isInProject() { return this.isInProject; }
/*     */   @NotNull public final TaskId getTaskId() { return this.taskId; }
/*     */   @NotNull public final Function2<Path, Continuation<? super Boolean>, Object> isMaybeSensitiveFile() { return this.isMaybeSensitiveFile; } @NotNull public final Function2<Path, Continuation<? super Boolean>, Object> getMustIgnore() { return this.mustIgnore; } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\026\020\006\032\0020\0072\006\020\b\032\0020\t2\006\020\n\032\0020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "checkActionWhitelist", "", "action", "", "actionType", "Lcom/intellij/ml/llm/matterhorn/ActionType;", "ej-ui"}) @SourceDebugExtension({"SMAP\nHumanInLoopImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n31#2,2:130\n1755#3,3:132\n*S KotlinDebug\n*F\n+ 1 HumanInLoopImpl.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion\n*L\n38#1:130,2\n40#1:132,3\n*E\n"}) public static final class Companion {
/*     */     private Companion() {} public final boolean checkActionWhitelist(@NotNull String action, @NotNull ActionType actionType) { // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'action'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'actionType'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */       //   15: checkcast com/intellij/openapi/components/ComponentManager
/*     */       //   18: astore #4
/*     */       //   20: iconst_0
/*     */       //   21: istore #5
/*     */       //   23: ldc com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */       //   25: astore #6
/*     */       //   27: aload #4
/*     */       //   29: aload #6
/*     */       //   31: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */       //   36: dup
/*     */       //   37: ifnonnull -> 49
/*     */       //   40: pop
/*     */       //   41: aload #4
/*     */       //   43: aload #6
/*     */       //   45: invokestatic serviceNotFoundError : (Lcom/intellij/openapi/components/ComponentManager;Ljava/lang/Class;)Ljava/lang/IllegalStateException;
/*     */       //   48: athrow
/*     */       //   49: checkcast com/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent
/*     */       //   52: astore_3
/*     */       //   53: aload_3
/*     */       //   54: invokevirtual getActionWhiteList : ()Ljava/util/List;
/*     */       //   57: astore #4
/*     */       //   59: aload #4
/*     */       //   61: checkcast java/lang/Iterable
/*     */       //   64: astore #5
/*     */       //   66: iconst_0
/*     */       //   67: istore #6
/*     */       //   69: aload #5
/*     */       //   71: instanceof java/util/Collection
/*     */       //   74: ifeq -> 94
/*     */       //   77: aload #5
/*     */       //   79: checkcast java/util/Collection
/*     */       //   82: invokeinterface isEmpty : ()Z
/*     */       //   87: ifeq -> 94
/*     */       //   90: iconst_0
/*     */       //   91: goto -> 147
/*     */       //   94: aload #5
/*     */       //   96: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   101: astore #7
/*     */       //   103: aload #7
/*     */       //   105: invokeinterface hasNext : ()Z
/*     */       //   110: ifeq -> 146
/*     */       //   113: aload #7
/*     */       //   115: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   120: astore #8
/*     */       //   122: aload #8
/*     */       //   124: checkcast com/intellij/ml/llm/matterhorn/settings/ActionRule
/*     */       //   127: astore #9
/*     */       //   129: iconst_0
/*     */       //   130: istore #10
/*     */       //   132: aload #9
/*     */       //   134: aload_1
/*     */       //   135: aload_2
/*     */       //   136: invokevirtual check : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ActionType;)Z
/*     */       //   139: ifeq -> 103
/*     */       //   142: iconst_1
/*     */       //   143: goto -> 147
/*     */       //   146: iconst_0
/*     */       //   147: ireturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #38	-> 12
/*     */       //   #130	-> 23
/*     */       //   #131	-> 27
/*     */       //   #38	-> 49
/*     */       //   #39	-> 53
/*     */       //   #40	-> 59
/*     */       //   #132	-> 69
/*     */       //   #133	-> 94
/*     */       //   #40	-> 132
/*     */       //   #133	-> 139
/*     */       //   #134	-> 146
/*     */       //   #40	-> 147
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   23	26	5	$i$f$service	I
/*     */       //   27	22	6	serviceClass$iv	Ljava/lang/Class;
/*     */       //   20	29	4	$this$service$iv	Lcom/intellij/openapi/components/ComponentManager;
/*     */       //   132	7	10	$i$a$-any-HumanInLoopImpl$Companion$checkActionWhitelist$1	I
/*     */       //   129	10	9	it	Lcom/intellij/ml/llm/matterhorn/settings/ActionRule;
/*     */       //   122	24	8	element$iv	Ljava/lang/Object;
/*     */       //   69	78	6	$i$f$any	I
/*     */       //   66	81	5	$this$any$iv	Ljava/lang/Iterable;
/*     */       //   53	95	3	settings	Lcom/intellij/ml/llm/matterhorn/settings/MatterhornModelPersistentStateComponent;
/*     */       //   59	89	4	whitelist	Ljava/util/List;
/*     */       //   0	148	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion;
/*     */       //   0	148	1	action	Ljava/lang/String;
/*  35 */       //   0	148	2	actionType	Lcom/intellij/ml/llm/matterhorn/ActionType; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final TaskSnapshotUpdater updater; private final boolean isBraveMode; @NotNull private final TaskChainId taskChainId; @NotNull private final TaskId taskId; @NotNull private final Function2<Path, Continuation<? super Boolean>, Object> isMaybeSensitiveFile; @NotNull private final Function2<Path, Continuation<? super Boolean>, Object> mustIgnore; @NotNull private final Function2<Path, Continuation<? super Boolean>, Object> isInProject; public static final int $stable = 8; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 130 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(HumanInLoopImpl.class), "getInstance(...)"); } @Nullable public Object shouldAllowAction(@NotNull HumanInLoopAction action, @NotNull Continuation $completion) { // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowAction$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowAction$1
/*     */     //   11: astore #9
/*     */     //   13: aload #9
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #9
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowAction$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #9
/*     */     //   50: aload #9
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #8
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #10
/*     */     //   62: aload #9
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 681, 0 -> 108, 1 -> 231, 2 -> 310, 3 -> 430, 4 -> 537, 5 -> 599, 6 -> 666
/*     */     //   108: aload #8
/*     */     //   110: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   113: aload_1
/*     */     //   114: invokevirtual getAllowListActionName : ()Ljava/lang/String;
/*     */     //   117: astore_3
/*     */     //   118: aload_1
/*     */     //   119: invokevirtual getActionType : ()Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   122: astore #4
/*     */     //   124: aload_0
/*     */     //   125: getfield isBraveMode : Z
/*     */     //   128: ifne -> 175
/*     */     //   131: aload_1
/*     */     //   132: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction
/*     */     //   135: ifeq -> 154
/*     */     //   138: getstatic com/intellij/ml/llm/matterhorn/ej/core/AgentAction.Companion : Lcom/intellij/ml/llm/matterhorn/ej/core/AgentAction$Companion;
/*     */     //   141: aload_1
/*     */     //   142: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction$TerminalAction
/*     */     //   145: invokevirtual getCommand : ()Ljava/lang/String;
/*     */     //   148: invokevirtual isReadonlyBashCommand : (Ljava/lang/String;)Z
/*     */     //   151: ifne -> 175
/*     */     //   154: aload_3
/*     */     //   155: ifnull -> 179
/*     */     //   158: aload #4
/*     */     //   160: ifnull -> 179
/*     */     //   163: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl.Companion : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$Companion;
/*     */     //   166: aload_3
/*     */     //   167: aload #4
/*     */     //   169: invokevirtual checkActionWhitelist : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ActionType;)Z
/*     */     //   172: ifeq -> 179
/*     */     //   175: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */     //   178: areturn
/*     */     //   179: aload_1
/*     */     //   180: instanceof com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*     */     //   183: ifeq -> 348
/*     */     //   186: aload_0
/*     */     //   187: getfield mustIgnore : Lkotlin/jvm/functions/Function2;
/*     */     //   190: aload_1
/*     */     //   191: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*     */     //   194: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   197: aload #9
/*     */     //   199: aload #9
/*     */     //   201: aload_0
/*     */     //   202: putfield L$0 : Ljava/lang/Object;
/*     */     //   205: aload #9
/*     */     //   207: aload_1
/*     */     //   208: putfield L$1 : Ljava/lang/Object;
/*     */     //   211: aload #9
/*     */     //   213: iconst_1
/*     */     //   214: putfield label : I
/*     */     //   217: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   222: dup
/*     */     //   223: aload #10
/*     */     //   225: if_acmpne -> 256
/*     */     //   228: aload #10
/*     */     //   230: areturn
/*     */     //   231: aload #9
/*     */     //   233: getfield L$1 : Ljava/lang/Object;
/*     */     //   236: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   239: astore_1
/*     */     //   240: aload #9
/*     */     //   242: getfield L$0 : Ljava/lang/Object;
/*     */     //   245: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   248: astore_0
/*     */     //   249: aload #8
/*     */     //   251: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   254: aload #8
/*     */     //   256: checkcast java/lang/Boolean
/*     */     //   259: invokevirtual booleanValue : ()Z
/*     */     //   262: ifne -> 348
/*     */     //   265: aload_0
/*     */     //   266: invokevirtual isInProject : ()Lkotlin/jvm/functions/Function2;
/*     */     //   269: aload_1
/*     */     //   270: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction$ActionTouchingFile
/*     */     //   273: invokevirtual getPath : ()Ljava/nio/file/Path;
/*     */     //   276: aload #9
/*     */     //   278: aload #9
/*     */     //   280: aload_0
/*     */     //   281: putfield L$0 : Ljava/lang/Object;
/*     */     //   284: aload #9
/*     */     //   286: aload_1
/*     */     //   287: putfield L$1 : Ljava/lang/Object;
/*     */     //   290: aload #9
/*     */     //   292: iconst_2
/*     */     //   293: putfield label : I
/*     */     //   296: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   301: dup
/*     */     //   302: aload #10
/*     */     //   304: if_acmpne -> 335
/*     */     //   307: aload #10
/*     */     //   309: areturn
/*     */     //   310: aload #9
/*     */     //   312: getfield L$1 : Ljava/lang/Object;
/*     */     //   315: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   318: astore_1
/*     */     //   319: aload #9
/*     */     //   321: getfield L$0 : Ljava/lang/Object;
/*     */     //   324: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   327: astore_0
/*     */     //   328: aload #8
/*     */     //   330: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   333: aload #8
/*     */     //   335: checkcast java/lang/Boolean
/*     */     //   338: invokevirtual booleanValue : ()Z
/*     */     //   341: ifeq -> 348
/*     */     //   344: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */     //   347: areturn
/*     */     //   348: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   351: aload_1
/*     */     //   352: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;)Ljava/lang/String;
/*     */     //   357: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   360: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;
/*     */     //   363: aload_0
/*     */     //   364: getfield taskChainId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   367: aload_0
/*     */     //   368: getfield taskId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   371: invokevirtual logAskConfirmationShowed : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)V
/*     */     //   374: aconst_null
/*     */     //   375: iconst_1
/*     */     //   376: aconst_null
/*     */     //   377: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   380: astore #5
/*     */     //   382: aload_0
/*     */     //   383: getfield updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   386: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingUserInput : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   389: aload #9
/*     */     //   391: aload #9
/*     */     //   393: aload_0
/*     */     //   394: putfield L$0 : Ljava/lang/Object;
/*     */     //   397: aload #9
/*     */     //   399: aload_1
/*     */     //   400: putfield L$1 : Ljava/lang/Object;
/*     */     //   403: aload #9
/*     */     //   405: aload #5
/*     */     //   407: putfield L$2 : Ljava/lang/Object;
/*     */     //   410: aload #9
/*     */     //   412: iconst_3
/*     */     //   413: putfield label : I
/*     */     //   416: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   421: dup
/*     */     //   422: aload #10
/*     */     //   424: if_acmpne -> 465
/*     */     //   427: aload #10
/*     */     //   429: areturn
/*     */     //   430: aload #9
/*     */     //   432: getfield L$2 : Ljava/lang/Object;
/*     */     //   435: checkcast kotlinx/coroutines/CompletableDeferred
/*     */     //   438: astore #5
/*     */     //   440: aload #9
/*     */     //   442: getfield L$1 : Ljava/lang/Object;
/*     */     //   445: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopAction
/*     */     //   448: astore_1
/*     */     //   449: aload #9
/*     */     //   451: getfield L$0 : Ljava/lang/Object;
/*     */     //   454: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   457: astore_0
/*     */     //   458: aload #8
/*     */     //   460: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   463: aload #8
/*     */     //   465: pop
/*     */     //   466: aload_0
/*     */     //   467: getfield updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   470: new com/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest
/*     */     //   473: dup
/*     */     //   474: aload_1
/*     */     //   475: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowAction$2
/*     */     //   478: dup
/*     */     //   479: aload_0
/*     */     //   480: aload_1
/*     */     //   481: aload #5
/*     */     //   483: aconst_null
/*     */     //   484: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/Continuation;)V
/*     */     //   487: checkcast kotlin/jvm/functions/Function2
/*     */     //   490: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/jvm/functions/Function2;)V
/*     */     //   493: checkcast com/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest
/*     */     //   496: aload #9
/*     */     //   498: aload #9
/*     */     //   500: aload #5
/*     */     //   502: putfield L$0 : Ljava/lang/Object;
/*     */     //   505: aload #9
/*     */     //   507: aconst_null
/*     */     //   508: putfield L$1 : Ljava/lang/Object;
/*     */     //   511: aload #9
/*     */     //   513: aconst_null
/*     */     //   514: putfield L$2 : Ljava/lang/Object;
/*     */     //   517: aload #9
/*     */     //   519: iconst_4
/*     */     //   520: putfield label : I
/*     */     //   523: invokeinterface updateHumanInLoopRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   528: dup
/*     */     //   529: aload #10
/*     */     //   531: if_acmpne -> 554
/*     */     //   534: aload #10
/*     */     //   536: areturn
/*     */     //   537: aload #9
/*     */     //   539: getfield L$0 : Ljava/lang/Object;
/*     */     //   542: checkcast kotlinx/coroutines/CompletableDeferred
/*     */     //   545: astore #5
/*     */     //   547: aload #8
/*     */     //   549: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   552: aload #8
/*     */     //   554: pop
/*     */     //   555: nop
/*     */     //   556: ldc2_w 120000
/*     */     //   559: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowAction$3
/*     */     //   562: dup
/*     */     //   563: aload #5
/*     */     //   565: aconst_null
/*     */     //   566: invokespecial <init> : (Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/Continuation;)V
/*     */     //   569: checkcast kotlin/jvm/functions/Function2
/*     */     //   572: aload #9
/*     */     //   574: aload #9
/*     */     //   576: aload #5
/*     */     //   578: putfield L$0 : Ljava/lang/Object;
/*     */     //   581: aload #9
/*     */     //   583: iconst_5
/*     */     //   584: putfield label : I
/*     */     //   587: invokestatic withTimeout : (JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   590: dup
/*     */     //   591: aload #10
/*     */     //   593: if_acmpne -> 617
/*     */     //   596: aload #10
/*     */     //   598: areturn
/*     */     //   599: aload #9
/*     */     //   601: getfield L$0 : Ljava/lang/Object;
/*     */     //   604: checkcast kotlinx/coroutines/CompletableDeferred
/*     */     //   607: astore #5
/*     */     //   609: nop
/*     */     //   610: aload #8
/*     */     //   612: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   615: aload #8
/*     */     //   617: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   620: astore #6
/*     */     //   622: goto -> 678
/*     */     //   625: astore #7
/*     */     //   627: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   630: ldc 'User doesn't react on human-in-loop request for 120 seconds'
/*     */     //   632: invokevirtual warn : (Ljava/lang/String;)V
/*     */     //   635: aload #5
/*     */     //   637: aload #9
/*     */     //   639: aload #9
/*     */     //   641: aconst_null
/*     */     //   642: putfield L$0 : Ljava/lang/Object;
/*     */     //   645: aload #9
/*     */     //   647: bipush #6
/*     */     //   649: putfield label : I
/*     */     //   652: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   657: dup
/*     */     //   658: aload #10
/*     */     //   660: if_acmpne -> 673
/*     */     //   663: aload #10
/*     */     //   665: areturn
/*     */     //   666: aload #8
/*     */     //   668: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   671: aload #8
/*     */     //   673: checkcast com/intellij/ml/llm/matterhorn/HumanInLoopResponse
/*     */     //   676: astore #6
/*     */     //   678: aload #6
/*     */     //   680: areturn
/*     */     //   681: new java/lang/IllegalStateException
/*     */     //   684: dup
/*     */     //   685: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   688: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   691: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #45	-> 60
/*     */     //   #48	-> 113
/*     */     //   #49	-> 118
/*     */     //   #50	-> 124
/*     */     //   #51	-> 131
/*     */     //   #52	-> 154
/*     */     //   #54	-> 175
/*     */     //   #57	-> 179
/*     */     //   #58	-> 186
/*     */     //   #45	-> 228
/*     */     //   #58	-> 256
/*     */     //   #45	-> 307
/*     */     //   #58	-> 335
/*     */     //   #59	-> 344
/*     */     //   #63	-> 348
/*     */     //   #64	-> 360
/*     */     //   #65	-> 374
/*     */     //   #66	-> 382
/*     */     //   #45	-> 427
/*     */     //   #67	-> 465
/*     */     //   #68	-> 470
/*     */     //   #69	-> 474
/*     */     //   #67	-> 475
/*     */     //   #68	-> 490
/*     */     //   #67	-> 498
/*     */     //   #45	-> 534
/*     */     //   #78	-> 554
/*     */     //   #79	-> 556
/*     */     //   #45	-> 596
/*     */     //   #79	-> 617
/*     */     //   #82	-> 625
/*     */     //   #84	-> 627
/*     */     //   #86	-> 635
/*     */     //   #45	-> 663
/*     */     //   #78	-> 680
/*     */     //   #45	-> 681
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   113	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   179	52	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   249	61	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   328	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   348	82	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   458	32	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   113	62	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   179	52	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   240	70	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   319	25	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   348	82	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   449	41	1	action	Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;
/*     */     //   118	57	3	allowListActionName	Ljava/lang/String;
/*     */     //   124	51	4	actionType	Lcom/intellij/ml/llm/matterhorn/ActionType;
/*     */     //   382	48	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   440	97	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   547	52	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   609	13	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   625	32	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   0	692	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	631	9	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	624	8	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   555	590	625	kotlinx/coroutines/TimeoutCancellationException
/* 130 */     //   609	622	625	kotlinx/coroutines/TimeoutCancellationException } @DebugMetadata(f = "HumanInLoopImpl.kt", l = {58, 58, 66, 67, 79, 86}, i = {0, 0, 1, 1, 2, 2, 2, 3, 4}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$0"}, n = {"this", "action", "this", "action", "this", "action", "deferredResponse", "deferredResponse", "deferredResponse"}, m = "shouldAllowAction", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class HumanInLoopImpl$shouldAllowAction$1 extends ContinuationImpl { Object L$0; Object L$1; Object L$2; int label; HumanInLoopImpl$shouldAllowAction$1(Continuation $completion) { super($completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { this.result = $result; this.label |= Integer.MIN_VALUE; return HumanInLoopImpl.this.shouldAllowAction(null, (Continuation<? super HumanInLoopResponse>)this); } } @NotNull private static final Logger logger = Logger.getInstance(HumanInLoopImpl.class);
/*     */   
/*     */   @DebugMetadata(f = "HumanInLoopImpl.kt", l = {71, 72}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"response", "response"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl$shouldAllowAction$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "response", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;"})
/*     */   static final class HumanInLoopImpl$shouldAllowAction$2 extends SuspendLambda implements Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     HumanInLoopImpl$shouldAllowAction$2(HumanInLoopAction $action, CompletableDeferred<HumanInLoopResponse> $deferredResponse, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       HumanInLoopResponse response;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           this.L$0 = response;
/*     */           this.label = 1;
/*     */           if (HumanInLoopImpl.this.updater.updateHumanInLoopRequest(null, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateHumanInLoopRequest(null, (Continuation<? super Unit>)this);
/*     */           this.L$0 = response;
/*     */           this.label = 2;
/*     */           if (HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for action: " + this.$action);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = response;
/*     */           this.label = 2;
/*     */           if (HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for action: " + this.$action);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for action: " + this.$action);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super HumanInLoopImpl$shouldAllowAction$2> $completion) {
/*     */       HumanInLoopImpl$shouldAllowAction$2 humanInLoopImpl$shouldAllowAction$2 = new HumanInLoopImpl$shouldAllowAction$2(this.$action, this.$deferredResponse, $completion);
/*     */       humanInLoopImpl$shouldAllowAction$2.L$0 = value;
/*     */       return (Continuation<Unit>)humanInLoopImpl$shouldAllowAction$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(HumanInLoopResponse p1, Continuation<?> p2) {
/*     */       return ((HumanInLoopImpl$shouldAllowAction$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "HumanInLoopImpl.kt", l = {80}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl$shouldAllowAction$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class HumanInLoopImpl$shouldAllowAction$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HumanInLoopResponse>, Object> {
/*     */     int label;
/*     */     
/*     */     HumanInLoopImpl$shouldAllowAction$3(CompletableDeferred<HumanInLoopResponse> $deferredResponse, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$deferredResponse.await((Continuation)this) == object)
/*     */             return object; 
/*     */           return this.$deferredResponse.await((Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super HumanInLoopImpl$shouldAllowAction$3> $completion) {
/*     */       return (Continuation<Unit>)new HumanInLoopImpl$shouldAllowAction$3(this.$deferredResponse, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((HumanInLoopImpl$shouldAllowAction$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object shouldAllowEdit(@NotNull Path path, @Nullable String before, @NotNull String after, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowEdit$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowEdit$1
/*     */     //   13: astore #7
/*     */     //   15: aload #7
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #7
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowEdit$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #7
/*     */     //   53: aload #7
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #6
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #8
/*     */     //   65: aload #7
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 623, 0 -> 108, 1 -> 175, 2 -> 278, 3 -> 428, 4 -> 567, 5 -> 615
/*     */     //   108: aload #6
/*     */     //   110: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   113: aload_0
/*     */     //   114: getfield isBraveMode : Z
/*     */     //   117: ifeq -> 124
/*     */     //   120: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */     //   123: areturn
/*     */     //   124: aload_0
/*     */     //   125: getfield isMaybeSensitiveFile : Lkotlin/jvm/functions/Function2;
/*     */     //   128: aload_1
/*     */     //   129: aload #7
/*     */     //   131: aload #7
/*     */     //   133: aload_0
/*     */     //   134: putfield L$0 : Ljava/lang/Object;
/*     */     //   137: aload #7
/*     */     //   139: aload_1
/*     */     //   140: putfield L$1 : Ljava/lang/Object;
/*     */     //   143: aload #7
/*     */     //   145: aload_2
/*     */     //   146: putfield L$2 : Ljava/lang/Object;
/*     */     //   149: aload #7
/*     */     //   151: aload_3
/*     */     //   152: putfield L$3 : Ljava/lang/Object;
/*     */     //   155: aload #7
/*     */     //   157: iconst_1
/*     */     //   158: putfield label : I
/*     */     //   161: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   166: dup
/*     */     //   167: aload #8
/*     */     //   169: if_acmpne -> 218
/*     */     //   172: aload #8
/*     */     //   174: areturn
/*     */     //   175: aload #7
/*     */     //   177: getfield L$3 : Ljava/lang/Object;
/*     */     //   180: checkcast java/lang/String
/*     */     //   183: astore_3
/*     */     //   184: aload #7
/*     */     //   186: getfield L$2 : Ljava/lang/Object;
/*     */     //   189: checkcast java/lang/String
/*     */     //   192: astore_2
/*     */     //   193: aload #7
/*     */     //   195: getfield L$1 : Ljava/lang/Object;
/*     */     //   198: checkcast java/nio/file/Path
/*     */     //   201: astore_1
/*     */     //   202: aload #7
/*     */     //   204: getfield L$0 : Ljava/lang/Object;
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   210: astore_0
/*     */     //   211: aload #6
/*     */     //   213: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   216: aload #6
/*     */     //   218: checkcast java/lang/Boolean
/*     */     //   221: invokevirtual booleanValue : ()Z
/*     */     //   224: ifne -> 334
/*     */     //   227: aload_0
/*     */     //   228: getfield mustIgnore : Lkotlin/jvm/functions/Function2;
/*     */     //   231: aload_1
/*     */     //   232: aload #7
/*     */     //   234: aload #7
/*     */     //   236: aload_0
/*     */     //   237: putfield L$0 : Ljava/lang/Object;
/*     */     //   240: aload #7
/*     */     //   242: aload_1
/*     */     //   243: putfield L$1 : Ljava/lang/Object;
/*     */     //   246: aload #7
/*     */     //   248: aload_2
/*     */     //   249: putfield L$2 : Ljava/lang/Object;
/*     */     //   252: aload #7
/*     */     //   254: aload_3
/*     */     //   255: putfield L$3 : Ljava/lang/Object;
/*     */     //   258: aload #7
/*     */     //   260: iconst_2
/*     */     //   261: putfield label : I
/*     */     //   264: invokeinterface invoke : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   269: dup
/*     */     //   270: aload #8
/*     */     //   272: if_acmpne -> 321
/*     */     //   275: aload #8
/*     */     //   277: areturn
/*     */     //   278: aload #7
/*     */     //   280: getfield L$3 : Ljava/lang/Object;
/*     */     //   283: checkcast java/lang/String
/*     */     //   286: astore_3
/*     */     //   287: aload #7
/*     */     //   289: getfield L$2 : Ljava/lang/Object;
/*     */     //   292: checkcast java/lang/String
/*     */     //   295: astore_2
/*     */     //   296: aload #7
/*     */     //   298: getfield L$1 : Ljava/lang/Object;
/*     */     //   301: checkcast java/nio/file/Path
/*     */     //   304: astore_1
/*     */     //   305: aload #7
/*     */     //   307: getfield L$0 : Ljava/lang/Object;
/*     */     //   310: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   313: astore_0
/*     */     //   314: aload #6
/*     */     //   316: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   319: aload #6
/*     */     //   321: checkcast java/lang/Boolean
/*     */     //   324: invokevirtual booleanValue : ()Z
/*     */     //   327: ifne -> 334
/*     */     //   330: getstatic com/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree.INSTANCE : Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse$Agree;
/*     */     //   333: areturn
/*     */     //   334: getstatic com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl.logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   337: aload_1
/*     */     //   338: <illegal opcode> makeConcatWithConstants : (Ljava/nio/file/Path;)Ljava/lang/String;
/*     */     //   343: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   346: getstatic com/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction.INSTANCE : Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/CompositeUiAction;
/*     */     //   349: aload_0
/*     */     //   350: getfield taskChainId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;
/*     */     //   353: aload_0
/*     */     //   354: getfield taskId : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;
/*     */     //   357: invokevirtual logAskConfirmationShowed : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskId;)V
/*     */     //   360: aconst_null
/*     */     //   361: iconst_1
/*     */     //   362: aconst_null
/*     */     //   363: invokestatic CompletableDeferred$default : (Lkotlinx/coroutines/Job;ILjava/lang/Object;)Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   366: astore #5
/*     */     //   368: aload_0
/*     */     //   369: getfield updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   372: getstatic com/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState.WaitingUserInput : Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;
/*     */     //   375: aload #7
/*     */     //   377: aload #7
/*     */     //   379: aload_0
/*     */     //   380: putfield L$0 : Ljava/lang/Object;
/*     */     //   383: aload #7
/*     */     //   385: aload_1
/*     */     //   386: putfield L$1 : Ljava/lang/Object;
/*     */     //   389: aload #7
/*     */     //   391: aload_2
/*     */     //   392: putfield L$2 : Ljava/lang/Object;
/*     */     //   395: aload #7
/*     */     //   397: aload_3
/*     */     //   398: putfield L$3 : Ljava/lang/Object;
/*     */     //   401: aload #7
/*     */     //   403: aload #5
/*     */     //   405: putfield L$4 : Ljava/lang/Object;
/*     */     //   408: aload #7
/*     */     //   410: iconst_3
/*     */     //   411: putfield label : I
/*     */     //   414: invokeinterface updateState : (Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   419: dup
/*     */     //   420: aload #8
/*     */     //   422: if_acmpne -> 481
/*     */     //   425: aload #8
/*     */     //   427: areturn
/*     */     //   428: aload #7
/*     */     //   430: getfield L$4 : Ljava/lang/Object;
/*     */     //   433: checkcast kotlinx/coroutines/CompletableDeferred
/*     */     //   436: astore #5
/*     */     //   438: aload #7
/*     */     //   440: getfield L$3 : Ljava/lang/Object;
/*     */     //   443: checkcast java/lang/String
/*     */     //   446: astore_3
/*     */     //   447: aload #7
/*     */     //   449: getfield L$2 : Ljava/lang/Object;
/*     */     //   452: checkcast java/lang/String
/*     */     //   455: astore_2
/*     */     //   456: aload #7
/*     */     //   458: getfield L$1 : Ljava/lang/Object;
/*     */     //   461: checkcast java/nio/file/Path
/*     */     //   464: astore_1
/*     */     //   465: aload #7
/*     */     //   467: getfield L$0 : Ljava/lang/Object;
/*     */     //   470: checkcast com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl
/*     */     //   473: astore_0
/*     */     //   474: aload #6
/*     */     //   476: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   479: aload #6
/*     */     //   481: pop
/*     */     //   482: aload_0
/*     */     //   483: getfield updater : Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/TaskSnapshotUpdater;
/*     */     //   486: new com/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest
/*     */     //   489: dup
/*     */     //   490: aload_1
/*     */     //   491: aload_2
/*     */     //   492: aload_3
/*     */     //   493: new com/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl$shouldAllowEdit$2
/*     */     //   496: dup
/*     */     //   497: aload_0
/*     */     //   498: aload_1
/*     */     //   499: aload #5
/*     */     //   501: aconst_null
/*     */     //   502: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;Ljava/nio/file/Path;Lkotlinx/coroutines/CompletableDeferred;Lkotlin/coroutines/Continuation;)V
/*     */     //   505: checkcast kotlin/jvm/functions/Function2
/*     */     //   508: invokespecial <init> : (Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V
/*     */     //   511: checkcast com/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest
/*     */     //   514: aload #7
/*     */     //   516: aload #7
/*     */     //   518: aload #5
/*     */     //   520: putfield L$0 : Ljava/lang/Object;
/*     */     //   523: aload #7
/*     */     //   525: aconst_null
/*     */     //   526: putfield L$1 : Ljava/lang/Object;
/*     */     //   529: aload #7
/*     */     //   531: aconst_null
/*     */     //   532: putfield L$2 : Ljava/lang/Object;
/*     */     //   535: aload #7
/*     */     //   537: aconst_null
/*     */     //   538: putfield L$3 : Ljava/lang/Object;
/*     */     //   541: aload #7
/*     */     //   543: aconst_null
/*     */     //   544: putfield L$4 : Ljava/lang/Object;
/*     */     //   547: aload #7
/*     */     //   549: iconst_4
/*     */     //   550: putfield label : I
/*     */     //   553: invokeinterface updateHumanInLoopRequest : (Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   558: dup
/*     */     //   559: aload #8
/*     */     //   561: if_acmpne -> 584
/*     */     //   564: aload #8
/*     */     //   566: areturn
/*     */     //   567: aload #7
/*     */     //   569: getfield L$0 : Ljava/lang/Object;
/*     */     //   572: checkcast kotlinx/coroutines/CompletableDeferred
/*     */     //   575: astore #5
/*     */     //   577: aload #6
/*     */     //   579: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   582: aload #6
/*     */     //   584: pop
/*     */     //   585: aload #5
/*     */     //   587: aload #7
/*     */     //   589: aload #7
/*     */     //   591: aconst_null
/*     */     //   592: putfield L$0 : Ljava/lang/Object;
/*     */     //   595: aload #7
/*     */     //   597: iconst_5
/*     */     //   598: putfield label : I
/*     */     //   601: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   606: dup
/*     */     //   607: aload #8
/*     */     //   609: if_acmpne -> 622
/*     */     //   612: aload #8
/*     */     //   614: areturn
/*     */     //   615: aload #6
/*     */     //   617: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   620: aload #6
/*     */     //   622: areturn
/*     */     //   623: new java/lang/IllegalStateException
/*     */     //   626: dup
/*     */     //   627: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   630: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   633: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #90	-> 63
/*     */     //   #95	-> 113
/*     */     //   #96	-> 120
/*     */     //   #99	-> 124
/*     */     //   #90	-> 172
/*     */     //   #99	-> 218
/*     */     //   #90	-> 275
/*     */     //   #99	-> 321
/*     */     //   #100	-> 330
/*     */     //   #102	-> 334
/*     */     //   #104	-> 346
/*     */     //   #105	-> 360
/*     */     //   #106	-> 368
/*     */     //   #90	-> 425
/*     */     //   #107	-> 481
/*     */     //   #108	-> 486
/*     */     //   #109	-> 490
/*     */     //   #110	-> 491
/*     */     //   #111	-> 492
/*     */     //   #107	-> 493
/*     */     //   #108	-> 508
/*     */     //   #107	-> 516
/*     */     //   #90	-> 564
/*     */     //   #119	-> 584
/*     */     //   #90	-> 612
/*     */     //   #119	-> 622
/*     */     //   #90	-> 623
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   113	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   211	67	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   314	16	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   334	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   474	34	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/HumanInLoopImpl;
/*     */     //   113	62	1	path	Ljava/nio/file/Path;
/*     */     //   202	76	1	path	Ljava/nio/file/Path;
/*     */     //   305	25	1	path	Ljava/nio/file/Path;
/*     */     //   334	94	1	path	Ljava/nio/file/Path;
/*     */     //   465	43	1	path	Ljava/nio/file/Path;
/*     */     //   113	62	2	before	Ljava/lang/String;
/*     */     //   193	85	2	before	Ljava/lang/String;
/*     */     //   296	34	2	before	Ljava/lang/String;
/*     */     //   334	94	2	before	Ljava/lang/String;
/*     */     //   456	36	2	before	Ljava/lang/String;
/*     */     //   113	62	3	after	Ljava/lang/String;
/*     */     //   184	94	3	after	Ljava/lang/String;
/*     */     //   287	43	3	after	Ljava/lang/String;
/*     */     //   334	94	3	after	Ljava/lang/String;
/*     */     //   447	46	3	after	Ljava/lang/String;
/*     */     //   368	60	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   438	129	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   577	29	5	deferredResponse	Lkotlinx/coroutines/CompletableDeferred;
/*     */     //   0	634	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	570	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	563	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "HumanInLoopImpl.kt", l = {99, 99, 106, 107, 119}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0"}, n = {"this", "path", "before", "after", "this", "path", "before", "after", "this", "path", "before", "after", "deferredResponse", "deferredResponse"}, m = "shouldAllowEdit", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class HumanInLoopImpl$shouldAllowEdit$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     HumanInLoopImpl$shouldAllowEdit$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return HumanInLoopImpl.this.shouldAllowEdit(null, null, null, (Continuation<? super HumanInLoopResponse>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "HumanInLoopImpl.kt", l = {113, 114}, i = {0, 1}, s = {"L$0", "L$0"}, n = {"response", "response"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.HumanInLoopImpl$shouldAllowEdit$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "response", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;"})
/*     */   static final class HumanInLoopImpl$shouldAllowEdit$2 extends SuspendLambda implements Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     HumanInLoopImpl$shouldAllowEdit$2(Path $path, CompletableDeferred<HumanInLoopResponse> $deferredResponse, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       HumanInLoopResponse response;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           this.L$0 = response;
/*     */           this.label = 1;
/*     */           if (HumanInLoopImpl.this.updater.updateHumanInLoopRequest(null, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateHumanInLoopRequest(null, (Continuation<? super Unit>)this);
/*     */           this.L$0 = response;
/*     */           this.label = 2;
/*     */           if (HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for edit in file: " + this.$path);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = response;
/*     */           this.label = 2;
/*     */           if (HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           HumanInLoopImpl.this.updater.updateState(TaskChainState.Running, (Continuation<? super Unit>)this);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for edit in file: " + this.$path);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           response = (HumanInLoopResponse)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           HumanInLoopImpl.logger.info("User responded with " + response + " for edit in file: " + this.$path);
/*     */           this.$deferredResponse.complete(response);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super HumanInLoopImpl$shouldAllowEdit$2> $completion) {
/*     */       HumanInLoopImpl$shouldAllowEdit$2 humanInLoopImpl$shouldAllowEdit$2 = new HumanInLoopImpl$shouldAllowEdit$2(this.$path, this.$deferredResponse, $completion);
/*     */       humanInLoopImpl$shouldAllowEdit$2.L$0 = value;
/*     */       return (Continuation<Unit>)humanInLoopImpl$shouldAllowEdit$2;
/*     */     }
/*     */     
/*     */     public final Object invoke(HumanInLoopResponse p1, Continuation<?> p2) {
/*     */       return ((HumanInLoopImpl$shouldAllowEdit$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object addCurrentAction(@NotNull Job currentAction, @NotNull String command, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.updater.updateCurrentActionJob(currentAction, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.updater.updateCurrentActionJob(currentAction, $completion); 
/*     */     this.updater.updateCurrentActionJob(currentAction, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object removeCurrentAction(@NotNull Job job, @NotNull String command, @NotNull Continuation<? super Unit> $completion) {
/*     */     if (this.updater.updateCurrentActionJob(null, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return this.updater.updateCurrentActionJob(null, $completion); 
/*     */     this.updater.updateCurrentActionJob(null, $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\HumanInLoopImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */