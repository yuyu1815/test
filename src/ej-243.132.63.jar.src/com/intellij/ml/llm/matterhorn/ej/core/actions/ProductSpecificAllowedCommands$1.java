/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions;
/*    */ 
/*    */ import com.intellij.openapi.extensions.ExtensionPointListener;
/*    */ import com.intellij.openapi.extensions.PluginDescriptor;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\037\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\002\b\002*\001\000\b\n\030\0002\b\022\004\022\0020\0020\001J\030\020\003\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\007H\026J\030\020\b\032\0020\0042\006\020\005\032\0020\0022\006\020\006\032\0020\007H\026¨\006\t"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$1", "Lcom/intellij/openapi/extensions/ExtensionPointListener;", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/ProductSpecificAllowedCommands$CommandsProvider;", "extensionAdded", "", "extension", "pluginDescriptor", "Lcom/intellij/openapi/extensions/PluginDescriptor;", "extensionRemoved", "ej-core"})
/*    */ public final class null
/*    */   implements ExtensionPointListener<ProductSpecificAllowedCommands.CommandsProvider>
/*    */ {
/*    */   public void extensionAdded(ProductSpecificAllowedCommands.CommandsProvider extension, PluginDescriptor pluginDescriptor) {
/* 21 */     Intrinsics.checkNotNullParameter(extension, "extension"); Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); ProductSpecificAllowedCommands.access$setRegex$p(ProductSpecificAllowedCommands.this, ProductSpecificAllowedCommands.access$computeRegex(ProductSpecificAllowedCommands.this));
/*    */   }
/*    */   
/*    */   public void extensionRemoved(ProductSpecificAllowedCommands.CommandsProvider extension, PluginDescriptor pluginDescriptor) {
/* 25 */     Intrinsics.checkNotNullParameter(extension, "extension"); Intrinsics.checkNotNullParameter(pluginDescriptor, "pluginDescriptor"); ProductSpecificAllowedCommands.access$setRegex$p(ProductSpecificAllowedCommands.this, ProductSpecificAllowedCommands.access$computeRegex(ProductSpecificAllowedCommands.this));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\ProductSpecificAllowedCommands$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */