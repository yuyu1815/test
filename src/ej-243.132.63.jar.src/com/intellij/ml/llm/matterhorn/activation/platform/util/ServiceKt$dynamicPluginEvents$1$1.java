/*    */ package com.intellij.ml.llm.matterhorn.activation.platform.util;
/*    */ 
/*    */ import com.intellij.ide.plugins.DynamicPluginListener;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.channels.ProducerScope;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000!\n\000\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\030\020\006\032\0020\0032\006\020\004\032\0020\0052\006\020\007\032\0020\bH\026J\020\020\t\032\0020\0032\006\020\004\032\0020\005H\002¨\006\n"}, d2 = {"com/intellij/ml/llm/matterhorn/activation/platform/util/ServiceKt$dynamicPluginEvents$1$1", "Lcom/intellij/ide/plugins/DynamicPluginListener;", "pluginLoaded", "", "pluginDescriptor", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "pluginUnloaded", "isUpdate", "", "onEvent", "platform"})
/*    */ public final class null
/*    */   implements DynamicPluginListener
/*    */ {
/*    */   null(ProducerScope<IdeaPluginDescriptor> $$this$callbackFlow) {}
/*    */   
/*    */   public void pluginLoaded(IdeaPluginDescriptor pluginDescriptor) {
/* 37 */     Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); onEvent(pluginDescriptor); } public void pluginUnloaded(IdeaPluginDescriptor pluginDescriptor, boolean isUpdate) {
/* 38 */     Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); onEvent(pluginDescriptor);
/*    */   }
/*    */   private final void onEvent(IdeaPluginDescriptor pluginDescriptor) {
/* 41 */     this.$$this$callbackFlow.trySend-JP2dKIU(pluginDescriptor);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\platfor\\util\ServiceKt$dynamicPluginEvents$1$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */