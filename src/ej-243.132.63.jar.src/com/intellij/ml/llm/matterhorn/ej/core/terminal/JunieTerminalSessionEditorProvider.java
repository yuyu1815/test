/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal;
/*    */ 
/*    */ import com.intellij.openapi.fileEditor.FileEditor;
/*    */ import com.intellij.openapi.fileEditor.FileEditorPolicy;
/*    */ import com.intellij.openapi.fileEditor.FileEditorProvider;
/*    */ import com.intellij.openapi.project.DumbAware;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.plugins.terminal.vfs.TerminalSessionVirtualFileImpl;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\000\030\0002\0020\0012\0020\002B\007¢\006\004\b\003\020\004J\030\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\013\032\0020\006H\026J\030\020\f\032\0020\r2\006\020\007\032\0020\b2\006\020\t\032\0020\nH\026J\b\020\016\032\0020\017H\026J\b\020\020\032\0020\021H\026¨\006\022"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/terminal/JunieTerminalSessionEditorProvider;", "Lcom/intellij/openapi/fileEditor/FileEditorProvider;", "Lcom/intellij/openapi/project/DumbAware;", "<init>", "()V", "accept", "", "project", "Lcom/intellij/openapi/project/Project;", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "acceptRequiresReadAction", "createEditor", "Lcom/intellij/openapi/fileEditor/FileEditor;", "getEditorTypeId", "", "getPolicy", "Lcom/intellij/openapi/fileEditor/FileEditorPolicy;", "ej-core"})
/*    */ public final class JunieTerminalSessionEditorProvider
/*    */   implements FileEditorProvider, DumbAware
/*    */ {
/*    */   public boolean accept(@NotNull Project project, @NotNull VirtualFile file) {
/* 55 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(file, "file"); return (file instanceof TerminalSessionVirtualFileImpl && file.getUserData(OpenTerminalKt.access$getJUNIE_SHELL_EXECUTOR_ID$p()) != null);
/*    */   }
/*    */   public boolean acceptRequiresReadAction() {
/* 58 */     return false;
/*    */   } @NotNull
/*    */   public FileEditor createEditor(@NotNull Project project, @NotNull VirtualFile file) {
/* 61 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(file, "file"); TerminalSessionVirtualFileImpl terminalFile = (TerminalSessionVirtualFileImpl)file;
/* 62 */     return new JunieTerminalSessionEditor(project, terminalFile);
/*    */   }
/*    */   @NotNull
/* 65 */   public String getEditorTypeId() { return "junie-terminal-session-editor"; } @NotNull
/*    */   public FileEditorPolicy getPolicy() {
/* 67 */     return FileEditorPolicy.HIDE_OTHER_EDITORS;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\JunieTerminalSessionEditorProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */