/*    */ package com.intellij.ml.llm.activation.data.model;
/*    */ 
/*    */ import com.intellij.ide.plugins.IdeaPluginDescriptor;
/*    */ import com.intellij.openapi.application.ApplicationNamesInfo;
/*    */ import com.intellij.openapi.extensions.PluginId;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\032\n\000\n\002\030\002\n\002\020\016\n\002\b\013\n\002\030\002\n\002\030\002\n\002\b\003\032\022\020\000\032\016\022\004\022\0020\002\022\004\022\0020\0020\001\032\b\020\003\032\0020\002H\002\032\b\020\004\032\0020\002H\002\032\022\020\f\032\004\030\0010\0022\006\020\021\032\0020\002H\002\"\016\020\005\032\0020\002XT¢\006\002\n\000\"\032\020\006\032\0020\0028BX\004¢\006\f\022\004\b\007\020\b\032\004\b\t\020\n\"\024\020\013\032\0020\0028BX\004¢\006\006\032\004\b\f\020\n\"\036\020\r\032\f0\002¢\006\002\b\016¢\006\002\b\0178BX\004¢\006\006\032\004\b\020\020\n¨\006\022"}, d2 = {"getGrazieAgentHeader", "Lkotlin/Pair;", "", "getGrazieAgentName", "getGrazieAgentVersion", "JUNIE_PLUGIN_ID", "productName", "getProductName$annotations", "()V", "getProductName", "()Ljava/lang/String;", "pluginVersion", "getPluginVersion", "productVersion", "Lcom/intellij/openapi/util/NlsSafe;", "Lorg/jetbrains/annotations/NotNull;", "getProductVersion", "id", "data.model"})
/*    */ public final class GrazieAgentKt {
/*    */   @NotNull
/* 11 */   public static final Pair<String, String> getGrazieAgentHeader() { return TuplesKt.to("Grazie-Agent", (new GrazieAgent(getGrazieAgentName(), getGrazieAgentVersion())).json()); } @NotNull
/*    */   private static final String JUNIE_PLUGIN_ID = "org.jetbrains.junie"; private static final String getGrazieAgentName() {
/* 13 */     return "junie:" + getProductName(); } private static final String getGrazieAgentVersion() {
/* 14 */     return getPluginVersion() + ":" + getPluginVersion();
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   private static final String getProductName() {
/* 23 */     Intrinsics.checkNotNullExpressionValue(ApplicationNamesInfo.getInstance().getProductName(), "getProductName(...)"); Intrinsics.checkNotNullExpressionValue(ApplicationNamesInfo.getInstance().getProductName().toLowerCase(Locale.ROOT), "toLowerCase(...)"); return PlatformUtils.isIdeaCommunity() ? "idea-community" : (PlatformUtils.isPyCharmCommunity() ? "pycharm-community" : ApplicationNamesInfo.getInstance().getProductName().toLowerCase(Locale.ROOT));
/*    */   }
/*    */   
/* 26 */   private static final String getPluginVersion() { if (getPluginVersion("org.jetbrains.junie") == null) getPluginVersion("org.jetbrains.junie");  return "unknown"; } private static final String getProductVersion() {
/* 27 */     Intrinsics.checkNotNullExpressionValue(ApplicationInfo.getInstance().getFullVersion(), "getFullVersion(...)"); return ApplicationInfo.getInstance().getFullVersion();
/*    */   }
/*    */   private static final String getPluginVersion(String id) {
/* 30 */     Intrinsics.checkNotNullExpressionValue(PluginId.getId(id), "getId(...)"); PluginId pluginId = PluginId.getId(id);
/* 31 */     IdeaPluginDescriptor plugin = PluginManagerCore.getPlugin(pluginId);
/* 32 */     return (plugin != null) ? plugin.getVersion() : null;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\activation\data\model\GrazieAgentKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */