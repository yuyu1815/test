package com.intellij.ml.llm.matterhorn;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\bf\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H&J\020\020\006\032\0020\0072\006\020\004\032\0020\005H&J\020\020\b\032\0020\0072\006\020\t\032\0020\nH&J\020\020\013\032\0020\0072\006\020\t\032\0020\fH&¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectStructureVisitor;", "", "enterFolder", "", "folder", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "exitFolder", "", "visitFile", "file", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFile;", "visitBinaryFile", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureBinaryFile;", "core"})
public interface ProjectStructureVisitor {
  boolean enterFolder(@NotNull ProjectStructureFolder paramProjectStructureFolder);
  
  void exitFolder(@NotNull ProjectStructureFolder paramProjectStructureFolder);
  
  void visitFile(@NotNull ProjectStructureFile paramProjectStructureFile);
  
  void visitBinaryFile(@NotNull ProjectStructureBinaryFile paramProjectStructureBinaryFile);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectStructureVisitor.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */