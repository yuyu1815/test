/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.tasks.prompt;
/*    */ 
/*    */ import com.intellij.openapi.util.registry.Registry;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ public final class DefaultImpls
/*    */ {
/*    */   public static boolean getPerplexityModeEnabled(@NotNull PromptOwnerViewModel $this) {
/* 15 */     return Registry.Companion.get("com.intellij.junie.perplexity.enabled").asBoolean();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\tasks\prompt\PromptOwnerViewModel$DefaultImpls.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */