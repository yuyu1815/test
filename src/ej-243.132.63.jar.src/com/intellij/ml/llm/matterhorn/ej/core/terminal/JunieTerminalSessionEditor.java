/*     */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*     */ 
/*     */ import com.intellij.openapi.Disposable;
/*     */ import com.intellij.openapi.fileEditor.FileEditor;
/*     */ import com.intellij.openapi.fileEditor.FileEditorState;
/*     */ import com.intellij.openapi.project.Project;
/*     */ import com.intellij.openapi.util.UserDataHolderBase;
/*     */ import com.intellij.openapi.vfs.VirtualFile;
/*     */ import com.intellij.terminal.ui.TerminalWidgetKt;
/*     */ import java.beans.PropertyChangeListener;
/*     */ import javax.swing.JComponent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.plugins.terminal.vfs.TerminalSessionVirtualFileImpl;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000N\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\000\030\0002\0020\0012\0020\002B\027\022\006\020\003\032\0020\004\022\006\020\005\032\0020\006¢\006\004\b\007\020\bJ\b\020\013\032\0020\fH\026J\b\020\r\032\0020\fH\026J\b\020\016\032\0020\017H\026J\020\020\020\032\0020\0212\006\020\022\032\0020\023H\026J\b\020\024\032\0020\nH\026J\b\020\025\032\0020\nH\026J\020\020\026\032\0020\0212\006\020\027\032\0020\030H\026J\020\020\031\032\0020\0212\006\020\027\032\0020\030H\026J\b\020\032\032\0020\033H\026J\b\020\034\032\0020\021H\026J\006\020\035\032\0020\021R\016\020\003\032\0020\004X\004¢\006\002\n\000R\016\020\005\032\0020\006X\004¢\006\002\n\000R\016\020\t\032\0020\nX\016¢\006\002\n\000¨\006\036"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalSessionEditor;", "Lcom/intellij/openapi/util/UserDataHolderBase;", "Lcom/intellij/openapi/fileEditor/FileEditor;", "myProject", "Lcom/intellij/openapi/project/Project;", "myFile", "Lorg/jetbrains/plugins/terminal/vfs/TerminalSessionVirtualFileImpl;", "<init>", "(Lcom/intellij/openapi/project/Project;Lorg/jetbrains/plugins/terminal/vfs/TerminalSessionVirtualFileImpl;)V", "responsibleForWidgetDispose", "", "getComponent", "Ljavax/swing/JComponent;", "getPreferredFocusedComponent", "getName", "", "setState", "", "state", "Lcom/intellij/openapi/fileEditor/FileEditorState;", "isModified", "isValid", "addPropertyChangeListener", "listener", "Ljava/beans/PropertyChangeListener;", "removePropertyChangeListener", "getFile", "Lcom/intellij/openapi/vfs/VirtualFile;", "dispose", "onExecutorSessionCompleted", "ej-core"})
/*     */ public final class JunieTerminalSessionEditor
/*     */   extends UserDataHolderBase
/*     */   implements FileEditor
/*     */ {
/*     */   @NotNull
/*     */   private final Project myProject;
/*     */   @NotNull
/*     */   private final TerminalSessionVirtualFileImpl myFile;
/*     */   private boolean responsibleForWidgetDispose;
/*     */   
/*     */   public JunieTerminalSessionEditor(@NotNull Project myProject, @NotNull TerminalSessionVirtualFileImpl myFile) {
/*  71 */     this.myProject = myProject;
/*  72 */     this.myFile = myFile;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public JComponent getComponent() {
/*  77 */     Intrinsics.checkNotNullExpressionValue(this.myFile.getTerminalWidget().getComponent(), "getComponent(...)"); return this.myFile.getTerminalWidget().getComponent();
/*     */   } @NotNull
/*  79 */   public JComponent getPreferredFocusedComponent() { Intrinsics.checkNotNullExpressionValue(this.myFile.getTerminalWidget().getPreferredFocusableComponent(), "getPreferredFocusableComponent(...)"); return this.myFile.getTerminalWidget().getPreferredFocusableComponent(); } @NotNull
/*     */   public String getName() {
/*  81 */     Intrinsics.checkNotNullExpressionValue(this.myFile.getName(), "getName(...)"); return this.myFile.getName();
/*     */   } public void setState(@NotNull FileEditorState state) {
/*  83 */     Intrinsics.checkNotNullParameter(state, "state");
/*     */   } public boolean isModified() {
/*  85 */     return false;
/*     */   } public boolean isValid() {
/*  87 */     return true;
/*     */   } public void addPropertyChangeListener(@NotNull PropertyChangeListener listener) {
/*  89 */     Intrinsics.checkNotNullParameter(listener, "listener");
/*     */   }
/*  91 */   public void removePropertyChangeListener(@NotNull PropertyChangeListener listener) { Intrinsics.checkNotNullParameter(listener, "listener"); } @NotNull
/*     */   public VirtualFile getFile() {
/*  93 */     return (VirtualFile)this.myFile;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void dispose() {}
/*     */ 
/*     */   
/*     */   public final void onExecutorSessionCompleted() {
/* 102 */     Intrinsics.checkNotNullExpressionValue(this.myFile.getTerminalWidget(), "getTerminalWidget(...)"); TerminalWidgetKt.setNewParentDisposable(this.myFile.getTerminalWidget(), (Disposable)this);
/* 103 */     this.responsibleForWidgetDispose = true;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalSessionEditor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */