/*    */ package com.intellij.ml.llm.matterhorn.ej.core.utils;
/*    */ 
/*    */ import com.intellij.openapi.extensions.PluginId;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\n\n\000\n\002\020\016\n\002\b\004\032\b\020\002\032\004\030\0010\001\032\020\020\003\032\004\030\0010\0012\006\020\004\032\0020\001\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\005"}, d2 = {"JUNIE_PLUGIN_ID", "", "getJunieVersion", "getPluginVersion", "id", "ej-core"})
/*    */ public final class PluginUtilsKt {
/*    */   @Nullable
/*  8 */   public static final String getJunieVersion() { return getPluginVersion("org.jetbrains.junie"); } @NotNull
/*    */   public static final String JUNIE_PLUGIN_ID = "org.jetbrains.junie"; @Nullable
/*    */   public static final String getPluginVersion(@NotNull String id) {
/* 11 */     Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullExpressionValue(PluginId.getId(id), "getId(...)"); PluginId pluginId = PluginId.getId(id);
/* 12 */     IdeaPluginDescriptor plugin = PluginManagerCore.getPlugin(pluginId);
/* 13 */     return (plugin != null) ? plugin.getVersion() : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\cor\\utils\PluginUtilsKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */