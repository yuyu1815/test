/*    */ package com.intellij.ml.llm.matterhorn.activation.config;
/*    */ 
/*    */ import androidx.compose.runtime.State;
/*    */ import com.intellij.ml.llm.matterhorn.activation.config.util.RegistryComposeKt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthOrigin;
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ import java.util.Locale;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\036\n\000\n\002\020\016\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\032\032\020\002\032\b\022\004\022\0020\0040\003*\0020\0052\006\020\006\032\0020\007H\002\032\f\020\b\032\0020\004*\0020\005H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\t"}, d2 = {"debugQuotaExceededLicenseId", "", "asAuthOriginStateIn", "Landroidx/compose/runtime/State;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthOrigin;", "Lcom/intellij/openapi/util/registry/RegistryValue;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "asAuthOrigin", "config"})
/*    */ public final class AiaConfigKt
/*    */ {
/*    */   @NotNull
/*    */   public static final String debugQuotaExceededLicenseId = "matterhorn.debug.quota.exceeded.license.id";
/*    */   
/*    */   private static final State<GrazieAuthOrigin> asAuthOriginStateIn(RegistryValue $this$asAuthOriginStateIn, CoroutineScope cs) {
/* 49 */     return RegistryComposeKt.valueStateIn($this$asAuthOriginStateIn, cs, AiaConfigKt::asAuthOriginStateIn$lambda$0); } private static final GrazieAuthOrigin asAuthOriginStateIn$lambda$0(RegistryValue it) { Intrinsics.checkNotNullParameter(it, "it"); return asAuthOrigin(it); }
/*    */ 
/*    */ 
/*    */   
/*    */   private static final GrazieAuthOrigin asAuthOrigin(RegistryValue $this$asAuthOrigin) {
/* 54 */     if ($this$asAuthOrigin.getSelectedOption() == null) $this$asAuthOrigin.getSelectedOption();  String type = $this$asAuthOrigin.asString();
/* 55 */     Intrinsics.checkNotNullExpressionValue(type.toLowerCase(Locale.ROOT), "toLowerCase(...)"); return 
/* 56 */       Intrinsics.areEqual(type.toLowerCase(Locale.ROOT), "application") ? GrazieAuthOrigin.AuthDevApplication : 
/* 57 */       GrazieAuthOrigin.AuthDevUser;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\config\AiaConfigKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */