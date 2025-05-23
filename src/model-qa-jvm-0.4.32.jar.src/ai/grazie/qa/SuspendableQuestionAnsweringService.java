package ai.grazie.qa;

import ai.grazie.model.llm.profile.LLMProfileID;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020 \n\002\b\005\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\bf\030\0002\0020\001JD\020\002\032\b\022\004\022\0020\0040\0032\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\006H¦@¢\006\002\020\rJ4\020\016\032\0020\0172\f\020\020\032\b\022\004\022\0020\0060\0212\n\b\002\020\022\032\004\030\0010\0062\n\b\002\020\023\032\004\030\0010\006H¦@¢\006\002\020\024J\036\020\025\032\b\022\004\022\0020\0060\0212\b\b\002\020\026\032\0020\027H¦@¢\006\002\020\030JD\020\031\032\b\022\004\022\0020\0320\0212\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\t\032\0020\0062\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\006H¦@¢\006\002\020\rJX\020\033\032\b\022\004\022\0020\0320\0212\006\020\005\032\0020\0062\006\020\007\032\0020\b2\006\020\034\032\0020\0062\022\020\035\032\016\022\n\022\b\022\004\022\0020\0360\0210\0212\n\b\002\020\n\032\004\030\0010\0132\n\b\002\020\f\032\004\030\0010\006H¦@¢\006\002\020\037J6\020 \032\0020!2\006\020\005\032\0020\0062\006\020\007\032\0020\b2\n\b\002\020\022\032\004\030\0010\0062\n\b\002\020\023\032\004\030\0010\006H¦@¢\006\002\020\"ø\001\000\002\006\n\004\b!0\001¨\006#À\006\001"}, d2 = {"Lai/grazie/qa/SuspendableQuestionAnsweringService;", "", "answerStream", "Lkotlinx/coroutines/flow/Flow;", "Lai/grazie/qa/QAAnswersChunk;", "query", "", "size", "", "dataSource", "profile", "Lai/grazie/model/llm/profile/LLMProfileID;", "context", "(Ljava/lang/String;ILjava/lang/String;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "extractWeb", "Lai/grazie/qa/ExtractWebResponse;", "urls", "", "parametersJson", "provider", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listSources", "showAll", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrieve", "Lai/grazie/qa/QADocument;", "retrieveV2", "config", "prioritizedSources", "Lai/grazie/qa/PrioritizedSource;", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Lai/grazie/model/llm/profile/LLMProfileID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchWeb", "Lai/grazie/qa/SearchWebResponse;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "model-qa"})
public interface SuspendableQuestionAnsweringService {
  @Nullable
  Object answerStream(@NotNull String paramString1, int paramInt, @NotNull String paramString2, @Nullable LLMProfileID paramLLMProfileID, @Nullable String paramString3, @NotNull Continuation<? super Flow<QAAnswersChunk>> paramContinuation);
  
  @Nullable
  Object retrieve(@NotNull String paramString1, int paramInt, @NotNull String paramString2, @Nullable LLMProfileID paramLLMProfileID, @Nullable String paramString3, @NotNull Continuation<? super List<QADocument>> paramContinuation);
  
  @Nullable
  Object retrieveV2(@NotNull String paramString1, int paramInt, @NotNull String paramString2, @NotNull List<? extends List<PrioritizedSource>> paramList, @Nullable LLMProfileID paramLLMProfileID, @Nullable String paramString3, @NotNull Continuation<? super List<QADocument>> paramContinuation);
  
  @Nullable
  Object searchWeb(@NotNull String paramString1, int paramInt, @Nullable String paramString2, @Nullable String paramString3, @NotNull Continuation<? super SearchWebResponse> paramContinuation);
  
  @Nullable
  Object extractWeb(@NotNull List<String> paramList, @Nullable String paramString1, @Nullable String paramString2, @NotNull Continuation<? super ExtractWebResponse> paramContinuation);
  
  @Nullable
  Object listSources(boolean paramBoolean, @NotNull Continuation<? super List<String>> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-qa-jvm-0.4.32.jar!\ai\grazie\qa\SuspendableQuestionAnsweringService.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */