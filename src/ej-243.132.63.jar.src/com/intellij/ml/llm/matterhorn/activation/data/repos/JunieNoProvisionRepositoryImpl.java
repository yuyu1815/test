/*    */ package com.intellij.ml.llm.matterhorn.activation.data.repos;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\002\n\000\n\002\030\002\n\000\b\000\030\0002\0020\001B\007¢\006\004\b\002\020\003J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026R\032\020\004\032\b\022\004\022\0020\0060\005X\004¢\006\b\n\000\032\004\b\007\020\bR\032\020\t\032\b\022\004\022\0020\n0\005X\004¢\006\b\n\000\032\004\b\013\020\b¨\006\020"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieNoProvisionRepositoryImpl;", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieAieProvisionRepository;", "<init>", "()V", "provisionStatusFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus;", "getProvisionStatusFlow", "()Lkotlinx/coroutines/flow/Flow;", "authDataFlow", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthResult;", "getAuthDataFlow", "reportAuthFailure", "", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "data.repos"})
/*    */ public final class JunieNoProvisionRepositoryImpl
/*    */   implements JunieAieProvisionRepository
/*    */ {
/*    */   @NotNull
/* 23 */   private final Flow<AieProvisionStatus> provisionStatusFlow = FlowKt.flowOf(AieProvisionStatus.AieFallback.AieServiceUnknownToProvisioner.INSTANCE); @NotNull public Flow<AieProvisionStatus> getProvisionStatusFlow() { return this.provisionStatusFlow; } @NotNull
/* 24 */   private final Flow<AieAuthResult> authDataFlow = FlowKt.flowOf(AieAuthFailure.AieServiceUnavailable.INSTANCE); @NotNull public Flow<AieAuthResult> getAuthDataFlow() { return this.authDataFlow; }
/*    */    public void reportAuthFailure(@NotNull GrazieAuthData authData) {
/* 26 */     Intrinsics.checkNotNullParameter(authData, "authData");
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\data\repos\JunieNoProvisionRepositoryImpl.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */