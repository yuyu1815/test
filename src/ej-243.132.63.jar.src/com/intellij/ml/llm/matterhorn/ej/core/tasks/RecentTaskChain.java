/*     */ package com.intellij.ml.llm.matterhorn.ej.core.tasks;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.tasks.persistence.TaskChainId;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.datetime.Instant;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\002\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B)\022\b\020\002\032\004\030\0010\003\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t¢\006\004\b\n\020\013J\013\020\024\032\004\030\0010\003HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\007HÆ\003J\t\020\027\032\0020\tHÆ\003J3\020\030\032\0020\0002\n\b\002\020\002\032\004\030\0010\0032\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\tHÆ\001J\023\020\031\032\0020\0322\b\020\033\032\004\030\0010\001HÖ\003J\t\020\034\032\0020\035HÖ\001J\t\020\036\032\0020\003HÖ\001R\023\020\002\032\004\030\0010\003¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\020\020\021R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023¨\006\037"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/RecentTaskChain;", "", "name", "", "taskChainId", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "state", "Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "created", "Lkotlinx/datetime/Instant;", "<init>", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;Lkotlinx/datetime/Instant;)V", "getName", "()Ljava/lang/String;", "getTaskChainId", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/persistence/TaskChainId;", "getState", "()Lcom/intellij/ml/llm/matterhorn/ej/core/tasks/TaskChainState;", "getCreated", "()Lkotlinx/datetime/Instant;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ej-core"})
/*     */ public final class RecentTaskChain
/*     */ {
/*     */   @Nullable
/*     */   private final String name;
/*     */   @NotNull
/*     */   private final TaskChainId taskChainId;
/*     */   @NotNull
/*     */   private final TaskChainState state;
/*     */   @NotNull
/*     */   private final Instant created;
/*     */   
/*     */   public RecentTaskChain(@Nullable String name, @NotNull TaskChainId taskChainId, @NotNull TaskChainState state, @NotNull Instant created) {
/* 176 */     this.name = name;
/* 177 */     this.taskChainId = taskChainId;
/* 178 */     this.state = state;
/* 179 */     this.created = created; } @NotNull public final Instant getCreated() { return this.created; }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final String getName() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainId getTaskChainId() {
/*     */     return this.taskChainId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainState getState() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component1() {
/*     */     return this.name;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainId component2() {
/*     */     return this.taskChainId;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TaskChainState component3() {
/*     */     return this.state;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Instant component4() {
/*     */     return this.created;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final RecentTaskChain copy(@Nullable String name, @NotNull TaskChainId taskChainId, @NotNull TaskChainState state, @NotNull Instant created) {
/*     */     Intrinsics.checkNotNullParameter(taskChainId, "taskChainId");
/*     */     Intrinsics.checkNotNullParameter(state, "state");
/*     */     Intrinsics.checkNotNullParameter(created, "created");
/*     */     return new RecentTaskChain(name, taskChainId, state, created);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "RecentTaskChain(name=" + this.name + ", taskChainId=" + this.taskChainId + ", state=" + this.state + ", created=" + this.created + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = (this.name == null) ? 0 : this.name.hashCode();
/*     */     result = result * 31 + this.taskChainId.hashCode();
/*     */     result = result * 31 + this.state.hashCode();
/*     */     return result * 31 + this.created.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof RecentTaskChain))
/*     */       return false; 
/*     */     RecentTaskChain recentTaskChain = (RecentTaskChain)other;
/*     */     return !Intrinsics.areEqual(this.name, recentTaskChain.name) ? false : (!Intrinsics.areEqual(this.taskChainId, recentTaskChain.taskChainId) ? false : ((this.state != recentTaskChain.state) ? false : (!!Intrinsics.areEqual(this.created, recentTaskChain.created))));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tasks\RecentTaskChain.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */