/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ 
/*    */ import com.intellij.ide.util.PropertiesComponent;
/*    */ import com.intellij.openapi.ui.DoNotAskOption;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\013\n\000\n\002\020\b\n\000*\001\000\b\n\030\0002\0020\001J\030\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/starter/CollectMatterhornCachesAction$actionPerformed$confirmed$1", "Lcom/intellij/openapi/ui/DoNotAskOption$Adapter;", "rememberChoice", "", "selected", "", "exitCode", "", "matterhorn"})
/*    */ public final class CollectMatterhornCachesAction$actionPerformed$confirmed$1
/*    */   extends DoNotAskOption.Adapter
/*    */ {
/*    */   public void rememberChoice(boolean selected, int exitCode) {
/* 56 */     PropertiesComponent.getInstance().setValue("matterhorn.caches.action.show.confirmation.dialog", selected);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CollectMatterhornCachesAction$actionPerformed$confirmed$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */