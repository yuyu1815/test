/*    */ package com.intellij.ml.llm.matterhorn;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\000\n\002\020\013\n\000\n\002\030\002\n\002\b\003\bæ\001\030\000 \0072\0020\001:\001\007J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\020\020\006\032\0020\0032\006\020\004\032\0020\005H&¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter;", "", "acceptForSource", "", "item", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "acceptForStructure", "Companion", "core"}) public interface ProjectFileStructureFilter { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; boolean acceptForSource(@NotNull ProjectStructureItem paramProjectStructureItem); boolean acceptForStructure(@NotNull ProjectStructureItem paramProjectStructureItem); @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\n\002\020\013\n\000\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\n\032\0020\0132\006\020\f\032\0020\rJ\016\020\n\032\0020\0132\006\020\f\032\0020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\007¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter$Companion;", "", "<init>", "()V", "ALL", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter;", "getALL", "()Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter;", "WITHOUT_HIDDEN_FOLDERS", "getWITHOUT_HIDDEN_FOLDERS", "isHiddenFolder", "", "item", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureFolder;", "Lcom/intellij/ml/llm/matterhorn/ProjectStructureItem;", "core"})
/*    */   @SourceDebugExtension({"SMAP\nProjectFileStructureFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProjectFileStructureFilter.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter$Companion\n+ 2 ProjectFileStructureFilter.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureFilterKt\n*L\n1#1,18:1\n17#2:19\n*S KotlinDebug\n*F\n+ 1 ProjectFileStructureFilter.kt\ncom/intellij/ml/llm/matterhorn/ProjectFileStructureFilter$Companion\n*L\n6#1:19\n*E\n"})
/*    */   public static final class Companion { @NotNull
/*  5 */     private static final ProjectFileStructureFilter ALL = ProjectFileStructureFilter$Companion$ALL$1.INSTANCE; @NotNull private static final ProjectFileStructureFilter WITHOUT_HIDDEN_FOLDERS; @NotNull public final ProjectFileStructureFilter getALL() { return ALL; } @Metadata(mv = {2, 1, 0}, k = 3, xi = 48) static final class ProjectFileStructureFilter$Companion$ALL$1 implements ProjectFileStructureFilter { public static final ProjectFileStructureFilter$Companion$ALL$1 INSTANCE = new ProjectFileStructureFilter$Companion$ALL$1(); public final boolean acceptForStructure(ProjectStructureItem it) { Intrinsics.checkNotNullParameter(it, "it"); return true; } public boolean acceptForSource(ProjectStructureItem item) { return ProjectFileStructureFilter.DefaultImpls.acceptForSource(this, item); } } @NotNull
/*  6 */     public final ProjectFileStructureFilter getWITHOUT_HIDDEN_FOLDERS() { return WITHOUT_HIDDEN_FOLDERS; } static { Companion $this$withoutHiddenFolders$iv = $$INSTANCE; int $i$f$withoutHiddenFolders = 0; WITHOUT_HIDDEN_FOLDERS = 
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
/* 19 */         new ProjectFileStructureFilter$Companion$special$$inlined$withoutHiddenFolders$1($this$withoutHiddenFolders$iv); }
/*    */ 
/*    */     
/*    */     public final boolean isHiddenFolder(@NotNull ProjectStructureFolder item) {
/*    */       Intrinsics.checkNotNullParameter(item, "item");
/*    */       return StringsKt.startsWith$default(item.getName(), ".", false, 2, null);
/*    */     }
/*    */     
/*    */     public final boolean isHiddenFolder(@NotNull ProjectStructureItem item) {
/*    */       Intrinsics.checkNotNullParameter(item, "item");
/*    */       return (item instanceof ProjectStructureFolder && isHiddenFolder((ProjectStructureFolder)item));
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   public static final class DefaultImpls {
/*    */     public static boolean acceptForSource(@NotNull ProjectFileStructureFilter $this, @NotNull ProjectStructureItem item) {
/*    */       Intrinsics.checkNotNullParameter(item, "item");
/*    */       return true;
/*    */     }
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureFilter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */