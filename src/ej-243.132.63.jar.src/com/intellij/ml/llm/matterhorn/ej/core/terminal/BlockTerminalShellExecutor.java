/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ShellExecutor;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalView;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.BlockTerminalSession;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.ShellCommandListener;
/*     */ import com.intellij.openapi.Disposable;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.coroutines.CompletableDeferred;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000¤\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\t\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\002\b\b\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\004\n\002\020\022\n\002\b\002\n\002\030\002\n\002\b\005\030\000 M2\0020\001:\004JKLMB1\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\007\022\006\020\t\032\0020\n¢\006\004\b\013\020\fJ\016\020%\032\0020#H@¢\006\002\020&J\016\020'\032\0020#H@¢\006\002\020&J\036\020(\032\0020#2\026\020)\032\022\022\004\022\0020\"\022\004\022\0020#0!j\002`$J\006\020*\032\0020#J\016\020+\032\0020\025H@¢\006\002\020&J2\020,\032\0020-2\b\020\b\032\004\030\0010\0072\006\020.\032\0020\0202\006\020/\032\002002\b\b\002\0201\032\00202H@¢\006\002\0203J\020\0204\032\0020\0202\006\020.\032\0020\020H\002J\022\0201\032\0020#*\00205H@¢\006\002\0206J$\0207\032\002082\b\0209\032\004\030\0010\0072\006\020/\032\002002\b\b\002\0201\032\00202H\002J\036\020:\032\0020#*\0020;2\b\b\002\020<\032\0020=H@¢\006\004\b>\020?J\026\020@\032\0020A2\006\020B\032\0020\007H@¢\006\002\020CJ\026\020D\032\0020#2\006\020E\032\0020FH@¢\006\002\020GJ\024\020H\032\0020I*\002052\006\020B\032\0020\007H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\020\020\b\032\004\030\0010\007X\004¢\006\002\n\000R\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\r\020\016R\016\020\017\032\0020\020X\004¢\006\002\n\000R\016\020\021\032\0020\022X\004¢\006\002\n\000R!\020\023\032\b\022\004\022\0020\0250\0248BX\002¢\006\f\n\004\b\030\020\031\032\004\b\026\020\027R\033\020\032\032\0020\0078@X\002¢\006\f\n\004\b\035\020\031\032\004\b\033\020\034R\024\020\036\032\b\022\004\022\0020\0070\037X\004¢\006\002\n\000R\"\020 \032\026\022\004\022\0020\"\022\004\022\0020#\030\0010!j\004\030\001`$X\016¢\006\002\n\000¨\006N"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "project", "Lcom/intellij/openapi/project/Project;", "workDirectory", "", "shellPathOrNull", "cancellationPolicy", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;)V", "getCancellationPolicy", "()Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CancellationPolicy;", "disposable", "Lcom/intellij/openapi/Disposable;", "settingsProvider", "Lorg/jetbrains/plugins/terminal/JBTerminalSystemSettingsProvider;", "terminalAccess", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess;", "getTerminalAccess", "()Lkotlinx/coroutines/Deferred;", "terminalAccess$delegate", "Lkotlin/Lazy;", "uuid", "getUuid$ej_core", "()Ljava/lang/String;", "uuid$delegate", "lastCommandSnapshots", "Lkotlinx/coroutines/flow/MutableStateFlow;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/TerminalEvent;", "", "Lcom/intellij/ml/llm/matterhorn/TerminalEventHandler;", "awaitTerminal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "attachEventHandler", "handler", "detachEventHandler", "startSessionAndCreateView", "startBlockTerminalWidget", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;", "parentDisposable", "initialTermSize", "Lcom/jediterm/core/util/TermSize;", "disableSavingHistory", "", "(Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lcom/jediterm/core/util/TermSize;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hackBlockTerminalRegistry", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupBaseOptions", "Lorg/jetbrains/plugins/terminal/ShellStartupOptions;", "shellPath", "awaitFirstBlockFinalizedOrRemoved", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "duration", "Lkotlin/time/Duration;", "awaitFirstBlockFinalizedOrRemoved-8Mi8wO0", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeCommand", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "command", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendControlSequence", "bytes", "", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchShellCommand", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;", "TerminalAccess", "ShellCommand", "PreparedShellCommand", "Companion", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
/*     */ public final class BlockTerminalShellExecutor implements ShellExecutor {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final CoroutineScope scope;
/*     */   @NotNull
/*     */   private final Project project;
/*     */   @NotNull
/*     */   private final String workDirectory;
/*     */   @Nullable
/*     */   private final String shellPathOrNull;
/*     */   @NotNull
/*     */   private final ShellExecutor.CancellationPolicy cancellationPolicy;
/*     */   @NotNull
/*     */   private final Disposable disposable;
/*     */   @NotNull
/*     */   private final JBTerminalSystemSettingsProvider settingsProvider;
/*     */   @NotNull
/*     */   private final Lazy terminalAccess$delegate;
/*     */   @NotNull
/*     */   private final Lazy uuid$delegate;
/*     */   @NotNull
/*     */   private final MutableStateFlow<String> lastCommandSnapshots;
/*     */   @Nullable
/*     */   private volatile Function1<? super TerminalEvent, Unit> eventHandler;
/*     */   @NotNull
/*     */   public static final String LINE_SEPARATOR = "\n";
/*     */   
/*  50 */   public BlockTerminalShellExecutor(@NotNull CoroutineScope scope, @NotNull Project project, @NotNull String workDirectory, @Nullable String shellPathOrNull, @NotNull ShellExecutor.CancellationPolicy cancellationPolicy) { this.scope = scope;
/*  51 */     this.project = project;
/*  52 */     this.workDirectory = workDirectory;
/*  53 */     this.shellPathOrNull = shellPathOrNull;
/*  54 */     this.cancellationPolicy = cancellationPolicy;
/*     */ 
/*     */ 
/*     */     
/*  58 */     this.disposable = CoroutineUtilKt.nestedDisposable(this.scope);
/*  59 */     this.settingsProvider = new JBTerminalSystemSettingsProvider();
/*  60 */     this.terminalAccess$delegate = LazyKt.lazy(this::terminalAccess_delegate$lambda$0);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  65 */     this.uuid$delegate = LazyKt.lazy(BlockTerminalShellExecutor::uuid_delegate$lambda$1);
/*  66 */     this.lastCommandSnapshots = StateFlowKt.MutableStateFlow(""); }
/*     */   @NotNull public ShellExecutor.CancellationPolicy getCancellationPolicy() { return this.cancellationPolicy; }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\023HÖ\001J\t\020\024\032\0020\025HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess;", "", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "view", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V", "getSession", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "getView", "()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ej-core"}) private static final class TerminalAccess {
/*     */     @NotNull private final BlockTerminalSession session;
/*     */     @NotNull private final BlockTerminalView view;
/*     */     public TerminalAccess(@NotNull BlockTerminalSession session, @NotNull BlockTerminalView view) { this.session = session; this.view = view; }
/*     */     @NotNull public final BlockTerminalSession getSession() { return this.session; }
/*  73 */     @NotNull public final BlockTerminalView getView() { return this.view; } @NotNull public final BlockTerminalSession component1() { return this.session; } @NotNull public final BlockTerminalView component2() { return this.view; } @NotNull public final TerminalAccess copy(@NotNull BlockTerminalSession session, @NotNull BlockTerminalView view) { Intrinsics.checkNotNullParameter(session, "session"); Intrinsics.checkNotNullParameter(view, "view"); return new TerminalAccess(session, view); } @NotNull public String toString() { return "TerminalAccess(session=" + this.session + ", view=" + this.view + ")"; } public int hashCode() { result = this.session.hashCode(); return result * 31 + this.view.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof TerminalAccess)) return false;  TerminalAccess terminalAccess = (TerminalAccess)other; return !Intrinsics.areEqual(this.session, terminalAccess.session) ? false : (!!Intrinsics.areEqual(this.view, terminalAccess.view)); } } private final Deferred<TerminalAccess> getTerminalAccess() { Lazy lazy = this.terminalAccess$delegate; return (Deferred<TerminalAccess>)lazy.getValue(); } @TestOnly @Nullable public final Object awaitTerminal(@NotNull Continuation $completion) { if (getTerminalAccess().await($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return getTerminalAccess().await($completion);  getTerminalAccess().await($completion); return Unit.INSTANCE; }
/*     */   private static final Deferred terminalAccess_delegate$lambda$0(BlockTerminalShellExecutor this$0) { return BuildersKt.async(this$0.scope, CoroutinesKt.getEDT(Dispatchers.INSTANCE), CoroutineStart.LAZY, new BlockTerminalShellExecutor$terminalAccess$2$1(null)); }
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {62}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor$terminalAccess$2$1") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess;", "Lkotlinx/coroutines/CoroutineScope;"}) static final class BlockTerminalShellExecutor$terminalAccess$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TerminalAccess>, Object> {
/*     */     int label;
/*  77 */     BlockTerminalShellExecutor$terminalAccess$2$1(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); this.label = 1; if (BlockTerminalShellExecutor.this.startSessionAndCreateView((Continuation)this) == object) return object;  return BlockTerminalShellExecutor.this.startSessionAndCreateView((Continuation)this);case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return SYNTHETIC_LOCAL_VARIABLE_1; }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super BlockTerminalShellExecutor$terminalAccess$2$1> $completion) { return (Continuation<Unit>)new BlockTerminalShellExecutor$terminalAccess$2$1($completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((BlockTerminalShellExecutor$terminalAccess$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } } @NotNull public final String getUuid$ej_core() { Lazy lazy = this.uuid$delegate; return (String)lazy.getValue(); } private static final String uuid_delegate$lambda$1() { return UUID.randomUUID().toString(); } @Nullable public Object close(@NotNull Continuation $completion) { if (BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new BlockTerminalShellExecutor$close$2(null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new BlockTerminalShellExecutor$close$2(null), $completion);  BuildersKt.withContext(CoroutinesKt.getEDT(Dispatchers.INSTANCE), new BlockTerminalShellExecutor$close$2(null), $completion); return Unit.INSTANCE; } @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor$close$2") @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}) static final class BlockTerminalShellExecutor$close$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; BlockTerminalShellExecutor$close$2(Continuation $completion) { super(2, $completion); } public final Object invokeSuspend(Object $result) { IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*  78 */           Disposer.dispose(BlockTerminalShellExecutor.this.disposable);
/*  79 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super BlockTerminalShellExecutor$close$2> $completion) { return (Continuation<Unit>)new BlockTerminalShellExecutor$close$2($completion); }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((BlockTerminalShellExecutor$close$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }
/*  83 */   public final void attachEventHandler(@NotNull Function1<? super TerminalEvent, Unit> handler) { Intrinsics.checkNotNullParameter(handler, "handler"); boolean bool = (this.eventHandler == null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  84 */      this.eventHandler = handler; }
/*     */ 
/*     */   
/*     */   public final void detachEventHandler() {
/*  88 */     boolean bool = (this.eventHandler != null) ? true : false; if (_Assertions.ENABLED && !bool) { String str = "Assertion failed"; throw new AssertionError(str); }
/*  89 */      this.eventHandler = null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object startSessionAndCreateView(Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startSessionAndCreateView$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_1
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startSessionAndCreateView$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #12
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startSessionAndCreateView$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_1
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #12
/*     */     //   50: aload #12
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #11
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #13
/*     */     //   62: aload #12
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 621, 0 -> 100, 1 -> 163, 2 -> 272, 3 -> 404, 4 -> 511
/*     */     //   100: aload #11
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: new com/jediterm/core/util/TermSize
/*     */     //   108: dup
/*     */     //   109: sipush #200
/*     */     //   112: bipush #80
/*     */     //   114: invokespecial <init> : (II)V
/*     */     //   117: astore_2
/*     */     //   118: iconst_1
/*     */     //   119: istore_3
/*     */     //   120: aload_0
/*     */     //   121: aload_0
/*     */     //   122: getfield shellPathOrNull : Ljava/lang/String;
/*     */     //   125: aload_0
/*     */     //   126: getfield disposable : Lcom/intellij/openapi/Disposable;
/*     */     //   129: aload_2
/*     */     //   130: iconst_1
/*     */     //   131: aload #12
/*     */     //   133: aload #12
/*     */     //   135: aload_0
/*     */     //   136: putfield L$0 : Ljava/lang/Object;
/*     */     //   139: aload #12
/*     */     //   141: iload_3
/*     */     //   142: putfield I$0 : I
/*     */     //   145: aload #12
/*     */     //   147: iconst_1
/*     */     //   148: putfield label : I
/*     */     //   151: invokespecial startBlockTerminalWidget : (Ljava/lang/String;Lcom/intellij/openapi/Disposable;Lcom/jediterm/core/util/TermSize;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   154: dup
/*     */     //   155: aload #13
/*     */     //   157: if_acmpne -> 185
/*     */     //   160: aload #13
/*     */     //   162: areturn
/*     */     //   163: aload #12
/*     */     //   165: getfield I$0 : I
/*     */     //   168: istore_3
/*     */     //   169: aload #12
/*     */     //   171: getfield L$0 : Ljava/lang/Object;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   177: astore_0
/*     */     //   178: aload #11
/*     */     //   180: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   183: aload #11
/*     */     //   185: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*     */     //   188: astore #4
/*     */     //   190: aload #4
/*     */     //   192: invokevirtual getView : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalContentView;
/*     */     //   195: dup
/*     */     //   196: ldc 'null cannot be cast to non-null type com.intellij.ml.llm.matterhorn.ej.core.terminal.block.BlockTerminalView'
/*     */     //   198: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   201: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView
/*     */     //   204: astore #5
/*     */     //   206: aload #5
/*     */     //   208: invokevirtual getSession : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   211: astore #6
/*     */     //   213: aload_0
/*     */     //   214: aload #5
/*     */     //   216: lconst_0
/*     */     //   217: aload #12
/*     */     //   219: iconst_1
/*     */     //   220: aconst_null
/*     */     //   221: aload #12
/*     */     //   223: aload_0
/*     */     //   224: putfield L$0 : Ljava/lang/Object;
/*     */     //   227: aload #12
/*     */     //   229: aload #4
/*     */     //   231: putfield L$1 : Ljava/lang/Object;
/*     */     //   234: aload #12
/*     */     //   236: aload #5
/*     */     //   238: putfield L$2 : Ljava/lang/Object;
/*     */     //   241: aload #12
/*     */     //   243: aload #6
/*     */     //   245: putfield L$3 : Ljava/lang/Object;
/*     */     //   248: aload #12
/*     */     //   250: iload_3
/*     */     //   251: putfield I$0 : I
/*     */     //   254: aload #12
/*     */     //   256: iconst_2
/*     */     //   257: putfield label : I
/*     */     //   260: invokestatic awaitFirstBlockFinalizedOrRemoved-8Mi8wO0$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;JLkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   263: dup
/*     */     //   264: aload #13
/*     */     //   266: if_acmpne -> 324
/*     */     //   269: aload #13
/*     */     //   271: areturn
/*     */     //   272: aload #12
/*     */     //   274: getfield I$0 : I
/*     */     //   277: istore_3
/*     */     //   278: aload #12
/*     */     //   280: getfield L$3 : Ljava/lang/Object;
/*     */     //   283: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession
/*     */     //   286: astore #6
/*     */     //   288: aload #12
/*     */     //   290: getfield L$2 : Ljava/lang/Object;
/*     */     //   293: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView
/*     */     //   296: astore #5
/*     */     //   298: aload #12
/*     */     //   300: getfield L$1 : Ljava/lang/Object;
/*     */     //   303: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*     */     //   306: astore #4
/*     */     //   308: aload #12
/*     */     //   310: getfield L$0 : Ljava/lang/Object;
/*     */     //   313: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   316: astore_0
/*     */     //   317: aload #11
/*     */     //   319: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   322: aload #11
/*     */     //   324: pop
/*     */     //   325: aload_0
/*     */     //   326: aload #6
/*     */     //   328: aload_0
/*     */     //   329: getfield workDirectory : Ljava/lang/String;
/*     */     //   332: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   337: invokespecial launchShellCommand : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;
/*     */     //   340: astore #7
/*     */     //   342: aload #7
/*     */     //   344: invokeinterface getPromisedResult : ()Lkotlinx/coroutines/Deferred;
/*     */     //   349: aload #12
/*     */     //   351: aload #12
/*     */     //   353: aload_0
/*     */     //   354: putfield L$0 : Ljava/lang/Object;
/*     */     //   357: aload #12
/*     */     //   359: aload #4
/*     */     //   361: putfield L$1 : Ljava/lang/Object;
/*     */     //   364: aload #12
/*     */     //   366: aload #5
/*     */     //   368: putfield L$2 : Ljava/lang/Object;
/*     */     //   371: aload #12
/*     */     //   373: aload #6
/*     */     //   375: putfield L$3 : Ljava/lang/Object;
/*     */     //   378: aload #12
/*     */     //   380: iload_3
/*     */     //   381: putfield I$0 : I
/*     */     //   384: aload #12
/*     */     //   386: iconst_3
/*     */     //   387: putfield label : I
/*     */     //   390: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   395: dup
/*     */     //   396: aload #13
/*     */     //   398: if_acmpne -> 456
/*     */     //   401: aload #13
/*     */     //   403: areturn
/*     */     //   404: aload #12
/*     */     //   406: getfield I$0 : I
/*     */     //   409: istore_3
/*     */     //   410: aload #12
/*     */     //   412: getfield L$3 : Ljava/lang/Object;
/*     */     //   415: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession
/*     */     //   418: astore #6
/*     */     //   420: aload #12
/*     */     //   422: getfield L$2 : Ljava/lang/Object;
/*     */     //   425: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView
/*     */     //   428: astore #5
/*     */     //   430: aload #12
/*     */     //   432: getfield L$1 : Ljava/lang/Object;
/*     */     //   435: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*     */     //   438: astore #4
/*     */     //   440: aload #12
/*     */     //   442: getfield L$0 : Ljava/lang/Object;
/*     */     //   445: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   448: astore_0
/*     */     //   449: aload #11
/*     */     //   451: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   454: aload #11
/*     */     //   456: pop
/*     */     //   457: iload_3
/*     */     //   458: ifeq -> 558
/*     */     //   461: aload_0
/*     */     //   462: aload #6
/*     */     //   464: aload #12
/*     */     //   466: aload #12
/*     */     //   468: aload_0
/*     */     //   469: putfield L$0 : Ljava/lang/Object;
/*     */     //   472: aload #12
/*     */     //   474: aload #4
/*     */     //   476: putfield L$1 : Ljava/lang/Object;
/*     */     //   479: aload #12
/*     */     //   481: aload #5
/*     */     //   483: putfield L$2 : Ljava/lang/Object;
/*     */     //   486: aload #12
/*     */     //   488: aload #6
/*     */     //   490: putfield L$3 : Ljava/lang/Object;
/*     */     //   493: aload #12
/*     */     //   495: iconst_4
/*     */     //   496: putfield label : I
/*     */     //   499: invokespecial disableSavingHistory : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   502: dup
/*     */     //   503: aload #13
/*     */     //   505: if_acmpne -> 557
/*     */     //   508: aload #13
/*     */     //   510: areturn
/*     */     //   511: aload #12
/*     */     //   513: getfield L$3 : Ljava/lang/Object;
/*     */     //   516: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession
/*     */     //   519: astore #6
/*     */     //   521: aload #12
/*     */     //   523: getfield L$2 : Ljava/lang/Object;
/*     */     //   526: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView
/*     */     //   529: astore #5
/*     */     //   531: aload #12
/*     */     //   533: getfield L$1 : Ljava/lang/Object;
/*     */     //   536: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*     */     //   539: astore #4
/*     */     //   541: aload #12
/*     */     //   543: getfield L$0 : Ljava/lang/Object;
/*     */     //   546: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   549: astore_0
/*     */     //   550: aload #11
/*     */     //   552: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   555: aload #11
/*     */     //   557: pop
/*     */     //   558: aload_0
/*     */     //   559: getfield eventHandler : Lkotlin/jvm/functions/Function1;
/*     */     //   562: dup
/*     */     //   563: ifnull -> 607
/*     */     //   566: astore #8
/*     */     //   568: iconst_0
/*     */     //   569: istore #9
/*     */     //   571: new com/intellij/ml/llm/matterhorn/TerminalSessionStartedEvent
/*     */     //   574: dup
/*     */     //   575: aload_0
/*     */     //   576: invokevirtual getUuid$ej_core : ()Ljava/lang/String;
/*     */     //   579: aload_0
/*     */     //   580: aload #4
/*     */     //   582: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;)Lkotlin/jvm/functions/Function0;
/*     */     //   587: invokespecial <init> : (Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
/*     */     //   590: astore #10
/*     */     //   592: aload #8
/*     */     //   594: aload #10
/*     */     //   596: invokeinterface invoke : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   601: pop
/*     */     //   602: nop
/*     */     //   603: nop
/*     */     //   604: goto -> 609
/*     */     //   607: pop
/*     */     //   608: nop
/*     */     //   609: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess
/*     */     //   612: dup
/*     */     //   613: aload #6
/*     */     //   615: aload #5
/*     */     //   617: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;)V
/*     */     //   620: areturn
/*     */     //   621: new java/lang/IllegalStateException
/*     */     //   624: dup
/*     */     //   625: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   628: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   631: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #92	-> 60
/*     */     //   #93	-> 105
/*     */     //   #94	-> 118
/*     */     //   #96	-> 120
/*     */     //   #92	-> 160
/*     */     //   #97	-> 190
/*     */     //   #98	-> 206
/*     */     //   #99	-> 213
/*     */     //   #92	-> 269
/*     */     //   #101	-> 324
/*     */     //   #102	-> 342
/*     */     //   #92	-> 401
/*     */     //   #104	-> 456
/*     */     //   #105	-> 461
/*     */     //   #92	-> 508
/*     */     //   #108	-> 557
/*     */     //   #109	-> 571
/*     */     //   #112	-> 592
/*     */     //   #113	-> 602
/*     */     //   #108	-> 603
/*     */     //   #108	-> 607
/*     */     //   #115	-> 609
/*     */     //   #92	-> 621
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	58	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   178	94	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   317	87	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   449	62	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   550	42	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   118	13	2	initialSize	Lcom/jediterm/core/util/TermSize;
/*     */     //   120	43	3	disableSavingHistory	Z
/*     */     //   169	103	3	disableSavingHistory	Z
/*     */     //   278	126	3	disableSavingHistory	Z
/*     */     //   410	51	3	disableSavingHistory	Z
/*     */     //   190	82	4	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   308	96	4	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   440	71	4	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   541	51	4	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   206	66	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   298	106	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   430	81	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   531	72	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   603	1	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   604	17	5	view	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/BlockTerminalView;
/*     */     //   213	59	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   288	116	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   420	91	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   521	82	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   603	1	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   604	17	6	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   342	53	7	changeToWorkDir	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;
/*     */     //   568	35	8	handler	Lkotlin/jvm/functions/Function1;
/*     */     //   592	11	10	event	Lcom/intellij/ml/llm/matterhorn/TerminalSessionStartedEvent;
/*     */     //   571	32	9	$i$a$-let-BlockTerminalShellExecutor$startSessionAndCreateView$2	I
/*     */     //   0	632	1	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	571	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	564	11	$result	Ljava/lang/Object;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Unit startSessionAndCreateView$lambda$3$lambda$2(BlockTerminalShellExecutor this$0, TerminalWidgetImpl $widget) {
/* 110 */     OpenTerminalKt.openTerminalEditor(this$0.getUuid$ej_core(), $widget);
/* 111 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Object startBlockTerminalWidget(String shellPathOrNull, Disposable parentDisposable, TermSize initialTermSize, boolean disableSavingHistory, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startBlockTerminalWidget$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startBlockTerminalWidget$1
/*     */     //   13: astore #12
/*     */     //   15: aload #12
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #12
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$startBlockTerminalWidget$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #5
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #12
/*     */     //   53: aload #12
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #11
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #13
/*     */     //   65: aload #12
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 243, 0 -> 92, 1 -> 171
/*     */     //   92: aload #11
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: aload_2
/*     */     //   99: invokespecial hackBlockTerminalRegistry : (Lcom/intellij/openapi/Disposable;)Lcom/intellij/openapi/Disposable;
/*     */     //   102: astore #6
/*     */     //   104: new com/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner
/*     */     //   107: dup
/*     */     //   108: aload_0
/*     */     //   109: getfield scope : Lkotlinx/coroutines/CoroutineScope;
/*     */     //   112: aload_0
/*     */     //   113: getfield project : Lcom/intellij/openapi/project/Project;
/*     */     //   116: invokespecial <init> : (Lkotlinx/coroutines/CoroutineScope;Lcom/intellij/openapi/project/Project;)V
/*     */     //   119: astore #7
/*     */     //   121: aload_0
/*     */     //   122: aload_1
/*     */     //   123: aload_3
/*     */     //   124: iload #4
/*     */     //   126: ifeq -> 133
/*     */     //   129: iconst_1
/*     */     //   130: goto -> 134
/*     */     //   133: iconst_0
/*     */     //   134: invokespecial setupBaseOptions : (Ljava/lang/String;Lcom/jediterm/core/util/TermSize;Z)Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   137: astore #8
/*     */     //   139: aload #7
/*     */     //   141: aload_2
/*     */     //   142: aload #8
/*     */     //   144: aload #12
/*     */     //   146: aload #12
/*     */     //   148: aload #6
/*     */     //   150: putfield L$0 : Ljava/lang/Object;
/*     */     //   153: aload #12
/*     */     //   155: iconst_1
/*     */     //   156: putfield label : I
/*     */     //   159: invokevirtual launchJunieTerminalWidget$ej_core : (Lcom/intellij/openapi/Disposable;Lorg/jetbrains/plugins/terminal/ShellStartupOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   162: dup
/*     */     //   163: aload #13
/*     */     //   165: if_acmpne -> 188
/*     */     //   168: aload #13
/*     */     //   170: areturn
/*     */     //   171: aload #12
/*     */     //   173: getfield L$0 : Ljava/lang/Object;
/*     */     //   176: checkcast com/intellij/openapi/Disposable
/*     */     //   179: astore #6
/*     */     //   181: aload #11
/*     */     //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   186: aload #11
/*     */     //   188: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl
/*     */     //   191: astore #9
/*     */     //   193: nop
/*     */     //   194: aload #9
/*     */     //   196: invokevirtual getSessionInitializedPromise : ()Ljava/util/concurrent/CompletableFuture;
/*     */     //   199: ldc2_w 30
/*     */     //   202: getstatic java/util/concurrent/TimeUnit.SECONDS : Ljava/util/concurrent/TimeUnit;
/*     */     //   205: invokevirtual get : (JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
/*     */     //   208: checkcast java/lang/Boolean
/*     */     //   211: pop
/*     */     //   212: aload #6
/*     */     //   214: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */     //   217: goto -> 240
/*     */     //   220: astore #10
/*     */     //   222: new com/intellij/ml/llm/matterhorn/ShellExecutor$ShellInitException
/*     */     //   225: dup
/*     */     //   226: invokespecial <init> : ()V
/*     */     //   229: athrow
/*     */     //   230: astore #10
/*     */     //   232: aload #6
/*     */     //   234: invokestatic dispose : (Lcom/intellij/openapi/Disposable;)V
/*     */     //   237: aload #10
/*     */     //   239: athrow
/*     */     //   240: aload #9
/*     */     //   242: areturn
/*     */     //   243: new java/lang/IllegalStateException
/*     */     //   246: dup
/*     */     //   247: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   250: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   253: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #118	-> 63
/*     */     //   #125	-> 97
/*     */     //   #127	-> 104
/*     */     //   #128	-> 121
/*     */     //   #129	-> 139
/*     */     //   #118	-> 168
/*     */     //   #131	-> 193
/*     */     //   #132	-> 194
/*     */     //   #137	-> 212
/*     */     //   #138	-> 217
/*     */     //   #133	-> 220
/*     */     //   #134	-> 222
/*     */     //   #137	-> 230
/*     */     //   #140	-> 240
/*     */     //   #118	-> 243
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	36	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   97	36	1	shellPathOrNull	Ljava/lang/String;
/*     */     //   97	65	2	parentDisposable	Lcom/intellij/openapi/Disposable;
/*     */     //   97	36	3	initialTermSize	Lcom/jediterm/core/util/TermSize;
/*     */     //   97	36	4	disableSavingHistory	Z
/*     */     //   104	67	6	registryCleanup	Lcom/intellij/openapi/Disposable;
/*     */     //   181	36	6	registryCleanup	Lcom/intellij/openapi/Disposable;
/*     */     //   220	10	6	registryCleanup	Lcom/intellij/openapi/Disposable;
/*     */     //   230	13	6	registryCleanup	Lcom/intellij/openapi/Disposable;
/*     */     //   121	41	7	runner	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalRunner;
/*     */     //   139	23	8	baseOptions	Lorg/jetbrains/plugins/terminal/ShellStartupOptions;
/*     */     //   193	27	9	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   240	3	9	widget	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/TerminalWidgetImpl;
/*     */     //   0	254	5	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	190	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	183	11	$result	Ljava/lang/Object;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   193	212	220	java/util/concurrent/TimeoutException
/*     */     //   193	212	230	finally
/*     */     //   220	230	230	finally
/*     */     //   230	232	230	finally
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final Disposable hackBlockTerminalRegistry(Disposable parentDisposable) {
/* 144 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(parentDisposable), "newDisposable(...)"); Disposable cleanup = Disposer.newDisposable(parentDisposable);
/*     */     
/* 146 */     Registry.Companion.get("terminal.new.ui").setValue(true, cleanup);
/* 147 */     Registry.Companion.get("terminal.new.ui.fish").setValue(true, cleanup);
/* 148 */     Registry.Companion.get("terminal.new.ui.powershell.win11").setValue(true, cleanup);
/* 149 */     Registry.Companion.get("terminal.new.ui.powershell.win10").setValue(true, cleanup);
/* 150 */     Registry.Companion.get("terminal.new.ui.powershell.unix").setValue(true, cleanup);
/*     */     
/* 152 */     return cleanup;
/*     */   }
/*     */   
/*     */   private final Object disableSavingHistory(BlockTerminalSession $this$disableSavingHistory, Continuation $completion) {
/* 156 */     if ($this$disableSavingHistory.getShellIntegration().getShellType() == ShellType.POWERSHELL) {
/*     */       
/* 158 */       ShellCommand disableCommand = launchShellCommand($this$disableSavingHistory, "Set-PSReadlineOption -HistorySaveStyle SaveNothing");
/* 159 */       if (disableCommand.getPromisedResult().await($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return disableCommand.getPromisedResult().await($completion);  disableCommand.getPromisedResult().await($completion); return Unit.INSTANCE;
/*     */     } 
/* 161 */     return Unit.INSTANCE;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final ShellStartupOptions setupBaseOptions(String shellPath, TermSize initialTermSize, boolean disableSavingHistory) {
/* 169 */     ShellStartupOptions.Builder it = new ShellStartupOptions.Builder(); int $i$a$-let-BlockTerminalShellExecutor$setupBaseOptions$1 = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 174 */     Pair[] arrayOfPair1 = new Pair[4]; arrayOfPair1[0] = TuplesKt.to("DISABLE_AUTO_UPDATE", "true");
/* 175 */     Pair pair1 = TuplesKt.to("HISTFILE", "/dev/null"), pair2 = pair1;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 343 */     boolean bool = true; Pair[] arrayOfPair2 = arrayOfPair1; ShellStartupOptions.Builder builder1 = ((shellPath == null) ? it : it.shellCommand(CollectionsKt.listOf(shellPath))).initialTermSize(initialTermSize); int $i$a$-takeIf-BlockTerminalShellExecutor$setupBaseOptions$2 = 0;
/*     */     boolean bool1 = disableSavingHistory;
/*     */     arrayOfPair2[bool] = bool1 ? pair1 : null;
/*     */     arrayOfPair1[2] = TuplesKt.to("GIT_PAGER", "cat");
/*     */     arrayOfPair1[3] = TuplesKt.to("BASH_SILENCE_DEPRECATION_WARNING", "1");
/*     */     return builder1.envVariables(MapsKt.toMap(CollectionsKt.listOfNotNull((Object[])arrayOfPair1))).build();
/*     */   }
/*     */   
/*     */   private final Object awaitFirstBlockFinalizedOrRemoved-8Mi8wO0(BlockTerminalView $this$awaitFirstBlockFinalizedOrRemoved_u2d8Mi8wO0, long duration, Continuation $completion) {
/*     */     CompletableDeferred<Unit> future = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
/*     */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(this.disposable, "awaitFirstBlockFinalizedOrRemoved"), "newDisposable(...)");
/*     */     Disposable cleanup = Disposer.newDisposable(this.disposable, "awaitFirstBlockFinalizedOrRemoved");
/*     */     TerminalOutputModel outputModel = $this$awaitFirstBlockFinalizedOrRemoved_u2d8Mi8wO0.getOutputView().getController().getOutputModel();
/*     */     outputModel.addListener(new BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2(future), cleanup);
/*     */     if (BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3(duration, cleanup, future, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3(duration, cleanup, future, null), $completion); 
/*     */     BuildersKt.withContext((CoroutineContext)Dispatchers.getIO(), new BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3(duration, cleanup, future, null), $completion);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\031\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H\026¨\006\007"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputModelListener;", "blockFinalized", "", "block", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/CommandBlock;", "blockRemoved", "ej-core"})
/*     */   public static final class BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2 implements TerminalOutputModelListener {
/*     */     BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$2(CompletableDeferred<Unit> $future) {}
/*     */     
/*     */     public void blockCreated(CommandBlock block) {
/*     */       TerminalOutputModelListener.DefaultImpls.blockCreated(this, block);
/*     */     }
/*     */     
/*     */     public void blockInfoUpdated(CommandBlock block, CommandBlockInfo newInfo) {
/*     */       TerminalOutputModelListener.DefaultImpls.blockInfoUpdated(this, block, newInfo);
/*     */     }
/*     */     
/*     */     public void blockFinalized(CommandBlock block) {
/*     */       Intrinsics.checkNotNullParameter(block, "block");
/*     */       this.$future.complete(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     public void blockRemoved(CommandBlock block) {
/*     */       Intrinsics.checkNotNullParameter(block, "block");
/*     */       this.$future.complete(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {202}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3(long $duration, Disposable $cleanup, CompletableDeferred<Unit> $future, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           try {
/*     */             this.label = 1;
/*     */             if (TimeoutKt.withTimeout-KLykuaI(this.$duration, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$future, null) {
/*     */                   int label;
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (this.$future.await((Continuation)this) == object)
/*     */                           return object; 
/*     */                         this.$future.await((Continuation)this);
/*     */                         return Unit.INSTANCE;
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$future, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }(Continuation)this) == object)
/*     */               return object; 
/*     */             TimeoutKt.withTimeout-KLykuaI(this.$duration, new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$future, null) {
/*     */                   int label;
/*     */                   
/*     */                   public final Object invokeSuspend(Object $result) {
/*     */                     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */                     switch (this.label) {
/*     */                       case 0:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         this.label = 1;
/*     */                         if (this.$future.await((Continuation)this) == object)
/*     */                           return object; 
/*     */                         this.$future.await((Continuation)this);
/*     */                         return Unit.INSTANCE;
/*     */                       case 1:
/*     */                         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */                         return Unit.INSTANCE;
/*     */                     } 
/*     */                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */                   }
/*     */                   
/*     */                   public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                     return (Continuation)new Function2<>(this.$future, $completion);
/*     */                   }
/*     */                   
/*     */                   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                     return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                   }
/*     */                 }(Continuation)this);
/*     */           } finally {
/*     */             Disposer.dispose(this.$cleanup);
/*     */           } 
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Disposer.dispose(this.$cleanup);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3> $completion) {
/*     */       return (Continuation<Unit>)new BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3(this.$duration, this.$cleanup, this.$future, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((BlockTerminalShellExecutor$awaitFirstBlockFinalizedOrRemoved$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object executeCommand(@NotNull String command, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$executeCommand$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$executeCommand$1
/*     */     //   11: astore #7
/*     */     //   13: aload #7
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #7
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$executeCommand$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #7
/*     */     //   50: aload #7
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #6
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #8
/*     */     //   62: aload #7
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 290, 0 -> 92, 1 -> 135, 2 -> 222
/*     */     //   92: aload #6
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: invokespecial getTerminalAccess : ()Lkotlinx/coroutines/Deferred;
/*     */     //   101: aload #7
/*     */     //   103: aload #7
/*     */     //   105: aload_0
/*     */     //   106: putfield L$0 : Ljava/lang/Object;
/*     */     //   109: aload #7
/*     */     //   111: aload_1
/*     */     //   112: putfield L$1 : Ljava/lang/Object;
/*     */     //   115: aload #7
/*     */     //   117: iconst_1
/*     */     //   118: putfield label : I
/*     */     //   121: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   126: dup
/*     */     //   127: aload #8
/*     */     //   129: if_acmpne -> 160
/*     */     //   132: aload #8
/*     */     //   134: areturn
/*     */     //   135: aload #7
/*     */     //   137: getfield L$1 : Ljava/lang/Object;
/*     */     //   140: checkcast java/lang/String
/*     */     //   143: astore_1
/*     */     //   144: aload #7
/*     */     //   146: getfield L$0 : Ljava/lang/Object;
/*     */     //   149: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor
/*     */     //   152: astore_0
/*     */     //   153: aload #6
/*     */     //   155: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   158: aload #6
/*     */     //   160: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess
/*     */     //   163: invokevirtual component1 : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   166: astore_3
/*     */     //   167: aload_0
/*     */     //   168: aload_3
/*     */     //   169: aload_1
/*     */     //   170: invokespecial launchShellCommand : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;
/*     */     //   173: astore #4
/*     */     //   175: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor.Companion : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion;
/*     */     //   178: aload_0
/*     */     //   179: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor
/*     */     //   182: aload #4
/*     */     //   184: invokeinterface getPromisedResult : ()Lkotlinx/coroutines/Deferred;
/*     */     //   189: aload #7
/*     */     //   191: aload #7
/*     */     //   193: aload #4
/*     */     //   195: putfield L$0 : Ljava/lang/Object;
/*     */     //   198: aload #7
/*     */     //   200: aconst_null
/*     */     //   201: putfield L$1 : Ljava/lang/Object;
/*     */     //   204: aload #7
/*     */     //   206: iconst_2
/*     */     //   207: putfield label : I
/*     */     //   210: invokevirtual waitForCommandCompletion : (Lcom/intellij/ml/llm/matterhorn/ShellExecutor;Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   213: dup
/*     */     //   214: aload #8
/*     */     //   216: if_acmpne -> 239
/*     */     //   219: aload #8
/*     */     //   221: areturn
/*     */     //   222: aload #7
/*     */     //   224: getfield L$0 : Ljava/lang/Object;
/*     */     //   227: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand
/*     */     //   230: astore #4
/*     */     //   232: aload #6
/*     */     //   234: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   237: aload #6
/*     */     //   239: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus
/*     */     //   242: astore #5
/*     */     //   244: aload #5
/*     */     //   246: getstatic com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */     //   249: swap
/*     */     //   250: invokevirtual ordinal : ()I
/*     */     //   253: iaload
/*     */     //   254: iconst_1
/*     */     //   255: if_icmpne -> 276
/*     */     //   258: aload #4
/*     */     //   260: invokeinterface getPromisedResult : ()Lkotlinx/coroutines/Deferred;
/*     */     //   265: invokeinterface getCompleted : ()Ljava/lang/Object;
/*     */     //   270: checkcast com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */     //   273: goto -> 289
/*     */     //   276: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */     //   279: dup
/*     */     //   280: aload #5
/*     */     //   282: invokevirtual getAgentMessage : ()Ljava/lang/String;
/*     */     //   285: iconst_m1
/*     */     //   286: invokespecial <init> : (Ljava/lang/String;I)V
/*     */     //   289: areturn
/*     */     //   290: new java/lang/IllegalStateException
/*     */     //   293: dup
/*     */     //   294: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   297: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   300: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #211	-> 60
/*     */     //   #213	-> 97
/*     */     //   #211	-> 132
/*     */     //   #213	-> 160
/*     */     //   #215	-> 167
/*     */     //   #217	-> 175
/*     */     //   #211	-> 219
/*     */     //   #218	-> 244
/*     */     //   #219	-> 254
/*     */     //   #220	-> 276
/*     */     //   #218	-> 289
/*     */     //   #211	-> 290
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	38	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   153	60	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   97	38	1	command	Ljava/lang/String;
/*     */     //   144	31	1	command	Ljava/lang/String;
/*     */     //   167	8	3	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   175	47	4	shellCommand	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;
/*     */     //   232	44	4	shellCommand	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;
/*     */     //   244	32	5	completionStatus	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   276	13	5	completionStatus	Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */     //   0	301	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	240	7	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	233	6	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object sendControlSequence(@NotNull byte[] bytes, @NotNull Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$sendControlSequence$1
/*     */     //   4: ifeq -> 39
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$sendControlSequence$1
/*     */     //   11: astore #5
/*     */     //   13: aload #5
/*     */     //   15: getfield label : I
/*     */     //   18: ldc -2147483648
/*     */     //   20: iand
/*     */     //   21: ifeq -> 39
/*     */     //   24: aload #5
/*     */     //   26: dup
/*     */     //   27: getfield label : I
/*     */     //   30: ldc -2147483648
/*     */     //   32: isub
/*     */     //   33: putfield label : I
/*     */     //   36: goto -> 50
/*     */     //   39: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$sendControlSequence$1
/*     */     //   42: dup
/*     */     //   43: aload_0
/*     */     //   44: aload_2
/*     */     //   45: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;Lkotlin/coroutines/Continuation;)V
/*     */     //   48: astore #5
/*     */     //   50: aload #5
/*     */     //   52: getfield result : Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   60: astore #6
/*     */     //   62: aload #5
/*     */     //   64: getfield label : I
/*     */     //   67: tableswitch default -> 163, 0 -> 88, 1 -> 125
/*     */     //   88: aload #4
/*     */     //   90: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   93: aload_0
/*     */     //   94: invokespecial getTerminalAccess : ()Lkotlinx/coroutines/Deferred;
/*     */     //   97: aload #5
/*     */     //   99: aload #5
/*     */     //   101: aload_1
/*     */     //   102: putfield L$0 : Ljava/lang/Object;
/*     */     //   105: aload #5
/*     */     //   107: iconst_1
/*     */     //   108: putfield label : I
/*     */     //   111: invokeinterface await : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   116: dup
/*     */     //   117: aload #6
/*     */     //   119: if_acmpne -> 141
/*     */     //   122: aload #6
/*     */     //   124: areturn
/*     */     //   125: aload #5
/*     */     //   127: getfield L$0 : Ljava/lang/Object;
/*     */     //   130: checkcast [B
/*     */     //   133: astore_1
/*     */     //   134: aload #4
/*     */     //   136: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   139: aload #4
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$TerminalAccess
/*     */     //   144: invokevirtual component1 : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   147: astore_3
/*     */     //   148: aload_3
/*     */     //   149: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
/*     */     //   152: aload_1
/*     */     //   153: iconst_0
/*     */     //   154: invokeinterface sendBytes : ([BZ)V
/*     */     //   159: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   162: areturn
/*     */     //   163: new java/lang/IllegalStateException
/*     */     //   166: dup
/*     */     //   167: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   170: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   173: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #224	-> 60
/*     */     //   #225	-> 93
/*     */     //   #224	-> 122
/*     */     //   #225	-> 141
/*     */     //   #226	-> 148
/*     */     //   #227	-> 159
/*     */     //   #224	-> 163
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   93	23	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor;
/*     */     //   93	32	1	bytes	[B
/*     */     //   134	29	1	bytes	[B
/*     */     //   148	15	3	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     //   0	174	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   50	113	5	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   57	106	4	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final ShellCommand launchShellCommand(BlockTerminalSession $this$launchShellCommand, String command) {
/*     */     int maxHistoryBuffer = this.settingsProvider.getBufferMaxLinesCount();
/*     */     this.lastCommandSnapshots.tryEmit("");
/*     */     PreparedShellCommand shellCommand = new PreparedShellCommand(command, getCancellationPolicy().getOutputLinesLimit(), maxHistoryBuffer, this.lastCommandSnapshots);
/*     */     shellCommand.launchInSession($this$launchShellCommand);
/*     */     return shellCommand;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\007\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\f\020\007\032\b\022\004\022\0020\0030\b¢\006\004\b\t\020\nJ\f\020\026\032\0020\003*\0020\003H\002J\016\020\027\032\0020\0302\006\020\031\032\0020\032J\020\020\033\032\0020\0032\006\020\034\032\0020\003H\002R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\013\020\fR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\005X\004¢\006\002\n\000R\032\020\007\032\b\022\004\022\0020\0030\bX\004¢\006\b\n\000\032\004\b\r\020\016R\032\020\017\032\b\022\004\022\0020\0210\020X\004¢\006\b\n\000\032\004\b\022\020\023R\016\020\024\032\0020\025X.¢\006\002\n\000¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;", "command", "", "outputLinesLimit", "", "historyLinesLimit", "outputFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "<init>", "(Ljava/lang/String;IILkotlinx/coroutines/flow/MutableStateFlow;)V", "getCommand", "()Ljava/lang/String;", "getOutputFlow", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "promisedResult", "Lkotlinx/coroutines/CompletableDeferred;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "getPromisedResult", "()Lkotlinx/coroutines/CompletableDeferred;", "disposable", "Lcom/intellij/openapi/Disposable;", "toDebug", "launchInSession", "Lkotlinx/coroutines/Job;", "session", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;", "normalizeActualOutput", "output", "ej-core"})
/*     */   @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand\n*L\n275#1:343\n275#1:344,5\n*E\n"})
/*     */   private static final class PreparedShellCommand implements ShellCommand {
/*     */     @NotNull
/*     */     private final String command;
/*     */     private final int outputLinesLimit;
/*     */     private final int historyLinesLimit;
/*     */     @NotNull
/*     */     private final MutableStateFlow<String> outputFlow;
/*     */     @NotNull
/*     */     private final CompletableDeferred<ShellExecutor.CommandResult> promisedResult;
/*     */     private Disposable disposable;
/*     */     
/*     */     public PreparedShellCommand(@NotNull String command, int outputLinesLimit, int historyLinesLimit, @NotNull MutableStateFlow<String> outputFlow) {
/*     */       this.command = command;
/*     */       this.outputLinesLimit = outputLinesLimit;
/*     */       this.historyLinesLimit = historyLinesLimit;
/*     */       this.outputFlow = outputFlow;
/*     */       this.promisedResult = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
/*     */       getPromisedResult().invokeOnCompletion(this::_init_$lambda$0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getCommand() {
/*     */       return this.command;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public MutableStateFlow<String> getOutputFlow() {
/*     */       return this.outputFlow;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public CompletableDeferred<ShellExecutor.CommandResult> getPromisedResult() {
/*     */       return this.promisedResult;
/*     */     }
/*     */     
/*     */     private static final Unit _init_$lambda$0(PreparedShellCommand this$0, Throwable it) {
/*     */       if (this$0.disposable != null) {
/*     */         if (this$0.disposable == null)
/*     */           Intrinsics.throwUninitializedPropertyAccessException("disposable"); 
/*     */         Disposer.dispose(null);
/*     */       } 
/*     */       return Unit.INSTANCE;
/*     */     }
/*     */     
/*     */     private final String toDebug(String $this$toDebug) {
/*     */       int length = $this$toDebug.length();
/*     */       CharSequence charSequence = $this$toDebug;
/*     */       Regex regex = new Regex("[\r\n]");
/*     */       String str1 = "\\n";
/*     */       charSequence = regex.replace(charSequence, str1);
/*     */       regex = new Regex("\\s{3,}");
/*     */       str1 = " . ";
/*     */       String noSpaces = regex.replace(charSequence, str1);
/*     */       String safeText = "{" + length + "}:`" + StringUtil.firstLast(noSpaces, 30) + "`";
/*     */       return ((((CharSequence)$this$toDebug).length() == 0)) ? "<empty>" : (StringsKt.isBlank($this$toDebug) ? "<blank>" : safeText);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Job launchInSession(@NotNull BlockTerminalSession session) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'session'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_0
/*     */       //   7: astore_2
/*     */       //   8: iconst_0
/*     */       //   9: istore_3
/*     */       //   10: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand
/*     */       //   12: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   15: dup
/*     */       //   16: ldc 'getInstance(...)'
/*     */       //   18: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   21: astore_2
/*     */       //   22: nop
/*     */       //   23: aconst_null
/*     */       //   24: astore_3
/*     */       //   25: iconst_0
/*     */       //   26: istore #4
/*     */       //   28: aload_2
/*     */       //   29: invokevirtual isDebugEnabled : ()Z
/*     */       //   32: ifeq -> 57
/*     */       //   35: aload_2
/*     */       //   36: astore #6
/*     */       //   38: iconst_0
/*     */       //   39: istore #5
/*     */       //   41: aload_0
/*     */       //   42: invokevirtual getCommand : ()Ljava/lang/String;
/*     */       //   45: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */       //   50: aload #6
/*     */       //   52: swap
/*     */       //   53: aload_3
/*     */       //   54: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */       //   57: nop
/*     */       //   58: aload_0
/*     */       //   59: aload_1
/*     */       //   60: checkcast com/intellij/openapi/Disposable
/*     */       //   63: invokestatic newDisposable : (Lcom/intellij/openapi/Disposable;)Lcom/intellij/openapi/Disposable;
/*     */       //   66: putfield disposable : Lcom/intellij/openapi/Disposable;
/*     */       //   69: new com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl
/*     */       //   72: dup
/*     */       //   73: aload_1
/*     */       //   74: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V
/*     */       //   77: astore_2
/*     */       //   78: aload_1
/*     */       //   79: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel;
/*     */       //   82: invokevirtual getTextBuffer$ej_core : ()Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */       //   85: astore_3
/*     */       //   86: aload_2
/*     */       //   87: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper
/*     */       //   90: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
/*     */       //   93: dup
/*     */       //   94: aload_0
/*     */       //   95: aload_3
/*     */       //   96: aload_1
/*     */       //   97: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Lcom/jediterm/terminal/model/TerminalTextBuffer;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;)V
/*     */       //   100: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener
/*     */       //   103: aload_0
/*     */       //   104: getfield disposable : Lcom/intellij/openapi/Disposable;
/*     */       //   107: dup
/*     */       //   108: ifnonnull -> 118
/*     */       //   111: pop
/*     */       //   112: ldc 'disposable'
/*     */       //   114: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */       //   117: aconst_null
/*     */       //   118: iconst_0
/*     */       //   119: iconst_4
/*     */       //   120: aconst_null
/*     */       //   121: invokestatic addListener$default : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraper;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;Lcom/intellij/openapi/Disposable;ZILjava/lang/Object;)V
/*     */       //   124: aload_1
/*     */       //   125: invokevirtual getCommandManager$ej_core : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandManager;
/*     */       //   128: new com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */       //   131: dup
/*     */       //   132: aload_2
/*     */       //   133: aload_0
/*     */       //   134: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)V
/*     */       //   137: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener
/*     */       //   140: aload_0
/*     */       //   141: getfield disposable : Lcom/intellij/openapi/Disposable;
/*     */       //   144: dup
/*     */       //   145: ifnonnull -> 155
/*     */       //   148: pop
/*     */       //   149: ldc 'disposable'
/*     */       //   151: invokestatic throwUninitializedPropertyAccessException : (Ljava/lang/String;)V
/*     */       //   154: aconst_null
/*     */       //   155: invokevirtual addListener : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;Lcom/intellij/openapi/Disposable;)V
/*     */       //   158: aload_1
/*     */       //   159: invokevirtual getCommandExecutionManager$ej_core : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandExecutionManager;
/*     */       //   162: aload_0
/*     */       //   163: invokevirtual getCommand : ()Ljava/lang/String;
/*     */       //   166: invokeinterface sendCommandToExecute : (Ljava/lang/String;)V
/*     */       //   171: aload_0
/*     */       //   172: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */       //   175: checkcast kotlinx/coroutines/Job
/*     */       //   178: areturn
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #275	-> 6
/*     */       //   #343	-> 10
/*     */       //   #275	-> 22
/*     */       //   #344	-> 23
/*     */       //   #345	-> 28
/*     */       //   #346	-> 35
/*     */       //   #276	-> 41
/*     */       //   #346	-> 53
/*     */       //   #348	-> 57
/*     */       //   #278	-> 58
/*     */       //   #279	-> 69
/*     */       //   #280	-> 78
/*     */       //   #281	-> 86
/*     */       //   #307	-> 103
/*     */       //   #281	-> 118
/*     */       //   #309	-> 124
/*     */       //   #318	-> 140
/*     */       //   #309	-> 155
/*     */       //   #320	-> 158
/*     */       //   #322	-> 171
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   10	11	3	$i$f$thisLogger	I
/*     */       //   8	13	2	$this$thisLogger$iv	Ljava/lang/Object;
/*     */       //   41	9	5	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$1	I
/*     */       //   28	30	4	$i$f$debug	I
/*     */       //   23	35	2	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */       //   25	33	3	e$iv	Ljava/lang/Exception;
/*     */       //   78	101	2	scraper	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;
/*     */       //   86	93	3	textBuffer	Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */       //   0	179	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */       //   0	179	1	session	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputListener;", "commandOutputChanged", "", "output", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;", "ej-core"})
/*     */     @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2\n*L\n290#1:343\n290#1:344,5\n*E\n"})
/*     */     public static final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2 implements ShellCommandOutputListener {
/*     */       BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2(TerminalTextBuffer $textBuffer, BlockTerminalSession $session) {}
/*     */       
/*     */       public void commandOutputChanged(StyledCommandOutput output) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: ldc 'output'
/*     */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   6: aload_0
/*     */         //   7: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   10: invokevirtual getOutputFlow : ()Lkotlinx/coroutines/flow/MutableStateFlow;
/*     */         //   13: aload_1
/*     */         //   14: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   17: invokeinterface tryEmit : (Ljava/lang/Object;)Z
/*     */         //   22: pop
/*     */         //   23: aload_1
/*     */         //   24: invokevirtual getText : ()Ljava/lang/String;
/*     */         //   27: astore_2
/*     */         //   28: aload_2
/*     */         //   29: checkcast java/lang/CharSequence
/*     */         //   32: invokestatic countNewLines : (Ljava/lang/CharSequence;)I
/*     */         //   35: istore_3
/*     */         //   36: iload_3
/*     */         //   37: aload_0
/*     */         //   38: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   41: invokestatic access$getOutputLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */         //   44: if_icmpge -> 66
/*     */         //   47: aload_0
/*     */         //   48: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */         //   51: invokevirtual getHistoryLinesCount : ()I
/*     */         //   54: iconst_1
/*     */         //   55: iadd
/*     */         //   56: aload_0
/*     */         //   57: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   60: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */         //   63: if_icmplt -> 70
/*     */         //   66: iconst_1
/*     */         //   67: goto -> 71
/*     */         //   70: iconst_0
/*     */         //   71: istore #4
/*     */         //   73: iload #4
/*     */         //   75: ifeq -> 243
/*     */         //   78: aload_0
/*     */         //   79: astore #5
/*     */         //   81: iconst_0
/*     */         //   82: istore #6
/*     */         //   84: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2
/*     */         //   86: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   89: dup
/*     */         //   90: ldc 'getInstance(...)'
/*     */         //   92: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   95: astore #5
/*     */         //   97: aload_0
/*     */         //   98: getfield $textBuffer : Lcom/jediterm/terminal/model/TerminalTextBuffer;
/*     */         //   101: astore #7
/*     */         //   103: aload_0
/*     */         //   104: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   107: astore #8
/*     */         //   109: aconst_null
/*     */         //   110: astore #6
/*     */         //   112: iconst_0
/*     */         //   113: istore #9
/*     */         //   115: aload #5
/*     */         //   117: invokevirtual isDebugEnabled : ()Z
/*     */         //   120: ifeq -> 173
/*     */         //   123: aload #5
/*     */         //   125: astore #13
/*     */         //   127: iconst_0
/*     */         //   128: istore #10
/*     */         //   130: aload #7
/*     */         //   132: invokevirtual getHistoryLinesCount : ()I
/*     */         //   135: istore #11
/*     */         //   137: aload #7
/*     */         //   139: invokevirtual getScreenLinesCount : ()I
/*     */         //   142: istore #12
/*     */         //   144: aload #8
/*     */         //   146: aload_2
/*     */         //   147: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   150: iload_3
/*     */         //   151: aload #8
/*     */         //   153: invokestatic access$getHistoryLinesLimit$p : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;)I
/*     */         //   156: iload #11
/*     */         //   158: iload #12
/*     */         //   160: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;IIII)Ljava/lang/String;
/*     */         //   165: aload #13
/*     */         //   167: swap
/*     */         //   168: aload #6
/*     */         //   170: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */         //   173: nop
/*     */         //   174: aload_0
/*     */         //   175: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   178: aload_2
/*     */         //   179: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   182: getstatic com/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus.LINE_LIMIT_EXCEEDED : Lcom/intellij/ml/llm/matterhorn/ShellExecutor$Companion$CompletionStatus;
/*     */         //   185: invokevirtual getAgentMessage : ()Ljava/lang/String;
/*     */         //   188: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   193: astore #5
/*     */         //   195: aload_0
/*     */         //   196: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   199: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */         //   202: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */         //   205: dup
/*     */         //   206: aload #5
/*     */         //   208: iconst_m1
/*     */         //   209: invokespecial <init> : (Ljava/lang/String;I)V
/*     */         //   212: invokeinterface complete : (Ljava/lang/Object;)Z
/*     */         //   217: pop
/*     */         //   218: aload_0
/*     */         //   219: getfield $session : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/BlockTerminalSession;
/*     */         //   222: invokevirtual getTerminalOutputStream$ej_core : ()Lcom/jediterm/terminal/TerminalOutputStream;
/*     */         //   225: iconst_1
/*     */         //   226: newarray byte
/*     */         //   228: astore #6
/*     */         //   230: aload #6
/*     */         //   232: iconst_0
/*     */         //   233: iconst_3
/*     */         //   234: bastore
/*     */         //   235: aload #6
/*     */         //   237: iconst_0
/*     */         //   238: invokeinterface sendBytes : ([BZ)V
/*     */         //   243: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #283	-> 6
/*     */         //   #285	-> 23
/*     */         //   #286	-> 28
/*     */         //   #287	-> 36
/*     */         //   #289	-> 73
/*     */         //   #290	-> 78
/*     */         //   #343	-> 84
/*     */         //   #290	-> 97
/*     */         //   #344	-> 109
/*     */         //   #345	-> 115
/*     */         //   #346	-> 123
/*     */         //   #291	-> 130
/*     */         //   #292	-> 137
/*     */         //   #293	-> 144
/*     */         //   #294	-> 150
/*     */         //   #295	-> 156
/*     */         //   #346	-> 168
/*     */         //   #348	-> 173
/*     */         //   #299	-> 174
/*     */         //   #300	-> 182
/*     */         //   #299	-> 193
/*     */         //   #301	-> 195
/*     */         //   #303	-> 218
/*     */         //   #306	-> 243
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   84	11	6	$i$f$thisLogger	I
/*     */         //   81	14	5	$this$thisLogger$iv	Ljava/lang/Object;
/*     */         //   130	35	10	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2$commandOutputChanged$1	I
/*     */         //   137	28	11	historyLines	I
/*     */         //   144	21	12	screenLines	I
/*     */         //   115	59	9	$i$f$debug	I
/*     */         //   109	65	5	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   112	62	6	e$iv	Ljava/lang/Exception;
/*     */         //   195	48	5	normalizedText	Ljava/lang/String;
/*     */         //   28	216	2	text	Ljava/lang/String;
/*     */         //   36	208	3	newLines	I
/*     */         //   73	171	4	reachedTheLimit	Z
/*     */         //   0	244	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$2;
/*     */         //   0	244	1	output	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandListener;", "commandFinished", "", "event", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;", "ej-core"})
/*     */     @SourceDebugExtension({"SMAP\nBlockTerminalShellExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n+ 2 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,342:1\n24#2:343\n61#2,5:344\n*S KotlinDebug\n*F\n+ 1 BlockTerminalShellExecutor.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3\n*L\n312#1:343\n312#1:344,5\n*E\n"})
/*     */     public static final class BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3 implements ShellCommandListener {
/*     */       BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3(BlockTerminalShellExecutor.PreparedShellCommand $receiver) {}
/*     */       
/*     */       public void initialized() {
/*     */         ShellCommandListener.DefaultImpls.initialized(this);
/*     */       }
/*     */       
/*     */       public void promptShown() {
/*     */         ShellCommandListener.DefaultImpls.promptShown(this);
/*     */       }
/*     */       
/*     */       public void commandStarted(String command) {
/*     */         ShellCommandListener.DefaultImpls.commandStarted(this, command);
/*     */       }
/*     */       
/*     */       public void promptStateUpdated(TerminalPromptState newState) {
/*     */         ShellCommandListener.DefaultImpls.promptStateUpdated(this, newState);
/*     */       }
/*     */       
/*     */       public void commandHistoryReceived(String history) {
/*     */         ShellCommandListener.DefaultImpls.commandHistoryReceived(this, history);
/*     */       }
/*     */       
/*     */       public void commandBufferReceived(String buffer) {
/*     */         ShellCommandListener.DefaultImpls.commandBufferReceived(this, buffer);
/*     */       }
/*     */       
/*     */       public void shellInfoReceived(String rawShellInfo) {
/*     */         ShellCommandListener.DefaultImpls.shellInfoReceived(this, rawShellInfo);
/*     */       }
/*     */       
/*     */       public void generatorFinished(GeneratorFinishedEvent event) {
/*     */         ShellCommandListener.DefaultImpls.generatorFinished(this, event);
/*     */       }
/*     */       
/*     */       public void clearInvoked() {
/*     */         ShellCommandListener.DefaultImpls.clearInvoked(this);
/*     */       }
/*     */       
/*     */       public void commandFinished(CommandFinishedEvent event) {
/*     */         // Byte code:
/*     */         //   0: aload_1
/*     */         //   1: ldc 'event'
/*     */         //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   6: aload_0
/*     */         //   7: getfield $scraper : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/ShellCommandOutputScraperImpl;
/*     */         //   10: invokevirtual scrapeOutput : ()Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/StyledCommandOutput;
/*     */         //   13: invokevirtual component1 : ()Ljava/lang/String;
/*     */         //   16: astore_2
/*     */         //   17: aload_0
/*     */         //   18: astore_3
/*     */         //   19: iconst_0
/*     */         //   20: istore #4
/*     */         //   22: ldc com/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3
/*     */         //   24: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   27: dup
/*     */         //   28: ldc 'getInstance(...)'
/*     */         //   30: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */         //   33: astore_3
/*     */         //   34: aload_0
/*     */         //   35: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   38: astore #5
/*     */         //   40: aconst_null
/*     */         //   41: astore #4
/*     */         //   43: iconst_0
/*     */         //   44: istore #6
/*     */         //   46: aload_3
/*     */         //   47: invokevirtual isDebugEnabled : ()Z
/*     */         //   50: ifeq -> 79
/*     */         //   53: aload_3
/*     */         //   54: astore #8
/*     */         //   56: iconst_0
/*     */         //   57: istore #7
/*     */         //   59: aload_1
/*     */         //   60: aload #5
/*     */         //   62: aload_2
/*     */         //   63: invokestatic access$toDebug : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   66: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   71: aload #8
/*     */         //   73: swap
/*     */         //   74: aload #4
/*     */         //   76: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */         //   79: nop
/*     */         //   80: aload_0
/*     */         //   81: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   84: aload_2
/*     */         //   85: invokestatic access$normalizeActualOutput : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;Ljava/lang/String;)Ljava/lang/String;
/*     */         //   88: astore_3
/*     */         //   89: aload_0
/*     */         //   90: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand;
/*     */         //   93: invokevirtual getPromisedResult : ()Lkotlinx/coroutines/CompletableDeferred;
/*     */         //   96: new com/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult
/*     */         //   99: dup
/*     */         //   100: aload_3
/*     */         //   101: aload_1
/*     */         //   102: invokevirtual getExitCode : ()I
/*     */         //   105: invokespecial <init> : (Ljava/lang/String;I)V
/*     */         //   108: invokeinterface complete : (Ljava/lang/Object;)Z
/*     */         //   113: pop
/*     */         //   114: return
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #311	-> 6
/*     */         //   #312	-> 17
/*     */         //   #343	-> 22
/*     */         //   #312	-> 34
/*     */         //   #344	-> 40
/*     */         //   #345	-> 46
/*     */         //   #346	-> 53
/*     */         //   #313	-> 59
/*     */         //   #346	-> 74
/*     */         //   #348	-> 79
/*     */         //   #315	-> 80
/*     */         //   #316	-> 89
/*     */         //   #317	-> 114
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   22	11	4	$i$f$thisLogger	I
/*     */         //   19	14	3	$this$thisLogger$iv	Ljava/lang/Object;
/*     */         //   59	12	7	$i$a$-debug$default-BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3$commandFinished$1	I
/*     */         //   46	34	6	$i$f$debug	I
/*     */         //   40	40	3	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */         //   43	37	4	e$iv	Ljava/lang/Exception;
/*     */         //   17	98	2	text	Ljava/lang/String;
/*     */         //   89	26	3	normalizedText	Ljava/lang/String;
/*     */         //   0	115	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$PreparedShellCommand$launchInSession$3;
/*     */         //   0	115	1	event	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/CommandFinishedEvent;
/*     */       }
/*     */     }
/*     */     
/*     */     private final String normalizeActualOutput(String output) {
/*     */       Intrinsics.checkNotNullExpressionValue(StringUtil.splitByLinesDontTrim(output), "splitByLinesDontTrim(...)");
/*     */       return ArraysKt.joinToString$default((Object[])StringUtil.splitByLinesDontTrim(output), "\n", null, null, 0, null, PreparedShellCommand::normalizeActualOutput$lambda$2, 30, null);
/*     */     }
/*     */     
/*     */     private static final CharSequence normalizeActualOutput$lambda$2(String it) {
/*     */       Intrinsics.checkNotNull(it);
/*     */       return StringsKt.trimEnd(it).toString();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\016\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005XT¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$Companion;", "", "<init>", "()V", "LINE_SEPARATOR", "", "ej-core"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b`\030\0002\0020\001R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\030\020\006\032\b\022\004\022\0020\b0\007X¦\004¢\006\006\032\004\b\t\020\nR\030\020\013\032\b\022\004\022\0020\0030\fX¦\004¢\006\006\032\004\b\r\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/BlockTerminalShellExecutor$ShellCommand;", "", "command", "", "getCommand", "()Ljava/lang/String;", "promisedResult", "Lkotlinx/coroutines/Deferred;", "Lcom/intellij/ml/llm/matterhorn/ShellExecutor$CommandResult;", "getPromisedResult", "()Lkotlinx/coroutines/Deferred;", "outputFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getOutputFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "ej-core"})
/*     */   public static interface ShellCommand {
/*     */     @NotNull
/*     */     String getCommand();
/*     */     
/*     */     @NotNull
/*     */     Deferred<ShellExecutor.CommandResult> getPromisedResult();
/*     */     
/*     */     @NotNull
/*     */     StateFlow<String> getOutputFlow();
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {213, 217}, i = {0, 0, 1}, s = {"L$0", "L$1", "L$0"}, n = {"this", "command", "shellCommand"}, m = "executeCommand", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class BlockTerminalShellExecutor$executeCommand$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     BlockTerminalShellExecutor$executeCommand$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return BlockTerminalShellExecutor.this.executeCommand(null, (Continuation<? super ShellExecutor.CommandResult>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {225}, i = {0}, s = {"L$0"}, n = {"bytes"}, m = "sendControlSequence", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class BlockTerminalShellExecutor$sendControlSequence$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     BlockTerminalShellExecutor$sendControlSequence$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return BlockTerminalShellExecutor.this.sendControlSequence(null, (Continuation<? super Unit>)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {129}, i = {0}, s = {"L$0"}, n = {"registryCleanup"}, m = "startBlockTerminalWidget", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class BlockTerminalShellExecutor$startBlockTerminalWidget$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     BlockTerminalShellExecutor$startBlockTerminalWidget$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return BlockTerminalShellExecutor.this.startBlockTerminalWidget(null, null, null, false, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "BlockTerminalShellExecutor.kt", l = {96, 99, 102, 105}, i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3}, s = {"L$0", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3"}, n = {"this", "disableSavingHistory", "this", "widget", "view", "session", "disableSavingHistory", "this", "widget", "view", "session", "disableSavingHistory", "this", "widget", "view", "session"}, m = "startSessionAndCreateView", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.BlockTerminalShellExecutor")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class BlockTerminalShellExecutor$startSessionAndCreateView$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     BlockTerminalShellExecutor$startSessionAndCreateView$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return BlockTerminalShellExecutor.this.startSessionAndCreateView((Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\BlockTerminalShellExecutor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */