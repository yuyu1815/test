/*    */ package com.intellij.ml.llm.matterhorn.ej.idea.gradle;
/*    */ import com.intellij.openapi.editor.Document;
/*    */ import com.intellij.openapi.fileEditor.FileDocumentManager;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\030\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH\026¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/idea/gradle/GradleProjectUpdateTrigger;", "Lcom/intellij/ml/llm/matterhorn/ej/core/utils/await/ProjectUpdateTrigger;", "<init>", "()V", "shouldLaunchUpdate", "", "project", "Lcom/intellij/openapi/project/Project;", "updatedDoc", "Lcom/intellij/openapi/editor/Document;", "ej-gradle"})
/*    */ public final class GradleProjectUpdateTrigger implements ProjectUpdateTrigger {
/*    */   public boolean shouldLaunchUpdate(@NotNull Project project, @NotNull Document updatedDoc) {
/* 13 */     Intrinsics.checkNotNullParameter(project, "project"); Intrinsics.checkNotNullParameter(updatedDoc, "updatedDoc"); VirtualFile virtualFile = FileDocumentManager.getInstance().getFile(updatedDoc);
/* 14 */     if (virtualFile == null) return false; 
/* 15 */     String extension = virtualFile.getExtension();
/* 16 */     return (Intrinsics.areEqual(extension, "gradle") || Intrinsics.areEqual(extension, "kts"));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\idea\gradle\GradleProjectUpdateTrigger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */