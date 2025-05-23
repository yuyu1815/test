/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.session.TerminalModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.terminal.block.util.ActionCoordinator;
/*     */ import com.intellij.openapi.util.Disposer;
/*     */ import com.jediterm.terminal.model.TerminalTextBuffer;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.TimeMark;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.Job;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ import org.jetbrains.plugins.terminal.util.ShellIntegration;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\013\n\002\b\b\n\002\030\002\n\002\030\002\n\000\b\000\030\0002\0020\001B3\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\022\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\t¢\006\004\b\f\020\rJ\006\020\031\032\0020\013J\020\020\032\032\0020\0232\006\020\033\032\0020\nH\002J\b\020\034\032\004\030\0010\nR\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\032\020\b\032\016\022\004\022\0020\n\022\004\022\0020\0130\tX\004¢\006\002\n\000R\020\020\016\032\004\030\0010\017X\016¢\006\002\n\000R\016\020\020\032\0020\021X\016¢\006\002\n\000R\020\020\022\032\004\030\0010\023X\016¢\006\002\n\000R\036\020\026\032\0020\0252\006\020\024\032\0020\025@BX\016¢\006\b\n\000\032\004\b\027\020\030R\032\020\035\032\016\022\004\022\0020\013\022\004\022\0020\0370\036X\004¢\006\002\n\000¨\006 "}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;", "", "textBuffer", "Lcom/jediterm/terminal/model/TerminalTextBuffer;", "shellIntegration", "Lorg/jetbrains/plugins/terminal/util/ShellIntegration;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "applyUpdate", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;", "", "<init>", "(Lcom/jediterm/terminal/model/TerminalTextBuffer;Lorg/jetbrains/plugins/terminal/util/ShellIntegration;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;)V", "changesTracker", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;", "trackerDisposable", "Lcom/intellij/openapi/Disposable;", "updatingJob", "Lkotlinx/coroutines/Job;", "value", "", "finished", "getFinished", "()Z", "startUpdating", "scheduleChangeApplying", "output", "finishUpdating", "metricTextInBufferToTextVisible", "Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/util/ActionCoordinator;", "Lkotlin/time/TimeMark;", "ej-core"})
/*     */ @SourceDebugExtension({"SMAP\nTerminalOutputContentUpdatesScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalOutputContentUpdatesScheduler.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler\n+ 2 TerminalModel.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/session/TerminalModel$Companion\n*L\n1#1,104:1\n231#2,7:105\n231#2,7:112\n*S KotlinDebug\n*F\n+ 1 TerminalOutputContentUpdatesScheduler.kt\ncom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler\n*L\n39#1:105,7\n76#1:112,7\n*E\n"})
/*     */ public final class TerminalOutputContentUpdatesScheduler {
/*     */   @NotNull
/*     */   private final TerminalTextBuffer textBuffer;
/*     */   @NotNull
/*     */   private final ShellIntegration shellIntegration;
/*     */   
/*     */   public TerminalOutputContentUpdatesScheduler(@NotNull TerminalTextBuffer textBuffer, @NotNull ShellIntegration shellIntegration, @NotNull CoroutineScope coroutineScope, @NotNull Function1<PartialCommandOutput, Unit> applyUpdate) {
/*  26 */     this.textBuffer = textBuffer;
/*  27 */     this.shellIntegration = shellIntegration;
/*  28 */     this.coroutineScope = coroutineScope;
/*  29 */     this.applyUpdate = applyUpdate;
/*     */ 
/*     */ 
/*     */     
/*  33 */     Intrinsics.checkNotNullExpressionValue(Disposer.newDisposable(), "newDisposable(...)"); this.trackerDisposable = Disposer.newDisposable();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  85 */     this.metricTextInBufferToTextVisible = new ActionCoordinator(
/*  86 */         10, TerminalOutputContentUpdatesScheduler::metricTextInBufferToTextVisible$lambda$4, TerminalOutputContentUpdatesScheduler::metricTextInBufferToTextVisible$lambda$5, TerminalOutputContentUpdatesScheduler::metricTextInBufferToTextVisible$lambda$6);
/*     */   }
/*     */   @NotNull
/*     */   private final CoroutineScope coroutineScope; @NotNull
/*     */   private final Function1<PartialCommandOutput, Unit> applyUpdate; @Nullable
/*     */   private TerminalOutputChangesTracker changesTracker; @NotNull
/*     */   private Disposable trackerDisposable; @Nullable
/*     */   private Job updatingJob; private boolean finished;
/*     */   @NotNull
/*     */   private final ActionCoordinator<Unit, TimeMark> metricTextInBufferToTextVisible;
/*     */   
/*     */   public final boolean getFinished() {
/*     */     return this.finished;
/*     */   }
/*     */   
/*     */   public final void startUpdating() {
/*     */     TerminalModel.Companion companion = TerminalModel.Companion;
/*     */     TerminalTextBuffer $this$withLock$iv = this.textBuffer;
/*     */     int $i$f$withLock = 0;
/* 105 */     $this$withLock$iv.lock();
/*     */     
/* 107 */     try { TerminalTextBuffer it = $this$withLock$iv; int $i$a$-withLock-TerminalOutputContentUpdatesScheduler$startUpdating$1 = 0; TerminalOutputChangesTracker tracker = new TerminalOutputChangesTracker(this.textBuffer, this.shellIntegration, this.trackerDisposable, this::startUpdating$lambda$2$lambda$0); this.changesTracker = tracker; Job job = BuildersKt.launch$default(this.coroutineScope, null, null, new TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1(this, null), 3, null); job.invokeOnCompletion(this::startUpdating$lambda$2$lambda$1); this.updatingJob = job; Unit unit = Unit.INSTANCE;
/*     */ 
/*     */       
/* 110 */       $this$withLock$iv.unlock(); } finally { $this$withLock$iv.unlock(); }
/*     */   
/* 112 */   } private static final Unit startUpdating$lambda$2$lambda$0(TerminalOutputContentUpdatesScheduler this$0) { this$0.metricTextInBufferToTextVisible.started(Unit.INSTANCE, TimeSource.Monotonic.ValueTimeMark.box-impl(TimeSource.Monotonic.INSTANCE.markNow-z9LOYto())); return Unit.INSTANCE; } @Nullable public final PartialCommandOutput finishUpdating() { PartialCommandOutput partialCommandOutput; TerminalModel.Companion companion = TerminalModel.Companion; TerminalTextBuffer $this$withLock$iv = this.textBuffer; int $i$f$withLock = 0; $this$withLock$iv.lock(); 
/*     */     try { TerminalOutputChangesTracker tracker;
/* 114 */       TerminalTextBuffer it = $this$withLock$iv; int $i$a$-withLock-TerminalOutputContentUpdatesScheduler$finishUpdating$1 = 0; if (this.changesTracker == null) throw new IllegalStateException("Finish updating called before start updating".toString());  this.changesTracker = null; if (this.updatingJob != null) { Job.DefaultImpls.cancel$default(this.updatingJob, null, 1, null); } else {  }  this.finished = true; partialCommandOutput = tracker.collectChangedOutputOrNull(); }
/*     */     finally
/*     */     
/* 117 */     { $this$withLock$iv.unlock(); }  return partialCommandOutput; }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "TerminalOutputContentUpdatesScheduler.kt", l = {52, 56, 58}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1(TerminalOutputContentUpdatesScheduler $receiver, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore_3
/*     */       //   4: aload_0
/*     */       //   5: getfield label : I
/*     */       //   8: tableswitch default -> 142, 0 -> 40, 1 -> 66, 2 -> 95, 3 -> 133
/*     */       //   40: aload_1
/*     */       //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   44: ldc2_w 100
/*     */       //   47: aload_0
/*     */       //   48: checkcast kotlin/coroutines/Continuation
/*     */       //   51: aload_0
/*     */       //   52: iconst_1
/*     */       //   53: putfield label : I
/*     */       //   56: invokestatic delay : (JLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   59: dup
/*     */       //   60: aload_3
/*     */       //   61: if_acmpne -> 71
/*     */       //   64: aload_3
/*     */       //   65: areturn
/*     */       //   66: aload_1
/*     */       //   67: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   70: aload_1
/*     */       //   71: pop
/*     */       //   72: aload_0
/*     */       //   73: getfield $tracker : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputChangesTracker;
/*     */       //   76: aload_0
/*     */       //   77: checkcast kotlin/coroutines/Continuation
/*     */       //   80: aload_0
/*     */       //   81: iconst_2
/*     */       //   82: putfield label : I
/*     */       //   85: invokevirtual collectChangedOutputOrWait : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   88: dup
/*     */       //   89: aload_3
/*     */       //   90: if_acmpne -> 100
/*     */       //   93: aload_3
/*     */       //   94: areturn
/*     */       //   95: aload_1
/*     */       //   96: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   99: aload_1
/*     */       //   100: checkcast com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput
/*     */       //   103: astore_2
/*     */       //   104: aload_0
/*     */       //   105: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;
/*     */       //   108: aload_2
/*     */       //   109: invokestatic access$scheduleChangeApplying : (Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler;Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;)Lkotlinx/coroutines/Job;
/*     */       //   112: aload_0
/*     */       //   113: checkcast kotlin/coroutines/Continuation
/*     */       //   116: aload_0
/*     */       //   117: iconst_3
/*     */       //   118: putfield label : I
/*     */       //   121: invokeinterface join : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   126: dup
/*     */       //   127: aload_3
/*     */       //   128: if_acmpne -> 138
/*     */       //   131: aload_3
/*     */       //   132: areturn
/*     */       //   133: aload_1
/*     */       //   134: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   137: aload_1
/*     */       //   138: pop
/*     */       //   139: goto -> 72
/*     */       //   142: new java/lang/IllegalStateException
/*     */       //   145: dup
/*     */       //   146: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   148: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   151: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #48	-> 3
/*     */       //   #52	-> 44
/*     */       //   #48	-> 64
/*     */       //   #55	-> 71
/*     */       //   #56	-> 72
/*     */       //   #48	-> 93
/*     */       //   #58	-> 104
/*     */       //   #48	-> 131
/*     */       //   #58	-> 138
/*     */       //   #48	-> 142
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   104	22	2	partialChange	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/PartialCommandOutput;
/*     */       //   0	152	0	this	Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1;
/*     */       //   44	98	1	$result	Ljava/lang/Object;
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1> $completion) {
/*     */       return (Continuation<Unit>)new TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1(TerminalOutputContentUpdatesScheduler.this, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TerminalOutputContentUpdatesScheduler$startUpdating$1$job$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit startUpdating$lambda$2$lambda$1(TerminalOutputContentUpdatesScheduler this$0, Throwable it) {
/*     */     Disposer.dispose(this$0.trackerDisposable);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Job scheduleChangeApplying(PartialCommandOutput output) {
/*     */     Intrinsics.checkNotNullExpressionValue(ModalityState.any(), "any(...)");
/*     */     return BuildersKt.launch$default(this.coroutineScope, CoroutinesKt.getEDT(Dispatchers.INSTANCE).plus(ModalityKt.asContextElement(ModalityState.any())), null, new TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1(output, null), 2, null);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TerminalOutputContentUpdatesScheduler.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output.TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1(PartialCommandOutput $output, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           TerminalOutputContentUpdatesScheduler.this.applyUpdate.invoke(this.$output);
/*     */           TerminalOutputContentUpdatesScheduler.this.metricTextInBufferToTextVisible.finished(Unit.INSTANCE);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1> $completion) {
/*     */       return (Continuation<Unit>)new TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1(this.$output, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((TerminalOutputContentUpdatesScheduler$scheduleChangeApplying$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit metricTextInBufferToTextVisible$lambda$4(Unit unit, TimeMark startTime) {
/*     */     Intrinsics.checkNotNullParameter(unit, "unit");
/*     */     Intrinsics.checkNotNullParameter(startTime, "startTime");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit metricTextInBufferToTextVisible$lambda$5(Unit unit, TimeMark startTime) {
/*     */     Intrinsics.checkNotNullParameter(unit, "unit");
/*     */     Intrinsics.checkNotNullParameter(startTime, "startTime");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit metricTextInBufferToTextVisible$lambda$6(Unit unit) {
/*     */     Intrinsics.checkNotNullParameter(unit, "unit");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\TerminalOutputContentUpdatesScheduler.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */