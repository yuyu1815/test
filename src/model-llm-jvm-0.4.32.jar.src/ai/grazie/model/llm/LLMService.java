/*    */ package ai.grazie.model.llm;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChatService;
/*    */ import ai.grazie.model.llm.completion.LLMCompletionService;
/*    */ import ai.grazie.model.llm.embedding.LLMEmbeddingService;
/*    */ import ai.grazie.utils.mpp.geo.Country;
/*    */ import java.util.Set;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\020\"\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\bf\030\0002\0020\0012\0020\0022\0020\003R\034\020\004\032\n\022\004\022\0020\006\030\0010\0058VX\004¢\006\006\032\004\b\007\020\bR\022\020\t\032\0020\nX¦\004¢\006\006\032\004\b\013\020\fø\001\000\002\006\n\004\b!0\001¨\006\rÀ\006\001"}, d2 = {"Lai/grazie/model/llm/LLMService;", "Lai/grazie/model/llm/completion/LLMCompletionService;", "Lai/grazie/model/llm/chat/v5/LLMChatService;", "Lai/grazie/model/llm/embedding/LLMEmbeddingService;", "allowedCountries", "", "Lai/grazie/utils/mpp/geo/Country;", "getAllowedCountries", "()Ljava/util/Set;", "name", "", "getName", "()Ljava/lang/String;", "model-llm"})
/*    */ public interface LLMService extends LLMCompletionService, LLMChatService, LLMEmbeddingService {
/*    */   @Nullable
/*    */   default Set<Country> getAllowedCountries() {
/* 15 */     return null;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   String getName();
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\LLMService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */