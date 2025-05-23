/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ import com.intellij.openapi.application.ApplicationActivationListener;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import com.intellij.openapi.wm.IdeFrame;
/*     */ import com.intellij.openapi.wm.ToolWindow;
/*     */ import com.intellij.ui.SystemNotifications;
/*     */ import com.intellij.util.ApplicationKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.enums.EnumEntries;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.channels.ProducerScope;
/*     */ import kotlinx.coroutines.flow.MutableStateFlow;
/*     */ import kotlinx.coroutines.flow.StateFlowKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Service({Service.Level.PROJECT})
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000`\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\005\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001:\002#$B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\026\020\026\032\0020\0272\006\020\030\032\0020\031H@¢\006\002\020\032J\016\020\033\032\0020\0272\006\020\034\032\0020\020J$\020\035\032\0020\0272\b\b\002\020\036\032\0020\0372\006\020 \032\0020\0372\b\020!\032\004\030\0010\"H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\024\020\b\032\b\022\004\022\0020\n0\tX\004¢\006\002\n\000R\027\020\013\032\b\022\004\022\0020\r0\f¢\006\b\n\000\032\004\b\013\020\016R\026\020\017\032\n\022\006\022\004\030\0010\0200\fX\004¢\006\002\n\000R\020\020\021\032\004\030\0010\022X\016¢\006\002\n\000R\020\020\023\032\004\030\0010\022X\016¢\006\002\n\000R\016\020\024\032\0020\025X\004¢\006\002\n\000¨\006%"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;", "Lcom/intellij/openapi/application/ApplicationActivationListener;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "_isIdeFocused", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "isToolWindowFocused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "currentNotification", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;", "iconJob", "Lkotlinx/coroutines/Job;", "clearNotificationJob", "iconMutex", "Lkotlinx/coroutines/sync/Mutex;", "manageIconInToolbar", "", "toolWindow", "Lcom/intellij/openapi/wm/ToolWindow;", "(Lcom/intellij/openapi/wm/ToolWindow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserNotification", "notificationType", "notifyWhenIdeInBackground", "title", "", "message", "ideFrame", "Lcom/intellij/openapi/wm/IdeFrame;", "EventType", "FocusState", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nJunieEventNotificationService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieEventNotificationService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 4 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 5 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 6 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,147:1\n14#2:148\n116#3,7:149\n124#3,2:161\n17#4:156\n19#4:160\n46#5:157\n51#5:159\n105#6:158\n*S KotlinDebug\n*F\n+ 1 JunieEventNotificationService.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService\n*L\n36#1:148\n75#1:149,7\n75#1:161,2\n103#1:156\n103#1:160\n103#1:157\n103#1:159\n103#1:158\n*E\n"})
/*     */ public final class JunieEventNotificationService implements ApplicationActivationListener {
/*     */   public JunieEventNotificationService(@NotNull CoroutineScope coroutineScope) {
/*  33 */     this.coroutineScope = coroutineScope;
/*     */ 
/*     */     
/*  36 */     int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 148 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(JunieEventNotificationService.class), "getInstance(...)"); this.logger = Logger.getInstance(JunieEventNotificationService.class);
/*     */     Intrinsics.checkNotNullExpressionValue(ApplicationKt.getApplication().getMessageBus(), "getMessageBus(...)");
/*     */     Intrinsics.checkNotNullExpressionValue(ApplicationActivationListener.TOPIC, "TOPIC");
/*     */     this._isIdeFocused = FlowKt.stateIn(UtilsKt.connectionFlow(ApplicationKt.getApplication().getMessageBus(), ApplicationActivationListener.TOPIC, JunieEventNotificationService::_isIdeFocused$lambda$0), this.coroutineScope, SharingStarted.Companion.getEagerly(), FocusState.Companion.getDefault());
/*     */     this.isToolWindowFocused = StateFlowKt.MutableStateFlow(Boolean.valueOf(false));
/*     */     this.currentNotification = StateFlowKt.MutableStateFlow(null);
/*     */     this.iconMutex = MutexKt.Mutex$default(false, 1, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private final CoroutineScope coroutineScope;
/*     */   @NotNull
/*     */   private final Logger logger;
/*     */   @NotNull
/*     */   private final StateFlow<FocusState> _isIdeFocused;
/*     */   @NotNull
/*     */   private final MutableStateFlow<Boolean> isToolWindowFocused;
/*     */   @NotNull
/*     */   private final MutableStateFlow<EventType> currentNotification;
/*     */   @Nullable
/*     */   private Job iconJob;
/*     */   @Nullable
/*     */   private Job clearNotificationJob;
/*     */   @NotNull
/*     */   private final Mutex iconMutex;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private static final ApplicationActivationListener _isIdeFocused$lambda$0(ProducerScope<? super FocusState> $this$connectionFlow) {
/*     */     Intrinsics.checkNotNullParameter($this$connectionFlow, "$this$connectionFlow");
/*     */     return new JunieEventNotificationService$_isIdeFocused$1$1($this$connectionFlow);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$_isIdeFocused$1$1", "Lcom/intellij/openapi/application/ApplicationActivationListener;", "applicationActivated", "", "ideFrame", "Lcom/intellij/openapi/wm/IdeFrame;", "applicationDeactivated", "ej-ui"})
/*     */   public static final class JunieEventNotificationService$_isIdeFocused$1$1 implements ApplicationActivationListener {
/*     */     JunieEventNotificationService$_isIdeFocused$1$1(ProducerScope<JunieEventNotificationService.FocusState> $this_connectionFlow) {}
/*     */     
/*     */     public void applicationActivated(IdeFrame ideFrame) {
/*     */       Intrinsics.checkNotNullParameter(ideFrame, "ideFrame");
/*     */       this.$this_connectionFlow.trySend-JP2dKIU(new JunieEventNotificationService.FocusState(true, ideFrame));
/*     */     }
/*     */     
/*     */     public void applicationDeactivated(IdeFrame ideFrame) {
/*     */       Intrinsics.checkNotNullParameter(ideFrame, "ideFrame");
/*     */       this.$this_connectionFlow.trySend-JP2dKIU(new JunieEventNotificationService.FocusState(false, ideFrame));
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final MutableStateFlow<Boolean> isToolWindowFocused() {
/*     */     return this.isToolWindowFocused;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\002\030\0002\b\022\004\022\0020\0000\001B\t\b\002¢\006\004\b\002\020\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;", "", "<init>", "(Ljava/lang/String;I)V", "TASK_FINISHED", "REQUIRE_HUMAN", "ej-ui"})
/*     */   public enum EventType {
/*     */     TASK_FINISHED, REQUIRE_HUMAN;
/*     */     
/*     */     @NotNull
/*     */     public static EnumEntries<EventType> getEntries() {
/*     */       return $ENTRIES;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\007\b\002\030\000 \0132\0020\001:\001\013B\033\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\004\b\006\020\007R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\002\020\bR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\t\020\n¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "", "isIdeFocused", "", "ideFrame", "Lcom/intellij/openapi/wm/IdeFrame;", "<init>", "(ZLcom/intellij/openapi/wm/IdeFrame;)V", "()Z", "getIdeFrame", "()Lcom/intellij/openapi/wm/IdeFrame;", "Companion", "ej-ui"})
/*     */   private static final class FocusState {
/*     */     public FocusState(boolean isIdeFocused, @Nullable IdeFrame ideFrame) {
/*     */       this.isIdeFocused = isIdeFocused;
/*     */       this.ideFrame = ideFrame;
/*     */     }
/*     */     
/*     */     public final boolean isIdeFocused() {
/*     */       return this.isIdeFocused;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final IdeFrame getIdeFrame() {
/*     */       return this.ideFrame;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState$Companion;", "", "<init>", "()V", "Default", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "getDefault", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "ej-ui"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final JunieEventNotificationService.FocusState getDefault() {
/*     */         return JunieEventNotificationService.FocusState.Default;
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     private final boolean isIdeFocused;
/*     */     @Nullable
/*     */     private final IdeFrame ideFrame;
/*     */     @NotNull
/*     */     private static final FocusState Default = new FocusState(false, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState$Companion;", "", "<init>", "()V", "Default", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "getDefault", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState;", "ej-ui"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final JunieEventNotificationService.FocusState getDefault() {
/*     */       return JunieEventNotificationService.FocusState.Default;
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Object manageIconInToolbar(@NotNull ToolWindow toolWindow, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$1
/*     */     //   11: astore #15
/*     */     //   13: aload #15
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #15
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #15
/*     */     //   50: aload #15
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #14
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #16
/*     */     //   62: aload #15
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 381, 0 -> 88, 1 -> 148
/*     */     //   88: aload #14
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: getfield iconMutex : Lkotlinx/coroutines/sync/Mutex;
/*     */     //   97: astore_3
/*     */     //   98: aconst_null
/*     */     //   99: astore #4
/*     */     //   101: iconst_0
/*     */     //   102: istore #5
/*     */     //   104: nop
/*     */     //   105: aload_3
/*     */     //   106: aload #4
/*     */     //   108: aload #15
/*     */     //   110: aload #15
/*     */     //   112: aload_0
/*     */     //   113: putfield L$0 : Ljava/lang/Object;
/*     */     //   116: aload #15
/*     */     //   118: aload_1
/*     */     //   119: putfield L$1 : Ljava/lang/Object;
/*     */     //   122: aload #15
/*     */     //   124: aload_3
/*     */     //   125: putfield L$2 : Ljava/lang/Object;
/*     */     //   128: aload #15
/*     */     //   130: iconst_1
/*     */     //   131: putfield label : I
/*     */     //   134: invokeinterface lock : (Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   139: dup
/*     */     //   140: aload #16
/*     */     //   142: if_acmpne -> 188
/*     */     //   145: aload #16
/*     */     //   147: areturn
/*     */     //   148: iconst_0
/*     */     //   149: istore #5
/*     */     //   151: aconst_null
/*     */     //   152: astore #4
/*     */     //   154: aload #15
/*     */     //   156: getfield L$2 : Ljava/lang/Object;
/*     */     //   159: checkcast kotlinx/coroutines/sync/Mutex
/*     */     //   162: astore_3
/*     */     //   163: aload #15
/*     */     //   165: getfield L$1 : Ljava/lang/Object;
/*     */     //   168: checkcast com/intellij/openapi/wm/ToolWindow
/*     */     //   171: astore_1
/*     */     //   172: aload #15
/*     */     //   174: getfield L$0 : Ljava/lang/Object;
/*     */     //   177: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   180: astore_0
/*     */     //   181: aload #14
/*     */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   186: aload #14
/*     */     //   188: pop
/*     */     //   189: nop
/*     */     //   190: iconst_0
/*     */     //   191: istore #6
/*     */     //   193: aload_0
/*     */     //   194: getfield iconJob : Lkotlinx/coroutines/Job;
/*     */     //   197: dup
/*     */     //   198: ifnull -> 210
/*     */     //   201: aconst_null
/*     */     //   202: iconst_1
/*     */     //   203: aconst_null
/*     */     //   204: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */     //   207: goto -> 211
/*     */     //   210: pop
/*     */     //   211: aload_0
/*     */     //   212: getfield clearNotificationJob : Lkotlinx/coroutines/Job;
/*     */     //   215: dup
/*     */     //   216: ifnull -> 228
/*     */     //   219: aconst_null
/*     */     //   220: iconst_1
/*     */     //   221: aconst_null
/*     */     //   222: invokestatic cancel$default : (Lkotlinx/coroutines/Job;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
/*     */     //   225: goto -> 229
/*     */     //   228: pop
/*     */     //   229: aload_0
/*     */     //   230: aload_0
/*     */     //   231: getfield currentNotification : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   234: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   237: new com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$2$1
/*     */     //   240: dup
/*     */     //   241: aload_1
/*     */     //   242: aconst_null
/*     */     //   243: invokespecial <init> : (Lcom/intellij/openapi/wm/ToolWindow;Lkotlin/coroutines/Continuation;)V
/*     */     //   246: checkcast kotlin/jvm/functions/Function2
/*     */     //   249: invokestatic onEach : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   252: getstatic kotlinx/coroutines/Dispatchers.INSTANCE : Lkotlinx/coroutines/Dispatchers;
/*     */     //   255: invokestatic getEDT : (Lkotlinx/coroutines/Dispatchers;)Lkotlin/coroutines/CoroutineContext;
/*     */     //   258: invokestatic flowOn : (Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   261: aload_0
/*     */     //   262: getfield coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   265: invokestatic launchIn : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
/*     */     //   268: putfield iconJob : Lkotlinx/coroutines/Job;
/*     */     //   271: aload_0
/*     */     //   272: aload_0
/*     */     //   273: getfield isToolWindowFocused : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   276: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   279: astore #7
/*     */     //   281: iconst_0
/*     */     //   282: istore #8
/*     */     //   284: aload #7
/*     */     //   286: astore #9
/*     */     //   288: iconst_0
/*     */     //   289: istore #10
/*     */     //   291: iconst_0
/*     */     //   292: istore #11
/*     */     //   294: new com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$lambda$2$$inlined$filter$1
/*     */     //   297: dup
/*     */     //   298: aload #9
/*     */     //   300: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;)V
/*     */     //   303: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   306: nop
/*     */     //   307: nop
/*     */     //   308: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   311: pop
/*     */     //   312: iconst_5
/*     */     //   313: getstatic kotlin/time/DurationUnit.SECONDS : Lkotlin/time/DurationUnit;
/*     */     //   316: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   319: invokestatic debounce-HG0u8IE : (Lkotlinx/coroutines/flow/Flow;J)Lkotlinx/coroutines/flow/Flow;
/*     */     //   322: new com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$manageIconInToolbar$2$3
/*     */     //   325: dup
/*     */     //   326: aload_0
/*     */     //   327: aconst_null
/*     */     //   328: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;Lkotlin/coroutines/Continuation;)V
/*     */     //   331: checkcast kotlin/jvm/functions/Function2
/*     */     //   334: invokestatic onEach : (Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
/*     */     //   337: aload_0
/*     */     //   338: getfield coroutineScope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   341: invokestatic launchIn : (Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
/*     */     //   344: putfield clearNotificationJob : Lkotlinx/coroutines/Job;
/*     */     //   347: nop
/*     */     //   348: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   351: astore #12
/*     */     //   353: aload_3
/*     */     //   354: aload #4
/*     */     //   356: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   361: goto -> 377
/*     */     //   364: astore #13
/*     */     //   366: aload_3
/*     */     //   367: aload #4
/*     */     //   369: invokeinterface unlock : (Ljava/lang/Object;)V
/*     */     //   374: aload #13
/*     */     //   376: athrow
/*     */     //   377: aload #12
/*     */     //   379: nop
/*     */     //   380: areturn
/*     */     //   381: new java/lang/IllegalStateException
/*     */     //   384: dup
/*     */     //   385: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   388: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   391: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #74	-> 60
/*     */     //   #75	-> 93
/*     */     //   #149	-> 98
/*     */     //   #150	-> 104
/*     */     //   #153	-> 105
/*     */     //   #74	-> 145
/*     */     //   #154	-> 188
/*     */     //   #155	-> 190
/*     */     //   #76	-> 193
/*     */     //   #77	-> 211
/*     */     //   #79	-> 229
/*     */     //   #80	-> 237
/*     */     //   #99	-> 252
/*     */     //   #100	-> 261
/*     */     //   #79	-> 268
/*     */     //   #102	-> 271
/*     */     //   #103	-> 281
/*     */     //   #156	-> 284
/*     */     //   #157	-> 291
/*     */     //   #158	-> 294
/*     */     //   #159	-> 306
/*     */     //   #160	-> 307
/*     */     //   #104	-> 308
/*     */     //   #104	-> 319
/*     */     //   #105	-> 322
/*     */     //   #106	-> 337
/*     */     //   #102	-> 344
/*     */     //   #108	-> 347
/*     */     //   #155	-> 351
/*     */     //   #161	-> 353
/*     */     //   #162	-> 361
/*     */     //   #161	-> 364
/*     */     //   #154	-> 379
/*     */     //   #108	-> 380
/*     */     //   #74	-> 381
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	55	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;
/*     */     //   181	163	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;
/*     */     //   93	55	1	toolWindow	Lcom/intellij/openapi/wm/ToolWindow;
/*     */     //   172	80	1	toolWindow	Lcom/intellij/openapi/wm/ToolWindow;
/*     */     //   98	50	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   163	185	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   348	13	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   364	16	3	$this$withLock_u24default$iv	Lkotlinx/coroutines/sync/Mutex;
/*     */     //   101	47	4	owner$iv	Ljava/lang/Object;
/*     */     //   163	185	4	owner$iv	Ljava/lang/Object;
/*     */     //   348	13	4	owner$iv	Ljava/lang/Object;
/*     */     //   364	16	4	owner$iv	Ljava/lang/Object;
/*     */     //   281	27	7	$this$filter$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   288	19	9	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   294	12	11	$i$f$unsafeFlow	I
/*     */     //   291	16	10	$i$f$unsafeTransform	I
/*     */     //   284	24	8	$i$f$filter	I
/*     */     //   193	155	6	$i$a$-withLock$default-JunieEventNotificationService$manageIconInToolbar$2	I
/*     */     //   104	44	5	$i$f$withLock	I
/*     */     //   0	392	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	331	15	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	324	14	$result	Ljava/lang/Object;
/*     */     //   151	229	5	$i$f$withLock	I
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   189	353	364	finally
/*     */     //   364	366	364	finally
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieEventNotificationService.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService$manageIconInToolbar$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\b\020\002\032\004\030\0010\003H\n"}, d2 = {"<anonymous>", "", "notification", "Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;"})
/*     */   static final class JunieEventNotificationService$manageIconInToolbar$2$1 extends SuspendLambda implements Function2<EventType, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieEventNotificationService$manageIconInToolbar$2$1(ToolWindow $toolWindow, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       JunieEventNotificationService.EventType notification;
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           notification = (JunieEventNotificationService.EventType)this.L$0;
/*     */           if (((notification == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[notification.ordinal()]) == -1) {
/*     */             this.$toolWindow.setIcon(JunieIcons.INSTANCE.getToolWindowLogo());
/*     */           } else {
/*     */             switch ((notification == null) ? -1 : WhenMappings.$EnumSwitchMapping$0[notification.ordinal()]) {
/*     */               case true:
/*     */               
/*     */               case true:
/*     */               
/*     */               default:
/*     */                 throw new NoWhenBranchMatchedException();
/*     */             } 
/*     */             JunieEventNotificationService.EventType eventType = notification;
/*     */             Intrinsics.checkNotNull(eventType);
/*     */             this.$toolWindow.setIcon(IconManager.Companion.getInstance().withIconBadge(JunieIcons.INSTANCE.getToolWindowLogo(), (Paint)eventType));
/*     */           } 
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieEventNotificationService$manageIconInToolbar$2$1> $completion) {
/*     */       JunieEventNotificationService$manageIconInToolbar$2$1 junieEventNotificationService$manageIconInToolbar$2$1 = new JunieEventNotificationService$manageIconInToolbar$2$1(this.$toolWindow, $completion);
/*     */       junieEventNotificationService$manageIconInToolbar$2$1.L$0 = value;
/*     */       return (Continuation<Unit>)junieEventNotificationService$manageIconInToolbar$2$1;
/*     */     }
/*     */     
/*     */     public final Object invoke(JunieEventNotificationService.EventType p1, Continuation<?> p2) {
/*     */       return ((JunieEventNotificationService$manageIconInToolbar$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieEventNotificationService.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService$manageIconInToolbar$2$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\020\013\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", ""})
/*     */   static final class JunieEventNotificationService$manageIconInToolbar$2$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     JunieEventNotificationService$manageIconInToolbar$2$3(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           JunieEventNotificationService.this.currentNotification.tryEmit(null);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super JunieEventNotificationService$manageIconInToolbar$2$3> $completion) {
/*     */       return (Continuation<Unit>)new JunieEventNotificationService$manageIconInToolbar$2$3($completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(boolean p1, Continuation<?> p2) {
/*     */       return ((JunieEventNotificationService$manageIconInToolbar$2$3)create(Boolean.valueOf(p1), p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   public final void sendUserNotification(@NotNull EventType notificationType) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc_w 'notificationType'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_0
/*     */     //   8: getfield currentNotification : Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */     //   11: aload_1
/*     */     //   12: invokeinterface tryEmit : (Ljava/lang/Object;)Z
/*     */     //   17: pop
/*     */     //   18: aload_0
/*     */     //   19: getfield _isIdeFocused : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   22: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   27: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState
/*     */     //   30: invokevirtual isIdeFocused : ()Z
/*     */     //   33: ifne -> 40
/*     */     //   36: iconst_1
/*     */     //   37: goto -> 41
/*     */     //   40: iconst_0
/*     */     //   41: istore_2
/*     */     //   42: iload_2
/*     */     //   43: ifeq -> 120
/*     */     //   46: aload_1
/*     */     //   47: getstatic com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   50: swap
/*     */     //   51: invokevirtual ordinal : ()I
/*     */     //   54: iaload
/*     */     //   55: tableswitch default -> 88, 1 -> 76, 2 -> 82
/*     */     //   76: ldc_w 'Junie completed the task'
/*     */     //   79: goto -> 96
/*     */     //   82: ldc_w 'Junie needs your attention'
/*     */     //   85: goto -> 96
/*     */     //   88: new kotlin/NoWhenBranchMatchedException
/*     */     //   91: dup
/*     */     //   92: invokespecial <init> : ()V
/*     */     //   95: athrow
/*     */     //   96: astore_3
/*     */     //   97: aload_0
/*     */     //   98: aconst_null
/*     */     //   99: aload_3
/*     */     //   100: aload_0
/*     */     //   101: getfield _isIdeFocused : Lkotlinx/coroutines/flow/StateFlow;
/*     */     //   104: invokeinterface getValue : ()Ljava/lang/Object;
/*     */     //   109: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$FocusState
/*     */     //   112: invokevirtual getIdeFrame : ()Lcom/intellij/openapi/wm/IdeFrame;
/*     */     //   115: iconst_1
/*     */     //   116: aconst_null
/*     */     //   117: invokestatic notifyWhenIdeInBackground$default : (Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/openapi/wm/IdeFrame;ILjava/lang/Object;)V
/*     */     //   120: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #111	-> 7
/*     */     //   #112	-> 18
/*     */     //   #113	-> 42
/*     */     //   #114	-> 46
/*     */     //   #115	-> 76
/*     */     //   #116	-> 82
/*     */     //   #114	-> 88
/*     */     //   #119	-> 97
/*     */     //   #120	-> 99
/*     */     //   #121	-> 100
/*     */     //   #119	-> 115
/*     */     //   #124	-> 120
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	23	3	message	Ljava/lang/String;
/*     */     //   42	79	2	ideInBackground	Z
/*     */     //   0	121	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;
/*     */     //   0	121	1	notificationType	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService$EventType;
/*     */   }
/*     */   
/*     */   private final void notifyWhenIdeInBackground(String title, String message, IdeFrame ideFrame) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: astore #4
/*     */     //   3: nop
/*     */     //   4: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   7: pop
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService
/*     */     //   13: astore #5
/*     */     //   15: iconst_0
/*     */     //   16: istore #6
/*     */     //   18: aload_3
/*     */     //   19: dup
/*     */     //   20: ifnull -> 52
/*     */     //   23: astore #7
/*     */     //   25: iconst_0
/*     */     //   26: istore #8
/*     */     //   28: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   31: aload #7
/*     */     //   33: aload_1
/*     */     //   34: aload_2
/*     */     //   35: <illegal opcode> run : (Lcom/intellij/openapi/wm/IdeFrame;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Runnable;
/*     */     //   40: invokeinterface invokeLater : (Ljava/lang/Runnable;)V
/*     */     //   45: nop
/*     */     //   46: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   49: goto -> 54
/*     */     //   52: pop
/*     */     //   53: aconst_null
/*     */     //   54: nop
/*     */     //   55: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   58: astore #5
/*     */     //   60: goto -> 79
/*     */     //   63: astore #6
/*     */     //   65: getstatic kotlin/Result.Companion : Lkotlin/Result$Companion;
/*     */     //   68: pop
/*     */     //   69: aload #6
/*     */     //   71: invokestatic createFailure : (Ljava/lang/Throwable;)Ljava/lang/Object;
/*     */     //   74: invokestatic constructor-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   77: astore #5
/*     */     //   79: aload #5
/*     */     //   81: astore #4
/*     */     //   83: aload #4
/*     */     //   85: invokestatic exceptionOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Throwable;
/*     */     //   88: dup
/*     */     //   89: ifnull -> 114
/*     */     //   92: astore #5
/*     */     //   94: aload #5
/*     */     //   96: astore #6
/*     */     //   98: iconst_0
/*     */     //   99: istore #7
/*     */     //   101: aload_0
/*     */     //   102: getfield logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   105: aload #6
/*     */     //   107: invokevirtual warn : (Ljava/lang/Throwable;)V
/*     */     //   110: nop
/*     */     //   111: goto -> 115
/*     */     //   114: pop
/*     */     //   115: aload #4
/*     */     //   117: astore #4
/*     */     //   119: aload #4
/*     */     //   121: invokestatic isSuccess-impl : (Ljava/lang/Object;)Z
/*     */     //   124: ifeq -> 152
/*     */     //   127: aload #4
/*     */     //   129: checkcast kotlin/Unit
/*     */     //   132: astore #5
/*     */     //   134: iconst_0
/*     */     //   135: istore #6
/*     */     //   137: aload_0
/*     */     //   138: getfield logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   141: aload_2
/*     */     //   142: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   147: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   150: nop
/*     */     //   151: nop
/*     */     //   152: return
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #131	-> 0
/*     */     //   #132	-> 18
/*     */     //   #133	-> 28
/*     */     //   #139	-> 45
/*     */     //   #132	-> 46
/*     */     //   #132	-> 52
/*     */     //   #139	-> 54
/*     */     //   #131	-> 55
/*     */     //   #140	-> 83
/*     */     //   #141	-> 101
/*     */     //   #142	-> 110
/*     */     //   #140	-> 111
/*     */     //   #142	-> 119
/*     */     //   #143	-> 137
/*     */     //   #144	-> 150
/*     */     //   #142	-> 151
/*     */     //   #145	-> 152
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   28	18	8	$i$a$-let-JunieEventNotificationService$notifyWhenIdeInBackground$1$1	I
/*     */     //   25	21	7	frame	Lcom/intellij/openapi/wm/IdeFrame;
/*     */     //   18	37	6	$i$a$-runCatching-JunieEventNotificationService$notifyWhenIdeInBackground$1	I
/*     */     //   15	40	5	$this$notifyWhenIdeInBackground_u24lambda_u245	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;
/*     */     //   101	10	7	$i$a$-onFailure-JunieEventNotificationService$notifyWhenIdeInBackground$2	I
/*     */     //   98	13	6	it	Ljava/lang/Throwable;
/*     */     //   137	14	6	$i$a$-onSuccess-JunieEventNotificationService$notifyWhenIdeInBackground$3	I
/*     */     //   134	17	5	it	Lkotlin/Unit;
/*     */     //   0	153	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/JunieEventNotificationService;
/*     */     //   0	153	1	title	Ljava/lang/String;
/*     */     //   0	153	2	message	Ljava/lang/String;
/*     */     //   0	153	3	ideFrame	Lcom/intellij/openapi/wm/IdeFrame;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   3	60	63	java/lang/Throwable
/*     */   }
/*     */   
/*     */   private static final void notifyWhenIdeInBackground$lambda$5$lambda$4$lambda$3(IdeFrame $frame, String $title, String $message) {
/*     */     if (SystemInfo.isMac)
/*     */       WindowManagerEx.getInstanceEx().requestUserAttention($frame, true); 
/*     */     if (SystemNotifications.getInstance() != null) {
/*     */       SystemNotifications.getInstance().notify("Junie", $title, $message);
/*     */     } else {
/*     */       SystemNotifications.getInstance();
/*     */     } 
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "JunieEventNotificationService.kt", l = {152}, i = {0, 0, 0}, s = {"L$0", "L$1", "L$2"}, n = {"this", "toolWindow", "$this$withLock_u24default$iv"}, m = "manageIconInToolbar", c = "com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class JunieEventNotificationService$manageIconInToolbar$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     JunieEventNotificationService$manageIconInToolbar$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return JunieEventNotificationService.this.manageIconInToolbar(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\JunieEventNotificationService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */