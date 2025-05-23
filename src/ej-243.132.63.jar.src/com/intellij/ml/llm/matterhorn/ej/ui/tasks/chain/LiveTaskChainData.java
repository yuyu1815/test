/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.HumanInLoopRequest;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.LiveTaskSnapshot;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.ProgressEntity;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainEntity;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.collections.immutable.PersistentList;
/*     */ import kotlinx.coroutines.Job;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\003\b\002\030\0002\0020\001B;\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\f\020\b\032\b\022\004\022\0020\n0\t\022\b\020\013\032\004\030\0010\f¢\006\004\b\r\020\016R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\021\020\022R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\023\020\024R\027\020\b\032\b\022\004\022\0020\n0\t¢\006\b\n\000\032\004\b\025\020\026R\023\020\013\032\004\030\0010\f¢\006\b\n\000\032\004\b\027\020\030R\021\020\031\032\0020\0328F¢\006\006\032\004\b\033\020\034¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData;", "", "chain", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "currentJob", "Lkotlinx/coroutines/Job;", "humanInLoopRequest", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "tasks", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;", "progress", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;Lkotlinx/coroutines/Job;Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;Lkotlinx/collections/immutable/PersistentList;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;)V", "getChain", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainEntity;", "getCurrentJob", "()Lkotlinx/coroutines/Job;", "getHumanInLoopRequest", "()Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "getTasks", "()Lkotlinx/collections/immutable/PersistentList;", "getProgress", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/ProgressEntity;", "hasChanges", "", "getHasChanges", "()Z", "ej-ui"})
/*     */ @SourceDebugExtension({"SMAP\nTaskChainDetailsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1064:1\n1755#2,3:1065\n*S KotlinDebug\n*F\n+ 1 TaskChainDetailsViewModel.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData\n*L\n926#1:1065,3\n*E\n"})
/*     */ final class LiveTaskChainData
/*     */ {
/*     */   @NotNull
/*     */   private final TaskChainEntity chain;
/*     */   @Nullable
/*     */   private final Job currentJob;
/*     */   @Nullable
/*     */   private final HumanInLoopRequest humanInLoopRequest;
/*     */   @NotNull
/*     */   private final PersistentList<LiveTaskSnapshot> tasks;
/*     */   @Nullable
/*     */   private final ProgressEntity progress;
/*     */   
/*     */   public LiveTaskChainData(@NotNull TaskChainEntity chain, @Nullable Job currentJob, @Nullable HumanInLoopRequest humanInLoopRequest, @NotNull PersistentList<LiveTaskSnapshot> tasks, @Nullable ProgressEntity progress) {
/* 919 */     this.chain = chain;
/* 920 */     this.currentJob = currentJob;
/* 921 */     this.humanInLoopRequest = humanInLoopRequest;
/* 922 */     this.tasks = tasks;
/* 923 */     this.progress = progress; } @Nullable public final ProgressEntity getProgress() { return this.progress; }
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainEntity getChain() {
/*     */     return this.chain;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final Job getCurrentJob() {
/*     */     return this.currentJob;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final HumanInLoopRequest getHumanInLoopRequest() {
/*     */     return this.humanInLoopRequest;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final PersistentList<LiveTaskSnapshot> getTasks() {
/*     */     return this.tasks;
/*     */   }
/*     */   
/*     */   public final boolean getHasChanges() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield tasks : Lkotlinx/collections/immutable/PersistentList;
/*     */     //   4: checkcast java/lang/Iterable
/*     */     //   7: astore_1
/*     */     //   8: iconst_0
/*     */     //   9: istore_2
/*     */     //   10: aload_1
/*     */     //   11: instanceof java/util/Collection
/*     */     //   14: ifeq -> 33
/*     */     //   17: aload_1
/*     */     //   18: checkcast java/util/Collection
/*     */     //   21: invokeinterface isEmpty : ()Z
/*     */     //   26: ifeq -> 33
/*     */     //   29: iconst_0
/*     */     //   30: goto -> 182
/*     */     //   33: aload_1
/*     */     //   34: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   39: astore_3
/*     */     //   40: aload_3
/*     */     //   41: invokeinterface hasNext : ()Z
/*     */     //   46: ifeq -> 181
/*     */     //   49: aload_3
/*     */     //   50: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   55: astore #4
/*     */     //   57: aload #4
/*     */     //   59: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot
/*     */     //   62: astore #5
/*     */     //   64: iconst_0
/*     */     //   65: istore #6
/*     */     //   67: aload #5
/*     */     //   69: invokevirtual getSteps : ()Lkotlinx/collections/immutable/PersistentList;
/*     */     //   72: checkcast java/lang/Iterable
/*     */     //   75: astore #7
/*     */     //   77: iconst_0
/*     */     //   78: istore #8
/*     */     //   80: aload #7
/*     */     //   82: instanceof java/util/Collection
/*     */     //   85: ifeq -> 105
/*     */     //   88: aload #7
/*     */     //   90: checkcast java/util/Collection
/*     */     //   93: invokeinterface isEmpty : ()Z
/*     */     //   98: ifeq -> 105
/*     */     //   101: iconst_0
/*     */     //   102: goto -> 173
/*     */     //   105: aload #7
/*     */     //   107: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   112: astore #9
/*     */     //   114: aload #9
/*     */     //   116: invokeinterface hasNext : ()Z
/*     */     //   121: ifeq -> 172
/*     */     //   124: aload #9
/*     */     //   126: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   131: astore #10
/*     */     //   133: aload #10
/*     */     //   135: checkcast com/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity
/*     */     //   138: astore #11
/*     */     //   140: iconst_0
/*     */     //   141: istore #12
/*     */     //   143: aload #11
/*     */     //   145: invokevirtual getChanges : ()Ljava/util/List;
/*     */     //   148: checkcast java/util/Collection
/*     */     //   151: invokeinterface isEmpty : ()Z
/*     */     //   156: ifne -> 163
/*     */     //   159: iconst_1
/*     */     //   160: goto -> 164
/*     */     //   163: iconst_0
/*     */     //   164: nop
/*     */     //   165: ifeq -> 114
/*     */     //   168: iconst_1
/*     */     //   169: goto -> 173
/*     */     //   172: iconst_0
/*     */     //   173: nop
/*     */     //   174: ifeq -> 40
/*     */     //   177: iconst_1
/*     */     //   178: goto -> 182
/*     */     //   181: iconst_0
/*     */     //   182: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #926	-> 0
/*     */     //   #1065	-> 10
/*     */     //   #1066	-> 33
/*     */     //   #926	-> 67
/*     */     //   #1065	-> 80
/*     */     //   #1066	-> 105
/*     */     //   #926	-> 143
/*     */     //   #926	-> 164
/*     */     //   #1066	-> 165
/*     */     //   #1067	-> 172
/*     */     //   #926	-> 173
/*     */     //   #1066	-> 174
/*     */     //   #1067	-> 181
/*     */     //   #926	-> 182
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   143	22	12	$i$a$-any-LiveTaskChainData$hasChanges$1$1	I
/*     */     //   140	25	11	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/StepEntity;
/*     */     //   133	39	10	element$iv	Ljava/lang/Object;
/*     */     //   80	93	8	$i$f$any	I
/*     */     //   77	96	7	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   67	107	6	$i$a$-any-LiveTaskChainData$hasChanges$1	I
/*     */     //   64	110	5	it	Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/LiveTaskSnapshot;
/*     */     //   57	124	4	element$iv	Ljava/lang/Object;
/*     */     //   10	172	2	$i$f$any	I
/*     */     //   8	174	1	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   0	183	0	this	Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/LiveTaskChainData;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\LiveTaskChainData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */