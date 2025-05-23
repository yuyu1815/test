/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.onboarding;
/*    */ import com.intellij.ml.llm.matterhorn.ej.ui.JunieEventNotificationService;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\026\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\002\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/onboarding/JunieOnboarding;", "Lcom/intellij/openapi/startup/ProjectActivity;", "<init>", "()V", "execute", "", "project", "Lcom/intellij/openapi/project/Project;", "(Lcom/intellij/openapi/project/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nJunieOnboarding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JunieOnboarding.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/onboarding/JunieOnboarding\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,20:1\n31#2,2:21\n*S KotlinDebug\n*F\n+ 1 JunieOnboarding.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/onboarding/JunieOnboarding\n*L\n15#1:21,2\n*E\n"})
/*    */ public final class JunieOnboarding implements ProjectActivity {
/*    */   @Nullable
/*    */   public Object execute(@NotNull Project project, @NotNull Continuation $completion) {
/* 11 */     PropertiesComponent properties = PropertiesComponent.getInstance(project);
/* 12 */     String flagKey = "junie.onboarding.icon.badge.shown";
/*    */     
/* 14 */     if (!properties.getBoolean(flagKey, false)) {
/* 15 */       ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 21 */       Class<JunieEventNotificationService> serviceClass$iv = JunieEventNotificationService.class;
/* 22 */       if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ((JunieEventNotificationService)$this$service$iv.getService(serviceClass$iv)).sendUserNotification(JunieEventNotificationService.EventType.TASK_FINISHED);
/*    */       properties.setValue(flagKey, true);
/*    */     } 
/*    */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\onboarding\JunieOnboarding.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */