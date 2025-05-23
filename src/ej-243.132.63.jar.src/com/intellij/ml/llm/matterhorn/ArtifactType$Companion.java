/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020%\n\002\020\016\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\024\020\b\032\b\022\002\b\003\030\0010\0072\006\020\t\032\0020\006R\036\020\004\032\022\022\004\022\0020\006\022\b\022\006\022\002\b\0030\0070\005X\004¢\006\002\n\000¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ArtifactType$Companion;", "", "<init>", "()V", "nameToType", "", "", "Lcom/intellij/ml/llm/matterhorn/ArtifactType;", "findByName", "name", "core"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @Nullable
/*    */   public final ArtifactType<?> findByName(@NotNull String name) {
/* 22 */     Intrinsics.checkNotNullParameter(name, "name"); return (ArtifactType)ArtifactType.access$getNameToType$cp().get(name);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ArtifactType$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */