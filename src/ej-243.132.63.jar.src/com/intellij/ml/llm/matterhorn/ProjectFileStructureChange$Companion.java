/*   */ package com.intellij.ml.llm.matterhorn;
/*   */ import kotlinx.serialization.KSerializer;
/*   */ 
/*   */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\f\020\004\032\b\022\004\022\0020\0060\005¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/intellij/ml/llm/matterhorn/ProjectFileStructureChange;", "core"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final KSerializer<ProjectFileStructureChange> serializer() {
/* 8 */     KClass[] arrayOfKClass = new KClass[5]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ProjectFileStructureCreateFileChange.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProjectFileStructureCreateMediaChange.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProjectFileStructureRemoveFileChange.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(ProjectFileStructureRenameFileChange.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(ProjectFileStructureUpdateFileChange.class); KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = (KSerializer)ProjectFileStructureCreateFileChange.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)ProjectFileStructureCreateMediaChange.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)ProjectFileStructureRemoveFileChange.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)ProjectFileStructureRenameFileChange.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)ProjectFileStructureUpdateFileChange.$serializer.INSTANCE; return (KSerializer<ProjectFileStructureChange>)new SealedClassSerializer("com.intellij.ml.llm.matterhorn.ProjectFileStructureChange", Reflection.getOrCreateKotlinClass(ProjectFileStructureChange.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*   */   }
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ProjectFileStructureChange$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */