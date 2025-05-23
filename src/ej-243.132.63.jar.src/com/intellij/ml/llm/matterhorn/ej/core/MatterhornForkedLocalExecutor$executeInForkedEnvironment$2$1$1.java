/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.openapi.vfs.VirtualFile;
/*    */ import com.intellij.openapi.vfs.VirtualFileFilter;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/MatterhornForkedLocalExecutor$executeInForkedEnvironment$2$1$1", "Lcom/intellij/openapi/vfs/VirtualFileFilter;", "accept", "", "file", "Lcom/intellij/openapi/vfs/VirtualFile;", "ej-core"})
/*    */ public final class MatterhornForkedLocalExecutor$executeInForkedEnvironment$2$1$1
/*    */   implements VirtualFileFilter
/*    */ {
/*    */   public boolean accept(VirtualFile file) {
/* 65 */     Intrinsics.checkNotNullParameter(file, "file"); System.out.println("==Copying " + file.getPath());
/* 66 */     return !Intrinsics.areEqual(file.getName(), ".git");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\MatterhornForkedLocalExecutor$executeInForkedEnvironment$2$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */