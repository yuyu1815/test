/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import com.intellij.ide.Region;
/*    */ import java.util.Locale;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\020\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\032\024\020\002\032\0020\001*\0020\0012\006\020\003\032\0020\004H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\005"}, d2 = {"stagingUrlPropertyName", "", "regionalPropertyName", "region", "Lcom/intellij/ide/Region;", "config"})
/*    */ public final class AiaConfigGrazieStagingUrlUtilKt
/*    */ {
/*    */   @NotNull
/*    */   private static final String stagingUrlPropertyName = "grazie.staging.url";
/*    */   
/*    */   private static final String regionalPropertyName(String $this$regionalPropertyName, Region region) {
/* 45 */     Intrinsics.checkNotNullExpressionValue(region.name().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return $this$regionalPropertyName + "." + $this$regionalPropertyName;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfigGrazieStagingUrlUtilKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */