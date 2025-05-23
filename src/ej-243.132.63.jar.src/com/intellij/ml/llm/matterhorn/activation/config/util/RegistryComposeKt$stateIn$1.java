/*    */ package com.intellij.ml.llm.matterhorn.activation.config.util;
/*    */ 
/*    */ import androidx.compose.runtime.MutableState;
/*    */ import com.intellij.openapi.util.registry.RegistryValue;
/*    */ import com.intellij.openapi.util.registry.RegistryValueListener;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\027\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026¨\006\006"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/config/util/RegistryComposeKt$stateIn$1", "Lcom/intellij/openapi/util/registry/RegistryValueListener;", "afterValueChanged", "", "value", "Lcom/intellij/openapi/util/registry/RegistryValue;", "config"})
/*    */ public final class RegistryComposeKt$stateIn$1
/*    */   implements RegistryValueListener
/*    */ {
/*    */   RegistryComposeKt$stateIn$1(MutableState<RegistryValue> $mutableState) {}
/*    */   
/*    */   public void afterValueChanged(RegistryValue value) {
/* 21 */     Intrinsics.checkNotNullParameter(value, "value"); this.$mutableState.setValue(value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\confi\\util\RegistryComposeKt$stateIn$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */