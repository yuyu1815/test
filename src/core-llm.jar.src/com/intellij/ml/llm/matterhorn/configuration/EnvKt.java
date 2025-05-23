/*    */ package com.intellij.ml.llm.matterhorn.configuration;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\016\n\000\n\002\020\013\n\002\030\002\n\002\b\003\"\025\020\000\032\0020\001*\0020\0028F¢\006\006\032\004\b\003\020\004¨\006\005"}, d2 = {"onlyHasJbAI", "", "Lcom/intellij/ml/llm/matterhorn/configuration/Env;", "getOnlyHasJbAI", "(Lcom/intellij/ml/llm/matterhorn/configuration/Env;)Z", "core"})
/*    */ public final class EnvKt
/*    */ {
/*    */   public static final boolean getOnlyHasJbAI(@NotNull Env $this$onlyHasJbAI) {
/* 32 */     Intrinsics.checkNotNullParameter($this$onlyHasJbAI, "<this>"); return ($this$onlyHasJbAI.getHasJbAI() && !$this$onlyHasJbAI.getHasIngrazzio() && !$this$onlyHasJbAI.getHasDirectAccess());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\configuration\EnvKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */