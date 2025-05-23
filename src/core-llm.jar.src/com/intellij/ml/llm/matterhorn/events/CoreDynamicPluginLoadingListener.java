/*    */ package com.intellij.ml.llm.matterhorn.events;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\000\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\004\032\0020\0052\006\020\006\032\0020\007H\026¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/events/CoreDynamicPluginLoadingListener;", "Lcom/intellij/ide/plugins/DynamicPluginListener;", "<init>", "()V", "pluginLoaded", "", "pluginDescriptor", "Lcom/intellij/ide/plugins/IdeaPluginDescriptor;", "core"})
/*    */ final class CoreDynamicPluginLoadingListener
/*    */   implements DynamicPluginListener
/*    */ {
/*    */   public void pluginLoaded(@NotNull IdeaPluginDescriptor pluginDescriptor) {
/* 35 */     Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); SerializableEventUpdatableSerializer.INSTANCE.getSerializer().reloadModule$core(SerializableEventUpdatableSerializer.INSTANCE.makeSerializersModule());
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\events\CoreDynamicPluginLoadingListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */