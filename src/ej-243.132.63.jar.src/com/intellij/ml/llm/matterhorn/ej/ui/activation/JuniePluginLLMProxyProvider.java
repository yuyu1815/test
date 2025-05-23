/*    */ package com.intellij.ml.llm.matterhorn.ej.ui.activation;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*    */ import com.intellij.ml.llm.matterhorn.MatterhornCaches;
/*    */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*    */ import com.intellij.ml.llm.matterhorn.configuration.EnvKt;
/*    */ import com.intellij.ml.llm.matterhorn.core.llm.AICache;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import com.intellij.openapi.components.ServicesKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\bÇ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/activation/JuniePluginLLMProxyProvider;", "", "<init>", "()V", "createLLMProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "project", "Lcom/intellij/openapi/project/Project;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ @SourceDebugExtension({"SMAP\nJuniePluginLLMProxyProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JuniePluginLLMProxyProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JuniePluginLLMProxyProvider\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,41:1\n31#2,2:42\n*S KotlinDebug\n*F\n+ 1 JuniePluginLLMProxyProvider.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/activation/JuniePluginLLMProxyProvider\n*L\n20#1:42,2\n*E\n"})
/*    */ public final class JuniePluginLLMProxyProvider {
/*    */   @NotNull
/*    */   public final LLMProxy createLLMProxy(@NotNull Project project) {
/* 20 */     Intrinsics.checkNotNullParameter(project, "project"); ComponentManager $this$service$iv = (ComponentManager)project; int $i$f$service = 0;
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
/* 42 */     Class<ArtifactRequestExecutorService> serviceClass$iv = ArtifactRequestExecutorService.class;
/* 43 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  ArtifactRequestExecutorService service = (ArtifactRequestExecutorService)$this$service$iv.getService(serviceClass$iv);
/*    */     boolean grazieRegistry = Registry.Companion.is("matterhorn.use.grazie2");
/*    */     boolean onlyHasJbAI = EnvKt.getOnlyHasJbAI(BuildConfigKt.getConfig());
/*    */     JuniePluginLLMProxyProviderKt.access$getLog$p().info("Use Grazie2: " + grazieRegistry + ", Only has JB AI: " + onlyHasJbAI);
/*    */     boolean useGrazieApi = ((grazieRegistry && BuildConfigKt.getConfig().getHasJbAI()) || onlyHasJbAI);
/*    */     MatterhornCaches caches = service.getCaches();
/*    */     JuniePluginLLMProxyProviderKt.access$getLog$p().info("Using JunieGrazieLLMProxy");
/*    */     JuniePluginLLMProxyProviderKt.access$getLog$p().info("Using MatterhornAIProxy");
/*    */     return (useGrazieApi == true) ? (LLMProxy)new JunieGrazieLLMProxy(AICache.Companion.create(BuildConfigKt.getConfig(), caches), new JunieGrazieAuthService(), project) : MatterhornLLMProxyProvider.INSTANCE.createLLMProxy(service);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final JuniePluginLLMProxyProvider INSTANCE = new JuniePluginLLMProxyProvider();
/*    */   public static final int $stable;
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\activation\JuniePluginLLMProxyProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */