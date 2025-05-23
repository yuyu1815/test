/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.IdeLicenseAiFlag;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import kotlinx.coroutines.flow.SharedFlow;
/*    */ import kotlinx.coroutines.flow.StateFlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003R\032\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/NoIdeLicenseRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieIdeLicenseRepository;", "<init>", "()V", "aiFlagFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/IdeLicenseAiFlag;", "getAiFlagFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "data.repos"})
/*    */ final class NoIdeLicenseRepositoryImpl
/*    */   implements JunieIdeLicenseRepository
/*    */ {
/*    */   @Nullable
/*    */   public Object refreshAiFlagAndAwait(@NotNull IdeLicenseAiFlag desiredAiFlag, @NotNull Continuation<? super Unit> $completion) {
/* 53 */     return JunieIdeLicenseRepository.DefaultImpls.refreshAiFlagAndAwait(this, desiredAiFlag, $completion);
/*    */   } @NotNull
/* 55 */   private final SharedFlow<IdeLicenseAiFlag> aiFlagFlow = (SharedFlow<IdeLicenseAiFlag>)FlowKt.asStateFlow(StateFlowKt.MutableStateFlow(IdeLicenseAiFlag.LicenseAiEnabled)); @NotNull public SharedFlow<IdeLicenseAiFlag> getAiFlagFlow() { return this.aiFlagFlow; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\NoIdeLicenseRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */