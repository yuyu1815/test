/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.jvm.functions.Function2;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\005\b\007\030\0002\0020\001BÃ\001\022\006\020\002\032\0020\003\022\"\020\004\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005\022\"\020\b\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005\022\"\020\t\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005\022\"\020\n\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005\022\"\020\013\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\f0\006\022\006\022\004\030\0010\0010\005¢\006\004\b\r\020\016J\016\020\004\032\0020\007H@¢\006\002\020\020J\016\020\b\032\0020\007H@¢\006\002\020\020J\016\020\t\032\0020\007H@¢\006\002\020\020J\016\020\n\032\0020\007H@¢\006\002\020\020J\016\020\013\032\0020\fH@¢\006\002\020\020R\016\020\002\032\0020\003X\004¢\006\002\n\000R,\020\004\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005X\004¢\006\004\n\002\020\017R,\020\b\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005X\004¢\006\004\n\002\020\017R,\020\t\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005X\004¢\006\004\n\002\020\017R,\020\n\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\0070\006\022\006\022\004\030\0010\0010\005X\004¢\006\004\n\002\020\017R,\020\013\032\036\b\001\022\004\022\0020\003\022\n\022\b\022\004\022\0020\f0\006\022\006\022\004\030\0010\0010\005X\004¢\006\004\n\002\020\017¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "onDelete", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "onLocate", "onRollback", "onSetVCS", "isOnVCS", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class FileManipulationActions
/*     */ {
/*     */   @NotNull
/*     */   private final FileChange change;
/*     */   @NotNull
/*     */   private final Function2<FileChange, Continuation<? super Unit>, Object> onDelete;
/*     */   @NotNull
/*     */   private final Function2<FileChange, Continuation<? super Unit>, Object> onLocate;
/*     */   @NotNull
/*     */   private final Function2<FileChange, Continuation<? super Unit>, Object> onRollback;
/*     */   @NotNull
/*     */   private final Function2<FileChange, Continuation<? super Unit>, Object> onSetVCS;
/*     */   @NotNull
/*     */   private final Function2<FileChange, Continuation<? super Boolean>, Object> isOnVCS;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   public FileManipulationActions(@NotNull FileChange change, @NotNull Function2<FileChange, Continuation<? super Unit>, Object> onDelete, @NotNull Function2<FileChange, Continuation<? super Unit>, Object> onLocate, @NotNull Function2<FileChange, Continuation<? super Unit>, Object> onRollback, @NotNull Function2<FileChange, Continuation<? super Unit>, Object> onSetVCS, @NotNull Function2<FileChange, Continuation<? super Boolean>, Object> isOnVCS) {
/* 152 */     this.change = change;
/* 153 */     this.onDelete = onDelete;
/* 154 */     this.onLocate = onLocate;
/* 155 */     this.onRollback = onRollback;
/* 156 */     this.onSetVCS = onSetVCS;
/* 157 */     this.isOnVCS = isOnVCS;
/*     */   } @Nullable
/*     */   public final Object onDelete(@NotNull Continuation $completion) {
/* 160 */     if (this.onDelete.invoke(this.change, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.onDelete.invoke(this.change, $completion);  this.onDelete.invoke(this.change, $completion); return Unit.INSTANCE;
/*     */   }
/*     */   @Nullable
/*     */   public final Object onLocate(@NotNull Continuation $completion) {
/* 164 */     if (this.onLocate.invoke(this.change, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.onLocate.invoke(this.change, $completion);  this.onLocate.invoke(this.change, $completion); return Unit.INSTANCE;
/*     */   }
/*     */   @Nullable
/*     */   public final Object onRollback(@NotNull Continuation $completion) {
/* 168 */     if (this.onRollback.invoke(this.change, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.onRollback.invoke(this.change, $completion);  this.onRollback.invoke(this.change, $completion); return Unit.INSTANCE;
/*     */   }
/*     */   @Nullable
/*     */   public final Object onSetVCS(@NotNull Continuation $completion) {
/* 172 */     if (this.onSetVCS.invoke(this.change, $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) return this.onSetVCS.invoke(this.change, $completion);  this.onSetVCS.invoke(this.change, $completion); return Unit.INSTANCE;
/*     */   } @Nullable
/*     */   public final Object isOnVCS(@NotNull Continuation $completion) {
/* 175 */     return this.isOnVCS.invoke(this.change, $completion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\FileManipulationActions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */