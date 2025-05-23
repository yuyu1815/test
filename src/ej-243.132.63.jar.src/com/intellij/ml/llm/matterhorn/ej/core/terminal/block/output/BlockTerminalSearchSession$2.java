/*    */ package com.intellij.ml.llm.matterhorn.ej.core.terminal.block.output;
/*    */ 
/*    */ import com.intellij.find.FindModel;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\022\020\004\032\0020\0052\b\020\006\032\004\030\0010\007H\026R\016\020\002\032\0020\003X\016¢\006\002\n\000¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/terminal/block/output/BlockTerminalSearchSession$2", "Lcom/intellij/find/FindModel$FindModelObserver;", "preventRecursion", "", "findModelChanged", "", "findModel", "Lcom/intellij/find/FindModel;", "ej-core"})
/*    */ public final class null
/*    */   implements FindModel.FindModelObserver
/*    */ {
/*    */   private boolean preventRecursion;
/*    */   
/*    */   public void findModelChanged(FindModel findModel) {
/* 65 */     if (!this.preventRecursion)
/*    */       try {
/* 67 */         this.preventRecursion = true;
/* 68 */         BlockTerminalSearchSession.access$findModelChanged(BlockTerminalSearchSession.this);
/*    */       } finally {
/*    */         
/* 71 */         this.preventRecursion = false;
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\terminal\block\output\BlockTerminalSearchSession$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */