/*    */ package com.intellij.ml.llm.matterhorn.core.llm.anthropic;
/*    */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\b\020\004\032\0020\005H\026J\016\020\006\032\b\022\004\022\0020\b0\007H\026¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicLlmClientProvider;", "Lcom/intellij/ml/llm/matterhorn/core/llm/MatterhornLlmClientProvider;", "<init>", "()V", "getClient", "Lcom/intellij/ml/llm/matterhorn/core/llm/LlmClient;", "getLLMs", "", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "core-llm"})
/*    */ @SourceDebugExtension({"SMAP\nAnthropicLlmClientProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnthropicLlmClientProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicLlmClientProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,20:1\n774#2:21\n865#2,2:22\n*S KotlinDebug\n*F\n+ 1 AnthropicLlmClientProvider.kt\ncom/intellij/ml/llm/matterhorn/core/llm/anthropic/AnthropicLlmClientProvider\n*L\n18#1:21\n18#1:22,2\n*E\n"})
/*    */ public final class AnthropicLlmClientProvider implements MatterhornLlmClientProvider {
/*    */   public AnthropicLlmClientProvider() {
/* 12 */     EnvExtensionsKt.assertHasMatterhornProxy(BuildConfigKt.getConfig());
/*    */   } @NotNull
/*    */   public LlmClient getClient() {
/* 15 */     return AnthropicClient.INSTANCE;
/*    */   } @NotNull
/*    */   public List<LLM> getLLMs() {
/* 18 */     Iterable $this$filter$iv = LLM.Companion.getKnownModels(); int $i$f$filter = 0;
/*    */ 
/*    */     
/* 21 */     Iterable iterable1 = $this$filter$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 22 */     for (Object element$iv$iv : iterable1) { LLM it = (LLM)element$iv$iv; int $i$a$-filter-AnthropicLlmClientProvider$getLLMs$1 = 0; if ((it.getProvider() == LlmProvider.Anthropic)) destination$iv$iv.add(element$iv$iv);  }
/* 23 */      return (List)destination$iv$iv;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\anthropic\AnthropicLlmClientProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */