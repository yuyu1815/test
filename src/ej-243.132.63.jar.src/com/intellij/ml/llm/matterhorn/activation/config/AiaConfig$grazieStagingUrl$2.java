/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieApiUrl;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */ final class AiaConfig$grazieStagingUrl$2
/*    */   implements Function0<GrazieApiUrl>
/*    */ {
/*    */   public final String invoke-0_pFto0() {
/* 41 */     return AiaConfig.access$isGrazieStaging(AiaConfig.this) ? GrazieApiUrl.Companion.fromResolvedUrl-kmrddwU(AiaConfigGrazieStagingUrlUtil.resolveStagingUrl$default(AiaConfigGrazieStagingUrlUtil.INSTANCE, null, null, 3, null)) : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfig$grazieStagingUrl$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */