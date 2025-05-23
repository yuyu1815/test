/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskId;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskRecapModel;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model.TaskStep;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.OnShowDiff;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.FunctionReferenceImpl;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.reflect.KFunction;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.flow.FlowCollector;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */ final class null<T>
/*     */   implements FlowCollector
/*     */ {
/*     */   public final Object emit(LiveTaskChainData chainData, Continuation $completion) {
/* 155 */     PersistentList<LiveTaskSnapshot> persistentList = chainData.getTasks();
/* 156 */     TaskChainEntity taskChainEntity = chainData.getChain();
/* 157 */     Project project = TaskChainDetailsViewModel.this.getProject();
/* 158 */     LLMProxy lLMProxy = TaskChainDetailsViewModel.this.getLlmProxy();
/* 159 */     KFunction kFunction1 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$1(TaskChainDetailsViewModel.this);
/* 160 */     KFunction kFunction2 = (KFunction)new TaskChainDetailsViewModel$1$1$steps$2(TaskChainDetailsViewModel.this);
/* 161 */     CoroutineScope coroutineScope = TaskChainDetailsViewModel.this.getScope();
/* 162 */     boolean bool = chainData.getHasChanges();
/* 163 */     HumanInLoopRequest humanInLoopRequest = chainData.getHumanInLoopRequest();
/* 164 */     KFunction kFunction3 = (chainData.getCurrentJob() != null) ? (KFunction)new TaskChainDetailsViewModel$1$1$steps$3(TaskChainDetailsViewModel.this) : null;
/* 165 */     ProgressEntity progressEntity = chainData.getProgress();
/*     */     
/* 167 */     TaskChainDetailsViewModel$1$1$steps$4 taskChainDetailsViewModel$1$1$steps$4 = new TaskChainDetailsViewModel$1$1$steps$4(); List<TaskStep> steps = TaskChainDetailsViewModelKt.produceStepVMs(lLMProxy, persistentList, taskChainEntity, project, (Function0<Unit>)kFunction1, (Function1<? super TaskId, Unit>)kFunction2, coroutineScope, bool, humanInLoopRequest, (Function0<Unit>)kFunction3, progressEntity, taskChainDetailsViewModel$1$1$steps$4, new TaskChainDetailsViewModel$1$1$steps$5(null), new TaskChainDetailsViewModel$1$1$steps$6(null), new TaskChainDetailsViewModel$1$1$steps$7(null), TaskChainDetailsViewModel.this::emit$lambda$0, new TaskChainDetailsViewModel$1$1$steps$9(null), new TaskChainDetailsViewModel$1$1$steps$10(null));
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 188 */     Map<Integer, TaskRecapModel> recap = TaskChainDetailsViewModelKt.collectRecap(steps);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 196 */     if (TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion);  TaskChainDetailsViewModel.this.getStepMapFlow().emit(recap, $completion); return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/TaskChainDetailsViewModel$1$1$steps$4", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "showDiff", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "wantEditable", "", "ej-ui"})
/*     */   public static final class TaskChainDetailsViewModel$1$1$steps$4 implements OnShowDiff {
/*     */     public void showDiff(FileChange change, boolean wantEditable) {
/*     */       Intrinsics.checkNotNullParameter(change, "change");
/*     */       TaskChainDetailsViewModel.this.showDiff$ej_ui(change, wantEditable);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {172}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$5")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"})
/*     */   static final class TaskChainDetailsViewModel$1$1$steps$5 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskChainDetailsViewModel$1$1$steps$5(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FileChange it;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (FileChange)this.L$0;
/*     */           this.label = 1;
/*     */           if (TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           TaskChainDetailsViewModel.this.deleteFile$ej_ui(it, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$5> $completion) {
/*     */       TaskChainDetailsViewModel$1$1$steps$5 taskChainDetailsViewModel$1$1$steps$5 = new TaskChainDetailsViewModel$1$1$steps$5($completion);
/*     */       taskChainDetailsViewModel$1$1$steps$5.L$0 = value;
/*     */       return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$5;
/*     */     }
/*     */     
/*     */     public final Object invoke(FileChange p1, Continuation<?> p2) {
/*     */       return ((TaskChainDetailsViewModel$1$1$steps$5)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {173}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$6")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"})
/*     */   static final class TaskChainDetailsViewModel$1$1$steps$6 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskChainDetailsViewModel$1$1$steps$6(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FileChange it;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (FileChange)this.L$0;
/*     */           this.label = 1;
/*     */           if (TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           TaskChainDetailsViewModel.this.locateFile$ej_ui(it, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$6> $completion) {
/*     */       TaskChainDetailsViewModel$1$1$steps$6 taskChainDetailsViewModel$1$1$steps$6 = new TaskChainDetailsViewModel$1$1$steps$6($completion);
/*     */       taskChainDetailsViewModel$1$1$steps$6.L$0 = value;
/*     */       return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$6;
/*     */     }
/*     */     
/*     */     public final Object invoke(FileChange p1, Continuation<?> p2) {
/*     */       return ((TaskChainDetailsViewModel$1$1$steps$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {174}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$7")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"})
/*     */   static final class TaskChainDetailsViewModel$1$1$steps$7 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskChainDetailsViewModel$1$1$steps$7(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FileChange it;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (FileChange)this.L$0;
/*     */           this.label = 1;
/*     */           if (TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           TaskChainDetailsViewModel.this.revertChange$ej_ui(it, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$7> $completion) {
/*     */       TaskChainDetailsViewModel$1$1$steps$7 taskChainDetailsViewModel$1$1$steps$7 = new TaskChainDetailsViewModel$1$1$steps$7($completion);
/*     */       taskChainDetailsViewModel$1$1$steps$7.L$0 = value;
/*     */       return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$7;
/*     */     }
/*     */     
/*     */     public final Object invoke(FileChange p1, Continuation<?> p2) {
/*     */       return ((TaskChainDetailsViewModel$1$1$steps$7)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {175}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$9")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"})
/*     */   static final class TaskChainDetailsViewModel$1$1$steps$9 extends SuspendLambda implements Function2<FileChange, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskChainDetailsViewModel$1$1$steps$9(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FileChange change;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           change = (FileChange)this.L$0;
/*     */           this.label = 1;
/*     */           if (TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           TaskChainDetailsViewModel.this.addFileToVCS$ej_ui(change, (Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$9> $completion) {
/*     */       TaskChainDetailsViewModel$1$1$steps$9 taskChainDetailsViewModel$1$1$steps$9 = new TaskChainDetailsViewModel$1$1$steps$9($completion);
/*     */       taskChainDetailsViewModel$1$1$steps$9.L$0 = value;
/*     */       return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$9;
/*     */     }
/*     */     
/*     */     public final Object invoke(FileChange p1, Continuation<?> p2) {
/*     */       return ((TaskChainDetailsViewModel$1$1$steps$9)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Unit emit$lambda$0(TaskChainDetailsViewModel this$0, String fileName, String rawMarkdown) {
/*     */     Intrinsics.checkNotNullParameter(fileName, "fileName");
/*     */     Intrinsics.checkNotNullParameter(rawMarkdown, "rawMarkdown");
/*     */     TaskChainDetailsViewModel.this.openMarkdownInEditor(fileName, rawMarkdown);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "TaskChainDetailsViewModel.kt", l = {177}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.TaskChainDetailsViewModel$1$1$steps$10")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;"})
/*     */   static final class TaskChainDetailsViewModel$1$1$steps$10 extends SuspendLambda implements Function2<FileChange, Continuation<? super Boolean>, Object> {
/*     */     int label;
/*     */     
/*     */     TaskChainDetailsViewModel$1$1$steps$10(Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       FileChange it;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           it = (FileChange)this.L$0;
/*     */           this.label = 1;
/*     */           return (TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this) == object) ? object : TaskChainDetailsViewModel.this.checkFileOnVcs$ej_ui(it, (Continuation<? super Boolean>)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super TaskChainDetailsViewModel$1$1$steps$10> $completion) {
/*     */       TaskChainDetailsViewModel$1$1$steps$10 taskChainDetailsViewModel$1$1$steps$10 = new TaskChainDetailsViewModel$1$1$steps$10($completion);
/*     */       taskChainDetailsViewModel$1$1$steps$10.L$0 = value;
/*     */       return (Continuation<Unit>)taskChainDetailsViewModel$1$1$steps$10;
/*     */     }
/*     */     
/*     */     public final Object invoke(FileChange p1, Continuation<?> p2) {
/*     */       return ((TaskChainDetailsViewModel$1$1$steps$10)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\TaskChainDetailsViewModel$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */