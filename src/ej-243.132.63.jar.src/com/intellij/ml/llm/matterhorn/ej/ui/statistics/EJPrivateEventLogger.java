/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.statistics;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\003\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJPrivateEventLogger;", "Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/AbstractEJPrivateEventLogger;", "<init>", "()V", "enabled", "", "getEnabled", "()Z", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nEJPrivateEventLogger.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EJPrivateEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJPrivateEventLogger\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,11:1\n31#2,2:12\n*S KotlinDebug\n*F\n+ 1 EJPrivateEventLogger.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/statistics/EJPrivateEventLogger\n*L\n10#1:12,2\n*E\n"})
/*    */ public final class EJPrivateEventLogger extends AbstractEJPrivateEventLogger {
/*    */   public boolean getEnabled() {
/* 10 */     ComponentManager $this$service$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$service = 0;
/*    */     
/* 12 */     Class<MatterhornModelPersistentStateComponent> serviceClass$iv = MatterhornModelPersistentStateComponent.class;
/* 13 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  return ((MatterhornModelPersistentStateComponent)$this$service$iv.getService(serviceClass$iv)).isDataSharingEnabled();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final EJPrivateEventLogger INSTANCE = new EJPrivateEventLogger();
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\statistics\EJPrivateEventLogger.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */