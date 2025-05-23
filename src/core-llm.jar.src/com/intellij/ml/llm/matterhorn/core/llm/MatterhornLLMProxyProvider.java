/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\004\032\0020\0052\006\020\006\032\0020\007¨\006\b"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLLMProxyProvider;", "", "<init>", "()V", "createLLMProxy", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "service", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequestExecutorService;", "core-llm"})
/*    */ public final class MatterhornLLMProxyProvider {
/*    */   @NotNull
/*    */   public final LLMProxy createLLMProxy(@NotNull ArtifactRequestExecutorService service) {
/*  9 */     Intrinsics.checkNotNullParameter(service, "service"); return new MatterhornAIProxy(
/* 10 */         AICache.Companion.create(BuildConfigKt.getConfig(), service.getCaches()), 
/* 11 */         service.getCaches(), null, null, null, null, 60, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static final MatterhornLLMProxyProvider INSTANCE = new MatterhornLLMProxyProvider();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\MatterhornLLMProxyProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */