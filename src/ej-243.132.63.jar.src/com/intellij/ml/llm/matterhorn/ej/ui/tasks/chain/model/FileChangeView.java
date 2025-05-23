/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.chain.model;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ml.llm.matterhorn.ej.core.actions.edit.FileChange;
/*     */ import com.intellij.ml.llm.matterhorn.ej.ui.toolwindow.OnShowDiff;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.io.path.PathsKt;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\020\016\n\002\b\003\n\002\020\b\n\002\b\005\n\002\020\013\n\000\n\002\020\002\n\002\b\002\b\007\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\007¢\006\004\b\b\020\tJ\016\020\004\032\0020\0332\006\020\034\032\0020\031R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\n\020\013R\016\020\004\032\0020\005X\004¢\006\002\n\000R\023\020\006\032\004\030\0010\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\016\032\0020\0178F¢\006\006\032\004\b\020\020\021R\021\020\022\032\0020\0238F¢\006\006\032\004\b\024\020\025R\021\020\026\032\0020\0238F¢\006\006\032\004\b\027\020\025R\021\020\030\032\0020\0318F¢\006\006\032\004\b\030\020\032¨\006\035"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileChangeView;", "", "change", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "onShowDiff", "Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;", "fileManipulationActions", "Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;", "<init>", "(Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;Lcom/intellij/ml/llm/matterhorn/ej/ui/toolwindow/OnShowDiff;Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;)V", "getChange", "()Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/FileChange;", "getFileManipulationActions", "()Lcom/intellij/ml/llm/matterhorn/ej/ui/tasks/chain/model/FileManipulationActions;", "name", "", "getName", "()Ljava/lang/String;", "linesAdded", "", "getLinesAdded", "()I", "linesRemoved", "getLinesRemoved", "isNew", "", "()Z", "", "wantEditable", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class FileChangeView
/*     */ {
/*     */   @NotNull
/*     */   private final FileChange change;
/*     */   @NotNull
/*     */   private final OnShowDiff onShowDiff;
/*     */   @Nullable
/*     */   private final FileManipulationActions fileManipulationActions;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   @NotNull
/*     */   public final FileChange getChange() {
/*     */     return this.change;
/*     */   }
/*     */   
/*     */   public FileChangeView(@NotNull FileChange change, @NotNull OnShowDiff onShowDiff, @Nullable FileManipulationActions fileManipulationActions) {
/* 180 */     this.change = change;
/* 181 */     this.onShowDiff = onShowDiff;
/* 182 */     this.fileManipulationActions = fileManipulationActions; } @Nullable public final FileManipulationActions getFileManipulationActions() { return this.fileManipulationActions; }
/*     */    @NotNull
/*     */   public final String getName() {
/* 185 */     return PathsKt.getName(this.change.getPath());
/*     */   }
/*     */   public final int getLinesAdded() {
/* 188 */     return this.change.getLinesAdded();
/*     */   }
/*     */   public final int getLinesRemoved() {
/* 191 */     return this.change.getLinesRemoved();
/*     */   }
/*     */   
/*     */   public final boolean isNew() {
/* 195 */     CharSequence charSequence = this.change.getInitialContent(); return (charSequence == null || charSequence.length() == 0);
/*     */   }
/*     */   public final void onShowDiff(boolean wantEditable) {
/* 198 */     this.onShowDiff.showDiff(this.change, wantEditable);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\chain\model\FileChangeView.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */