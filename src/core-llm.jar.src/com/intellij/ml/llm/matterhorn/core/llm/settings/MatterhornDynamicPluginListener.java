/*    */ package com.intellij.ml.llm.matterhorn.core.llm.settings;
/*    */ 
/*    */ import com.intellij.ide.plugins.DynamicPluginListener;
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026J\030\020\b\032\0020\0052\006\020\006\032\0020\0072\006\020\t\032\0020\nH\026¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/settings/MatterhornDynamicPluginListener;", "Lcom/intellij/ide/plugins/DynamicPluginListener;", "<init>", "()V", "pluginLoaded", "", "pluginDescriptor", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "beforePluginUnload", "isUpdate", "", "core-llm"})
/*    */ public final class MatterhornDynamicPluginListener
/*    */   implements DynamicPluginListener
/*    */ {
/*    */   public void pluginLoaded(@NotNull IdeaPluginDescriptor pluginDescriptor) {
/* 32 */     Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor");
/*    */   }
/*    */   
/*    */   public void beforePluginUnload(@NotNull IdeaPluginDescriptor pluginDescriptor, boolean isUpdate) {
/* 36 */     Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\settings\MatterhornDynamicPluginListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */